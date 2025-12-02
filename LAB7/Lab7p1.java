import java.awt.event.*;
import java.awt.*;
class Lab7p1{
 	public static void main(String...args){
		final int[] c={1};
		Frame f=new Frame();
		TextField  tf=new TextField(100);
		Label l1=new Label();
		Label l2=new Label();
		Button b=new Button("click");
			f.setLayout(new FlowLayout());
			l1.setPreferredSize(new Dimension(200,200));
			l1.setText("Event Handling");
			l2.setPreferredSize(new Dimension(200,200));
		
			
			b.setSize(100,100);
			f.add(l1);
			f.add(tf);
			f.add(b);
		
			f.add(l2);
			f.setSize(500,500);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter(){
		     		 
				public void windowClosing(WindowEvent we){
				f.dispose();
			}                   
			});
			b.addActionListener(new ActionListener(){
			
				public void actionPerformed(ActionEvent ae){
				System.out.println("hi"+c[0]);
				l2.setText(tf.getText());
				c[0]++;
			}
			});
	}	
}


