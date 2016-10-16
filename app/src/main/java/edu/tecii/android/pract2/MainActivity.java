package edu.tecii.android.pract2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txt1,txt2,txt3,r1,r2;
    Button boton;
    EditText edt1,edt2,edt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView)findViewById(R.id.textView2);
        txt2 = (TextView)findViewById(R.id.textView3);
        txt3 = (TextView)findViewById(R.id.textView4);
        r1 = (TextView)findViewById(R.id.textView5);
        r2 = (TextView)findViewById(R.id.textView6);
        boton = (Button)findViewById(R.id.button);
        boton.setOnClickListener(this);
        edt1 = (EditText)findViewById(R.id.editText) ;
        edt2 = (EditText)findViewById(R.id.editText2) ;
        edt3 = (EditText)findViewById(R.id.editText3) ;
    }
    public double getDecimal(int decs,double dec){
        dec = dec*(java.lang.Math.pow(10, decs));
        dec = java.lang.Math.round(dec);
        dec = dec/java.lang.Math.pow(10, decs);

        return dec;
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
                double cap = Double.parseDouble(edt1.getText().toString());
                double tas = Double.parseDouble(edt2.getText().toString());
                double per = Double.parseDouble(edt3.getText().toString());
                double total = cap*Math.pow((1+tas/100),per);
                double total2 = total-cap;

                r1.setText("Monto igual a = " + getDecimal(2,total));
                r2.setText("Interes total =  " + getDecimal(2,total2));
                break;
        }
    }
}
