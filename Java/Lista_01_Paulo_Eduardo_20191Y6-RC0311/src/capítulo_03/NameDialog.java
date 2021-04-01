package capítulo_03;
import javax.swing.JOptionPane;
public class NameDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Qual o seu nome? ");
		
		String message = String.format("Welcome, %s, to Java Programing!", name);
		
		JOptionPane.showMessageDialog(null, message);
	}

}
