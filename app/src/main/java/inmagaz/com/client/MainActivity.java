package inmagaz.com.client;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
   EditText login = null;
   EditText password = null;
   TextView largeText;
    String pathToShrift = "fonts/Ametist.ttf";
    Typeface typefacen = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (EditText) findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        typefacen = Typeface.createFromAsset(getAssets(), pathToShrift);

        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(openFileInput("login.txt"),"UTF-8"));
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(openFileInput("password.txt"),"UTF-8"));
            String str1 = bf.readLine();
            String str2 = bf2.readLine();
            if(str1!=null&&str1!=""&&str1.length()!=0&&str2!=null&&str2!=""&&str2.length()!=0){
                setContentView(R.layout.main_show);
                largeText = (TextView) findViewById(R.id.textView26);
                largeText.setText("Приветствуем вас : "+str1);
                largeText.setTypeface(typefacen);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void layout_addTovar(View view){
        Intent intent = new Intent(MainActivity.this,add_tovar.class);
        startActivity(intent);
    }
    public void layout_zakazy(View view){
        Intent intent = new Intent(MainActivity.this,zakazy.class);
        startActivity(intent);
    }
    public void sign_in(View view){
        String str1 = login.getText().toString();
        String str2 = password.getText().toString();
        if(str1!=null&&str1!=""&&str1.length()!=0&&str2!=null&&str2!=""&&str2.length()!=0){
            try {
                BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(openFileOutput("login.txt",MODE_PRIVATE),"UTF-8"));
                BufferedWriter bf2 = new BufferedWriter(new OutputStreamWriter(openFileOutput("password.txt",MODE_PRIVATE),"UTF-8"));
                bf.write(str1);
                bf2.write(str2);
                bf.close();
                bf2.close();
                setContentView(R.layout.main_show);
                largeText = (TextView) findViewById(R.id.textView26);
                largeText.setText("Приветствуем вас : " + str1);
                largeText.setTypeface(typefacen);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            Toast.makeText(MainActivity.this,"Введены не корректные данные",Toast.LENGTH_SHORT).show();
        }
    }
}
