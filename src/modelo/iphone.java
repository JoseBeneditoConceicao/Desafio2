package modelo;

import interfaces.aparelhotelefonico;
import interfaces.navegadornainternet;
import interfaces.reprodutormusical;

public class iphone implements aparelhotelefonico, navegadornainternet, reprodutormusical {

    public void ligar() {
        System.out.println("ligar");
    }

    public void atender() {
        System.out.println("atender");
    }

    public void iniciarcorreiodevoz() {
        System.out.println("iniciarcorreiodevoz");
    }

    public void exibirpagina() {
        System.out.println("exibirpagina");
    }

    public void adicionarnovaaba() {
        System.out.println("adicionarnovaaba");
    }

    public void atualizarpagina() {
        System.out.println("atualizarpagina");
    }

    public void tocar() {
        System.out.println("tocar");
    }

    public void pausar() {
        System.out.println("pausar");
    }

    public void selecionarmusica() {
        System.out.println("selecionarmusica");
    }
}
