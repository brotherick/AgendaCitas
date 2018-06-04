/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author brotherick
 */
public class Cita {
    private Integer idCita;
    private String nombrePaciente;
    private String fecha;
    private String doctor;
    private String especialidad;
    private String sintomas;

    public Cita(Integer idCita, String nombrePaciente, String fecha, String doctor, String especialidad, String sintomas) {
        this.idCita = idCita;
        this.nombrePaciente = nombrePaciente;
        this.fecha = fecha;
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.sintomas = sintomas;
    }

    public Cita() {
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
            
    
}
