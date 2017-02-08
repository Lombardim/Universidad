package universidad;

public class Curso {
    
    private int NRC;
    private Profesor profesor;
    
    public Curso(int NRC) {
        this.NRC = NRC;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if(this.profesor == null){
        
            this.profesor = profesor;
            
        }
    }

    public int getNRC() {
        return NRC;
    }

    public void setNRC(int NRC) {
        this.NRC = NRC;
    }
    
}
