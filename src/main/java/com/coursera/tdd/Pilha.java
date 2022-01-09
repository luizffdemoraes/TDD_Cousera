package main.java.com.coursera.tdd;

public class Pilha {

    private Object elemento;
    private int quantidade;

    public Pilha (){
    }

    public boolean estaVazia() {
        return (elemento == null);
    }

    public int tamanho() {
        return 0;
    }

    public void empilha(Object elemento) {
        this.elemento = elemento;
        quantidade++;
    }

    public Object topo() {
        return null;
    }
}
