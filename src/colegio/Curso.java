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
            System.out.println();
            System.out.println("***********************************************************************************************");
            //metodo con el objeto vacio

            Alumno alum3= new Alumno();
            alum3.setNombre("Kepa");
            alum3.setApellido("Sago Legui");
            alum3.setNacimiento(1982);
            alum3.setGrupo("DAW1");
            alum3.setHorario("Mannana");
            System.out.println(alum3.toString());
            System.out.println();
            System.out.println("***********************************************************************************************");
            Profesor profe3= new Profesor();
            profe3.setNombre("jiij");
            profe3.setApellido("Fernandez");
            profe3.setNacimiento(68);
            profe3.setDepartamento("ufologia");
            profe3.setNrp(87);
            System.out.println(profe3.toString());
        }
}
