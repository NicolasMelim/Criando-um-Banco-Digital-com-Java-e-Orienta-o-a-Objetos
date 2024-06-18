import static javax.swing.text.html.HTML.Tag.SUP;

public abstract  class Conta implements IConta{
    private static final int AGENCIA_PADRAO = 01;

    private static int SEQUENCIAL = 1;

     protected int agencia;
    protected int numeroConta;
    protected  double saldo;
    protected Cliente cliente;

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Nome titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %d", this.cliente.getCpf()));
        System.out.println(String.format("E-mail: %s", this.cliente.getEmail()));
        System.out.println(String.format("Sua agencia é: %d", this.agencia));
        System.out.println(String.format("Sua conta é: %d", this.numeroConta));
        System.out.println(String.format("Seu saldo é de: %.2f", this.saldo));
    }
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;

    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void cpf(int num){


    }


    public  void depositar(double valor){
        saldo += valor;
    }


    public  void transferir(double valor, Conta contaDestino){
            this.sacar(valor);
            contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

}
