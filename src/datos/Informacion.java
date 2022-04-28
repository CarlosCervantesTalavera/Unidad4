/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author carlo
 */
public class Informacion {
    
    String Nombre;
    String Escuela;
    String Carrera;
    int NumSemestre;

    public Informacion(String Nombre, String Escuela, String Carrera, int NumSemestre) {
        this.Nombre = Nombre;
        this.Escuela = Escuela;
        this.Carrera = Carrera;
        this.NumSemestre = NumSemestre;
    }

    public String getNombre() {
        return " El nombre es: " + Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEscuela() {
        return " Escuela: " + Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public String getCarrera() {
        return " Carrera: " + Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getNumSemestre() {
        return " Numero de Semestre:" + NumSemestre;
    }

    public void setNumSemestre(int NumSemestre) {
        this.NumSemestre = NumSemestre;
    }

  
    
    
}
