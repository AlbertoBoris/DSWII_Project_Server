package com.project.server.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.server.entity.Mascota;
import com.project.server.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {

	List<Usuario> findByDni(String dni);

	@Query("select u from Usuario u where u.correo=?1 and u.contrasena=?2")
	Usuario findByLogin(String correo, String password);

}
