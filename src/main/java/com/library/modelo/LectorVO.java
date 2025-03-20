
package com.library.modelo;

import java.util.ArrayList;


public class LectorVO extends UsuarioVO {
    
    private ArrayList<PrestamoVO> prestamos;

    public LectorVO( int id, String name, String email) {
        super(id, name, email);
    }

    public ArrayList<PrestamoVO> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<PrestamoVO> prestamos) {
        this.prestamos = prestamos;
    }

  
    
}
