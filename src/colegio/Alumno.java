package colegio;

import java.util.Scanner;

public class Alumno extends Persona {
    protected String grupo;
    protected String horario;

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Alumno(String nombre, String apellido, int nacimiento, String grupo, String horario) {

        super(nombre, apellido, nacimiento);// atributos heredados de la clase padre
        this.grupo = grupo;
        this.horario = horario;
    }

    public void grupoTurno(String grupo, String horario) {
        this.grupo = grupo;
        this.horario = horario;
    }

    public void GrupoTurno(String grupo, String horario) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce grupo al que pertenece el alumno");
        grupo = in.nextLine();
        System.out.println("Indica el horario del grupo al que pertenece el alumno");
        horario = in.nextLine();
        in.close();
    }

    public void VisualizarAlumno() {
        System.out.println("Los datos del alumno son:");
        Imprime();
        System.out.println();
        System.out.print("\t" + "\t" + "\t" + "Grupo: " + grupo);
        System.out.print("\t" + "\t" + "\t" + "Horario: " + horario);
    }

}
