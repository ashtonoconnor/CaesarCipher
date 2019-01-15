import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Cipher openCaesar = new Cipher();

		int goAgain = 1;

		while (goAgain == 1) {
			String answer = openCaesar.encryptDecrypt();
			switch (answer) {
			case "E":
				// System.out.println("Your in encrypt");
				openCaesar.getPlainText();
				openCaesar.getKey();
				openCaesar.encrypt();
				break;
			case "D":
				// System.out.println("Your in decrypt");
				openCaesar.getPlainText();
				openCaesar.getKey();
				openCaesar.decrypt();
				break;
				
			}
			String msg = "Would you like to go again (Y/N): ";
			answer = JOptionPane.showInputDialog(msg);
			
			//7JOptionPane.showMessageDialog(null, answer);
			
			if ((answer.equals("Y")) || (answer.equals("y")) || (answer.equals("Yes")) || (answer.equals("yes"))) {
				goAgain = 1;
			}
			else {
				goAgain = 0;
				//JOptionPane.showMessageDialog(null, "Thank you! Come again!");
			};
			

		}
		// ask if they want to go again
		// for dec, syso canner are fine
		// for operational, change to JOPs --- graded
	}

}
