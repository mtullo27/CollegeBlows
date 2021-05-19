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

import com.google.android.material.snackbar.Snackbar;

import java.io.IOException;
import java.io.Serializable;

public class CharacterCreation extends AppCompatActivity {

    public final static int PICK_PHOTO_CODE = 1046;
    TextView progressCLabel;
    TextView statTotal;
    int statRemaining = 10;
    SeekBar charBar;
    SeekBar intBar;
    SeekBar dexBar;
    SeekBar strBar;
    SeekBar consBar;
    int currentProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);

        statTotal = findViewById(R.id.stats);

        charBar = findViewById(R.id.charBar);
        intBar = findViewById(R.id.intBar);
        dexBar = findViewById(R.id.dexBar);
        strBar = findViewById(R.id.strenBar);
        consBar = findViewById(R.id.constiBar);

        charBar.setOnSeekBarChangeListener(seekBarChangeListener);
        intBar.setOnSeekBarChangeListener(seekBarChangeListener);
        dexBar.setOnSeekBarChangeListener(seekBarChangeListener);
        strBar.setOnSeekBarChangeListener(seekBarChangeListener);
        consBar.setOnSeekBarChangeListener(seekBarChangeListener);
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            currentProgress = seekBar.getProgress();
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
            int progress = seekBar.getProgress();
            String tag = seekBar.getTag().toString();
            switch (tag){
                case("Charisma: "):
                    progressCLabel = findViewById(R.id.charis);
                    break;
                case("Intelligence: "):
                    progressCLabel = findViewById(R.id.intel);
                    break;
                case("Dexterity: "):
                    progressCLabel = findViewById(R.id.dex);
                    break;
                case("Strength: "):
                    progressCLabel = findViewById(R.id.stren);
                    break;
                default:
                    progressCLabel = findViewById(R.id.consti);

            }
            if (statRemaining - (progress - currentProgress) < 0){
                seekBar.setProgress(currentProgress + statRemaining);
                statRemaining = 0;
                progressCLabel.setText(tag + (currentProgress + statRemaining));
                Snackbar.make(findViewById(R.id.character_creation), "Out of stat points", Snackbar.LENGTH_SHORT);
            }
            else {
                progressCLabel.setText(tag + progress);
                statRemaining = statRemaining - (progress - currentProgress);
                statTotal.setText("Stat Points Remaining: " + (statRemaining));
            }
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
    public void onClickCon(View v){
        character c = new character(charBar.getProgress(), intBar.getProgress(), dexBar.getProgress(), strBar.getProgress(), consBar.getProgress());
        Intent intent = new Intent(this, Level1.class);
        intent.putExtra("Character", c);
        startActivity(intent);
    }

    public void backButton(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
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