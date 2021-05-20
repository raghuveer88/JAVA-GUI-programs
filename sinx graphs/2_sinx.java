import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.*;


class Graphs extends Frame {

	public void paint(Graphics g){
		 g.drawLine(0,350,1440,350); 
        g.drawLine(720,0,720,1440); 
        
        for(int i = 0;i<=720;i = i+180){
        	String m = i/180+"pi";
        	g.drawString(m,720+i,360);
        }

        g.setColor(Color.BLUE);
        
        for(double x=0;x<=720;x=x+0.5)
        {
            double y = 100*(sin(x*(3.141/180))+0.333*sin(3*(x*(3.141/180))));
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(720+X,350-Y,720+X,350-Y);
        }
    }
		
	

	public static void main(String[] args){
		Graphs c = new Graphs();
		c.setTitle("sinx");
		c.setSize(2000,2000);
		c.setVisible(true);
		c.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}