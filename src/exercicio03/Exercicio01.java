package exercicio03;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args){
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		
		int numeroAntecessor = numero - 1;
		
		int numeroSucessor = numero + 1;
		
		JOptionPane.showMessageDialog(null, "Os números vizinhos são " + numeroAntecessor + " e " + numeroSucessor);
	}
}
