package universidad;

import java.util.ArrayList;

public class Profesor {
    
    int ID;
    String nombre;
    private ArrayList <Curso> cursos;
    
    public Profesor(int ID){
        
        this.ID = ID;
        cursos = new ArrayList();
        
    }
    
    public void agregarCurso(Curso curso){
            
        if(cursos.size() < 10){
            
            cursos.add(curso);
            
        }
    }
    
}
