package com.nestor.aplicacion.models.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nestor.aplicacion.models.entity.Usuario;


@Component
public class UsuarioDao implements IUsuarioDao{
	
	//private EntityManager em;
	private int count = 0;
	List<Usuario> usuarios;
	
	public UsuarioDao() {
		usuarios = new ArrayList<>();
		Usuario usuario1 = new Usuario(0, "Alfonso Bocanegra", "123", "aaa@bbb.com");
		Usuario usuario2 = new Usuario(1, "Camilo Sabaneta", "123", "zzz@yyy.com");
		usuarios.add(usuario1);
		usuarios.add(usuario2);
	}

	public void persist() {
		
	}
	
	public void remove() {
		
	}
	
	public Usuario findusuariobyid(int id) {
		int find;
		if(id == 0) {
			find = counter();
		}
		else 
		{
			find =0;
		}
		return usuarios.get(id);
	}
	
	public int counter() {
		return count++;
	}
	
	public List<Usuario> findAll(){
		return usuarios;
	}

	public Usuario findbyId(int id) {
		return  usuarios.get(id);
	}
	
	public Usuario findUsuarioUserPass(String user, String pass) {
		for (Usuario usuario: usuarios)
		{
			if((usuario.getEmail().equals(user.toString())) && (usuario.getPass().equals(pass.toString()))) {
				return usuario;
			}
		}
		return new Usuario();
	}
}
