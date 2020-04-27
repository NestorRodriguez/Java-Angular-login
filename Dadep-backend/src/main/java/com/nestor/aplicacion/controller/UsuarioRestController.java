package com.nestor.aplicacion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.aplicacion.models.entity.Usuario;
import com.nestor.aplicacion.models.services.IUsuarioServices;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200/login", allowedHeaders = "*")
public class UsuarioRestController {

		@Autowired
		private IUsuarioServices usuarioService;
		
		@GetMapping("/usuariobyid")
		public Usuario indexid(int id){
			return usuarioService.buscarUsuarioId(id);
		}

		@GetMapping("/usuarios")
		public List<Usuario> indexall(){
			return usuarioService.findAll();
		}
		
		@GetMapping("/counter")
		public int indexCounter() {
			return usuarioService.counter();
		}
		
		@CrossOrigin(origins = "http://localhost:4200/login", allowedHeaders = "http://localhost:4200/")
		@GetMapping("/usuarioByUserPass")
		public Usuario indexuserpass(String user, String pass) {
			return usuarioService.findUsuarioUserPass(user, pass);
		}
}
