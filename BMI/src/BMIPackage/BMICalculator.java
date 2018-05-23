package BMIPackage;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BMICalculator {

	private JFrame frame;
	private JTextField weightInput, heightInput;
	private JButton Calc;
	private JLabel Weight,Height;
	private ListenForButton lb;
	private double digitWeight,digitHeight, result;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMICalculator window = new BMICalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BMICalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lb=new ListenForButton();
		
		weightInput= new JTextField();
		weightInput.setBounds(10, 11, 86, 20);
		frame.getContentPane().add(weightInput);
		weightInput.setColumns(10);
		
		heightInput = new JTextField();
		heightInput.setBounds(10, 55, 86, 20);
		frame.getContentPane().add(heightInput);
		heightInput.setColumns(10);
		
		Calc = new JButton("Calc");
		Calc.setBounds(7, 96, 89, 23);
		frame.getContentPane().add(Calc);
		Calc.addActionListener(lb);
		
		Weight = new JLabel("Weight");
		Weight.setBounds(106, 14, 46, 14);
		frame.getContentPane().add(Weight);
		
	    Height = new JLabel("Height");
		Height.setBounds(106, 58, 46, 14);
		frame.getContentPane().add(Height);
	}
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			if(event.getSource()==Calc) {
				digitWeight=Double.parseDouble(weightInput.getText());
				digitHeight=Double.parseDouble(heightInput.getText());
				result=digitWeight/(digitHeight*digitHeight);
				result=Math.round(result*100)/100.0;
				JOptionPane.showMessageDialog(null, "Индекс на телесната маса: "+result,"ИТМ",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
		}
		
	}
}
