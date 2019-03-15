package com.contect.mycontect;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.contect.mycontect.fragment.ContactFragment;
import com.contect.mycontect.json.JsonPasser;

public class MainActivity extends AppCompatActivity{
    private Button saveBtn;
    private Button viewListBtn;
    private EditText nameTxt;
    private EditText numberTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkInternetConnection();

        saveBtn = (Button)findViewById(R.id.savet_Btn);
        viewListBtn = (Button)findViewById(R.id.viewList_Btn);
        nameTxt = (EditText) findViewById(R.id.name_EdTxt);
        numberTxt = (EditText)findViewById(R.id.phoneNum_EdTxt);


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = numberTxt.getText().toString();
                String number = numberTxt.getText().toString();

//                isValidPhoneNumber(number);


                Toast.makeText(getApplication(), "Contact saved successfully", Toast.LENGTH_LONG).show();
            }
        });

        viewListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplication(), ContactListActivity.class));
            }
        });

    }

//    private static boolean isValidPhoneNumber(String phoneNumber) {
//        return !TextUtils.isEmpty(phoneNumber) && android.util.Patterns.PHONE.matcher(phoneNumber).matches();
//    }

    //Check Internet connection
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

}
