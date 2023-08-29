package com.seguimiento.terroristas.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seguimiento.terroristas.models.Terrorista;

public interface ITerroristaDAO extends JpaRepository<Terrorista, Long> {

}
