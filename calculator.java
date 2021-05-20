import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame implements ActionListener{


	Button b[] = new Button[20];
	TextField t = new TextField(20);
	String x,y,z;
GridBagConstraints gb = new GridBagConstraints();
Calculator(){
	x=y=z = "";
	this.setBackground(Color.yellow);
	this.setLayout(new GridBagLayout());

	
	for(int i = 0;i<20;i++){
		if(i == 0){
			String c = "clear";
			b[i] = new Button(c);
			gb.gridx = 0;
			gb.gridy = 0;
			add(b[i],gb);				
		}
		else if(i == 1){
			String c = ""+"Del";
			b[i] = new Button(c);
			gb.gridx = 0;
			gb.gridy = 1;
			add(b[i],gb);

		}
		else if(i == 2){
			String c = ""+"  %  ";
			b[i] = new Button(c);
			gb.gridx = 0;
			gb.gridy = 2;
			add(b[i],gb);
		}
		else if(i == 3){
			b[i] = new Button(" /   ");
			gb.gridx = 0;
			gb.gridy = 3;
			add(b[i],gb);

		}
		else if(i == 7){
			b[i] = new Button("*");
			gb.gridx = 1;
			gb.gridy = 3;
			add(b[i],gb);
		}
		else if(i == 11){
			b[i] = new Button("-");
			gb.gridx = 2;
			gb.gridy = 3;
			add(b[i],gb);
		}
		else if(i == 15){
			b[i] = new Button("+");
			gb.gridx = 3;
			gb.gridy = 3;
			add(b[i],gb);
		}
		else if(i == 16){
			b[i] = new Button("  .");
			gb.gridx = 4;
			gb.gridy = 0;
			add(b[i],gb);
		}
		else if(i == 18){
			b[i] = new Button("Exit");
			gb.gridx = 4;
			gb.gridy = 2;
			add(b[i],gb);
		}
		else if(i == 19){
			b[i] = new Button(" = ");
			gb.gridx = 4;
			gb.gridy = 3;
			add(b[i],gb);

		}
        else{
        	int c;
        	if(i == 14){
        	 c = 1;
        	}
        	else{
        	 c = i%10;
            }
        	String a = ""+c;
		b[i] = new Button(a);
			gb.gridx = (int)i/4;
			gb.gridy = i%4;
			add(b[i],gb);			
		}
	}
	
	t.setEditable(false);
    this.add(t);
    for(int i = 0;i<20;i++){
    	b[i].addActionListener(this);
    }
}

public void actionPerformed(ActionEvent ae){
	
	  String str = ae.getActionCommand();

	  if(str.equals("Exit")){
	  	System.exit(0);
	  }


  	  else if ((str.charAt(0) >= '0' && str.charAt(0) <= '9') || str.charAt(0) == '.'){ 
            if (!y.equals("")) 
                z = z + str; 
            else
                x = x + str;  
            t.setText(x + y +z); 
        } 
        else if (str.equals("clear")){  
            x = y = z = "";  
            t.setText(x + y + z); 
        } 
        else if(str.equals("Del")){
        	 if (!z.equals("")) {
                z = ""; 
            }
             else if (!y.equals("")){ 
                y = ""; 
            }
             else { 
                x = "";
            }
                t.setText(x + y + z); 
        }
        else if (str.charAt(0) == '=') { 
  
            double ans;  
            if (y.equals("+")) 
                ans = (Double.parseDouble(x) + Double.parseDouble(z)); 
            else if (y.equals("-")) 
                ans = (Double.parseDouble(x) - Double.parseDouble(z)); 
            else if (y.equals("/")) 
                ans = (Double.parseDouble(x) / Double.parseDouble(z));
            else if (y.equals("%")) 
                ans = (Double.parseDouble(x) % Double.parseDouble(z));  

            else
                ans = (Double.parseDouble(x) * Double.parseDouble(z)); 
  
            
            t.setText(x + y + z + "=" + ans); 
  
            x = Double.toString(ans); 
  
            y = z = ""; 
        } 
        else { 
            
            if (y.equals("") || z.equals("")) 
                y = str; 
            else{
                double ans; 
                if (y.equals("+")) 
                    ans = (Double.parseDouble(x) + Double.parseDouble(z)); 
                else if (y.equals("-")) 
                    ans = (Double.parseDouble(x) - Double.parseDouble(z)); 
                else if (y.equals("/")) 
                    ans = (Double.parseDouble(x) / Double.parseDouble(z)); 
                else if (y.equals("%")) 
                ans = (Double.parseDouble(x) % Double.parseDouble(z));  

                else
                    ans = (Double.parseDouble(x) * Double.parseDouble(z)); 
                x = Double.toString(ans); 
 
                y = str; 
   
                z = ""; 	
            
            }
            t.setText(x + y + z);
        } 
    } 









	public static void main(String[] args){
		Calculator f = new Calculator();
		f.setTitle("calculator");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
		     System.exit(0);
	         }
         });
		}
	}

