import java.awt.*;
import java.awt.event.*;

class MycheckBox extends Frame implements ItemListener{

	Checkbox c1,c2;
	String msg = "";
	MycheckBox(){
		c1 = new Checkbox("father",true);
		c2 = new Checkbox("mother");

		this.setLayout(new FlowLayout());
		this.add(c1);
		this.add(c2);

		c1.addItemListener(this);
		c2.addItemListener(this);

	}

	public void itemStateChanged(ItemEvent i){
		repaint();
	}

	public void paint(Graphics g){
		g.drawString("Current state",10,100);
		msg = "father :" + c1.getState();
		g.drawString(msg,10,120);
		msg = "mother:" + c2.getState();
		g.drawString(msg,10,140);
	}


	public static void main(String[] args){
		MycheckBox c = new MycheckBox();
		c.setTitle("check box");
		c.setSize(400,400);
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}