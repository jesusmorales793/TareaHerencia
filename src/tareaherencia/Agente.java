/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class Agente extends Empleado {

    private String casoAsignado;

    public Agente(String nombre, String cedula, int badgeNum, int edad, String casoAsignado) {
        super(nombre, cedula, badgeNum, edad);
        this.casoAsignado = casoAsignado;

    }

    public String getCasoAsignado() {
        return casoAsignado;
    }

    public void setCasoAsignado(String casoAsignado) {
        this.casoAsignado = casoAsignado;
    }

    @Override
    public String trabajoHoraSalida() {
        return "Hoy salgo a las 6:30pm y soy un Agente.";
    }
}
