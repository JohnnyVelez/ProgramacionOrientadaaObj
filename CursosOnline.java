/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline;

import CursoDao.CursoDAO;
import CursoDao.CursoDAOlmpl;
import entidades.Cursos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CursosOnline {

    private final static   String URL = "jdbc:postgresql://localhost:5432/cursos_online";
    private final static String USUARIO = "postgres";
    private final static String CLAVE = "1234";
    
    public static void main(String[]args){
       
        CursoDAO cursoDAO = new CursoDAOlmpl();
        
        Cursos newCurso= new Cursos(3,"Modificado Java");
        cursoDAO.eliminar(3);
//        cursoDAO.actualizar(newCurso);
        
        
 
//        cursoDAO.ingresar(newCurso);
        
        
//        cursos = cursoDAO.getCursos();
//        System.out.println(cursos.size());


        List <Cursos> cursos = cursoDAO.getCursos();
        System.out.println(cursos);
       
        
        
        
        
        
        
        
        
//       Connection conn; 
//       try{
//        conn = DriverManager.getConnection(URL,USUARIO,CLAVE);
//        System.out.println("conexion exitosa!!");
//        String sql = "SELECT id, nombre FROM public.cursos;";
//        PreparedStatement stm= conn.prepareStatement(sql);
//                
//        ResultSet rs= stm.executeQuery();
//                while(rs.next())
//                {
//                    System.out.println(rs.getInt(1)+ "" +rs.getString(2));
//                
//                }
//                
//                }
//       catch (SQLException e)
//       {
//           e.printStackTrace();
//       
//       
//       }
//        
//        
    }
    
}
