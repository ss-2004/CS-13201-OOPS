import java.awt.*;
import java.awt.event.*;

class calc implements ActionListener
{
	Frame f = new Frame();
	Label l1 = new Label("Input 1 : ");
	Label l2 = new Label("Input 2 : ");
	Label l3 = new Label("Result : ");
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	
	Button b1 = new Button("+");
	Button b2 = new Button("-");
	Button b3 = new Button("x");
	Button b4 = new Button("/");
	Button b5 = new Button("%");
	
	Button b6 = new Button("sin(x)");
	Button b7 = new Button("cos(x)");
	Button b8 = new Button("tan(x)");
	Button b9 = new Button("log(x)");
	Button b10 = new Button("ln(x)");
	
	Button bb = new Button("Basic");
	Button bs = new Button("Scientific");
	Button be = new Button("EXIT");
	
	calc()
	{
		selectMode();
		
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500, 500);		
	}
	
	void selectMode()
	{
		bs.setBounds(75, 50, 100, 35);
		bb.setBounds(200, 50, 100, 35);
		be.setBounds(325, 50, 100, 35);
	
		f.add(bs);
		f.add(bb);
		f.add(be);
	
		bb.addActionListener(this);
		bs.addActionListener(this);
		be.addActionListener(this);
	}
	
	void renderBasic()
	{
		l1.setBounds(100, 100, 100, 20);
		l2.setBounds(100, 140, 100, 20);
		l3.setBounds(100, 180, 100, 20);
		
		t1.setBounds(200, 100, 100, 20);
		t2.setBounds(200, 140, 100, 20);
		t3.setBounds(200, 180, 100, 20);
		
		b1.setBounds(50, 250, 60, 30);
		b2.setBounds(125, 250, 60, 30);
		b3.setBounds(200, 250, 60, 30);
		b4.setBounds(275, 250, 60, 30);
		b5.setBounds(350, 250, 60, 30);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		
		f.add(t1);
		f.add(t2);
		f.add(t3);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	
	void renderAdv()
	{
		l1.setBounds(100, 100, 100, 20);
		l3.setBounds(100, 140, 100, 20);
		
		t1.setBounds(200, 100, 100, 20);
		t3.setBounds(200, 140, 100, 20);
		
		b6.setBounds(50, 250, 60, 30);
		b7.setBounds(125, 250, 60, 30);
		b8.setBounds(200, 250, 60, 30);
		b9.setBounds(275, 250, 60, 30);
		b10.setBounds(350, 250, 60, 30);
		
		f.add(l1);
		f.add(l3);
		
		f.add(t1);
		f.add(t3);
		
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		Object choice = e.getSource();
		double n1, n2;
		
		if(choice == be)
			System.exit(0);
		if(choice == bb)
		{
			renderBasic();
			
			n1 = Double.parseDouble(t1.getText());
			n2 = Double.parseDouble(t2.getText());
			
			if(e.getSource() == b1)
				t3.setText(String.valueOf(n1+n2));
			if(e.getSource() == b2)
				t3.setText(String.valueOf(n1-n2));
			if(e.getSource() == b3)
				t3.setText(String.valueOf(n1*n2));
			if(e.getSource() == b4)
				t3.setText(String.valueOf(n1/n2));
			if(e.getSource() == b5)
				t3.setText(String.valueOf(n1%n2));
		}
		if(choice == bs)
		{
			renderAdv();
			
			n1 = Double.parseDouble(t1.getText());
			
			if(e.getSource() == b6)
				t3.setText(String.valueOf(Math.sin(n1)));
			if(e.getSource() == b7)
				t3.setText(String.valueOf(Math.cos(n1)));
			if(e.getSource() == b8)
				t3.setText(String.valueOf(Math.tan(n1)));
			if(e.getSource() == b9)
				t3.setText(String.valueOf(Math.log10(n1)));
			if(e.getSource() == b10)
				t3.setText(String.valueOf(Math.log(n1)));
		}	
	}
	
	public static void main(String args[])
	{
		new calc();
	}
}
