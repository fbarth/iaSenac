package linhaQuatro.jogadores;

/**
 * Implementa��o do jogador aleat�rio, baseline da competi��o.
 * 
 * @author Fabr�cio J. Barth
 * @version 05, novembro, 2007
 *
 */
public class JogadorAleatorio implements Jogador{

	@Override
	public int jogada(int[][] tabuleiro, int corDaMinhaBola) {
		double value = Math.random();
		if(value>=0.0 && value<=0.14)
			return 0;
		else if(value>=0.15 && value<=0.29)
			return 1;
		else if(value>=0.3 && value<=0.44)
			return 2;
		else if(value>=0.45 && value<=0.59)
			return 3;
		else if(value>=0.6 && value<=0.74)
			return 4;
		else if(value>=0.75 && value<=0.89)
			return 5;
		else
			return 6;
	}

	@Override
	public String getNome() {
		return "Alet�rio";
	}
}
