package com.contect.mycontect;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Toolbar;

import com.contect.mycontect.fragment.ContactFragment;

public class ContactListActivity extends AppCompatActivity implements ContactFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        //Check Internet connection
        checkInternetConnection();

        if(savedInstanceState == null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainContainer, ContactFragment.newInstance("", ""), "rageComicList")
                    .commit();
        }
    }

    public boolean checkInternetConnection(){
        ConnectivityManager connMgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()){
            Toast.makeText(this, "Connected", Toast.LENGTH_LONG).show();
            return true;
        }else {
            Toast.makeText(this, "Network Connection is not available", Toast.LENGTH_LONG).show();
            return false;
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
