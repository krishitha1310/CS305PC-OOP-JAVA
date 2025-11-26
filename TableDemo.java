import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9p1 extends JFrame{
	Label l;
	
	Lab9p1(){
		super("Tapped Pane Demo");
		
		String heading={"Name","Course","RollNo"};
		String[][] s={
			{"Dell","cse","12"},
			{"kri","csd","34"},
			{"shi","csm","56"}
		         };
		setVisible(true);
		add(jtp);
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String...args){
		new Lab9p1();
	}
}

