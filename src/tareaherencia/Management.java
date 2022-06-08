/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txtto change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class Management extends Empleado {

    private String equipoAsignado;

    public Management(String nombre, String cedula, int badgeNum, int edad, String equipoAsignado) {
        super(nombre, cedula, badgeNum, edad);

        this.equipoAsignado = equipoAsignado;
    }

    public String getEquipoAsignado() {
        return equipoAsignado;
    }

    public void setEquipoAsignado(String equipoAsignado) {
        this.equipoAsignado = equipoAsignado;
    }

}
