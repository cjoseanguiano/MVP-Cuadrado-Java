package com.devix.www.mvp_cuadrado;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class CuadradoModel implements ICuadrado.Model {

    private ICuadrado.Presenter presenter;
    private double resultado;

    public CuadradoModel(ICuadrado.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void alCuadradoM(String data) {
        if (data.equals("")) {
            presenter.showErrorP("Error");
        } else {
            resultado = Double.valueOf(data) * Double.valueOf(data);
            presenter.showResultP(String.valueOf(resultado));
        }
    }
}
