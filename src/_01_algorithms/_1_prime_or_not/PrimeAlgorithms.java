package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeAlgorithms {
public static void main(String[] args) {
	
	String primestr = JOptionPane.showInputDialog(null, "Input a number.");
	
	int primeint = (Integer.parseInt(primestr));
	
	for(int i = 2; i<primeint; i++){
		if (primeint % i == 0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			System.exit(0);
		}
		
			}
	JOptionPane.showMessageDialog(null, "Your number is prime");
		}
	}


