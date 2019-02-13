package yadunandan.databasedemo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class data extends SQLiteOpenHelper {

    Context ctx;
    static final String custInfo="CustomerInformation";
    static final int verNum=1;
    String createQuery="create table CustInfo(id integer primary key autoincrement,fname text,lname text);";
    SQLiteDatabase db;
    public data(Context ct)
    {
        super(ct,custInfo,null,verNum);
        ctx=ct;

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
db.execSQL(createQuery);
Log.i("Database","Table Created:");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void insertdata(String s1,String s2)
    {
       // String insert="insert into CustInfo values(''"+s1+"','"+s2+"') ";
        String insert="insert into CustInfo(fname,lname) values(s1,s2);";
        db=getWritableDatabase();
        db.execSQL(insert);
        Toast.makeText(ctx,"successfull",Toast.LENGTH_SHORT).show();
    }
}
