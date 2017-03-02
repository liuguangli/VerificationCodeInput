package com.dalimao.verificationcodeinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dalimao.corelibrary.VerificationCodeInput;

public class MainActivity extends AppCompatActivity {

    private static final String  TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VerificationCodeInput input = (VerificationCodeInput) findViewById(R.id.verificationCodeInput);
        input.setOnCompleteListener(new VerificationCodeInput.Listener() {
            @Override
            public void onComplete(String content) {
                Log.d(TAG, "完成输入：" + content);
            }
        });
    }
}
