public class Conta_Corrente extends  Conta {


    public Conta_Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void cpf(int num) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("********* EXTRATO CONTA CORRENTE *************");
        super.imprimirInfosComuns();


    }
}
