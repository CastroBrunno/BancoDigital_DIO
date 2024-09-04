

public class App {
    public static void main(String[] args) throws Exception {

        Cliente bruno = new Cliente();
        bruno.setNome("Bruno");

        Conta cc = new ContaCorrente(bruno);
        Conta poup = new ContaPoupança(bruno);

        cc.depositar(100);
        cc.transferir(100, poup);

        cc.imprimirExtrato();
        poup.imprimirExtrato();

    }
}
