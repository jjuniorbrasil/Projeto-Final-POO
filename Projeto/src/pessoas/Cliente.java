package pessoas;

public class Cliente extends Pessoa {
    private static int qtdcontas = 1;
    private int idcliente;
    
    public Cliente (String cpf, String nome) {
        super();
        super.setCpf(cpf);
        super.setNome(nome);
        idcliente = qtdcontas++;
    }
    
    public int id() {
        return this.idcliente;
    }
}
