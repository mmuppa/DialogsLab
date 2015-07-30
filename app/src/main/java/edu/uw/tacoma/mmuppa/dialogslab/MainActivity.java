package edu.uw.tacoma.mmuppa.dialogslab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simpleDialogButton = (Button) findViewById(R.id.simple_dialog_button);
        simpleDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FireMissilesDialogFragment fireMissilesDialogFragment = new FireMissilesDialogFragment();
                fireMissilesDialogFragment.show(getFragmentManager(), "missiles");
            }
        });

        final Button listDialogButton = (Button) findViewById(R.id.list_dialog_button);
        listDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListDialogFragment listDialogFragment = new ListDialogFragment();
                listDialogFragment.show(getFragmentManager(), "colors");
            }
        });

        final Button multiListDialogButton = (Button) findViewById(R.id.multilist_dialog_button);
        multiListDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiListFragment multiListFragment = new MultiListFragment();
                multiListFragment.show(getFragmentManager(), "toppings");
            }
        });

        final Button customDialogButton = (Button) findViewById(R.id.custom_dialog_button);
        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogFragment customDialogFragment = new CustomDialogFragment();
                customDialogFragment.show(getFragmentManager(), "custom");
            }
        });

        final Button timeDialogButton = (Button) findViewById(R.id.time_dialog_button);
        timeDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimeFragment timeFragment = new TimeFragment();
                timeFragment.show(getFragmentManager(), "time");
            }
        });

        final Button dateDialogButton = (Button) findViewById(R.id.date_dialog_button);
        dateDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DateFragment dateFragment = new DateFragment();
                dateFragment.show(getFragmentManager(), "date");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
