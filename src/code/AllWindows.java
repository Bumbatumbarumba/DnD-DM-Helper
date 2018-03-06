package code;

import javax.swing.JFrame;

/* Created by Bartosz Kosakowski
 * March 6th, 2018
 * Class used to hold all windows that the program will require, as well
 * as the necessary function
 */
public class AllWindows {
	private static JFrame MainWindow = new JFrame();
	private static JFrame CreateCampaignWindow = new JFrame();
	private static JFrame LoadCapaignWindow = new JFrame();
	private static JFrame AboutWindow = new JFrame();
	private static JFrame CampaignWindow = new JFrame();
	
	public static void createWindows(){
		MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainWindow.setSize(400, 400);
		MainWindow.setVisible(true);
		MainWindow.setTitle("DnD DM Helper");
	}
}// end of AllWindows
