package practise;

import javax.swing.JOptionPane;

public class FirstPrac {

	public static void main(String[] args) {
		
	String num1 = JOptionPane.showInputDialog("Enter first number!");
	
	String num2 = JOptionPane.showInputDialog("Enter second number!");
	 
	int intNum1 = Integer.parseInt(num1);
	int intNum2 = Integer.parseInt(num2);
	
	JOptionPane.showMessageDialog(null, intNum1+intNum2);
	}

}
