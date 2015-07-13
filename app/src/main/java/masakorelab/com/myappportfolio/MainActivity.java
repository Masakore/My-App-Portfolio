package masakorelab.com.myappportfolio;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button Objects
        Button button1 = (Button)findViewById(R.id.btn1);
        Button button2 = (Button)findViewById(R.id.btn2);
        Button button3 = (Button)findViewById(R.id.btn3);
        Button button4 = (Button)findViewById(R.id.btn4);
        Button button5 = (Button)findViewById(R.id.btn5);
        Button button6 = (Button)findViewById(R.id.btn6);

        //Set Listener
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        Context context = getApplicationContext();
        String text ="";

        switch (v.getId()) {
            case R.id.btn1:
                text = getString(R.string.spotifystreamer);
                break;
            case R.id.btn2:
                text = getString(R.string.scoresapp);
                break;
            case R.id.btn3:
                text = getString(R.string.libraryapp);
                break;
            case R.id.btn4:
                text = getString(R.string.builditbigger);
                break;
            case R.id.btn5:
                text = getString(R.string.baconreader);
                break;
            case R.id.btn6:
                text = getString(R.string.capstone);
                break;
        }


        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
