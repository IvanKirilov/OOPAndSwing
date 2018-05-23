import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame{

	private JPanel mainPanel;
	private JLabel nameLbl, ageLbl, telLbl, 
		purchaseLbl, colaLbl, breadLbl, chipsLbl,
		waterLbl,beerLbl, colaCounter, breadCounter,
		waterCounter, chipsCounter, beerCounter;
	private JTextField tel, name, age;
	private JButton purchaseBtn, colaPlus, colaMinus,
		breadPlus, breadMinus, waterPlus, waterMinus,
		chipsPlus, chipsMinus,beerPlus, beerMinus;
	private ListenForButton lb;
	
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		this.setLocation(50, 50);
		this.setSize(600, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("РћРЅР»Р°Р№РЅ РјР°РіР°Р·РёРЅ");
		
		lb = new ListenForButton();
		
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		
		nameLbl = new JLabel("Име:");
		nameLbl.setBounds(50, 50, 80, 20);
		mainPanel.add(nameLbl);
		
		name = new JTextField();
		name.setBounds(100, 50, 100, 20);
		mainPanel.add(name);
		
		telLbl = new JLabel("Тел:");
		telLbl.setBounds(50, 90, 80, 20);
		mainPanel.add(telLbl);
		
		tel = new JTextField();
		tel.setBounds(100, 90, 100, 20);
		mainPanel.add(tel);
		
		ageLbl = new JLabel("Год:");
		ageLbl.setBounds(50, 130, 80, 20);
		mainPanel.add(ageLbl);
		
		age = new JTextField();
		age.setBounds(100, 130, 26, 20);
		mainPanel.add(age);
		
		colaLbl = new JLabel("Кола");
		colaLbl.setBounds(380, 50, 80, 20);
		mainPanel.add(colaLbl);
		
		colaCounter = new JLabel("0");
		colaCounter.setBounds(360, 50, 30, 20);
		mainPanel.add(colaCounter);
		
		colaPlus = new JButton("+");
		colaPlus.addActionListener(lb);
		colaPlus.setBounds(450, 50, 50, 20);
		mainPanel.add(colaPlus);
		
		colaMinus = new JButton("-");
		colaMinus.addActionListener(lb);
		colaMinus.setBounds(510, 50, 50, 20);
		mainPanel.add(colaMinus);
		
		breadLbl = new JLabel("Хляб");
		breadLbl.setBounds(380, 90, 80, 20);
		mainPanel.add(breadLbl);
		
		breadCounter = new JLabel("0");
		breadCounter.setBounds(360, 90, 30, 20);
		mainPanel.add(breadCounter);
		
		breadPlus = new JButton("+");
		breadPlus.addActionListener(lb);
		breadPlus.setBounds(450, 90, 50, 20);
		mainPanel.add(breadPlus);
		
		breadMinus = new JButton("-");
		breadMinus.addActionListener(lb);
		breadMinus.setBounds(510, 90, 50, 20);
		mainPanel.add(breadMinus);
		
		waterLbl = new JLabel("Вода");
		waterLbl.setBounds(380, 130, 80, 20);
		mainPanel.add(waterLbl);
		
		waterCounter = new JLabel("0");
		waterCounter.setBounds(360, 130, 30, 20);
		mainPanel.add(waterCounter);
		
		waterPlus = new JButton("+");
		waterPlus.addActionListener(lb);
		waterPlus.setBounds(450, 130, 50, 20);
		mainPanel.add(waterPlus);
		
		waterMinus = new JButton("-");
		waterMinus.addActionListener(lb);
		waterMinus.setBounds(380, 130, 0, 20);
		mainPanel.add(waterMinus);
		
		beerLbl = new JLabel("Бира");
		beerLbl.setBounds(380, 170, 80, 20);
		mainPanel.add(beerLbl);
		
		beerCounter = new JLabel("0");
		beerCounter.setBounds(360, 130, 30, 20);
		mainPanel.add(beerCounter);
		
		beerPlus = new JButton("+");
		beerPlus.addActionListener(lb);
		beerPlus.setBounds(450, 130, 50, 20);
		mainPanel.add(beerPlus);
		
		beerMinus = new JButton("-");
		beerMinus.addActionListener(lb);
		waterMinus.setBounds(510, 130, 50, 20);
		mainPanel.add(waterMinus);
		
		purchaseBtn = new JButton("Айде в кошницата!: ");
		purchaseBtn.addActionListener(lb);
		purchaseBtn.setBounds(350, 350, 200, 30);
		mainPanel.add(purchaseBtn);
		
		purchaseLbl = new JLabel("Няма");
		purchaseLbl.setBounds(50, 200, 500, 80);
		mainPanel.add(purchaseLbl);
		
		this.add(mainPanel);
		this.setVisible(true);
	}
	
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			
			if(event.getSource() == colaPlus){
				int old = Integer.parseInt(
						colaCounter.getText());
				int val = old + 1;
				colaCounter.setText(val + "");
			}
			
			if(event.getSource() == colaMinus){
				int old = Integer.parseInt(
						colaCounter.getText());
				int val = old - 1;
				if(val >= 0){
					colaCounter.setText(val + "");
				}
			}
			
			if(event.getSource() == waterPlus){
				int old = Integer.parseInt(
						waterCounter.getText());
				int val = old + 1;
				waterCounter.setText(val + "");
			}
			
			if(event.getSource() == waterMinus){
				int old = Integer.parseInt(
						waterCounter.getText());
				int val = old - 1;
				if(val >= 0){
					waterCounter.setText(val + "");
				}
			}
			
			if(event.getSource() == breadPlus){
				int old = Integer.parseInt(
						breadCounter.getText());
				int val = old + 1;
				breadCounter.setText(val + "");
			}
			
			if(event.getSource() == breadMinus){
				int old = Integer.parseInt(
						breadCounter.getText());
				int val = old - 1;
				if(val >= 0){
					breadCounter.setText(val + "");
				}
			}
				if(event.getSource() == beerPlus){
					int old = Integer.parseInt(
							beerCounter.getText());
					int val = old + 1;
					beerCounter.setText(val + "");
				}
				
				if(event.getSource() == beerMinus){
					int old = Integer.parseInt(
							beerCounter.getText());
					int val = old - 1;
					if(val >= 0){
						beerCounter.setText(val + "");
					}
			}
			
			if(event.getSource() == purchaseBtn){
				if(Integer.parseInt(age.getText())<18){
					if(beerPlus.isSelected()){
						//result-=(beer);
					}
				}
				
				double sum = 0.0;
				
				sum += Integer.parseInt(
						colaCounter.getText())*1.23;
				
				sum += Integer.parseInt(
						breadCounter.getText())*0.94;
				
				sum += Integer.parseInt(
						waterCounter.getText())*5.6;
				
				sum+=Integer.parseInt(beerCounter.getText())*1.23;
				
				String result = "";
				
				int colas = Integer.parseInt(
						colaCounter.getText());
				
				int breads = Integer.parseInt(
						breadCounter.getText());
				
				int waters = Integer.parseInt(
						waterCounter.getText());
				
				int beer = Integer.parseInt(
						beerCounter.getText());
				
				result +=0;
				
				if(colas > 0){
					result += (colas + " коли; ");
				}
				
				if(breads > 0){
					result += (breads + " хляба; ");
				}
				
				if(waters > 0){
					result += (waters + " води; ");
				}
				
				if(beer>0){
					result+=(beer+ "  бири" );
				}
				
				result += " Вашата поръчка е: " + sum;
				
				purchaseLbl.setText(result);
			}
			
		}
		
	}
	
}
