package com.sena.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.modelos.Usuario;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer > {

}
