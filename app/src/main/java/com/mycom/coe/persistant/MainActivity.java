package com.mycom.coe.persistant;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.mycom.coe.persistant.model.Board;
import com.mycom.coe.persistant.util.DbHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    final String APP = "APP_PREFERENCES";
//    SharedPreferences sp;
//    SharedPreferences.Editor editor;

    SQLiteDatabase mDb;
    DbHelper mHelper;
    Cursor mCursor;
//    CustomAdapter adapter;

    ArrayList<Board> boards;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boards = new ArrayList<Board>();
        mHelper = new DbHelper(this);
        mDb = mHelper.getWritableDatabase();


//        mHelper.onUpgrade(mDb, 1, 1);    //Reinstall Database

//        Board b1 =  mHelper.getMessage(1);  // get a a message
//        Toast.makeText(this, b1.toString(), Toast.LENGTH_SHORT).show();
//
//        b1.setMessage("Android is very easy");
//        mHelper.updateMessage(b1);                         // update a message
//
//        Board b2 =  mHelper.getMessage(1);  // get a a message
//        Toast.makeText(this, b2.toString(), Toast.LENGTH_SHORT).show();
//
//        mHelper.addMessage(new Board("New title","New Name","New Message"));
        boards = mHelper.getAllMessages();                    // get all messages
        for (Board board : boards) {
            Toast.makeText(this, board.toString(), Toast.LENGTH_SHORT).show();
        }




//        mHelper.updateMessage(b1);


//        mHelper.deleteMessage( id );


//        createSharedPreferences();
//        readSharedPreference();
    }

//    private void readSharedPreference() {
//        String str = sp.getString("KEY","Default String");
//        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
//        File f = getDatabasePath(APP + ".xml");
//        System.out.println(  f.getAbsolutePath());
//    }
//
//    private void createSharedPreferences() {
//        sp = getSharedPreferences(APP, Context.MODE_PRIVATE);
//        editor = sp.edit();
//        editor.putString("KEY","Foo Bar");
//        editor.putBoolean("LOGIC", true);
//        editor.commit();
//    }

}
