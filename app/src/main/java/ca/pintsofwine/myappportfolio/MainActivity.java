package ca.pintsofwine.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private static final String TOAST_MSG = "This button will launch my %s!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /**
     * All of the buttons on the layout have their onClick property set to call this method,
     * have it display a toast indicating that the button will eventually be used to launch an
     * app
     * @param view the button that's been clicked
     */
    public void showMessage(View view) {
        Toast.makeText(getApplicationContext(),
                String.format(TOAST_MSG,((Button) view).getText()),
                Toast.LENGTH_SHORT)
                .show();
    }
}
