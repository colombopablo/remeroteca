package com.remera.implementacion;


import com.remera.dao.Dao;
import com.remera.model.Usuario;
import java.util.List;


public class userManager {  
  
     
    private Dao dao;  
  
    public Usuario newUsuario() {  
        return new Usuario();  
    }  
  
    public void persist(Usuario user) {  
        dao.persist(user);  
    }  
  
    public List<Usuario> getUsuario() {  
        final List<Usuario> list = dao.find(Usuario.class);  
        return list;  
    }  

}