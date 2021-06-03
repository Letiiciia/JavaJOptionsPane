package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[] args) {
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		int media = (numero1 + numero2)/2;
		
		JOptionPane.showMessageDialog(null, "A média é: " + media);
	}
}
