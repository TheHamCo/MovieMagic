package edu.css.mjackson1.moviemagic;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ResultsActivity extends ActionBarActivity {
    TextView txtResultsTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        txtResultsTitle = (TextView) findViewById(R.id.txtResultsTitle);


    }
public class class1 extends Activity
{
    private TextView txtResultsTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txtResultsTitle.setText(getIntent().getExtras().getString("Title")); // get Title from Main Activity
    }
}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_results, menu);
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