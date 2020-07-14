/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoDao;

import entidades.Cursos;
import java.util.List;

/**
 *
 * @author Johnny
 */
public interface CursoDAO {
    void ingresar(Cursos curso);
    void actualizar (Cursos cursos);
    void eliminar (int id);
    List<Cursos> getCursos();
    
}
