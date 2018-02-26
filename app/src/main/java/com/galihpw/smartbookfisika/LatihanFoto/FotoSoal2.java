package com.galihpw.smartbookfisika.LatihanFoto;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;
import com.galihpw.smartbookfisika.utility.Utility;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class FotoSoal2 extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    static final int REQUEST_CAMERA = 0;
    static final int SELECT_FILE = 1;
    private String userChoosenTask;
    Bitmap bitmap;

    String[] value = new String[]{
            "Choose from Gallery",
            "Take Photo",
            "Remove Profile Photo"
    };

    @BindView(R.id.videosoal2)
    ImageView videosoal2;

    @BindView(R.id.play_videosoal2)
    ImageView play_videosoal2;

    @BindView(R.id.jawabsoal2)
    ImageView jawabsoal2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.foto_soal2, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        ButterKnife.bind(this,rootView);
        Glide.with(this).load("http://img.youtube.com/vi/Lvwtrk0wr0Y/0.jpg").into(videosoal2);

        play_videosoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), YoutubeActivity.class);
                Config.VIDEO_ID = "Lvwtrk0wr0Y";
                startActivity(intent);
            }
        });

        jawabsoal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogPhoto();
            }
        });

        return rootView;
    }

    public void dialogPhoto(){
        AlertDialog.Builder alertdialogbuilder = new AlertDialog.Builder(getActivity());

        alertdialogbuilder.setTitle("Profile Picture");

        alertdialogbuilder.setItems(value, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                boolean result= Utility.checkPermission(getActivity());

                switch (value[item]) {
                    case "Choose from Gallery":
                        Toast.makeText(getActivity(), "Select Photo", Toast.LENGTH_SHORT).show();
                        userChoosenTask = "Choose from Library";
                        if (result)
                            galleryIntent();
                        break;
                    case "Take Photo":
                        Toast.makeText(getActivity(), "Take Photo", Toast.LENGTH_SHORT).show();
                        userChoosenTask = "Take Photo";
                        if (result)
                            cameraIntent();
                        break;
                    case "Remove Profile Photo":
                        Toast.makeText(getActivity(), "Photo Removed", Toast.LENGTH_SHORT).show();
                        jawabsoal2.setImageResource(R.drawable.bgmateri1);
                        break;
                }

            }
        });

        AlertDialog dialog = alertdialogbuilder.create();

        dialog.show();
    }

    private void cameraIntent(){
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    private void galleryIntent(){
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);//
        startActivityForResult(Intent.createChooser(intent, "Select File"),SELECT_FILE);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == Activity.RESULT_OK) {
            if (requestCode == SELECT_FILE)
                onSelectFromGalleryResult(data);
            else if (requestCode == REQUEST_CAMERA)
                onCaptureImageResult(data);
        }
    }

    private void onCaptureImageResult(Intent data) {
        bitmap = (Bitmap) data.getExtras().get("data");
        ByteArrayOutputStream bytes = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes);
        File destination = new File(Environment.getExternalStorageDirectory(),
                System.currentTimeMillis() + ".jpg");
        FileOutputStream fo;
        try {
            destination.createNewFile();
            fo = new FileOutputStream(destination);
            fo.write(bytes.toByteArray());
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        jawabsoal2.setImageBitmap(bitmap);
    }

    @SuppressWarnings("deprecation")
    private void onSelectFromGalleryResult(Intent data) {
        bitmap=null;
        if (data != null) {
            try {
                bitmap = MediaStore.Images.Media.getBitmap(getActivity().getApplicationContext().getContentResolver(), data.getData());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        jawabsoal2.setImageBitmap(bitmap);
    }
}
