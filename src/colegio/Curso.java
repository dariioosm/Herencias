package colegio;

    public class Curso extends Alumno {
        public Curso(String nombre, String apellido, int nacimiento, String grupo, String horario) {
            super(nombre, apellido, nacimiento, grupo, horario);
        }
    
        public static void main(String[] args) {
            Alumno alum1 = new Alumno("Dario", "Sanchez", 2000, "DAW", "mannana");
            Alumno alum2 = new Alumno("Pepito", "Alvarez Perez", 1975, "Distancia", "Tarde");
            System.out.println(
                    "====================================================================================================");
            alum1.VisualizarAlumno();
            System.out.println();
            System.out.println(
                    "====================================================================================================");
            alum2.VisualizarAlumno();
    
            Profesor profe1 = new Profesor("Viti", "Jefe", 1980, "Informatica", 33);
            Profesor profe2 = new Profesor("Rio", "Ferdinand", 1978, "Talleres", 21);
            System.out.println();
    
            profe1.visualizarProfesor();
            System.out.println();
            profe2.visualizarProfesor();
    
        }
    
}
