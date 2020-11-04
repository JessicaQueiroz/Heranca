package com.company;

public class Animal {
    // atributos
    int tamanho;
    String cor;
    double peso;

    // metodos
    void dormir(){
        System.out.println("Dormir como um animal");
    }
    void correr(){
        System.out.println("Correr como um animal");
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
