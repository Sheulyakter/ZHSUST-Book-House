package com.example.purnota.zhsustbookhouse;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cheActivity extends Activity {

    Button cheOneSub,cheTwoSub,cheThreeSub,cheFourSub,cheFiveSub,cheSixSub,cheSevenSub,cheEightSub,cheNineSub,cheTenSub,
            cheElevenSub,cheTwilveSub,cheThirteenSub,cheFourteenSub,cheFifteenSub;
    DownloadManager downloadManagerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_che);

        cheOneSub=(Button) findViewById(R.id.firstSubCHE);
        cheTwoSub=(Button) findViewById(R.id.cheButtonTwo);
        cheThreeSub=(Button) findViewById(R.id.cheButtonThree);
        cheFourSub=(Button) findViewById(R.id.cheButtonFour);
        cheFiveSub=(Button) findViewById(R.id.cheButtonFive);
        cheSixSub=(Button) findViewById(R.id.cheButtonSix);
        cheSevenSub=(Button) findViewById(R.id.cheButtonSeven);
        cheEightSub=(Button) findViewById(R.id.cheButtonEight);
        cheNineSub=(Button) findViewById(R.id.cheButtonNine);
        cheTenSub=(Button) findViewById(R.id.cheButtonTen);
        cheElevenSub=(Button) findViewById(R.id.cheButtonEleven);
        cheTwilveSub=(Button) findViewById(R.id.cheButtonTwilve);
        cheThirteenSub=(Button) findViewById(R.id.cheButtonThirteen);
        cheFourteenSub=(Button) findViewById(R.id.cheButtonFourteen);
        cheFifteenSub=(Button) findViewById(R.id.cheButtonFifteen);

        cheOneSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });

        cheTwoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheThreeSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheFourSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheFiveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheSixSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheSevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });

        cheEightSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheNineSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheTenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });

        cheElevenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheTwilveSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheThirteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheFourteenSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/uc?export=download&id=1dgtsF6dbBmpmW50zR_qx76H00wWAXKHC");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });
        cheFifteenSub.setOnClickListener(new View.OnClickListener() {
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
