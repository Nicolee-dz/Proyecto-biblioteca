
package com.library.modelo;

public class LibroVO {
    private static String titulo;
    private static String autor;
    private static String genero;
    private int unidDispo;

    
     public LibroVO(String titulo, String autor, String genero, int unidDispo) {
        LibroVO.titulo = titulo;
        LibroVO.autor = autor;
        LibroVO.genero = genero;
        this.unidDispo = unidDispo;
    }

    public static String getTitulo() {
        return titulo;
    }

    public static String getAutor() {
        return autor;
    }

    public static String getGenero() {
        return genero;
    }

    public int getUnidDispo() {
        return unidDispo;
    }

    public void setUnidDispo(int unidDispo) {
        this.unidDispo = unidDispo;
    }
    
}
