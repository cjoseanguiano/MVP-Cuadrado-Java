package com.devix.www.mvp_cuadrado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ICuadrado.View {

    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView txtAlCuadrado;
    private EditText edtAlCuadrado;
    private Button button;
    private ICuadrado.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAlCuadrado = (TextView) findViewById(R.id.tvAlCuadrado);
        edtAlCuadrado = (EditText) findViewById(R.id.edAlCuadrado);
        button = (Button) findViewById(R.id.btnCalcular);
        presenter = new CuadradoPresenter(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.alCuadradoP(edtAlCuadrado.getText().toString());
            }
        });
    }

    @Override
    public void showResultV(String result) {
        txtAlCuadrado.setText(result);
    }

    @Override
    public void showErrorV(String error) {
        txtAlCuadrado.setText(error);
    }
}
