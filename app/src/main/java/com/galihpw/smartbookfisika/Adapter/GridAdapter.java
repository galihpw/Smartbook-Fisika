package com.galihpw.smartbookfisika.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.galihpw.smartbookfisika.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ujang Wahyu on 24/01/2017.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {

    List<DaftarMenu> mItems;
    OnItemClickListener mItemClickListener;


    public GridAdapter() {
        super();
        mItems = new ArrayList<DaftarMenu>();
        DaftarMenu nama = new DaftarMenu();
        nama.setName("Dasar dan Indikator Pembelajaran");
        nama.setThumbnail(R.drawable.logomini);
        mItems.add(nama);

        nama = new DaftarMenu();
        nama.setName("Materi Listrik Statis");
        nama.setThumbnail(R.drawable.logomini);
        mItems.add(nama);

        nama = new DaftarMenu();
        nama.setName("Latihan Soal");
        nama.setThumbnail(R.drawable.logomini);
        mItems.add(nama);

        nama = new DaftarMenu();
        nama.setName("Tentang Aplikasi");
        nama.setThumbnail(R.drawable.logomini);
        mItems.add(nama);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_view, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        DaftarMenu nature = mItems.get(i);
        viewHolder.tvspecies.setText(nature.getName());
        viewHolder.imgThumbnail.setImageResource(nature.getThumbnail());
    }

    @Override
    public int getItemCount() {

        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {
            super(itemView);
            imgThumbnail = (ImageView)itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView)itemView.findViewById(R.id.status);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            System.out.println("onClick");
            TextView tv = (TextView) view.findViewById(R.id.status);
            String id = tv.getText().toString();
            mItemClickListener.onItemClick(view, getAdapterPosition(), id); //OnItemClickListener mItemClickListener;
        }
    }
    public interface OnItemClickListener {
        public void onItemClick(View view, int position, String id);
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }
}
