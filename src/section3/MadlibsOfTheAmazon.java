package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showInputDialog(" a piranha-infested river, here's how to do it...");		
		// Get the user to enter an adjective
		String adjective= JOptionPane.showInputDialog("adjective");
		// Get the user to enter a type of liquid
String liquid=JOptionPane.showInputDialog("liquid");
		// Get the user to enter a body part
String bodypart=JOptionPane.showInputDialog("body part");
		// Get the user to enter a verb
String verd=JOptionPane.showInputDialog("verb");
		// Get the user to enter a place
String place=JOptionPane.showInputDialog("place");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] 
String sentence= "Piranhas are- more "+adjective+" during the day,\n so cross the river at\n"+
		
" night. Piranhas are attracted to fresh "+ liquid +" and will most\n"+
" likely take a bite out of your "+bodypart+" if you "+verd+". Whatever\n"+
"you do, if you have an open wound, try to find another way to get\n"+
"+back to the "+place+". Good luck!";
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, sentence);

	}
}

