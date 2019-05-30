import javax.swing.*;
import java.awt.*;

public class WindowServer extends JFrame {
	public WindowServer() {
		setBounds(1200,300,280,350);				
		
		JPanel ventana = new JPanel();
		
		ventana.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		ventana.add(areatexto,BorderLayout.CENTER);
		
		add(ventana);
		
		setVisible(true);
	}
	
	private JTextArea areatexto;
}
