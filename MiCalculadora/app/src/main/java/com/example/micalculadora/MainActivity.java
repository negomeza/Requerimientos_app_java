package com.example.micalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variables para almacenar los números y operaciones
    private StringBuilder input = new StringBuilder();
    private double num1 = 0;
    private double num2 = 0;
    private char operator;

    // Elementos de la interfaz de usuario
    private TextView txtResultado;
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button buttonSuma, buttonResta, buttonMultiplicacion, buttonDivision, buttonIgual, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los elementos de la interfaz de usuario
        txtResultado = findViewById(R.id.txtResultado);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonSuma = findViewById(R.id.button_suma);
        buttonResta = findViewById(R.id.button_menos);
        buttonMultiplicacion = findViewById(R.id.button_multiplicacion);
        buttonDivision = findViewById(R.id.button_division);
        buttonIgual = findViewById(R.id.button_igual);
        buttonReset = findViewById(R.id.button_reset);

        // Configurando los listeners de los botones numéricos
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("0");
                txtResultado.setText(input.toString());
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("1");
                txtResultado.setText(input.toString());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("2");
                txtResultado.setText(input.toString());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("3");
                txtResultado.setText(input.toString());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("4");
                txtResultado.setText(input.toString());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("5");
                txtResultado.setText(input.toString());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("6");
                txtResultado.setText(input.toString());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("7");
                txtResultado.setText(input.toString());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("8");
                txtResultado.setText(input.toString());
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.append("9");
                txtResultado.setText(input.toString());
            }
        });


        // Configurando los listeners de los botones de operación
        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('+');
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('-');
            }
        });

        buttonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('*');
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOperation('/');
            }
        });

        buttonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetCalculator();
            }
        });
    }

    private void performOperation(char operator) {
        if (input.length() > 0) {
            num1 = Double.parseDouble(input.toString());
            this.operator = operator;
            input.setLength(0);
        }
    }

    private void calculateResult() {
        if (input.length() > 0) {
            num2 = Double.parseDouble(input.toString());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }

            input.setLength(0);
            input.append(result);
            txtResultado.setText(input.toString());
        }
    }

    private void resetCalculator() {
        input.setLength(0);
        num1 = 0;
        num2 = 0;
        txtResultado.setText("0");
    }
}
