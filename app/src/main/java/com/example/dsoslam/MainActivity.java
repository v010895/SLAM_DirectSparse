package com.example.dsoslam;
import com.example.dsoslam.nativefunction.DsoNdkInterface;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.Manifest;
public class MainActivity extends Activity implements  OnClickListener{
    Button datasetMode,cameraMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        datasetMode = (Button)findViewById(R.id.dataset_mode);
        datasetMode.setOnClickListener(this);


    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.dataset_mode:
                startActivity(new Intent(MainActivity.this,DataSetModeActivity.class));
        }
    }

    
}
