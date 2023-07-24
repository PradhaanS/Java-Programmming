package is111;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;
public class Tictactoe extends JFrame implements ActionListener{
	 boolean turn;
	 static int i,j;
	 JFrame f=new JFrame("TIC TAC TOE");
	  private JButton[][] b;
    // String [][]matrix=new String[3][3];
   JDialog d=new JDialog(f,"dialog box");
   JLabel l=new JLabel();
   JPanel p=new JPanel(new BorderLayout());
 Tictactoe(){
	 p.setLayout(new GridLayout(3,3));
   b =new JButton[3][3];
		 {
		        for (int row = 0; row < b.length; row++) {
		        	
		            for (int col = 0; col < b[0].length; col++) {
		                JButton cell = new JButton();
		                b[row][col] = cell;
		                cell.setPreferredSize(new Dimension(50,50));
		                p.add(cell);
		                //cell.setBounds((100+50*col),(100+50*row),50,50);
		                cell.addActionListener(this);
		            }
		        }
		  
	   }
   
   //JButton cell=new JButton();
   //b[2][2]=cell;
    //f.add(cell);
    //cell.setBounds(200,200,50,50);
    //cell.addActionListener(this);
		 f.add(p);
		 f.pack();
		
		 f.setVisible(true);
     f.setSize(400,400);
     f.setLayout(null);
    //for(;i<3&&j<3;) {
    	// b[i][j].addActionListener(this);
     //}
 }
    @Override
     public void actionPerformed(ActionEvent e) {
    	 int x,y;
    	 JButton now=(JButton) e.getSource();
     	if(turn) {
     		if(!now.getText().equals("x")) {
     		now.setText("o");
     		turn=false;
     		}
     	}
     	else {
     		if(!now.getText().equals("o")) {
     		now.setText("x");
     		turn=true;
     		}
     	}
    	for(x=0,y=0;x<3;x++) {
    		if(((b[x][y].getText().equals("x"))&&(b[x][y+1].getText().equals("x"))&&(b[x][y+2].getText().equals("x")))){
    			 l.setText("x won the game"); 
    	       	  JOptionPane.showMessageDialog(f, "x won the game");	
    	       	  f.add(d);
    	       	  d.add(l);
    	       	d.setSize(300,300);
    	       	  d.setVisible(true);	
    		}
    	}
    	for(y=0,x=0;y<3;y++) {
    		if(((b[x][y].getText().equals("x"))&&(b[x+1][y].getText().equals("x"))&&(b[x+2][y].getText().equals("x")))){
    			 l.setText("x won the game"); 
    	       	  JOptionPane.showMessageDialog(f, "x own the game");	
    	       	  f.add(d);
    	       	d.setSize(300,300);
    	       	  d.setVisible(true);	
    		}
    	}
    	
    	y=0;
    	if(((b[x][y].getText().equals("x"))&&(b[x+1][y+1].getText().equals("x"))&&(b[x+2][y+2].getText().equals("x")))) {
    		 l.setText("x won the game"); 
	       	  JOptionPane.showMessageDialog(f,  "x won the game");	
	       	  f.add(d);
	       	  
	       	d.setSize(300,300);
	       	  d.setVisible(true);		
    	}
    	
    	if(((b[0][2].getText().equals("x"))&&(b[1][1].getText().equals("x"))&&(b[2][0].getText().equals("x")))) {
   		 l.setText("x won the game"); 
	       	  JOptionPane.showMessageDialog(f, "x won the game");	
	       	  f.add(d);
	       	d.setSize(300,300);
	       	  d.setVisible(true);		
   	}
    	for(x=0,y=0;x<3;x++) {
    		if(((b[x][y].getText().equals("o"))&&(b[x][y+1].getText().equals("o"))&&(b[x][y+2].getText().equals("o")))){
    			 l.setText("o won the game"); 
    	       	  JOptionPane.showMessageDialog(f, "o won the game");	
    	       	  f.add(d);
    	       	d.setSize(300,300);
    	       	  d.setVisible(true);	
    		}
    	}
    	for(y=0,x=0;y<3;y++) {
    		if(((b[x][y].getText().equals("o"))&&(b[x+1][y].getText().equals("o"))&&(b[x+2][y].getText().equals("o")))){
    			 l.setText("o won the game"); 
    	       	  JOptionPane.showMessageDialog(f, "o won the game");	
    	       	  f.add(d);
    	       	d.setSize(300,300);
    	       	  d.setVisible(true);	
    		}
    	}
    	x=0;y=0;
    	if(((b[x][y].getText().equals("o"))&&(b[(x+1)][(y+1)].getText().equals("o"))&&(b[(x+2)][(y+2)].getText().equals("o")))) {
    		 l.setText("o won the game"); 
	       	  JOptionPane.showMessageDialog(f,"o won the game");	
	       	  f.add(d);
	       	d.setSize(300,300);
	       	  d.setVisible(true);		
    	}
    	if(((b[0][2].getText().equals("o"))&&(b[1][1].getText().equals("o"))&&(b[2][0].getText().equals("o")))) {
   		 l.setText("o won the game"); 
	       	  JOptionPane.showMessageDialog(f,"o won the game");	
	       	  f.add(d);
	       	d.setSize(300,300);
	       	  d.setVisible(true);		
   	}
    	
    	 
     }
	  
public static void main(String[] args) {
	new  Tictactoe();
  } 
}
