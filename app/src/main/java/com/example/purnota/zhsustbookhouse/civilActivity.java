package com.example.purnota.zhsustbookhouse;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class civilActivity extends Activity {

    Button ceOneSub,ceTwoSub,ceThreeSub,ceFourSub,ceFiveSub,ceSixSub,ceSevenSub,ceEightSub,ceNineSub,ceTenSub,
            ceElevenSub,ceTwelveSub,ceThirteenSub,ceFourteenSub,ceFifteenSub;
    DownloadManager downloadManagerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil);

        ceOneSub=(Button) findViewById(R.id.firstSubCE);
        ceTwoSub=(Button) findViewById(R.id.ceButtonTwo);
        ceThreeSub=(Button) findViewById(R.id.ceButtonThree);
        ceFourSub=(Button) findViewById(R.id.ceButtonFour);
        ceFiveSub=(Button) findViewById(R.id.ceButtonFive);
        ceSixSub=(Button) findViewById(R.id.ceButtonSix);
        ceSevenSub=(Button) findViewById(R.id.ceButtonSeven);
        ceEightSub=(Button) findViewById(R.id.ceButtonEight);
        ceNineSub=(Button) findViewById(R.id.ceButtonNine);
        ceTenSub=(Button) findViewById(R.id.ceButtonTen);
        ceElevenSub=(Button) findViewById(R.id.ceButtonEleven);
        ceTwelveSub=(Button) findViewById(R.id.ceButtonTwelve);
        ceThirteenSub=(Button) findViewById(R.id.ceButtonThirteen);
        ceFourteenSub=(Button) findViewById(R.id.ceButtonFourteen);
        ceFifteenSub=(Button) findViewById(R.id.ceButtonFifteen);

        ceOneSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceTwoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceThreeSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceFourSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceFiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceSixSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceSevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceEightSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceNineSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceTenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });

        ceElevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceTwelveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceThirteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceFourteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        ceFifteenSub.setOnClickListener(new View.OnClickListener() {
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
