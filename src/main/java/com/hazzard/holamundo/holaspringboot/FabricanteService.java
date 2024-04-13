package com.hazzard.holamundo.holaspringboot;

import java.util.List; 
import org.springframework.stereotype.Service;

@Service
public class FabricanteService {

  private final FabricanteRepository fabricanteRepository;

  public FabricanteService(FabricanteRepository fabricanteRepository) {
    this.fabricanteRepository = fabricanteRepository;
  }

  public List<Fabricante> getAllFabricantes() {
    return fabricanteRepository.findAll();
  }
}