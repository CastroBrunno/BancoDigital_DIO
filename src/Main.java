import banco.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupança;

public class Main {
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
