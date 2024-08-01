
package com.robson.bancodigital;

public class BancoDigital {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        cc.depositar(100);
        
        cc.transferir(poupanca, 50);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
