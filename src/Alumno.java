public class Alumno extends Persona{
    private int matricula;
    private String curso;
    

    public Alumno(String nombre, String email) {
        super(nombre, email);
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }
}
