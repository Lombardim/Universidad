package universidad;

import java.util.ArrayList;

public class Universidad {
    
    
    ArrayList <Curso> cursos;
    ArrayList <Profesor> profesores;
    ArrayList <Estudiante> estudiantes;
    
    public Universidad(){
        
        cursos = new ArrayList<>();
        profesores = new ArrayList<>();
       
    }
    
    public void agregarProfesor(){
        
        Profesor P1 = new Profesor(1);
        profesores.add(P1);
        
    }
    
    public void agregarCurso(){
        
        Curso C1 = new Curso(10);
        cursos.add(C1);
        
    }
    
    public void agregarEstudiante(){
        
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
        
        p.agregarCurso(c);
        
        c.setProfesor(p);
        
    }
    
    public static void main(String[] args) {
        
    }       
}