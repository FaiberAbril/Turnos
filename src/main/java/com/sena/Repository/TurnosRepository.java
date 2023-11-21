package com.sena.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.modelos.Turnos;
@Repository
public interface TurnosRepository extends JpaRepository<Turnos, Integer >{

}
