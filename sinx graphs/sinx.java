import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.*;


class Graph extends Frame {

	public void paint(Graphics g){
		 g.drawLine(0,350,1440,350); 
        g.drawLine(720,0,720,1440); 
        
        g.setColor(Color.BLUE);


        for(int i = 0;i<=720;i = i+180){
        	String m = i/180+"pi";
        	g.drawString(m,720+i,360);
        }



        
        for(double x=0;x<=720;x=x+0.5)
        {
            double y = 100* sin(x*(3.141/180));
            int Y = (int)y;
            int X = (int)x;

            if(Y == 99){
            	String s = 1+"-";
            	g.drawString(s,710,350-Y);
            }
            if(Y == -99){
            	String s = "- -"+1;
            	g.drawString(s,719,350-Y);
            }
           
            g.drawLine(720+X,350-Y,720+X,350-Y);
        }
    }
		
	

	public static void main(String[] args){
		Graph c = new Graph();
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