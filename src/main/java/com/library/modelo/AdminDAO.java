package com.library.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDAO {

    private java.sql.Connection con;
    private Statement st;
    private ResultSet rs;

    public AdminDAO() {
        con = null;
        st = null;
        rs = null;
    }

    public boolean ingresarAdmin(String admin) {
        try {
            String ingresar = "INSERT INTO admin(user,pass,email) "
                    + "VALUE(" + admin + ")";
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

    public boolean entrarAdmin(String user, String pass) {
        String consulta = "SELECT admin_id FROM admin WHERE user = '" + user + "' AND pass = " + pass;
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

    public boolean nameAdmin(String user) {
        String consulta = "SELECT admin_id FROM admin WHERE user = '" + user + "'";
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

}
