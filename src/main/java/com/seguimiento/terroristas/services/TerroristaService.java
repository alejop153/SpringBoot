package com.seguimiento.terroristas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.seguimiento.terroristas.dao.ITerroristaDAO;
import com.seguimiento.terroristas.models.Terrorista;

public class TerroristaService implements ITerroristaService {

  @Autowired
  private ITerroristaDAO terroristaDAO;

  @Override
  public List<Terrorista> findAll() {
    return terroristaDAO.findAll();
  }

  @Override
  public Terrorista findById(Long id) {
    return terroristaDAO.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    terroristaDAO.deleteById(id);
  }

  @Override
  public Terrorista save(Terrorista terrorista) {
    return terroristaDAO.save(terrorista);
  }

}
