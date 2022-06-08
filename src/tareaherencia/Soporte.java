/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class Soporte extends Empleado {

    private String agenteAsignado;

    public Soporte(String nombre, String cedula, int badgeNum, int edad, String agenteAsignado) {
        super(nombre, cedula, badgeNum, edad);

        this.agenteAsignado = agenteAsignado;
    }

    public String getCasoAsignado() {
        return agenteAsignado;
    }

    public void setCasoAsignado(String casoAsignado) {
        this.agenteAsignado = agenteAsignado;
    }

}
