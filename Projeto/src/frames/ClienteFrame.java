package frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import pessoas.Cliente;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.LinkedList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ClienteFrame extends JFrame {
    
    private JPanel contentPane;
    private LinkedList<Cliente> listaCliente;
    JTextArea textArea;
    private JButton sairButton;
    public LinkedList<Cliente> getListaCliente() {
    return listaCliente;
    
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteFrame frame = new ClienteFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClienteFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 459);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	    textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(33, 57, 496, 336);
		contentPane.add(textArea);
		
		JLabel tituloCliente = new JLabel("Clientes Cadastrados");
		tituloCliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		tituloCliente.setBounds(209, 25, 194, 25);
		contentPane.add(tituloCliente);
		listaCliente= new LinkedList();
		sairButton = new JButton("Sair");
		sairButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		sairButton.setBounds(539, 370, 89, 23);
		contentPane.add(sairButton);
		
	}
	
	public void mostraClientes() {
	    textArea.setText("");
	    for(Cliente c:listaCliente) {
	    	textArea.append(c.toString()+"\n");
	    }
	}
	
}
