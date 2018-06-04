/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejador;

import bean.Cita;
import java.util.ArrayList;

/**
 *
 * @author brotherick
 */
public class ManejadorCita {
    private ArrayList<Cita> lista;
    public static ManejadorCita INSTANCIA=new ManejadorCita();
    
    public ManejadorCita(){
        lista = new ArrayList<>();
    }
    
    public void agregar(Cita c){
        lista.add(c);
    }
    
    public void eliminar(Cita c){
        lista.remove(c);
    }
    
    public void editar(Cita c){
        lista.replace();
        
    }
    
    public ArrayList<Cita> listar(){
        return this.lista;
    }
    
    public Cita buscar(String nombre){
        Cita encontrado = null;
        for(Cita c:lista){
            if(c.getNombrePaciente().equals(nombre) == true){
                encontrado = c;
            }
        }
        return encontrado;
    }
    
}
