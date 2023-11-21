package com.sena.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.modelos.Cajas;
@Repository
public interface CajasRepository extends JpaRepository<Cajas, Integer > {

}
