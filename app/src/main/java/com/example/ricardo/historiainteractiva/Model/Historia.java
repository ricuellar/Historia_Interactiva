package com.example.ricardo.historiainteractiva.Model;

import com.example.ricardo.historiainteractiva.R;

/**
 * Created by ricardo on 05/11/2015.
 */
public class Historia {
    private Pagina[] paginas;

    public Historia(){

        paginas= new Pagina [7];
        paginas[0]= new Pagina();
        paginas [0].setImageID(R.drawable.page0);
        paginas[0].setTexto("El marciano esta perdido");
    }
}
