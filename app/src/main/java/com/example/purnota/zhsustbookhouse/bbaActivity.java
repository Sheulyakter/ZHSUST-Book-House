package com.example.purnota.zhsustbookhouse;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class bbaActivity extends Activity {

    Button bbaOneSub,bbaTwoSub,bbaThreeSub,bbaFourSub,bbaFiveSub,bbaSixSub,bbaSevenSub,bbaEightSub,bbaNineSub,bbaTenSub,bbaElevenSub,
            bbaTwelveSub,bbaThirteenSub,bbaFourteenSub,bbaFifteenSub;
    DownloadManager downloadManagerOne;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba);

        bbaOneSub=(Button) findViewById(R.id.firstSubBBA);
        bbaTwoSub=(Button) findViewById(R.id.bbaSecondSub);
        bbaThreeSub=(Button) findViewById(R.id.bbaSubThree);
        bbaFourSub=(Button) findViewById(R.id.bbaSubFore);
        bbaFiveSub=(Button) findViewById(R.id.bbaSubFive);
        bbaSixSub=(Button) findViewById(R.id.bbaSubSix);
        bbaSevenSub=(Button) findViewById(R.id.bbaSubSeven);
        bbaEightSub=(Button) findViewById(R.id.bbaSubEight);
        bbaNineSub=(Button) findViewById(R.id.bbaSubNine);
        bbaTenSub=(Button) findViewById(R.id.bbaSubTen);
        bbaElevenSub=(Button) findViewById(R.id.bbaSubEleven);
        bbaTwelveSub=(Button) findViewById(R.id.bbaSubTwelve);
        bbaThirteenSub=(Button) findViewById(R.id.bbaSubThirteen);
        bbaFourteenSub=(Button) findViewById(R.id.bbaSubFourteen);
        bbaFifteenSub=(Button) findViewById(R.id.bbaSubFifteen);

        bbaOneSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);



            }
        });
        bbaTwoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaThreeSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaFourSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaFiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaSixSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaSevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaEightSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaNineSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaTenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaElevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaTwelveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaThirteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaFourteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        bbaFifteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
    }


}
