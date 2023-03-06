import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import static java.awt.Font.PLAIN;

class Ventana extends JFrame{
	GridBagConstraints gbc= new GridBagConstraints();
	GridBagLayout gbl= new GridBagLayout();
	JLabel a,txtResultado;
	JTextArea txtGrados;
	JComboBox<String> combTemp,combTemp2;
	JButton btnConvertir;
	public Ventana() {
		getContentPane().setLayout(gbl); 
        setTitle("Conversoor temperaturas"); 
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        getContentPane().setBackground(Color.WHITE); 
        
        JTextArea1(txtGrados," ",0,0,1,1);
        JCombo(combTemp,"selesciona una opc.",1,0,1,1);
		JLabel1(a,"A: ",0,1,1,1);
		JCombo(combTemp2,"selesciona una opc.",1,1,1,1);
		JBtn(btnConvertir,"Convertir",0,2,2,1);
		JLabel1(txtResultado,"=",0,3,2,1);
		 setVisible(true);
	}//constructor
	
	public void JBtn(JButton c,String txt,int x, int y, int w, int h) {
		c = new JButton(txt);
		metodoMagico(c,x,y,w,h);
		/*c.setFont(new Font("MONOSPACED",PLAIN,30));
		c.setOpaque(true); //Para poder darle un color de fondo
		c.setBackground(Color.WHITE); //Color de fondo
        c.setForeground(Color.BLACK); //Color de fuente
       	c.setBorder(new LineBorder(Color.WHITE)); //Borde*/
        add(c); //Añado el JLabel al JFrame
	}
	public void JCombo(JComboBox c,String txt,int x, int y, int w, int h) {
		c =new JComboBox<>();
		c.addItem("selesciona una opc.");
		metodoMagico(c,x,y,w,h);
        add(c); //Añado el JLabel al JFrame
	}
	public void JTextArea1(JTextArea c,String txt,int x, int y, int w, int h) {
		c = new JTextArea(txt); //Inicio JLabel
		 c.setOpaque(true); //Para poder darle un color de fondo
		c.setBackground(Color.WHITE); //Color de fondo
		c.setForeground(Color.BLUE); //Color de fuente
		c.setBorder(new LineBorder(Color.DARK_GRAY)); //Borde
		c.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		metodoMagico(c,x,y,w,h);
        add(c); //Añado el JLabel al JFrame
	}
	public void JLabel1(JLabel c,String txt,int x, int y, int w, int h) {
		c = new JLabel(txt); //Inicio JLabel
		 c.setOpaque(true); //Para poder darle un color de fondo
		c.setBackground(Color.WHITE); //Color de fondo
		c.setForeground(Color.BLUE); //Color de fuente
		c.setFont(new Font("MONOSPACED", PLAIN, 40)); //Fuente
		c.setHorizontalAlignment(SwingConstants.RIGHT); //Alineamiento horizontal derecha
		metodoMagico(c,x,y,w,h);
        add(c); //Añado el JLabel al JFrame
	}
	public void metodoMagico(Component c,int x, int y, int w, int h) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		gbl.setConstraints(c, gbc);
	}
}
public class Pruebas030623 {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Ventana();
			}
		});
	}
}
