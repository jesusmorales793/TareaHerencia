/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaherencia;

/**
 *
 * @author admin
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jesus", "KJSDS6", 48235, 35);
        Agente agente1 = new Agente("Juan", "HYICS2", 55668, 22, "AC-558");
        Tier2 tier21 = new Tier2("Luis", "HYI3000", 556581, 22, "Jason", "ESC885");

        System.out.println("Datos: " + empleado1.trabajoHoraSalida());

        System.out.println("Datos: " + agente1.trabajoHoraSalida());

        System.out.println("Nombre Tier2: " + tier21.getNombre());
    }
}
