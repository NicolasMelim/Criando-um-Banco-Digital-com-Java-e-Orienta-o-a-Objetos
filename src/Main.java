public class Main {
    public static void main(String[] args) {
        Cliente nicolas = new Cliente();
        nicolas.setNome("Nicolas");
        nicolas.setCpf(364284652);
        nicolas.setEmail("melimnicolas@gmail.com");

        Conta cc = new Conta_Corrente(nicolas);
        cc.depositar(350);
        System.out.println("----------------------------------------------------------------");
        Conta pou = new ContaPoupanca(nicolas);
        cc.transferir(100, pou);
        cc.imprimirExtrato();
        pou.imprimirExtrato();

    System.out.println("----------------------------------------------------------------");
        Cliente gabrielle = new Cliente();
        gabrielle.setNome("Gabrielle");
        gabrielle.setCpf(454328752);
        gabrielle.setEmail("gabifreire@gmail.com");

        Conta corr = new Conta_Corrente(gabrielle);
        corr.depositar(1000);

        Conta poup = new ContaPoupanca(gabrielle);
        corr.transferir(350, poup);
        corr.imprimirInfosComuns();


    }
}
