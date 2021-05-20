import java.awt.*;
import java.awt.event.*;


class Mybutton extends Frame implements ActionListener{

	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s.equals("red")){
			setBackground(Color.red);
		}
		if(s.equals("blue")){
			setBackground(Color.blue);
		}
		if(s.equals("green")){
			setBackground(Color.green);
		}
	}

	public static void main(String[] args){
		Mybutton mb = new Mybutton();
		mb.setTitle("color changer");
		mb.setSize(400,400);
		mb.setVisible(true);
		mb.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		Button b1,b2,b3;
		mb.setLayout(null);
		b1 = new Button("red");
		b2 = new Button("green");
		b3 = new Button("blue");
		b1.setBounds(100,100,70,40);
		b2.setBounds(100,160,70,40);
		b3.setBounds(100,220,70,40);
		mb.add(b1);
		mb.add(b2);
		mb.add(b3);
		b1.addActionListener(mb);
		b2.addActionListener(mb);
		b3.addActionListener(mb);
		
	}
}
