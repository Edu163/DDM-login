/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.util.ArrayList;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Garse
 */
public class HumanJugador {
    private String nombre;
    private String password;
    
    public HumanJugador(String nombre, String password){
        this.nombre = nombre;
        this.password = password;
    }


    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // Funciones DB
    
    public void save() throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "insert into Usuarios (TABLAUSUARIO,TABLAPASSWORD) values" + "('" + this.nombre + "','" + this.password + "')";
        stmt.executeUpdate(consulta);
    }
    
    public static HumanJugador obtener(String nombre,String password2) throws SQLException{
        Conexion conexion = new Conexion();
        boolean resultado = conexion.conectar();
        Statement stmt = conexion.crearConsulta();
        final String consulta = "SELECT TABLAUSUARIO,TABLAPASSWORD FROM Usuarios WHERE TABLAUSUARIO = '" + nombre +"' AND TABLAPASSWORD='" + password2 +"'";        
        
        ResultSet resultados;
        resultados = stmt.executeQuery(consulta);
        
        
        
        if (resultados.next()==true) {
            System.out.println("Existe");
            String nombre2 = resultados.getString("TABLAUSUARIO");
            String password = resultados.getString("TABLAPASSWORD");
            return new HumanJugador(nombre2, password);
        }
        else
        {
            System.out.println("No Existe");
            return null;
        } 
    }
}

    

