
package com.robson.bancodigital;
public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Conta Corrente ===");
        imprimirInfoComuns();
    }

 

    
}
