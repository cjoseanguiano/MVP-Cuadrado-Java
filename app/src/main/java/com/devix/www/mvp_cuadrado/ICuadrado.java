package com.devix.www.mvp_cuadrado;

/**
 * Created by Carlos Anguiano on 20/07/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

public interface ICuadrado {

    interface Presenter {
        void showResultP(String result);

        void alCuadradoP(String data);

        void showErrorP(String error);
    }

    interface View {
        void showResultV(String result);

        void showErrorV(String error);
    }

    public interface Model {
        void alCuadradoM(String data);
    }
}
