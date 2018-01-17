package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
Button mUpperButton,mLowerButton;
TextView mZinglers;
int mStoryIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

mLowerButton=(Button)findViewById(R.id.buttonBottom);
mUpperButton=(Button)findViewById(R.id.buttonTop);
mZinglers=(TextView)findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
mUpperButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(mStoryIndex==1 || mStoryIndex==2) {
            mZinglers.setText(R.string.T3_Story);
            mUpperButton.setText(R.string.T3_Ans1);
            mLowerButton.setText(R.string.T3_Ans2);
            mStoryIndex=3;
        }
        else {
            mZinglers.setText(R.string.T6_End);
            mLowerButton.setVisibility(View.GONE);
            mUpperButton.setVisibility(View.GONE);
        }

    }
});



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

mLowerButton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(mStoryIndex==1) {
            mZinglers.setText(R.string.T2_Story);
            mLowerButton.setText(R.string.T2_Ans2);
            mUpperButton.setText(R.string.T2_Ans1);
        mStoryIndex=2;
        }
        else if(mStoryIndex==2){
            mZinglers.setText(R.string.T4_End);
            mLowerButton.setVisibility(View.GONE);
            mUpperButton.setVisibility(View.GONE);
        }
        else {
            mZinglers.setText(R.string.T5_End);
            mLowerButton.setVisibility(View.GONE);
            mUpperButton.setVisibility(View.GONE);
        }
    }
});
    }
}
