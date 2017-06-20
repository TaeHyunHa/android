package com.example.qwe.quest001;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;
    TextView textView;
    Button tel;
    Button goole;
    Button toast;
    Button change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.edittext);
        textView=(TextView)findViewById(R.id.textview);
        tel=(Button)findViewById(R.id.tel);
        goole=(Button)findViewById(R.id.goole);
        toast=(Button)findViewById(R.id.toast);
        change=(Button)findViewById(R.id.change);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(editText.getText().toString());
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"버튼이눌렷어요",Toast.LENGTH_SHORT).show();
            }
        });

        goole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gooleintent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.goole.com"));
                startActivity(gooleintent);

            }
        });


        tel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tel=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-1234-5679"));
                startActivity(tel);
            }
        });

        change.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"액티비티 변화",Toast.LENGTH_SHORT).show();
                Intent changeintent= new Intent(MainActivity.this,Main2Activity.class);
                startActivity(changeintent);
            }
        });

    }
}
