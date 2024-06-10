public class Iphone implements Reprodutor_musical,Telefone,Navegar_na_internet {

    @Override
    public void abrirNavegador() {
        System.out.println(" Abrir o navegador");
    }

    @Override
    public void navegarParaUmaPagina(String url) {
        System.out.println(" Navegar para  pagina  "+ url+ " ");
    }

    @Override
    public void fecharNavegador() {
        System.out.println(" Fechar o navagador");;
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println(" Fazer Chamada "+ numero + " ");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");;
    }

    @Override
    public void encerrarChamada() {
        System.out.println(" Encerrar chamada");
    }

    @Override
    public void tocarMusic() {
        System.out.println(" Tocar Musica");
    }

    @Override
    public void pausarMusica() {
        System.out.println(" Pausar Musica");
    }

    @Override
    public void pararMusica() {
        System.out.println(" Parar a Musica");
    }

    @Override
    public void navegarPelasMusica() {
        System.out.println(" Navegar pelas musicas");
    }

   
    
}
