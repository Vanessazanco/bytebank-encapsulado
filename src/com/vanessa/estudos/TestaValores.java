package com.vanessa.estudos;

public class TestaValores {
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        Conta conta2 = new Conta(1337, 15623);
        Conta conta3 = new Conta(1337, 356841);

        System.out.println(conta.getAgencia());

        System.out.println(Conta.getTotal());


    }
}
