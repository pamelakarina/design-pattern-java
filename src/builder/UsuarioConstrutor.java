package builder;

import repository.UsuarioRepository;

public class UsuarioConstrutor implements UsuarioRepository{

    @Override
    public void salvarUsuario(String nome) {
        // salvando no banco
        System.out.println("Salvando usuario: " + nome);
    }

}
