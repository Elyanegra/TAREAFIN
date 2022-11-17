/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 21PROGA005
 */
public class alumno {
    
    private string nombre,apellido,especialidad,grupo;
    private int grado;

    public alumno(string nombre, string apellido, string especialidad, string grupo, int grado) {
        this.nombre = null;
        this.apellido = null;
        this.especialidad = null;
        this.grupo = null;
        this.grado = 0;
    }
    private double c1,c2,c3;

    public alumno() {
    }

    public string getNombre() {
        return nombre;
    }

    public void setNombre(string nombre) {
        this.nombre = nombre;
    }

    public string getApellido() {
        return apellido;
    }

    public void setApellido(string apellido) {
        this.apellido = apellido;
    }

    public string getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(string especialidad) {
        this.especialidad = especialidad;
    }

    public string getGrupo() {
        return grupo;
    }

    public void setGrupo(string grupo) {
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public double getC1() {
        return c1;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC2(double c2) {
        this.c2 = c2;
    }

    public double getC3() {
        return c3;
    }

    public void setC3(double c3) {
        this.c3 = c3;
    }
    
    public double promedio () { 
    return (c1+c2+c3)/3;

        }
}

     

