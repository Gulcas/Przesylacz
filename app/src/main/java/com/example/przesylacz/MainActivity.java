package com.example.przesylacz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View v) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString(); //konwersja odebranego tekstu z pola edittext do pojedyńczego stringa
        Intent intent = new Intent(this, ReceiverActivity.class);
        intent.putExtra("message", messageText);
        startActivity(intent);
    }
}
