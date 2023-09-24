package primeira.cliente;

public class ClientePayPal {

    private String login;
    private String senha;

    public ClientePayPal(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}
