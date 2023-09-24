package primeira.cliente;

public class ClienteCartao {


    private String senha;
    private String codigoSeguranca;

    public ClienteCartao(String senha, String codigoSeguranca){
        this.senha = senha;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getSenha() {
        return senha;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

}
