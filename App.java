import java.awt.event.*;
import java.awt.*;
public class App{
  public static void main(String[] args) throws Exception {  
        Frame f=new Frame();

        Label firstval=new Label("ENTER THE FIRST VALUE");
        Label secval=new Label("ENTER THE SECOND VALUE");
        Button ad=new Button("add");
        Button sub=new Button("sub");
        Button mul=new Button("mul");
        Button div=new Button("div");
        TextField tf1=new TextField(100);
        TextField tf2=new TextField(100);

        firstval.setBounds(200,100,200,20);
        secval.setBounds(200,300,200,20);
        ad.setBounds(400,500,100,20);
        sub.setBounds(600,500,100,20);
        mul.setBounds(800,500,100,20);
        div.setBounds(1000,500,100,20);
        tf1.setBounds(700,100,100,20);
        tf2.setBounds(700,300,100,20);
        Label res=new Label();
        res.setBounds(750,550,200,20);

        f.add(firstval);
        f.add(secval);
        f.add(ad);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(tf1);
        f.add(tf2);
        f.add(res);
       
        f.setSize(5000,5000);
        f.setLayout(null);
        f.setVisible(true);
        
        ad.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    final int a=Integer.parseInt(tf1.getText());
                    final int b=Integer.parseInt(tf2.getText());
                    int r=a+b;
                    res.setText("RESULT:"+r);;
                }
                catch(NumberFormatException nfe){
                    System.out.println("invalid");
                }       
        }});

        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    final int a=Integer.parseInt(tf1.getText());
                    final int b=Integer.parseInt(tf2.getText());
                    int r=a-b;
                    res.setText("RESULT:"+r);;
                }
                catch(NumberFormatException nfe){
                    System.out.println("invalid");
                }    
            }
        });
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    final int a=Integer.parseInt(tf1.getText());
                    final int b=Integer.parseInt(tf2.getText());
                    int r=a*b;
                    res.setText("RESULT:"+r);;
                }
                catch(NumberFormatException nfe){
                    System.out.println("invalid");
                }    
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    final int a=Integer.parseInt(tf1.getText());
                    final int b=Integer.parseInt(tf2.getText());
                    if(b==0){
                        res.setText("RESULT:not divisible");
                    }
                    else{
                    int r=a/b;
                    res.setText("RESULT:"+r);
                    }
                }
                catch(NumberFormatException nfe){
                    System.out.println("invalid");
                }    
            }
        });
        f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
				    f.dispose();
				}                   
			});
    
    }
}
