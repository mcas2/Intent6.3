package com.mcas2.intent63;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String [] registerArray = {"Datos del alumno", "Datos del primer tutor", "Datos del segundo tutor", "Datos de escolarización"};
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner registerSpinner = findViewById(R.id.registerSpinner);
        arrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, registerArray);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);

        registerSpinner.setAdapter(arrayAdapter);


        registerSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(), RegisterPersonData.class);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default:
                        intent = null;
                        Toast toast = Toast.makeText(view.getContext(), "Seleccione una opción.", Toast.LENGTH_LONG);
                        toast.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
}
