package com.library.modelo;

import java.util.Date;

public class PrestamoVO {

    private static int idUsuario;
    private static int idLibro;
    private static Date fechaRetiro;
    private static Date fechaEntrega;

    public PrestamoVO(int idUsuario, int idLibro,Date fechaRetiro, Date fechaEntrega) {
        PrestamoVO.idUsuario = idUsuario;
        PrestamoVO.idLibro = idLibro;
        PrestamoVO.fechaRetiro = fechaRetiro;
        PrestamoVO.fechaEntrega = fechaEntrega;
    }

    public static int getIdUsuario() {
        return idUsuario;
    }

    public static int getIdLibro() {
        return idLibro;
    }

    public static Date getFechaRetiro() {
        return fechaRetiro;
    }

    public static Date getFechaEntrega() {
        return fechaEntrega;
    }

}
