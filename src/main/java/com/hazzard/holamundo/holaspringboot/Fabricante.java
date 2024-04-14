package com.hazzard.holamundo.holaspringboot;

import jakarta.persistence.*;
import jakarta.persistence.GenerationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@jakarta.persistence.Entity
public class Fabricante {
  private static final Logger logger = LoggerFactory.getLogger(Fabricante.class);
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
    logger.info("El nombre ha sido establecido a {}", nombre);
  }

}
