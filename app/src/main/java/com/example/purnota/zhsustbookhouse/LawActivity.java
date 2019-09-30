package com.example.purnota.zhsustbookhouse;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LawActivity extends Activity {
    Button lawOneSub, lawTwoSub, lawThreeSub, lawFourSub, lawFiveSub, lawSixSub, lawSevenSub, lawEightSub, lawNineSub,
    lawTenSub,lawElevenSub,lawTwelveSub,lawThirteenSub,lawFourteenSub,lawFifteenSub;
    DownloadManager downloadManagerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law);

        lawOneSub=(Button) findViewById(R.id.firstSubLAW);
        lawTwoSub=(Button) findViewById(R.id.lawButtonTwo);
        lawThreeSub=(Button) findViewById(R.id.lawButtonThree);
        lawFourSub=(Button) findViewById(R.id.lawButtonFour);
        lawFiveSub=(Button) findViewById(R.id.lawButtonFive);
        lawSixSub=(Button) findViewById(R.id.lawButtonSix);
        lawSevenSub=(Button) findViewById(R.id.lawButtonSeven);
        lawEightSub=(Button) findViewById(R.id.lawButtonEight);
        lawNineSub=(Button) findViewById(R.id.lawButtonNine);
        lawTenSub=(Button) findViewById(R.id.lawButtonTen);
        lawElevenSub=(Button) findViewById(R.id.lawButtonEleven);
        lawTwelveSub=(Button) findViewById(R.id.lawButtonTwelve);
        lawThirteenSub=(Button) findViewById(R.id.lawButtonThirteen);
        lawFourteenSub=(Button) findViewById(R.id.lawButtonFourteen);
        lawFifteenSub=(Button) findViewById(R.id.lawButtonFifteen);


        lawOneSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawTwoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawThreeSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawFourSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawFiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawSixSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawSevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawEightSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawNineSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawTenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawElevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawTwelveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawThirteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawFourteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        lawFifteenSub.setOnClickListener(new View.OnClickListener() {
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
