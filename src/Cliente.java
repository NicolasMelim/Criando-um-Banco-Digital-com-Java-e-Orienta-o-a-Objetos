import java.util.List;

public class Cliente {

    private String nome;
    private int cpf;
    private  String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void verificarCpf(long cpf) {
        if (cpf > 11) {
            System.out.println("O CPF possui menos de 12 dígitos.");
        } else {
            System.out.println("O CPF possui 12 dígitos ou mais.");
        }
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
