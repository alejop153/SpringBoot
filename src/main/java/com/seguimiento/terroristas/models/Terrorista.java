package com.seguimiento.terroristas.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "terrorista")
public class Terrorista {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column
  private String nombre;

  @Column
  private String apellidos;

  @Column
  private String alias;

  @Column
  private String nacionalidad;

  @Column
  private int dias_pendientes;

  public Long getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public String getAlias() {
    return alias;
  }

  public String getNacionalidad() {
    return nacionalidad;
  }

  public int getDias_pendientes() {
    return dias_pendientes;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public void setNacionalidad(String nacionalidad) {
    this.nacionalidad = nacionalidad;
  }

  public void setDias_pendientes(int dias_pendientes) {
    this.dias_pendientes = dias_pendientes;
  }

}
