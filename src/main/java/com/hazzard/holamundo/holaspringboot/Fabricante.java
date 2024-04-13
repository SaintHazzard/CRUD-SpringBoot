package com.hazzard.holamundo.holaspringboot;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;

@jakarta.persistence.Entity
public class Fabricante {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "fabricante_codigo_seq")
  @SequenceGenerator(name = "fabricante_codigo_seq", sequenceName = "fabricante_codigo_seq", allocationSize = 1)

  private Long codigo;
  private String nombre;

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
}
