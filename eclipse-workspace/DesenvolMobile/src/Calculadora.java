import javax.swing.*;
public class Calculadora {

	public static void main(String[] args) {
		Calcular calcular = new Calcular();
		
		int menu;
		int x, y;
		String aux;
		
		do {
			menu =Integer.parseInt(JOptionPane.showInputDialog("1)Somar"+
		"\n2)subtra��o\n3)Multiplica��o\n4)Divis�o\n5)sair"));
			if(menu==1) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Soma(x, y));
			}else if(menu==2) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Subtracao(x, y));
			}else if(menu==3) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Multiplicacao(x, y));
			}else if(menu==4) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Divisao(x, y));
			}
		}
		while(menu!=5);
	}

}