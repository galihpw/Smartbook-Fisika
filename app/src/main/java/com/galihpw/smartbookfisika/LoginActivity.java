package com.galihpw.smartbookfisika;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editTextNis;
    private EditText editTextPassword;
    public ProgressDialog progressDialog;
    String nis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView logoLogin = (ImageView) findViewById(R.id.logoLogin);

        Glide.with(this).load(R.drawable.logomini).into(logoLogin);

        editTextNis = (EditText) findViewById(R.id.username);
        editTextPassword = (EditText) findViewById(R.id.password);
        Button bStart = (Button) findViewById(R.id.buttonLogin);

        //Adding click listener
        bStart.setOnClickListener(this);

        /*bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MenuActivity.class);
                startActivity(intent);
                finish();
            }
        });*/
    }

    private void login(){

        Intent intent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent);

        //Getting values from edit texts
        /*nis = editTextNis.getText().toString().trim();
        final String password = editTextPassword.getText().toString().trim();

        //Creating a string request
        String url_login = Config.URL + "login.php";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url_login,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //If we are getting success from server
                        if(response.equalsIgnoreCase(Config.LOGIN_SUCCESS)){
                            progressDialog.dismiss();

                            //Starting profile activity
                            Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                            startActivity(intent);

                            finish();
                        }else{
                            progressDialog.dismiss();

                            //If the server response is not success
                            //Displaying an error message on toast
                            Toast.makeText(LoginActivity.this, "Invalid username or password", Toast.LENGTH_LONG).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //You can handle error here if you want
                        progressDialog.dismiss();

                        Toast.makeText(LoginActivity.this, "No Connection", Toast.LENGTH_LONG).show();
                    }
                }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> params = new HashMap<>();
                //Adding parameters to request
                params.put(Config.KEY_NIS, nis);
                params.put(Config.KEY_PASSWORD, password);

                //returning parameter
                return params;
            }
        };

        //Adding the string request to the queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);*/
    }

    @Override
    public void onClick(View v) {

        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Hide:
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);

        if (!validate()) {
            Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
            return;
        }

        //Loading
        progressDialog = new ProgressDialog(LoginActivity.this, R.style.AppTheme_Dark_Dialog);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage("Authenticating...");
        progressDialog.setCancelable(false);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.show();

        //Calling the login function
        login();

    }

    public boolean validate() {
        boolean valid = true;

        String nip = editTextNis.getText().toString();
        String password = editTextPassword.getText().toString();

        if (nip.isEmpty()) {
            editTextNis.setError("Masukkan NIP");
            valid = false;
        } else {
            editTextNis.setError(null);
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Masukkan Password");
            valid = false;
        } else {
            editTextPassword.setError(null);
        }

        return valid;
    }
}
