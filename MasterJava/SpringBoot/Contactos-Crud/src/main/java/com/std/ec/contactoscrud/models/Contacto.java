package com.std.ec.contactoscrud.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Contacto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Debe ingresar su nombre")
    private String nombre;
    @NotEmpty(message = "Debe ingresar su email")
    @Email
    private String email;

    @NotBlank(message = "Debe ingresar su celular")
    private String celular;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past // Solo permite fechas en el pasado
    @NotNull(message = "Debe ingresar su fecha de nacimiento")
    private LocalDate fechaNacimiento;
    private LocalDateTime fechaRegistro;

    public Contacto() {
    }

    public Contacto(Integer id, String nombre, String email, String celular, LocalDate fechaNacimiento, LocalDateTime fechaRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaRegistro = fechaRegistro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    // Yo cuando yo cree un nuevo objeto le va a signar por defecto la fecha de hoy
    @PrePersist
    public void asignarFechaRegistro(){
        fechaRegistro = LocalDateTime.now();
    }
}
