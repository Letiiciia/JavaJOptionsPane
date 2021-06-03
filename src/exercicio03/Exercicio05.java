package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas:"));
		double valorHora = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da hora:"));
		
		double salario = horas * valorHora;
		
		JOptionPane.showMessageDialog(null, "O salário do funcionário é: " + salario);
	
	}

}
