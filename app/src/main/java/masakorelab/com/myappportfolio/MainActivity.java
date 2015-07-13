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
        displayToast(v);
    }

    public void displayToast(View view) {

        //Because you cannot take text in a button fro view directory
        Button button = (Button) view;

        String buttonText = (String) button.getText();

        Context context = getApplicationContext();

        CharSequence text = getString(R.string.open_ap) + buttonText;

        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
