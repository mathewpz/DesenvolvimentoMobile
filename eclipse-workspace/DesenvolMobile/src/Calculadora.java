import javax.swing.*;
public class Calculadora {

	public static void main(String[] args) {
		Calcular calcular = new Calcular();
		
		int menu;
		int x, y;
		
		do {
			menu =Integer.parseInt(JOptionPane.showInputDialog("1)Somar"+
		"\n2)subtra��o\n3)sair"));
			if(menu==1) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Soma(x, y));
			}else if(menu==2) {
				x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
				y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
				JOptionPane.showMessageDialog(null,"O resultado �: "+calcular.Subtracao(x, y));
			}
		}
		while(menu!=3);
	}

}