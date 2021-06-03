package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio02 {
	public static void main(String[] args) {	
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));
		
		int soma = numero1 + numero2;
		
		JOptionPane.showMessageDialog(null, "A soma entre os números é: " + soma);
	}

}
