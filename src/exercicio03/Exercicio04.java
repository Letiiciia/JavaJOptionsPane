package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		double conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));

		double valorGarçom = (conta * 10) / 100;

		JOptionPane.showMessageDialog(null, "Os 10% do garçom é: " + valorGarçom + " e o total é: " + conta);

	}

}
