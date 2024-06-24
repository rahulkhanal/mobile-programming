package com.example.contact;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class saira2 extends Activity {
    protected void OnCreate(Bundle _bundle){
        super.onCreate(_bundle);
        setContentView(R.layout.saira2);
        Button btn = findViewById(R.id.redirect);
        btn.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(saira2.this,sairaActivity.class);
                startActivity(i);
            }
        });
    }
}
