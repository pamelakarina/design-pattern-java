import service.UsuarioService;

public class App {
    public static void main(String[] args) throws Exception {
        UsuarioService usuarioPamela = new UsuarioService();
        usuarioPamela.salvarUsuarioService("pamela");
    }
}
