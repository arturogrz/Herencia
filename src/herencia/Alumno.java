package herencia;
    public class Alumno extends Persona{
    private String clave;
    private String grupo;
    private int semestre;
    private String carrera;
    //-------------------------------------------------------------------
    public Alumno(String nombre, int edad, String sexo, String direccion,
            String clave,String grupo,int semestre,String carrera) {
        super(nombre, edad, sexo, direccion);
        this.clave = clave;
        this.grupo = grupo;
        this.semestre = semestre;
        this.carrera = carrera;
    }
    //-------------------------------------------------------------------
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    
        
        
    
    
}
