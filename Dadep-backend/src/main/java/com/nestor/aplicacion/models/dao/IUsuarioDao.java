package com.nestor.aplicacion.models.dao;

import java.util.List;

import com.nestor.aplicacion.models.entity.Usuario;;

public interface IUsuarioDao {

	public List<Usuario> findAll();

	public Usuario findbyId(int id);
	
	public int counter();

	public Usuario findUsuarioUserPass(String user, String pass);
	
}
