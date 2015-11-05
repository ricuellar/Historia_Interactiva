package com.example.ricardo.historiainteractiva.Model;

/**
 * Created by ricardo on 05/11/2015.
 */
public class Choice {
    private String texto;
    private int siguientePagina;
    private Choice opcion1;
    private Choice opcion2;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getSiguientePagina() {
        return siguientePagina;
    }

    public void setSiguientePagina(int siguientePagina) {
        this.siguientePagina = siguientePagina;
    }

    public Choice getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(Choice opcion1) {
        this.opcion1 = opcion1;
    }

    public Choice getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(Choice opcion2) {
        this.opcion2 = opcion2;
    }
}
