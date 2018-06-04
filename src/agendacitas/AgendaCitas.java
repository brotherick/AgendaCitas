/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendacitas;

import bean.Cita;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import manejador.ManejadorCita;

/**
 *
 * @author brotherick
 */
public class AgendaCitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion = 0;
        do{
            System.out.println("MENU AGENDA DE CITAS");
            System.out.println("AGREGAR = 1");
            System.out.println("BUSCAR = 2");
            System.out.println("ELIMINAR = 3");
            System.out.println("MOSTRAR = 4");
            System.out.println("SALIR = 5");
            opcion = Integer.parseInt(br.readLine());
            switch(opcion){
                case 1:
                    Cita nueva = new Cita();
                    System.out.println("Usted selecciono Agregar");
                    System.out.println("Nombre de Paciente: ");
                    nueva.setNombrePaciente(br.readLine());
                    System.out.println("Fecha y hora en que el paciente estara asistiendo: ");
                    nueva.setFecha(br.readLine());
                    System.out.println("Nombre del doctor: ");
                    nueva.setDoctor(br.readLine());
                    System.out.println("Especialidad: ");
                    nueva.setEspecialidad(br.readLine());
                    System.out.println("Escriba los sintomas del paciente: ");
                    nueva.setSintomas(br.readLine());
                    ManejadorCita.INSTANCIA.agregar(nueva);
                    break;
                case 2:
                    System.out.println("Ingrese un nombre de paciente para buscar la cita");
                    Cita buscar = ManejadorCita.INSTANCIA.buscar(br.readLine());
                    if(buscar != null){
                        System.out.println("CONTACTO ENCONTRADO!");
                        System.out.println("Paciente: " + buscar.getNombrePaciente() + " Fecha y hora de la cita: " + buscar.getFecha() +
                        " Doctor: " + buscar.getDoctor() + " Especialidad: " + buscar.getEspecialidad() + " Sintomas: " + buscar.getSintomas());
                    }else{
                        System.out.println("CONTACTO NO ENCONTRADO!");
                    }
                    break;
                case 3:
                    System.out.println("Usted selecciono Eliminar");
                    for(Cita c:ManejadorCita.INSTANCIA.listar()){
                        System.out.println("Paciente: " + c.getNombrePaciente() + " Fecha y hora de la cita: " + c.getFecha() +
                        " Doctor: " + c.getDoctor() + " Especialidad: " + c.getEspecialidad() + " Sintomas: " + c.getSintomas());
                    }
                    System.out.println("Ingrese nombre de paciente para eliminar cita");
                    Cita eliminar = ManejadorCita.INSTANCIA.buscar(br.readLine());
                    ManejadorCita.INSTANCIA.eliminar(eliminar);
                    break;
                case 4:
                    System.out.println("Usted selecciono Mostrar");
                    for(Cita c:ManejadorCita.INSTANCIA.listar()){
                        System.out.println("Paciente: " + c.getNombrePaciente() + " Fecha y hora de la cita: " + c.getFecha() +
                        " Doctor: " + c.getDoctor() + " Especialidad: " + c.getEspecialidad() + " Sintomas: " + c.getSintomas());
                    }
                    break;                  
            }
        }while(opcion != 5);
    }
    
}
