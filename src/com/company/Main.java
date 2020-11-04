package com.company;

public class Main {

    public static void main(String[] args) {
        /*Animal animal = new Animal();
        animal.correr(); */
        Cao cao = new Cao();
        Passaro passaro = new Passaro();

        cao.setCor("Marrom");
        System.out.println(cao.getCor());
        cao.correr();
        cao.setPeso(10);
        System.out.println(cao.getPeso());
        cao.setTamanho(45);
        System.out.println(cao.getTamanho());
        passaro.setCor("Azul");
        System.out.println(passaro.getCor());
        passaro.setPeso(1.5);
        System.out.println(passaro.getPeso());
        passaro.setTamanho(45);
        System.out.println(passaro.getTamanho());
        passaro.correr();
    }
}
