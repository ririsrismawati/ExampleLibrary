package com.fortyonestudio.examplelibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.fortyonestudio.mylibrary.BasicCount;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_count)
    Button btnCount;
    @Bind(R.id.tv_result)
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        BasicCount basicCount = new BasicCount();
        Log.d("Result", Float.toString(basicCount.multiplyFunction(2, 3)));

    }

    @OnClick(R.id.btn_count)
    void countClick() {

        //Initialize the BasicCount class from mylibrary
        BasicCount basicCount = new BasicCount();

        //Set result value to textview
        tvResult.setText(Float.toString(basicCount.multiplyFunction(2, 3)));

    }
}
