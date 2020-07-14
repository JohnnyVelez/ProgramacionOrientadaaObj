/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoDao;

import CursoDao.CursoDAO;
import entidades.Cursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.util;

/**
 *
 * @author Johnny
 */
public class CursoDAOlmpl implements CursoDAO {
    

    @Override
    public List<Cursos> getCursos() {
          List<Cursos> cursos = new ArrayList<>();
          Connection conn; 
       try{
        conn = DriverManager.getConnection(util.URL,util.USUARIO,util.CLAVE);
        System.out.println("!!conexion exitosa!!");
        String sql = "SELECT id, nombre FROM public.cursos;";
        PreparedStatement stm= conn.prepareStatement(sql);
                
        ResultSet rs= stm.executeQuery();
                while(rs.next())
                {
                     Cursos curso = new Cursos(rs.getInt(1),rs.getString(2));
                     cursos.add(curso);
                }
                
                }
       catch (SQLException e)
       {
           e.printStackTrace();
       
       
       }
       return cursos; 

        
    }

    @Override
    public void ingresar(Cursos curso) {
//       INSERT INTO public.cursos( nombre)VALUES (?);
        String query= "INSERT INTO public.cursos( nombre)VALUES (?);";
        Connection conn; 
        try{
        conn = DriverManager.getConnection(util.URL,util.USUARIO,util.CLAVE);
        PreparedStatement stm= conn.prepareStatement(query);
        stm.setString(1, curso.getNombre());
        stm.execute();
        }       
        
       catch (SQLException e)
       {
           e.printStackTrace();
       
       
       }
      
    }

    @Override
    public void actualizar(Cursos cursos) {
        String query= "UPDATE public.cursos SET nombre=? WHERE id=?;";
        Connection conn; 
         try{
        conn = DriverManager.getConnection(util.URL,util.USUARIO,util.CLAVE);
        PreparedStatement stm= conn.prepareStatement(query);
        stm.setString(1, cursos.getNombre());
        stm.setInt(2, cursos.getId());
        stm.execute();
        }       
        
       catch (SQLException e)
       {
           e.printStackTrace();
       
       
       }
    }

    @Override
    public void eliminar(int id) {
         String query= "DELETE FROM public.cursos WHERE id=?;";
        Connection conn; 
         try{
        conn = DriverManager.getConnection(util.URL,util.USUARIO,util.CLAVE);
        PreparedStatement stm= conn.prepareStatement(query);
        stm.setInt(1, id);
        stm.execute();
        }       
        
       catch (SQLException e)
       {
           e.printStackTrace();
       
       
       }
    }

   
    
    
}    
    

