import modelo.iphone;

public class desafio2 {

    public static void main(String[] args) {
        var iphone = new iphone();
        
        System.out.println("Musica");        
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarmusica();

        System.out.println("Ligacao");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarcorreiodevoz();

        System.out.println("Navegador");
        iphone.exibirpagina();
        iphone.adicionarnovaaba();
        iphone.atualizarpagina();
		
    }
}