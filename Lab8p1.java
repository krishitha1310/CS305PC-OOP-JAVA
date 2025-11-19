import java.awt.*;
import java.awt.event.*;
class Lab8p1 extends Frame implements ActionListener{
	Label l;
	Lab8p1(){
		super("Demo of MenuBar");
		setLayout(new FlowLayout());
		l=new Label();
		l.setPreferredSize(new Dimension(100,100));
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
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we){
				dispose();
			}
		});
		
		
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
		new Lab8p1();
	}
}
