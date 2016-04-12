package android.com.workoutsettracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Thread;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome_screen);
            Thread.sleep(4000);
            Intent intent = new Intent(this, DailyView.class);
            startActivity(intent);
        }
        catch(Exception e){
            System.out.println("Couldn't sleep!" + e);
        }
    }
}
