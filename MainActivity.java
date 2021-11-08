package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);

    }

    public void EscribirPunto(View view) {
        if( !String.valueOf(tvResultado.getText()).contains(".") ){
            tvResultado.setText(tvResultado.getText() + ".");
        }
    }

    public void EscribirCero(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("0");
        }else{
            tvResultado.setText(tvResultado.getText() + "0");
        }
    }

    public void EscribirUno(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }
    }

    public void EscribirDos(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("2");
        }else{
            tvResultado.setText(tvResultado.getText() + "2");
        }
    }

    public void EscribirTres(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("3");
        }else{
            tvResultado.setText(tvResultado.getText() + "3");
        }
    }

    public void EscribirCuatro(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("4");
        }else{
            tvResultado.setText(tvResultado.getText() + "4");
        }
    }

    public void EscribirCinco(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("5");
        }else{
            tvResultado.setText(tvResultado.getText() + "5");
        }
    }

    public void EscribirSeis(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("6");
        }else{
            tvResultado.setText(tvResultado.getText() + "6");
        }
    }

    public void EscribirSiete(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("7");
        }else{
            tvResultado.setText(tvResultado.getText() + "7");
        }
    }

    public void EscribirOcho(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("8");
        }else{
            tvResultado.setText(tvResultado.getText() + "8");
        }
    }

    public void EscribirNueve(View view) {
        float valor = Float.parseFloat(tvResultado.getText().toString());
        if(valor == 0.0f){
            tvResultado.setText("9");
        }else{
            tvResultado.setText(tvResultado.getText() + "9");
        }
    }

    public void LimpiarResultado(View view) {
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        tvResultado.setText("0");
    }

    public void OperacionDividir(View view) {
        numero1 = Float.parseFloat(String.valueOf(tvResultado.getText()));
        operacion = "/";
        tvResultado.setText("0");
    }

    public void OperacionSumar(View view) {
        numero1 = Float.parseFloat(String.valueOf(tvResultado.getText()));
        operacion = "+";
        tvResultado.setText("0");
    }

    public void OperacionRestar(View view) {
        numero1 = Float.parseFloat(String.valueOf(tvResultado.getText()));
        operacion = "-";
        tvResultado.setText("0");
    }

    public void OperacionMultiplicar(View view) {
        numero1 = Float.parseFloat(String.valueOf(tvResultado.getText()));
        operacion = "*";
        tvResultado.setText("0");
    }


    public void MostrarResultado(View view) {
        numero2 = Float.parseFloat(String.valueOf(tvResultado.getText()));
        float result = 0.0f;

        if(operacion.equals("%")){
            result = (numero1 / 100.0f) * numero2;
        }if(operacion.equals("/")){
            if(numero2 != 0.0f){
                result = numero1 / numero2;
            }else{
                result = 0.0f;
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            }
        }else if(operacion.equals("*")){
            result = numero1 * numero2;
        }else if(operacion.equals("-")){
            result = numero1 - numero2;
        }else if(operacion.equals("+")){
            result = numero1 + numero2;
        }

        tvResultado.setText(result + "");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";

    }


    public void actInfo(View view) {
        Intent info = new Intent(this, acti2Info.class);
        startActivity(info);
    }
}