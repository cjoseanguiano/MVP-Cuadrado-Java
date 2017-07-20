package com.devix.www.mvp_cuadrado;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public class CuadradoPresenter implements ICuadrado.Presenter {

    private ICuadrado.View view;
    private ICuadrado.Model model;

    public CuadradoPresenter(ICuadrado.View view) {
        this.view = view;
        model = new CuadradoModel(this);
    }

    @Override
    public void showResultP(String result) {
        if (view != null) {
            view.showResultV(result);
        }
    }

    @Override
    public void alCuadradoP(String data) {
        if (view != null) {
            model.alCuadradoM(data);
        }
    }

    @Override
    public void showErrorP(String error) {
        if (view != null) {
            view.showResultV(error);
        }
    }

}
