package com.example.emptyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
    }

    public void toStart()
    {

        setContentView(R.layout.start);

    }

    public void start(View view)
    {
        toStart();
    }


    public void toPineapple()
    {

        setContentView(R.layout.pineapple);

    }

    public void pineapple(View view)
    {
        toPineapple();
    }
    public void toApple()
    {

        setContentView(R.layout.apple);

    }
    public void apple(View view)
    {
        toApple();
    }

    public void toBanana()
    {

        setContentView(R.layout.banana);

    }
    public void banana(View view)
    {
        toBanana();
    }



    public void toLemon()
    {

        setContentView(R.layout.lemon);

    }
    public void lemon(View view)
    {
        toLemon();
    }

    public void toMango()
    {

        setContentView(R.layout.mango);

    }
    public void mango(View view)
    {
        toMango();
    }




    public void toCherry()
    {

        setContentView(R.layout.cherry);

    }
    public void cherry(View view)
    {
        toCherry();
    }

    public void AnimationApple(View view)
    {

        ImageView imageView=view.findViewById(R.id.imageView);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationTextApple(View view)
    {
        MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_apple);
        mp.start();
        TextView textView=view.findViewById(R.id.textView);
        textView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationMango(View view)
    {
        ImageView imageView=view.findViewById(R.id.imageMango);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }
public void AnimationTextMango(View view)
{

    MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_mango);
    mp.start();
    TextView textView=view.findViewById(R.id.MangoView);
    textView.animate().alpha(0).rotation(360).setDuration(2000);

}

    public void AnimationPineapple(View view)
    {
        ImageView imageView=view.findViewById(R.id.imageView4);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationTextPineapple(View view)
    {

        MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_pineapple);
        mp.start();
        TextView textView=view.findViewById(R.id.text4);
        textView.animate().alpha(0).rotation(360).setDuration(2000);

    }


    public void AnimationBanana(View view)
    {
        ImageView imageView=view.findViewById(R.id.imageView6);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }

    public void AnimationTextBanana(View view)
    {

        MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_banana);
        mp.start();
        TextView textView=view.findViewById(R.id.text6);
        textView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationCherry(View view)
    {
        ImageView imageView=view.findViewById(R.id.imageView3);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }

    public void AnimationTextCherry(View view)
    {

        MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_cherry);
        mp.start();
        TextView textView=view.findViewById(R.id.text3);
        textView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationLemon(View view)
    {
        ImageView imageView=view.findViewById(R.id.imageView5);
        imageView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void AnimationTextLemon(View view)
    {

        MediaPlayer mp = MediaPlayer.create(this ,R.raw.pronunciation_en_lemon);
        mp.start();
        TextView textView=view.findViewById(R.id.text5);
        textView.animate().alpha(0).rotation(360).setDuration(2000);

    }
    public void toEnd()
    {

        setContentView(R.layout.end);

    }

    public void end(View view)
    {
        toEnd();
    }


}