import javax.swing.*;


import java.awt.*;
import java.awt.image.BufferedImage;
public class Project_result extends JFrame{
	JFrame c = new JFrame();
	private JTextField textfield = new JTextField(30);
	private JPanel panel = new JPanel();
	private GoogleAPI googleAPI=new GoogleAPI();
	private String location="Àü¶óºÏµµ+ÀüÁÖ½Ã+´öÁø±¸+¸í·û4±æ";
	private JLabel googleMap=new JLabel();
	private JTextArea ddd= new JTextArea();
	public Project_result(int index,String select) {
		
		c.setLayout(new BorderLayout());
		c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font = new Font(select, Font.BOLD, 20);
		ddd.setFont(font);
		ddd.setText("                                      "+select);
		c.setResizable(false);
		c.setTitle("Google Maps");
		c.setVisible(true);
		panel.add(textfield);
		c.add(BorderLayout.NORTH,ddd);
		googleAPI.downloadMap(location);
		googleMap = new JLabel(googleAPI.getMap(location)){
	        @Override
	        public void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.setColor(Color.BLUE);
	            g.fillOval(355, 155, 30, 30);
	            //1
	            if(index==1) {
	            	g.setColor(Color.RED);
		            g.fillOval(200,20,30,30);
	            }
	            
	            else if(index==2) {
	            	g.setColor(Color.RED);
		            g.fillOval(260,80,30,30);
	            }
	            
	            else if(index==3) {
	            	g.setColor(Color.RED);
		            g.fillOval(300,120,30,30);

	            }
	            
	            else if(index==4) {
	            	g.setColor(Color.RED);
		            g.fillOval(420,210,30,30);
	            }
	            
	            else if(index==5) {
	            	g.setColor(Color.RED);
		            g.fillOval(470,250,30,30);
	            }
	            else if(index==6) {
	            	g.setColor(Color.RED);
		            g.fillOval(510,290,30,30);
	            }
	            
	            else if(index==7) {
	            	g.setColor(Color.RED);
		            g.fillOval(160,70,30,30);
	            }
	            else if(index==8) {
	            	g.setColor(Color.RED);
		            g.fillOval(200,110,30,30);
	            }
	            
	            else if(index==9) {
	            	g.setColor(Color.RED);
		            g.fillOval(235,135,30,30);
	            }
	            
	            else if(index==10) {
	            	g.setColor(Color.RED);
		            g.fillOval(270,170,30,30);
	            }
	            
	            else if(index==11) {
	            	g.setColor(Color.RED);
		            g.fillOval(310,190,30,30);
	            }
	            
	            //3
	            else if(index==12) {
	            	g.setColor(Color.RED);
		            g.fillOval(120,120,30,30);
	            }
	            
	            else if(index==13) {
	            	g.setColor(Color.RED);
		            g.fillOval(170,160,30,30);
	            }
	            
	            else if(index==14) {
	            	g.setColor(Color.RED);
		            g.fillOval(205,170,30,30);
	            }
	            
	            else if(index==15) {
	            	g.setColor(Color.RED);
		            g.fillOval(260,200,30,30);
	            }
	            
	            else if(index==16) {
	            	g.setColor(Color.RED);
		            g.fillOval(310,230,30,30);
	            }
	            
	            else if(index==17) {
	            	g.setColor(Color.RED);
		            g.fillOval(360,260,30,30);
	            }
	            
	            else if(index==18) {
	            	g.setColor(Color.RED);
		            g.fillOval(400,300,30,30);
	            }
	            
	            else if(index==19) {
	            	g.setColor(Color.RED);
		            g.fillOval(450,355,30,30);
	            }
	            
	            else if(index==20) {
	            	g.setColor(Color.RED);
		            g.fillOval(490,410,30,30);
	            }
	            
	            //4
	            else if(index==21) {
	            	g.setColor(Color.RED);
		            g.fillOval(100,170,30,30);
	            }
	            
	            else if(index==22) {
	            	g.setColor(Color.RED);
		            g.fillOval(150,200,30,30);
	            }
	            
	            else if(index==23) {
	            	g.setColor(Color.RED);
		            g.fillOval(180,220,30,30);
	            }
	            
	            else if(index==24) {
	            	g.setColor(Color.RED);
		            g.fillOval(240,250,30,30);
	            }
	            
	            else if(index==25) {
	            	g.setColor(Color.RED);
		            g.fillOval(280,280,30,30);
	            }
	            
	            //4.5
	            else if(index==26) {
	            	g.setColor(Color.RED);
		            g.fillOval(270,320,30,30);
	            }
	            
	            else if(index==27) {
	            	g.setColor(Color.RED);
		            g.fillOval(310,340,30,30);
	            }
	            
	            else if(index==28) {
	            	g.setColor(Color.RED);
		            g.fillOval(360,360,30,30);
	            }
	            
	            else if(index==29) {
	            	g.setColor(Color.RED);
		            g.fillOval(410,400,30,30);
	            }
	            
	            else if(index==30) {
	            	g.setColor(Color.RED);
		            g.fillOval(460,430,30,30);
	            }
	            
	            //5
	            else if(index==31) {
	            	g.setColor(Color.RED);
		            g.fillOval(60,210,30,30);
	            }
	            
	            else if(index==32) {
	            	g.setColor(Color.RED);
		            g.fillOval(110,260,30,30);
	            }
	            
	            else if(index==33) {
	            	g.setColor(Color.RED);
		            g.fillOval(160,310,30,30);
	            }
	            
	            else if(index==34) {
	            	g.setColor(Color.RED);
		            g.fillOval(240,360,30,30);
	            }
	            
	            else if(index==35) {
	            	g.setColor(Color.RED);
		            g.fillOval(330,395,30,30);
	            }
	            
	            else if(index==36) {
	            	g.setColor(Color.RED);
		            g.fillOval(330,395,30,30);
	            }
	            
	            //back
	            else if(index==37) {
	            	g.setColor(Color.RED);
		            g.fillOval(290,440,30,30);
	            }
	            
	        }
	    };
		googleAPI.fileDelete(location);
		
		//c.add(BorderLayout.NORTH,panel);
		c.add(BorderLayout.CENTER,googleMap);
		c.pack();
		c.setSize(612, 612);
		
		
	}
}
