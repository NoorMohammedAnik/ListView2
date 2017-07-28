package com.noor.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView countryList;

    String countryName[]={"Bangladesh","India","Pakistan","USA","Germany","Korea","Singapore","Japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //link up with xml listview
        countryList =(ListView)findViewById(R.id.listview);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,countryName);

        countryList.setAdapter(adapter);

        countryList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Intent i=new Intent(MainActivity.this,ListDetailsActivity.class);
                Toast.makeText(MainActivity.this, countryName[position], Toast.LENGTH_SHORT).show();

                i.putExtra("name",countryName[position]); //data pass

                startActivity(i);

            }
        });



    }
}
