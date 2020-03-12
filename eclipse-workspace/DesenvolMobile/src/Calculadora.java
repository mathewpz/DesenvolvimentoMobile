import javax.swing.*;
public class Calculadora {

	public static void main(String[] args) {
		Calcular calcular = new Calcular();
		
		int menu;
		int x, y;
		String aux;
		
		do {
			menu =Integer.parseInt(JOptionPane.showInputDialog("1)Somar"+
		"\n2)subtração\n3)Multiplicação\n4)Divisão\n5)sair"));
			if(menu==1) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado é: "+calcular.Soma(x, y));
			}else if(menu==2) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado é: "+calcular.Subtracao(x, y));
			}else if(menu==3) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado é: "+calcular.Multiplicacao(x, y));
			}else if(menu==4) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado é: "+calcular.Divisao(x, y));
			}
		}
		while(menu!=5);
	}

}