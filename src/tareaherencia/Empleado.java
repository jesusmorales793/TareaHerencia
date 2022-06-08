/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class Empleado {

    private String nombre;
    private String cedula;
    private int badgeNum;
    private int edad;

    public Empleado(String nombre, String cedula, int badgeNum, int edad) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.badgeNum = badgeNum;
        this.edad = edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getBadgeNum() {
        return badgeNum;
    }

    public int getEdad() {
        return edad;
    }

    public String trabajoHoraSalida() {
        return "Hoy salgo a las 3pm y soy empleado";
    }
}
