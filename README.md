# Modelagem-e-Diagrama-o-de-um-Componente-iPhone
## Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo),  elaborei a diagramação das classes e interfaces . Em seguida, implementei as classes e interfaces no formato de arquivos .java.


```mermaid


classDiagram
 
     class Iphone {
        + Tocar musica()
        + Pausar musicas()
        + Parar musica()
        + Navegar pelas musicas()
        + Fazer chamada(String numero)
        + Receber chamada()
        + Encerrar chamada()
        + Abrir navegador()
        + Navegar para uma pagina(String url)
        + Fechar Navegador()

        
     }

     class Telefone {
        <<interface>> 
        + Fazer chamada()
        + Receber chamada()
        + Encerrar chamada()

     }

     class Reprodutor musical {
        <<interface>>
        + Tocar musica()
        + pausar musica()
        + Parar musisca()
        + navegar pelas musicas()
     } 

     class Navegar na internet{
        <<interface>>
        + abrir navegador()
        + navegar para uma pagina()
        + fechar navagador()
     }

     Navegar na internet <|-- Iphone : implements
     Telefone <|-- Iphone : implements
     Reprodutor musical <|-- Iphone : implements



     



