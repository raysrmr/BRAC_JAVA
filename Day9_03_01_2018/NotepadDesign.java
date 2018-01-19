import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class NotepadDesign extends JFrame implements ActionListener
{
	JTextArea area;
	JMenuBar menubar;
	JMenu file;
	JMenuItem ne,open,exit;
	NotepadDesign(String title)
	{
		super(title);
		area=new JTextArea();
		add(area);
		menubar=new JMenuBar();
		setJMenuBar(menubar);
		file=new JMenu("File");
		ne=new JMenuItem("New");
		open=new JMenuItem("Open");
		exit=new JMenuItem("Exit");
		file.add(ne);
		file.add(open);
		file.add(exit);
		menubar.add(file);
		ne.addActionListener(this);
		open.addActionListener(this);
		exit.addActionListener(this);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String act=ae.getActionCommand();
		JFileChooser jfc=new JFileChooser();
		if(act.equals(ne.getLabel()))
		{
			String msg=area.getText();
			if(!msg.equals(""))
			{
				int val=JOptionPane.showConfirmDialog(this,"Do you want save?");
				if(val==0)
				{
					
					jfc.showSaveDialog(this);
				}
				else{
					area.setText("");
				}
			}
		}
		else if(act.equals(open.getLabel()))
		{
			try{
			jfc.showOpenDialog(this);
			File fna=jfc.getSelectedFile();
			int i=0;
			FileInputStream fis=new FileInputStream(fna.getAbsolutePath());
			while((i=fis.read())!=-1)
			{
				area.append(""+(char)i);
			}
			}catch(Exception e)
			{
				System.out.println("Error : "+e);
			}
		}
		else if(act.equals(exit.getLabel()))
		{
		}
	}
}
