package calendar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyCalander extends JFrame{
	     	 JButton t1= new JButton();
	     	 JButton t2= new JButton();
	     	 JButton t3= new JButton();
	     	 JButton t4= new JButton();
	public  void setTime() {
		String[] week= {"����һ","���ڶ�","������","������","������","������","������"};
		Calendar ca = Calendar.getInstance();
		String year = String.valueOf(ca.get(Calendar.YEAR));
		String month = String.valueOf(ca.get(Calendar.MONTH));
		int i = ca.get(Calendar.DAY_OF_WEEK);
		String day = String.valueOf(ca.get(Calendar.DATE));
		String hour = String.valueOf(ca.get(Calendar.HOUR_OF_DAY));
		String minute = String.valueOf(ca.get(Calendar.MINUTE));
		String second = String.valueOf(ca.get(Calendar.SECOND));
		//t1 = new JButton();
		t1.setText(year + "��");
		t1.setBackground(Color.lightGray);
		//t1.setSize(200, 100);
		t1.setPreferredSize(new Dimension(200,100));
		//t1.setLocation(arg0, arg1);
		//t2 = new JButton();
		t2.setText(month + "��" + day + "��");
		t2.setBackground(Color.lightGray);
		t2.setSize(200, 100);
		//t3 = new JButton();
		t3.setText(week[i]);
		t3.setBackground(Color.lightGray);
		t3.setSize(200, 100);
		//t4 = new JButton();
		t4.setText(hour + "ʱ" + minute + "��" + second + "��");
		t4.setBackground(Color.lightGray);
		t4.setSize(200, 100);
		t2.setPreferredSize(new Dimension(200,100));
		t3.setPreferredSize(new Dimension(200,100));
		t4.setPreferredSize(new Dimension(200,100));
		t4.setFont(new Font("����",Font.BOLD,25));
		t2.setFont(new Font("����",Font.BOLD,25));
		t3.setFont(new Font("����",Font.BOLD,25));
		t1.setFont(new Font("����",Font.BOLD,30));
	}
	
	
	public MyCalander() {
		JFrame frame=new JFrame("�ҵ�����");
		frame.setLocation(1700, 400);
		frame.setSize(200,400);
		frame.setLayout(new GridLayout(4,1));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setResizable(false);
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JPanel p3=new JPanel();
		JPanel p4=new JPanel();
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		p1.add(t1);
		p2.add(t2);
		p3.add(t3);
		p4.add(t4);
		
		
	 	timer.schedule(new Task(),0,500);
	}
	
 	public static void main(String[] agrs) {
		new MyCalander();
		
		
		
		

		
		
		
	}
 	Timer timer=new Timer();
 	public class Task extends TimerTask {
 		@Override
 		public void run() {
 			setTime();
 	}

	
		
	}

}


































