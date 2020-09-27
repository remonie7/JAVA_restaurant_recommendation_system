import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Project_main extends JFrame{
	static JLabel Bu = new JLabel("START");
	static String[][] listlist = new String[116][7];
	public static List<String> fileLineRead(String name) throws IOException
	 {
	  ArrayList<String> retStr = new ArrayList<String>();

	  BufferedReader in = new BufferedReader(new FileReader(name));

	  String s;

	  while ((s = in.readLine()) != null) {

	   retStr.add(s);
	  }
	  in.close();
	  return retStr;  
	 }
	public static void main(String[] args) throws IOException {
		List<String> ret = fileLineRead("C:\\Users\\com\\Downloads\\bbb.txt");
		
		int i=0;
			for(int j=0; j<102; j++){
				for(int k=0; k<7; k++){
					listlist[j][k] = ret.get(i);
					i++;
				}
			}
			JFrame frame = new JFrame("시작 화면");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    
		    JLabel label = new JLabel("메뉴 추천!");
		    JLabel label2 = new JLabel("Program");
		    frame.add(label);
		    frame.add(label2);
		    label.setFont(new Font("점심 메뉴 추천",Font.PLAIN,25));
		    label2.setFont(new Font("",Font.ITALIC,25));
		    //label.setForeground(Color.magenta);
		    //label2.setForeground(Color.RED);
		    Bu.setForeground(Color.RED);
		    Bu.setFont(new Font("",Font.ITALIC,25));
		    label.setBounds(40,0, 200, 50);
		    label2.setBounds(150,30, 200, 50);
		    Bu.setBounds(90, 90, 100, 100);
		    frame.add(Bu);
		    Bu.addMouseListener( new Event());
		    frame.setLayout(null);
		    frame.getContentPane().setBackground(Color.WHITE);
		    frame.setSize(300, 250);
		    frame.setVisible(true);
			  
	}
	
	public static class Event implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			new Project_select(listlist);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Bu.setFont(new Font("",Font.ITALIC,30));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Bu.setFont(new Font("",Font.ITALIC,25));
		}
		
	}
}
