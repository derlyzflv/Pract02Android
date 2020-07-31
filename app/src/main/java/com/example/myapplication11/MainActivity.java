package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Double Valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view){
        boolean checked=((RadioButton) view).isChecked();

        switch(view.getId()){
            case R.id.radioButton:
                if(checked)
                    Valor=Valor+5;
                break;
            case R.id.radioButton2:
                if(checked)
                    Valor=Valor+4;
                break;
            case R.id.radioButton3:
                if(checked)
                    Valor=Valor+3;
                break;
            case R.id.radioButton4:
                if(checked)
                    Valor=Valor+2;
                break;
            case R.id.radioButton5:
                if(checked)
                    Valor=Valor+1;
                break;
        }
    }

    public void onCheckboxClicked(View view){
        boolean checked=((CheckBox)view).isChecked();

        switch(view.getId()){
            case R.id.checkBox:
                if(checked)
                    Valor=Valor+1;
                else{
                    Valor=Valor+0;
                }
                break;
            case R.id.checkBox2:
                if(checked)
                    Valor=Valor+1;
                else{
                    Valor=Valor+0;
                }
                break;
        }
    }
    public void onClick(View view){
        if (view.getId()==R.id.button){
            ((EditText)view).setText(Valor.toString());
        }
    }
}