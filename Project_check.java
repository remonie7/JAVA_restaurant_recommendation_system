import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
 
public class Project_check {
    private JFrame mainFrame;
    private JPanel Pa;
    private JLabel La;
    static ArrayList mArrayList = new ArrayList<String>();
    static ArrayList mArrayList1 = new ArrayList<String>();
    Project_check(ArrayList AL,ArrayList AL1) {
    	mArrayList=AL;
    	mArrayList1=AL1;
        showList(mArrayList,mArrayList1);
    }
   
 
    private void showList(ArrayList AL,ArrayList AL1) {
 
        final List List = new List(AL.size(), false);
        for(int i=0;i<AL.size();i++)
        	List.add((String) AL.get(i));
 
        JLabel deleteButton = new JLabel("Delete");
        JLabel random = new JLabel("Random");
 
         
        deleteButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				String data =List.getItem(
                        List.getSelectedIndex());
    	for(int i=0;i<AL.size();i++)
        	if(AL.get(i).equals(data)) {
        		AL.remove(i);
        		AL1.remove(i);
        	}
        List.remove(List.getSelectedIndex());
        int delCount = 0;
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
				deleteButton.setFont(new Font("Serif", Font.ITALIC, 28));				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				deleteButton.setFont(new Font("Serif", Font.ITALIC, 25));
			}
        });
        
        random.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				try {
					new Project_fre(mArrayList,mArrayList1);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				random.setFont(new Font("Serif", Font.ITALIC, 28));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				random.setFont(new Font("Serif", Font.ITALIC, 25));
			}
        });
        mainFrame = new JFrame("식당 목록");
        La=new JLabel("추천 식당 List");
        La.setFont(new Font("Serif", Font.BOLD, 13));
        Pa=new JPanel();
        Pa.add(La);
        Pa.setBounds(150, 10, 100, 20);
        mainFrame.add(Pa);
        mArrayList=AL;
    	mArrayList1=AL1;
    	mainFrame.setLayout(null);
    	List.setBounds(30, 50, 150, 250);
    	deleteButton.setFont(new Font("Serif", Font.ITALIC, 25));
    	deleteButton.setBounds(270, 100, 150, 50);
    	random.setFont(new Font("Serif", Font.ITALIC, 25));
    	random.setBounds(260, 180, 100, 50);
        mainFrame.add(deleteButton);
        mainFrame.add(random);
        mainFrame.add(List);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(400, 400);
        mainFrame.setVisible(true);
    }
}
