package com.maidi.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.edit_text);
        final ImageView imageView = (ImageView) findViewById(R.id.image_view);
        final ProgressBar progressBar =(ProgressBar)findViewById(R.id.progress_bar);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button:
                       /* String inputText = editText.getText().toString();
                        Toast.makeText(MainActivity.this,inputText,
                                Toast.LENGTH_SHORT).show();*/

                        /*****AlertDialog begind *****/
                        /*
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is Dialog");
                        dialog.setMessage("Something import.");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface anInterface, int which) {

                            }
                        });
                        dialog.setNegativeButton("Cansel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface anInterface, int i) {

                            }
                        });
                        dialog.show();*/
                        /*****AlertDialog end *****/

                        /*****ProgressDialog begin *****/
                        /*
                        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                        progressDialog.setTitle("This is ProgressDialog");
                        progressDialog.setMessage("loading...");
                        progressDialog.setCancelable(true);
                        progressDialog.show();*/
                        /*****ProgressDialog end *****/

                        /**************ImageView begin******************/
                       /* imageView.setImageResource(R.drawable.image2);*/
                        /**************ImageView end******************/

                        /*****************ProgressBar begin***************************/
                            /*if(progressBar.getVisibility()==View.GONE){
                                progressBar.setVisibility(View.VISIBLE);
                            }else {
                                progressBar.setVisibility(View.GONE);
                            }*/
                            int progress = progressBar.getProgress();
                            progress = progress + 10;
                            progressBar.setProgress(progress);
                        /******************ProgressBar end**************************/
                        break;
                    default:
                        break;
                }
            }
        });
    }

}
