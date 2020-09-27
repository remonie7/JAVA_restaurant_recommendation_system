import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class Project_fre extends JFrame {
	static List<String> list1 = new ArrayList<String>();
	static List<Integer> list2 = new ArrayList<Integer>();
	
	
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
	
	public void Read(ArrayList AL,ArrayList AL1) throws IOException {
		Random ran=new Random();
		int a=ran.nextInt(AL.size());
		String select=(String) AL.get(a);
		System.out.print(select);
		
		int select_index=Integer.parseInt((String)AL1.get(a));
		System.out.print(select_index);
		new Project_result(select_index,select);
		List<String> ret = fileLineRead("C:\\Users\\com\\Downloads\\javatest.txt");
		boolean aa=false;
		for(int i=0; i<ret.size(); i++) {
			if(ret.get(i).equals(select))
			{
				int freq=(Integer.parseInt(ret.get(i+1)))+1;
				ret.set(i+1, Integer.toString(freq));
				aa=true;
			}
			
		}
		if(aa==false)
		{
			ret.add(select);
			ret.add("1");
		}
		
		try
	    {
	      FileWriter fw = new FileWriter("C:\\Users\\com\\Downloads\\javatest.txt"); // 절대주소 경로 가능
	      BufferedWriter bw = new BufferedWriter(fw);	 

	      for(String str : ret) {
	      bw.write(str);
	      bw.newLine(); // 줄바꿈
	      }

	      bw.close();
	    }
	    catch (IOException e)
	    {
	      System.err.println(e); // 에러가 있다면 메시지 출력
	      System.exit(1);
	    }
		
		for(int i=0; i<ret.size(); i=i+2)
		{
			list1.add(ret.get(i));
		}
		for(int i=1; i<ret.size(); i=i+2)
		{
			list2.add(Integer.parseInt(ret.get(i)));
		}
		
		String[] ret1 = new String[list1.size()];
		int[] ret2 = new int[list2.size()];
		
		for(int i=0; i<list2.size()-1; i++) {
				for(int j=i+1; j<list2.size(); j++) {
					if(list2.get(i) < list2.get(j))
					{
						int temp2=list2.get(i);
						list2.set(i, list2.get(j));
						list2.set(j, temp2);
						
						String temp1=list1.get(i);
						list1.set(i, list1.get(j));
						list1.set(j, temp1);
					}
					
			}
		}
		
		
		for(int i=0; i<list2.size()-1; i++)
		{
			System.out.println(list1.get(i));
			
		}
		
	}
	Project_fre(ArrayList AL,ArrayList AL1) throws IOException{
		JTextArea Text=new JTextArea();
		Read(AL,AL1);
		JLabel La=new JLabel(list1.get(0)+" "+list2.get(0)+"표");
		JLabel La1=new JLabel(list1.get(1)+" "+list2.get(1)+"표");
		JLabel La2=new JLabel(list1.get(2)+" "+list2.get(2)+"표");
		JLabel La3=new JLabel(list1.get(3)+" "+list2.get(3)+"표");
		JLabel La4=new JLabel(list1.get(4)+" "+list2.get(4)+"표");
		
		/*La.setForeground(Color.RED);
		La1.setForeground(Color.ORANGE);
		La2.setForeground(Color.MAGENTA);
		La3.setForeground(Color.darkGray);
		La4.setForeground(Color.blue);
		*/
		
		La.setBounds(250, 0, 130, 80);
		La1.setBounds(250, 50, 130, 80);
		La2.setBounds(250, 110, 130, 80);
		La3.setBounds(250, 170, 130, 80);
		La4.setBounds(250, 230, 130, 80);
		
		JFrame frame = new JFrame();
		frame.getContentPane().add(La);
		frame.getContentPane().add(La1);
		frame.getContentPane().add(La2);
		frame.getContentPane().add(La3);
		frame.getContentPane().add(La4);
		
		
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	     MyDrawPanel drawPanel = new MyDrawPanel(); 
	     frame.getContentPane().add(drawPanel);
	     frame.setSize(400,400);
	     frame.setVisible(true);

	}
	class MyDrawPanel extends JPanel {  // 내부 클래스
        public void paintComponent(Graphics g) {
          g.setColor(Color.PINK);
          g.fillRect(20,10,list2.get(0)*5,40);
           
           g.setColor(Color.ORANGE);
           g.fillRect(20,70,list2.get(1)*5,40);
           
           g.setColor(Color.MAGENTA);
           g.fillRect(20,130,list2.get(2)*5,40);
           
           g.setColor(Color.darkGray);
           g.fillRect(20,190,list2.get(3)*5,40);
           
           g.setColor(Color.blue);
           g.fillRect(20,250,list2.get(4)*5,40);
        }
     } // close inner class
}