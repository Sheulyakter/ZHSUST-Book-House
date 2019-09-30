package com.example.purnota.zhsustbookhouse;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class wellcome extends AppCompatActivity {

    ViewFlipper v_flipper;
    Button cseD,eeeD,cheD,ceD,engD,lawD,bbaD,developerButton,aboutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);


   ////// getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        int images[] = {R.drawable.banner, R.drawable.banner2, R.drawable.banner3, R.drawable.banner4, R.drawable.banner5, R.drawable.banner6};

        v_flipper = (ViewFlipper) findViewById(R.id.v_flipper);

        // for(int i=0 ; i<images.length; i++)
        //{
        //  flipperImages(images[i]);
        //  }

        for(int image: images)
        {
            flipperImages(image);
        }

        cseD=(Button) findViewById(R.id.CSEButton);
        eeeD=(Button) findViewById(R.id.EEEButton);
        cheD=(Button) findViewById(R.id.CHEButton);
        ceD=(Button) findViewById(R.id.CIVILButton);
        engD=(Button) findViewById(R.id.ENGButton);
        lawD=(Button) findViewById(R.id.LAWButton);
        bbaD=(Button) findViewById(R.id.BBAButton);
        developerButton=(Button) findViewById(R.id.DEVELOPERButton);
        aboutBtn=(Button) findViewById(R.id.ABOUTButton);

        aboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCSE= new Intent(wellcome.this, about.class);
                startActivity(intentCSE);
            }
        });

        cseD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCSE= new Intent(wellcome.this, cseActivity.class);
                startActivity(intentCSE);
            }
        });
        eeeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEEE= new Intent(wellcome.this, eeeActivity.class);
                startActivity(intentEEE);
            }
        });
        cheD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCHE= new Intent(wellcome.this, cheActivity.class);
                startActivity(intentCHE);
            }
        });

        ceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCE= new Intent(wellcome.this, civilActivity.class);
                startActivity(intentCE);
            }
        });
        engD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentENG= new Intent(wellcome.this, engActivity.class);
                startActivity(intentENG);
            }
        });
        lawD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLAW= new Intent(wellcome.this, LawActivity.class);
                startActivity(intentLAW);
            }
        });

        bbaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentBBA= new Intent(wellcome.this, bbaActivity.class);
                startActivity(intentBBA);
            }
        });
        developerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentDEV= new Intent(wellcome.this, DeveloperActivity.class);
                startActivity(intentDEV);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_bar,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        if(id==R.id.homeId)
        {
            Intent intenthome = new Intent(wellcome.this,wellcome.class);
            startActivity(intenthome);
            return  true;
        }
        if(id==R.id.helpId)
        {
            Intent intenthelp = new Intent(wellcome.this,about.class);
            startActivity(intenthelp);
            return true;
        }
        if(id==R.id.creditId)
        {
            Intent intentcredit = new Intent(wellcome.this,DeveloperActivity.class);
            startActivity(intentcredit);
            return  true;
        }
        if(id==R.id.exitId)
        {
            final AlertDialog.Builder builder = new AlertDialog.Builder(wellcome.this);
            builder.setMessage("Are you sure you want to exit?");
            builder.setTitle("EXIT");

            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();

                }
            });
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();

                }
            });
            AlertDialog alertdialog = builder.create();
            alertdialog.show();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.exit);
        builder.setMessage(R.string.exitmessage);

        builder.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog dialog = builder.show();
    }







    public  void  flipperImages (int image)
    {
        ImageView imageView  = new ImageView( this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);

        v_flipper.setFlipInterval(2000); //2 seconds

        v_flipper.setAutoStart(true);

        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }




}
