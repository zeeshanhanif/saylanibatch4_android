package com.example.android.demoaysnctask;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    private static final String TAG = "MainActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textResult);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Hello Btn1",Toast.LENGTH_SHORT).show();
                MyAsyncTask task = new MyAsyncTask();
                task.execute();
                //getDataFromServer();
            }
        });
    }

    public JSONObject getDataFromServer() {
        try {
            URL url = new URL("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.geojson");
            //URL url = new URL("http://www.yahoo.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            String completedData = "";
            String tempData = null;
            while((tempData=br.readLine()) !=null){
                completedData+=tempData;
            }
            Log.d(TAG,"<><><>"+completedData);
            return parseJSON(completedData);


        }
        catch (Exception e){
            e.printStackTrace();
            Log.d("MainActivity","Exception -- "+e.getMessage());
        }
        return null;
    }

    private JSONObject parseJSON(String jsonString){
        try {
            JSONObject obj = new JSONObject(jsonString);
            String data = obj.getString("type");
            JSONObject metadata = obj.getJSONObject("metadata");
            String title = metadata.getString("title");
            JSONArray features = obj.getJSONArray("features");

            JSONObject firstIndex = features.getJSONObject(0);
            String type = firstIndex.getString("type");
            Log.d(TAG,"DAta = "+data);
            return metadata;
        } catch (JSONException e) {
            e.printStackTrace();
            Log.d("MainActivity","Exception -- "+e.getMessage());
        }
        return null;
    }


    public class MyAsyncTask extends AsyncTask<Void,Void,JSONObject>{

        @Override
        protected JSONObject doInBackground(Void... params) {
            //Toast.makeText(getApplicationContext(),"Hello in doInBackground",Toast.LENGTH_SHORT).show();
            Log.d("MainActivity","Hello in doInBackground");
            JSONObject metaObject = getDataFromServer();
            return metaObject;
        }

        @Override
        protected void onPostExecute(JSONObject jsonObj) {
            super.onPostExecute(jsonObj);
            try {
                Toast.makeText(getApplicationContext(),"Hello in onPostExecute -- "+jsonObj.getString("title"),Toast.LENGTH_SHORT).show();
                textView.setText(jsonObj.getString("title"));
            } catch (JSONException e) {
                e.printStackTrace();
                Log.d("MainActivity","Exception -- "+e.getMessage());
            }
        }


    }




}
