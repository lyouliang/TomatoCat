package com.bobbylow.TomatoCat;

import android.os.Bundle;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;

public class TomatoCatActivity extends SherlockFragmentActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.options, menu);
        return(super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case android.R.id.home:
                return(true);
            case R.id.about:
                return(true);
            case R.id.preferences:
                return(true);
            case R.id.help:
                return(true);
        }
        return(super.onOptionsItemSelected(item));
    }
}
