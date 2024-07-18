package com.vanessa.estudos;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());
        conta.setAgencia(26580);
        System.out.println(conta.getAgencia());

        Cliente vanessa = new Cliente();
        vanessa.setNome("Vanessa Z");
        conta.setTitular(vanessa);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        //agora em duas linhas
        Cliente titularDaConta= conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(vanessa);
        System.out.println(conta.getTitular());


    }

}
