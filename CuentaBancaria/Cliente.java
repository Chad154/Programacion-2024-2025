package CuentaBancaria;

import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String direccion;
    private String localidad;
    private LocalDate fechaNacimiento;

    // constructor
    public Cliente(String nombre, String apellidos, String direccion, String localidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    // getters-setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // métodos
    public String nombreCompleto() {
        return nombre + " " + apellidos;
    }

    public String direccionCompleta() {
        return direccion + " " + localidad;
    }
}