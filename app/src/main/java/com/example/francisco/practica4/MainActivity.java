package com.example.francisco.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnConvertir;
    private EditText edTxtNum;
    private TextView txtB100,txtB50,txtB20,txtM5,txtM2,
    txtM1,txtC50,txtC20,txtC10,txtVi10,txtVi11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConvertir = (Button)findViewById(R.id.btn1);
        edTxtNum = (EditText)findViewById(R.id.edtxt1);
        txtB100= (TextView)findViewById(R.id.tvB100);
        txtB50 = (TextView)findViewById(R.id.tvB50);
        txtB20 = (TextView)findViewById(R.id.tvB20);
        txtM5 = (TextView)findViewById(R.id.tvM5);
        txtM2 = (TextView)findViewById(R.id.tvM2);
        txtM1 = (TextView)findViewById(R.id.tvM1);
        txtC50 = (TextView)findViewById(R.id.tvC50);
        txtC20 = (TextView)findViewById(R.id.tvC20);
        txtC10 = (TextView)findViewById(R.id.tvC10);




        btnConvertir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String cant = edTxtNum.getText().toString();
                int parEnt, parDec;
                int b100, b50, b20, M5, M2, M1, c50, c20, c10;
                double num = Double.parseDouble(cant);
                parEnt = (int)(num);
                b100 = parEnt/100;
                parEnt = parEnt%100;
                b50 = parEnt/50;
                parEnt = parEnt%50;
                b20 = parEnt/20;
                parEnt = parEnt%20;
                M5 = parEnt/5;
                parEnt = parEnt%5;
                M2 = parEnt/2;
                parEnt= parEnt%2;
                M1 = parEnt;

                parDec = (int)(num * 1000+0.5);
                c50 = parDec/500;
                parDec = parDec%500;
                c20 = parDec/200;
                parDec = parDec%200;
                c10 = parDec/100;

                String res1 = "", res2 = "", res3 = "", res4 = "", res5 = "", res6 = "",
                res7 = "", res8 = "", res9 = "";
                res1 = "El total de billetes de 100 es: " + b100 + "";
                res2 = "El total de billetes de 50 es: " + b50 + "";
                res3 = "El total de billetes de 20 es: " + b20 + "";
                res4 = "El total de monedas de 5 es: " + M5 + "";
                res5 = "El total de monedas de 2 es: " + M2 + "";
                res6 = "El total de monedas de 1 es: " + M1 + "";
                res7 = "El total de monedas de 50 centavos es: " + c50 + "";
                res8 = "El total de monedas de 20 centavos es: " + c20 + "";
                res9 = "El total de monedas de 10 centavos es: " + c10 + "";


                txtB100.setText(res1);
                txtB50.setText(res2);
                txtB20.setText(res3);
                txtM5.setText(res4);
                txtM2.setText(res5);
                txtM1.setText(res6);
                txtC50.setText(res7);
                txtC20.setText(res8);
                txtC10.setText(res9);






            }

        });

    }
}