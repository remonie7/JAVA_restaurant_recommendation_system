import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Project_select extends JFrame{
	JRadioButton [] one = new JRadioButton[2]; //성별
	JRadioButton [] two = new JRadioButton[4]; //가격
	JRadioButton [] three = new JRadioButton[4]; //가격
	JCheckBox [] four = new JCheckBox[7]; //메뉴
	JLabel button = new JLabel("Next");
	ButtonGroup Gone = new ButtonGroup();
	ButtonGroup Gtwo = new ButtonGroup();
	ButtonGroup Gthree = new ButtonGroup();
	String [] onedata= {"점심","저녁"};
	String [] twodata= {"0.5","1.0","1.5","2.0↑"};
	String [] threedata= {"30분","1시간","1시간↑"};
	String [] fourdata= {"육류","양식","간편식","분식","면류","한식","기타"};
	int result[]= {0,0,0,0};
	int menu []= {0,0,0,0,0,0,0};
	JTextArea ta = new JTextArea();
	String[][] datalist;
	ArrayList mArrayList = new ArrayList<String>();
	ArrayList mArrayList1 = new ArrayList<String>();
	Project_select(String[][] listlist){
		datalist=listlist;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame c = new JFrame();
		c.setTitle("선택창");
		JLabel LD =new JLabel("점심?저녁?");
		LD.setFont(new Font("Serif",Font.ITALIC,13));
		JLabel money =new JLabel("가격은?");
		money.setFont(new Font("Serif",Font.ITALIC,13));
		JLabel time =new JLabel("시간은?");
		time.setFont(new Font("Serif",Font.ITALIC,13));
		JLabel menu =new JLabel("메뉴 선택");
		menu.setFont(new Font("Serif",Font.ITALIC,13));
		
		LD.setBounds(20, 10, 100, 50);
		money.setBounds(20, 50, 100, 50);
		time.setBounds(20, 90, 100, 50);
		menu.setBounds(20, 140, 100, 50);
		c.getContentPane().add(LD);
		c.getContentPane().add(money);
		c.getContentPane().add(time);
		c.getContentPane().add(menu);
		Project_checkListener listener=new Project_checkListener(); 
		for(int i=0;i<2;i++) {
			one[i]=new JRadioButton(onedata[i],true);
			Gone.add(one[i]);
			one[i].addItemListener(listener);
			one[i].setBounds(110+i*70,10, 70,50);
			c.add(one[i]);
		}
		for(int i=0;i<4;i++) {
			two[i]=new JRadioButton(twodata[i],true);
			Gtwo.add(two[i]);
			two[i].addItemListener(listener);
			two[i].setBounds(110+i*70,50, 70,50);
			c.add(two[i]);
		}
		
		for(int i=0;i<3;i++) {
			three[i]=new JRadioButton(threedata[i],true);
			Gthree.add(three[i]);
			three[i].addItemListener(listener);
			three[i].setBounds(110+i*70,90, 70,50);
			c.add(three[i]);
		}
		
		for(int i=0;i<3;i++) {
			four[i]=new JCheckBox(fourdata[i]);
			
			four[i].addItemListener(listener);
			four[i].setBounds(110+i*70,130, 70,50);
			c.add(four[i]);
		}
		for(int i=3;i<7;i++) {
			four[i]=new JCheckBox(fourdata[i]);
			
			four[i].addItemListener(listener);
			four[i].setBounds(110+(i-3)*70,170, 70,50);
			c.add(four[i]);
		}
		button.setBounds(450,200, 80,50);
		button.addMouseListener(new EventHandler());
		c.add(button);
		JLabel La=new JLabel("(단위 : 만원)");
		JLabel La1=new JLabel("(중복 체크 가능)");
		La1.setFont(new Font("Serif",Font.ITALIC,13));
		button.setForeground(Color.RED);
	    button.setFont(new Font("",Font.ITALIC,27));
		//ta.setBackground(Color.black);
		//ta.setText("단위 :만 원\n메뉴는\n중복체크 \n가능합니다.");
		La.setBounds(400,23, 100,100);
		La1.setBounds(10,140, 100,100);
		//ta.setEnabled(false);
		c.getContentPane().add(La);
		c.getContentPane().add(La1);
		c.setSize(550,300); 
		c.setLayout(null);
		c.setVisible(true);
		
	}
	
	class Project_checkListener implements ItemListener {
		
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				for(int i=0;i<2;i++) {
					if(one[i].isSelected()) 
						result[0] = i+1;
					
				}
				for(int i=0;i<4;i++) {
					if(two[i].isSelected())
						result[1] = i+1;
				}
				
				for(int i=0;i<3;i++) {
					if(three[i].isSelected())
						result[2] = i+1;
				}
				
				for(int i=0;i<7;i++) {
					if(four[i].isSelected())
						menu[i] = i+1;
				}
			}
			
		}
	}
	
	public class EventHandler implements MouseListener {	 
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("다음 단계로");
			for(int j=0; j<116; j++)
			{
				String no1=Integer.toString(result[0]);
				String no2=Integer.toString(result[1]);
				String no3=Integer.toString(result[2]);
				
				String no22=Integer.toString(result[1]-1);
				String no33=Integer.toString(result[2]-1);
				
				String no222=Integer.toString(result[1]-2);
				String no333=Integer.toString(result[2]-2);
				
				String no2222=Integer.toString(result[1]-3);
				
				if(no2.equals(datalist[j][5])|no22.equals(datalist[j][5])|no222.equals(datalist[j][5])|no2222.equals(datalist[j][5]))
				{
					
				if(no3.equals(datalist[j][3])|no33.equals(datalist[j][3])|no333.equals(datalist[j][3]))
					
				{
									
				
				if(no1.equals(datalist[j][2]))
				{
					String checkno1=Integer.toString(menu[0]);
					String checkno2=Integer.toString(menu[1]);
					String checkno3=Integer.toString(menu[2]);
					String checkno4=Integer.toString(menu[3]);
					String checkno5=Integer.toString(menu[4]);
					String checkno6=Integer.toString(menu[5]);
					String checkno7=Integer.toString(menu[6]);
					if(datalist[j][1].equals(checkno1)|datalist[j][1].equals(checkno2)|datalist[j][1].equals(checkno3)|datalist[j][1].equals(checkno4)|datalist[j][1].equals(checkno5)|datalist[j][1].equals(checkno6)|datalist[j][1].equals(checkno7))
					{
						mArrayList.add(datalist[j][0]);
						mArrayList1.add(datalist[j][4]);
					}	        						
				}
				}
				}	
				
			}
	        new Project_check(mArrayList,mArrayList1);
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
			button.setFont(new Font("",Font.ITALIC,30));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			button.setFont(new Font("",Font.ITALIC,27));
		}
	}
}