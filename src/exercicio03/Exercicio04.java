package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		double conta = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));

		double valorGar�om = (conta * 10) / 100;

		JOptionPane.showMessageDialog(null, "Os 10% do gar�om �: " + valorGar�om + " e o total �: " + conta);

	}

}
