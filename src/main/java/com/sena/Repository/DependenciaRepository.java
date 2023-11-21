package com.sena.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.modelos.Dependencia;
@Repository
public interface DependenciaRepository extends JpaRepository<Dependencia, Integer >{

}
