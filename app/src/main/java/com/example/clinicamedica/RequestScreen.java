package com.example.clinicamedica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RequestScreen extends AppCompatActivity {

    private Button btnSend;
    private EditText name ;
    private EditText age ;
    private EditText birthDay;
    private RadioGroup radioGroupCategory;
    private RadioButton general;
    private RadioButton orthopedist;
    private RadioButton ophthalmologist;
    private EditText hour;
    private EditText day;

    Patient patient = new Patient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_screen);

        requestContentId();

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                accessClassContentId();
                if(radioGroupCategory.getCheckedRadioButtonId() == R.id.radioBtnSpecialtyOne) {
                    patient.setCategory(general.getText().toString());
                } else if(radioGroupCategory.getCheckedRadioButtonId() == R.id.radioBtnSpecialtyTwo) {
                    patient.setCategory(orthopedist.getText().toString());
                } else if(radioGroupCategory.getCheckedRadioButtonId() == R.id.radioBtnSpecialtyThree) {
                    patient.setCategory(ophthalmologist.getText().toString());
                } else {
                    patient.setCategory("Não informado.");
                }
                Toast.makeText(RequestScreen.this, patient.toString(), Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

    public void requestContentId() {
        btnSend = findViewById(R.id.btnSend);
        name = findViewById(R.id.editTextName);
        age = findViewById(R.id.editTextAge);
        birthDay = findViewById(R.id.editTextDate);
        radioGroupCategory = findViewById(R.id.radioGroupSpeciality);
        general = findViewById(R.id.radioBtnSpecialtyOne);
        orthopedist = findViewById(R.id.radioBtnSpecialtyTwo);
        ophthalmologist = findViewById(R.id.radioBtnSpecialtyThree);
        hour = findViewById(R.id.editTextHour);
        day = findViewById(R.id.editTextDay);
    }

    public void accessClassContentId() {
        patient.setName(name.getText().toString());
        patient.setAge(age.getText().toString());
        patient.setBirthDate(birthDay.getText().toString());
        patient.setHour(hour.getText().toString());
        patient.setDay(day.getText().toString());
    }
}