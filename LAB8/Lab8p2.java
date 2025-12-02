import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab8p2 extends JFrame implements ActionListener{
	JLabel l;
	Lab8p2(){
		super("Demo of MenuBar");
		setLayout(null);
		l=new JLabel();
		l.setBounds(250,100,200,200);
		l.setFont(new Font("Arial",Font.BOLD,20));
		add(l);
		MenuBar mb=new MenuBar();
		setMenuBar(mb);
		String[][] s={{"File","Open","Close","save"},
				{"Edit","font","undo","cut"},
				{"Help","delete"}};
		
		
		for(int i=0;i<s.length;i++){
			Menu k=new Menu(s[i][0]);
			mb.add(k);
			for(int j=1;j<s[i].length;j++){
				MenuItem mm=new MenuItem(s[i][j]);
				mm.addActionListener(this);
				k.add(mm);
			}
			
		}
		
		setSize(500,500);
		setVisible(true);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	public void actionPerformed(ActionEvent ae){
		String com=ae.getActionCommand();
		
		if(com.equals("Close")){
			System.exit(0);
		}
		else{
			l.setText(com);
		}
	}
	
	public static void main(String...args){
		new Lab8p2();
	}
}
