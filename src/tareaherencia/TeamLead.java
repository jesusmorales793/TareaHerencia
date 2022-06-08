/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class TeamLead extends Management {

    private int NumAgentes;

    public TeamLead(String nombre, String cedula, int badgeNum, int edad, String equipoAsignado, int NumAgentes) {
        super(nombre, cedula, badgeNum, edad, equipoAsignado);
        this.NumAgentes = NumAgentes;
    }

    public int getNumAgentes() {
        return NumAgentes;
    }

    public void setNumAgentes(int NumAgentes) {
        this.NumAgentes = NumAgentes;
    }
}
