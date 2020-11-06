package com.nsc.voyage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String gouvernorats[] = {"Bizerte","Sousse","Tunis"};
    public static final String typeEssence[] = {"Super sans plomb","Gasoil Super","Gasoil"};


    //déclaration des contrôles
    EditText txtConsoLitreKm;
    TextView txtDistance,txtPrixLitre,txtMessageResultat;
    Spinner spnSource,spnDestination,spnTypeEssence;
    RadioButton rdbRouteNationale,rdbAutoroute;
    CheckBox chkEau,chkPizza,chkCafe;
    Button btnCalculer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // liaison des contrôles
        txtConsoLitreKm = (EditText) findViewById(R.id.txtConsoLitreKm);
        txtDistance = (TextView) findViewById(R.id.txtDistance);
        txtPrixLitre = (TextView) findViewById(R.id.txtPrixLitre);
        txtMessageResultat = (TextView) findViewById(R.id.txtMessageResultat);
        spnSource = (Spinner) findViewById(R.id.spnSource);
        spnDestination = (Spinner) findViewById(R.id.spnDestination);
        spnTypeEssence = (Spinner) findViewById(R.id.spnTypeEssence);
        rdbRouteNationale = (RadioButton) findViewById(R.id.rdbRouteNationale);
        rdbAutoroute = (RadioButton) findViewById(R.id.rdbAutoroute);
        chkEau = (CheckBox)findViewById(R.id.chkEau);
        chkPizza = (CheckBox)findViewById(R.id.chkPizza);
        chkCafe = (CheckBox)findViewById(R.id.chkCafe);
        btnCalculer =(Button) findViewById(R.id.btnCalculer);
//initialisations
        ArrayAdapter<String>  adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,gouvernorats );
        spnSource.setAdapter(adapter);
        spnDestination.setAdapter(adapter);
        ArrayAdapter<String>  adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,typeEssence );
        spnTypeEssence.setAdapter(adapter2);
    }
}