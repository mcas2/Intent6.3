package com.mcas2.intent63;

import java.util.Date;

public class Person {
    public Person (){

    }

    public enum TipoCentro {
        PUBLICO, CONCERTADO, PRIVADO, EXTERIOR
    }

    private String nombre;
    private String apellido1;
    private String apellido2;
    private String domicilio;
    private String nacionalidad;
    private Date fechaNacimiento;
    private String NIF;
    private Person tutor1;
    private Person tutor2;
    private String centroProcedencia;
    private String cursoProcedencia;
    private TipoCentro tipoCentro;
    private boolean becado;

    public Person(String nombre, String apellido1, String apellido2,
                  String domicilio, String nacionalidad, Date fechaNacimiento,
                  String NIF, Person tutor1, Person tutor2, String centroProcedencia,
                  String cursoProcedencia, TipoCentro tipoCentro, boolean becado) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.domicilio = domicilio;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.NIF = NIF;
        this.tutor1 = tutor1;
        this.tutor2 = tutor2;
        this.centroProcedencia = centroProcedencia;
        this.cursoProcedencia = cursoProcedencia;
        this.tipoCentro = tipoCentro;
        this.becado = becado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Person getTutor1() {
        return tutor1;
    }

    public void setTutor1(Person tutor1) {
        this.tutor1 = tutor1;
    }

    public Person getTutor2() {
        return tutor2;
    }

    public void setTutor2(Person tutor2) {
        this.tutor2 = tutor2;
    }

    public String getCentroProcedencia() {
        return centroProcedencia;
    }

    public void setCentroProcedencia(String centroProcedencia) {
        this.centroProcedencia = centroProcedencia;
    }

    public String getCursoProcedencia() {
        return cursoProcedencia;
    }

    public void setCursoProcedencia(String cursoProcedencia) {
        this.cursoProcedencia = cursoProcedencia;
    }

    public TipoCentro getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(TipoCentro tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public boolean isBecado() {
        return becado;
    }

    public void setBecado(boolean becado) {
        this.becado = becado;
    }
}
