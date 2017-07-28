package com.noor.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ListDetailsActivity extends AppCompatActivity {

    TextView txtName,txtDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_details);

        txtName=(TextView)findViewById(R.id.txtName);
        txtDesc=(TextView)findViewById(R.id.txtDesc);

        String getName= getIntent().getExtras().getString("name"); //data recived

       // txtName.setText(getName);

        if(getName.equals("Bangladesh"))
        {
            txtName.setText("Bangladesh");
            txtDesc.setText("Bangladesh is a nice country!!");

        }




    }
}
