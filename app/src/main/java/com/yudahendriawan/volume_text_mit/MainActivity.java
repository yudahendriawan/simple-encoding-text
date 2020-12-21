package com.yudahendriawan.volume_text_mit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView _normalText, _afterTransformation;
    EditText _inputAction;
    Button _goExcecute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getSupportActionBar().hide();

        _normalText = findViewById(R.id.tv_normaltext);
        _afterTransformation = findViewById(R.id.tv_afterTransformation);
        _inputAction = findViewById(R.id.et_inputAction);
        _goExcecute = findViewById(R.id.bt_go_excecute);
    }
}
