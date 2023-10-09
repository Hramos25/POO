package aula13.jogos;

public class Tabuleiro {

  public Tabuleiro(JogoDoGalo jogo) {
     assert jogo != null;

     this.jogo = jogo;
  }

  public void joga(int lin,int col,boolean jogadorX) {
     // quando o jogo termina, invocar: jogo.notificaFim(resultado());
       assert lin >= 1 && lin <= 3;
         assert col >= 1 && col <= 3;
         

  }

  public int resultado() { // -1 -> jogador O ; 0 -> empate ; 1 -> jogador X
     int res = 0;

     return res;
  }

  // se conveniente, acrescentar outros métodos públicos

  protected JogoDoGalo jogo;
}
