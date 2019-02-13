package yadunandan.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1,t2;
    data db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(EditText)findViewById(R.id.fname);
        t2=(EditText)findViewById(R.id.lname);

        db = new data(this);
    }

    public void insert(View view) {
        db.insertdata(t1.getText().toString(),t2.getText().toString());
    }

}
