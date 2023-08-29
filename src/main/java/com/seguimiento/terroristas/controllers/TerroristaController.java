package com.seguimiento.terroristas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.seguimiento.terroristas.services.TerroristaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

import com.seguimiento.terroristas.models.Terrorista;

@RestController
@RequestMapping("/seguimiento")
public class TerroristaController {

  @Autowired
  private TerroristaService terroristaService;

  @GetMapping("/terroristas")
  public List<Terrorista> getTerroristas() {
    return terroristaService.findAll();
  }

  @GetMapping("/terroristas/{id}")
  public Terrorista getTerroristaById(@PathVariable Long id) {
    return terroristaService.findById(id);
  }

  @DeleteMapping("/terroristas/{id}")
  public void deleteTerrorista(@PathVariable Long id) {
    terroristaService.delete(id);
  }

  @PostMapping("/terroristas")
  public Terrorista saveTerrorista(@RequestBody Terrorista terrorista) {
    return terroristaService.save(terrorista);
  }

  @PutMapping("/terroristas/{id}")
  public Terrorista updateTerrorista(@PathVariable Long id, @RequestBody Terrorista terrorista) {
    Terrorista terroristaActual = terroristaService.findById(id);
    if (terroristaActual != null) {
      terroristaActual.setNombre(terrorista.getNombre());
      terroristaActual.setApellidos(terrorista.getApellidos());
      terroristaActual.setAlias(terrorista.getAlias());
      terroristaActual.setNacionalidad(terrorista.getNacionalidad());
      terroristaActual.setDias_pendientes(terrorista.getDias_pendientes());
    }
    return terroristaService.save(terroristaActual);
  }
}
