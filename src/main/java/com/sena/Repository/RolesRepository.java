package com.sena.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.modelos.Roles;
@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer >{

}
