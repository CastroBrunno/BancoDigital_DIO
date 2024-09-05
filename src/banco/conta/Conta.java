package banco.conta;

import banco.Cliente;

public class Conta implements InterfaceConta{

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 440;

    private double saldo;
    private int agencia;
    private int numConta;
    private Cliente cliente;
    
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public int getAgencia() {
        return agencia;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    
    @Override
    public void sacar(double valor){
        saldo -= valor;
    }
    
    @Override
    public void transferir(double valor, InterfaceConta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
