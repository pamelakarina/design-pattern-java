package service;

import builder.UsuarioConstrutor;

public class UsuarioService {


    public void salvarUsuarioService(String nome){
        UsuarioConstrutor usuarioConstrutor = new UsuarioConstrutor();
        usuarioConstrutor.salvarUsuario(nome);
        System.out.println("usuario salvo: " + nome);
    }
}
