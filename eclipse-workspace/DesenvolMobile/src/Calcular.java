import javax.swing.JOptionPane;
public class Calcular {
	int a, b;
	
	public static int Soma(int a, int b) {
		int soma = a + b;
		return soma;
	}
	public static int Subtracao(int a, int b) {
		int subtracao = a-b;
		return subtracao;
	}
	public static int Multiplicacao(int a, int b) {
		int multiplicacao = a*b;
		return multiplicacao;
	}
	public static int Divisao(int a, int b) {
		int divisao = a/b;
		return divisao;
	}
}