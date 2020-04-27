package com.nestor.aplicacion.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nestor.aplicacion.models.entity.Usuario;
import com.nestor.aplicacion.models.dao.IUsuarioDao;
import com.nestor.aplicacion.models.services.IUsuarioServices;

@Service
public class UsuarioServiceImpl implements IUsuarioServices {

	@Autowired
	private IUsuarioDao UsuarioDao;
	//private Usuario usuario = new Usuario();
	
	@Override
	public Usuario buscarUsuarioId(int id) {
		return UsuarioDao.findbyId(id);
	}
	
	@Override
	public List<Usuario> findAll(){
		return (List<Usuario>) UsuarioDao.findAll();
	}

	@Override
	public int counter() {
		return UsuarioDao.counter();
	}

	@Override
	public Usuario findUsuarioUserPass(String user, String pass) {
		return UsuarioDao.findUsuarioUserPass(user, pass);
	}
}
