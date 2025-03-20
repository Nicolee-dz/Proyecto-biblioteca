package com.library.modelo;

import java.sql.*;
import java.util.ArrayList;

public class LectorDAO {

    private java.sql.Connection con;
    private Statement st;
    private ResultSet rs;

    public LectorDAO() {
        con = null;
        st = null;
        rs = null;
    }

    public boolean ingresarLector(String jugador) {
        try {
            String ingresar = "INSERT INTO lector(name,pass,email) "
                    + "VALUE(" + jugador + ")";
            con = Connectiondb.connection();
            st = con.createStatement();
            st.executeUpdate(ingresar);
            st.close();
            Connectiondb.disconnected();
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean entrarLector(String user, String pass) {
        String consulta = "SELECT id_lector FROM lector WHERE name = '" + user + "' AND pass = " + pass;
        try {
            con = Connectiondb.connection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                st.close();
                Connectiondb.disconnected();
                return true;
            } else {
                st.close();
                Connectiondb.disconnected();
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    public boolean nameLector(String user) {
        String consulta = "SELECT id_lector FROM lector WHERE name = '" + user + "'";
        try {
            con = Connectiondb.connection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            if (rs.next()) {
                st.close();
                Connectiondb.disconnected();
                return true;
            } else {
                st.close();
                Connectiondb.disconnected();
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }

    public ArrayList<LectorVO> MostrarLectores() {
        ArrayList<LectorVO> lectores = new ArrayList<>();
        String consulta = "SELECT * FROM lector ORDER BY id_lector";
        try {
            con = Connectiondb.connection();
            st = con.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                LectorVO lector=new LectorVO(rs.getInt("id_lector"), rs.getString("name"), rs.getString("email"));
                lectores.add(lector);
            }
            Connectiondb.disconnected();

        } catch (SQLException ex) {
        }
        return lectores;
    }
}
