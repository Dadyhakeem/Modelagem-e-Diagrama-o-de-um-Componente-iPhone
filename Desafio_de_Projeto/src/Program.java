public class Program {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.fazerChamada("324436784");
        iphone.receberChamada();
        iphone.encerrarChamada();

        iphone.tocarMusic();
        iphone.pausarMusica();
        iphone.abrirNavegador();
        iphone.navegarParaUmaPagina("Amazon");
        iphone.navegarPelasMusica();
        iphone.tocarMusic();
        iphone.pararMusica();
        iphone.fecharNavegador();
    }
}
