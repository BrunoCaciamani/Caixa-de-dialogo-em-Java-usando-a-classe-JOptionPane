import javax.swing.*;
import kjava.awt.event.*;


public class CaixaDialogo extends JFrame implements ActionListener{
	
	private JButton btn1;
	
	public CaixaDialago(){
		btn1 = new JButton("Executar");
		btn1.setBounds(200,200,200,50);
		add(btn1);
		btn1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == btn1){
			
			JOptionPane.showMessageDialog(this, "Texto da mensagem", "Titulo da mensagem", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}
	
	public static void main(String args []){
		
		CaixaDialago form = new CaixaDialago();
		form.setLayout(null);
		form.setBounds(0,0,700,450);
		form.setVisible(true);
		form.setLocationRelativeTo(null);
		form.setTitle("Caixas de Dialago");
		form.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}