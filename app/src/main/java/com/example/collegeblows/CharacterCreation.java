package com.example.collegeblows;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;

public class CharacterCreation extends AppCompatActivity {

    public final static int PICK_PHOTO_CODE = 1046;
    TextView progressCLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);

        SeekBar charBar = findViewById(R.id.charBar);

        int progressC = charBar.getProgress();
        progressCLabel = findViewById(R.id.charis);
        progressCLabel.setText("Charisma: " + progressC);
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
            progressCLabel.setText("Charisma: " + progress);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

    public Bitmap loadFromUri(Uri photoUri){
        Bitmap image = null;
        try {
            if(Build.VERSION.SDK_INT > 27){
                ImageDecoder.Source source = ImageDecoder.createSource(this.getContentResolver(), photoUri);
                image = ImageDecoder.decodeBitmap(source);
            }
            else image = MediaStore.Images.Media.getBitmap(this.getContentResolver(), photoUri);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return image;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((data != null) && requestCode == PICK_PHOTO_CODE) {
            Uri photoUri = data.getData();
            Bitmap selectedImage = loadFromUri(photoUri);
            ImageView ivPreview = (ImageView) findViewById(R.id.Player);
            ivPreview.setImageBitmap(selectedImage);
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onPickPhoto(View v){
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if(intent.resolveActivity(getPackageManager()) != null)
            startActivityForResult(intent, PICK_PHOTO_CODE);
    }

}