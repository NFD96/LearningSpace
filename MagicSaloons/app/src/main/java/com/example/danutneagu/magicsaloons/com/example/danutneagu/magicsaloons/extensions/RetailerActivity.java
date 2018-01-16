package com.example.danutneagu.magicsaloons.com.example.danutneagu.magicsaloons.extensions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


import static com.example.danutneagu.magicsaloons.R.*;

public class RetailerActivity extends AppCompatActivity {
    private static final String SOAP_ACTION = "http://localhost:3306/retailer";
    private static final String METHOD_NAME = "retailer";
    private static final String NAMESPACE = "http://localhost";
    private static final String URL = "http://localhost:3306";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_retailer);
        SoapObject request = new SoapObject(NAMESPACE, METHOD_NAME);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);

        envelope.setOutputSoapObject(request);

        HttpTransportSE ht = new HttpTransportSE(URL);
        try {
            ht.call(SOAP_ACTION, envelope);
            SoapPrimitive response = (SoapPrimitive)envelope.getResponse();
            SoapPrimitive s = response;
            String str = s.toString();
            String resultArr[] = str.split("&");//Result string will split & store in an array

            TextView tv = new TextView(this);

            for(int i = 0; i<resultArr.length;i++){
                tv.append(resultArr[i]+"\n\n");
            }
            setContentView(tv);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
