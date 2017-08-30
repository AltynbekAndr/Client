package inmagaz.com.client;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class add_tovar extends AppCompatActivity {
    private static final int SELECT_IMAGE1 = 1;
    private static final int SELECT_IMAGE2 = 2;
    private static final int SELECT_IMAGE3 = 3;
    private static final int SELECT_IMAGE4 = 4;
    private static final int SELECT_IMAGE5 = 5;
    private static final int SELECT_IMAGE6 = 6;
    private static final int SELECT_IMAGE7 = 7;
    private static final int SELECT_IMAGE8 = 8;
    private static final int SELECT_IMAGE9 = 9;
    private static final int SELECT_IMAGE10 = 10;
    Bitmap bitmap1 = null;
    Bitmap bitmap2 = null;
    Bitmap bitmap3 = null;
    Bitmap bitmap4 = null;
    Bitmap bitmap5 = null;
    Bitmap bitmap6 = null;
    Bitmap bitmap7 = null;
    Bitmap bitmap8 = null;
    Bitmap bitmap9 = null;
    Bitmap bitmap10 = null;

    ImageView img1 = null;
    ImageView img2 = null;
    ImageView img3 = null;
    ImageView img4 = null;
    ImageView img5 = null;
    ImageView img6 = null;
    ImageView img7 = null;
    ImageView img8 = null;
    ImageView img9 = null;
    ImageView img10 = null;

    Spinner spinner1 = null;
    Spinner spinner2 = null;
    Spinner spinner3 = null;
    Spinner spinner4 = null;
    Spinner spinner5 = null;
    Spinner spinner6 = null;
    Spinner spinner7 = null;
    Spinner spinner8 = null;
    Spinner spinner9 = null;
    Spinner spinner10 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_tovar);
        img1 = (ImageView) findViewById(R.id.imageView);
        img2 = (ImageView) findViewById(R.id.imageView2);
        img3 = (ImageView) findViewById(R.id.imageView3);
        img4 = (ImageView) findViewById(R.id.imageView4);
        img5 = (ImageView) findViewById(R.id.imageView5);
        img6 = (ImageView) findViewById(R.id.imageView6);
        img7 = (ImageView) findViewById(R.id.imageView7);
        img8 = (ImageView) findViewById(R.id.imageView8);
        img9 = (ImageView) findViewById(R.id.imageView9);
        img10 = (ImageView) findViewById(R.id.imageView10);

        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);
        spinner6 = (Spinner) findViewById(R.id.spinner6);
        spinner7 = (Spinner) findViewById(R.id.spinner7);
        spinner8 = (Spinner) findViewById(R.id.spinner8);
        spinner9 = (Spinner) findViewById(R.id.spinner9);
        spinner10 = (Spinner) findViewById(R.id.spinner10);

        ArrayAdapter<?> arrayAdapterM = ArrayAdapter.createFromResource(this, R.array.category, android.R.layout.simple_spinner_item);
        arrayAdapterM.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(arrayAdapterM);
        spinner2.setAdapter(arrayAdapterM);
        spinner3.setAdapter(arrayAdapterM);
        spinner4.setAdapter(arrayAdapterM);
        spinner5.setAdapter(arrayAdapterM);
        spinner6.setAdapter(arrayAdapterM);
        spinner7.setAdapter(arrayAdapterM);
        spinner8.setAdapter(arrayAdapterM);
        spinner9.setAdapter(arrayAdapterM);
        spinner10.setAdapter(arrayAdapterM);

        /*spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] array = getResources().getStringArray(R.array.category);
                Toast.makeText(getApplicationContext(), "" + array[i], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/
    }
    public void layout_MainActivity(View view){
        Intent intent = new Intent(add_tovar.this,MainActivity.class);
        startActivity(intent);
    }
    public void imageClick1(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE1);
    }
    public void imageClick2(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE2);
    }
    public void imageClick3(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE3);
    }
    public void imageClick4(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE4);
    }
    public void imageClick5(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE5);
    }
    public void imageClick6(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE6);
    }
    public void imageClick7(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE7);
    }
    public void imageClick8(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE8);
    }
    public void imageClick9(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE9);
    }
    public void imageClick10(View view){
        Intent pickPhoto = new Intent(Intent.ACTION_PICK);
        pickPhoto.setType("image/*");
        startActivityForResult(pickPhoto, SELECT_IMAGE10);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == RESULT_OK) {

            if (requestCode == SELECT_IMAGE1) {
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap1 = BitmapFactory.decodeStream(input);
                    img1.setImageBitmap(bitmap1);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE2){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap2 = BitmapFactory.decodeStream(input);
                    img2.setImageBitmap(bitmap2);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE3){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap3 = BitmapFactory.decodeStream(input);
                    img3.setImageBitmap(bitmap3);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE4){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap4 = BitmapFactory.decodeStream(input);
                    img4.setImageBitmap(bitmap4);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE5){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap5 = BitmapFactory.decodeStream(input);
                    img5.setImageBitmap(bitmap5);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE6){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap6 = BitmapFactory.decodeStream(input);
                    img6.setImageBitmap(bitmap6);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE7){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap7 = BitmapFactory.decodeStream(input);
                    img7.setImageBitmap(bitmap7);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE8){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap8 = BitmapFactory.decodeStream(input);
                    img8.setImageBitmap(bitmap8);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE9){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap9 = BitmapFactory.decodeStream(input);
                    img9.setImageBitmap(bitmap9);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }else if(requestCode == SELECT_IMAGE10){
                Uri uri = data.getData();
                try {
                    InputStream input = getContentResolver().openInputStream(uri);
                    bitmap10 = BitmapFactory.decodeStream(input);
                    img10.setImageBitmap(bitmap10);
                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }
            }

        }
    }
}
