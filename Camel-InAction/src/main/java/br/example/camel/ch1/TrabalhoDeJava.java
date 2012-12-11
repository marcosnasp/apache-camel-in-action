package br.example.camel.ch1;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TrabalhoDeJava extends JFrame {

    private JButton buttonAdd;
    private JButton buttonRemove;
    private JButton buttonCredit;
    private JButton buttonDebit;
    private JButton buttonRendJuros;
    private JButton buttonSearch;
    private JButton buttonDebitJuros;
    
    private JPanel panel;
    
	public TrabalhoDeJava(){
		
		super ("Minha Conta");
		
		//Criando Painel 1
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		//Adicinonando o Tamanho do meu Painel
		p.add(new JTextArea(30, 60));
		
		//Criando Painel 2
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		// criando os botoes e anexando acoes...
		criarBotoes();
		
		//Adicionando os Botões
		panel.add(buttonAdd);
		panel.add(buttonRemove);
		panel.add(buttonCredit);
		panel.add(buttonDebit);
		panel.add(buttonRendJuros);
		panel.add(buttonSearch);
		panel.add(buttonDebitJuros);
		
		//Criando um Terceiro Painel
		JPanel p3 = new JPanel();
		p3.setLayout(new FlowLayout());
		//Criando a aba para abrir diretórios
		Label label = new Label("Diretórios de Arquivos");
		//Definindo a fonte e o tamanho da mesma
		label.setFont(new Font("Dialogo", Font.ITALIC, 13));
		//Adicionando Label
		p3.add(label);
		p3.add(new TextField(50));
		//Adicionando o botão carregar
		JButton button = new JButton("Carregue Aqui");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser ca = new JFileChooser("d:/Downloads");
				ca.setMultiSelectionEnabled(false); //selecionar um arquivo por vez.
				ca.showOpenDialog(null);
			}
		});
		
		p3.add(button);
		
		//adcionando o Painel 4
		JPanel p4 = new JPanel();
		p4.setLayout(new BorderLayout());
		p4.add(new JLabel("Atividades:"));
		
		//Recuperando o container das Janelas
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		//Adicionando BorderLayout ao NORTE, Painel 4
		c.add(BorderLayout.NORTH, p4);
		c.add(p);
		//Adicionando BorderLayout ao CENTRO, Painel 2
		c.add(BorderLayout.CENTER, panel);
		//Adicionando BorderLayout ao SUL, Painel 3
		c.add(BorderLayout.SOUTH, p3);
		
	
		//Criando botão para fechar a janelinha
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Definição do tamanho da Janela
		setSize(800, 600);
		//Validando Visualização
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		
	}
	
	private void criarBotoes() {
	    buttonAdd = new JButton();
	    buttonAdd.setAction(new ButtonAdicionar("Adicionar"));
	    
        buttonRemove = new JButton();
        buttonRemove.setAction(new ButtonRemover("Remover"));
        
        buttonCredit = new JButton();
        buttonCredit.setAction(new ButtonCreditar("Creditar"));
        
        buttonDebit = new JButton();
        buttonDebit.setAction(new ButtonDebitar("Debitar"));
        
        buttonRendJuros = new JButton();
        buttonRendJuros.setAction(new ButtonRenderJuros("Render Juros"));
        
        buttonSearch = new JButton();
        buttonSearch.setAction(new ButtonProcurar("Procurar"));
        
        buttonDebitJuros = new JButton();
        buttonDebitJuros.setAction(new ButtonDebitJuros("Debitar Juros"));
        
	}
	
	private class ButtonAdicionar extends AbstractAction {
        private static final long serialVersionUID = 1L;
	    
        public ButtonAdicionar(String textoButton) {
            super(textoButton);
        }
        
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonAdd) {
                // EXECUTA ACAO...
               JOptionPane.showMessageDialog(panel,
                        "Estou adicionando",
                        "Adicionando",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
	}
	
	private class ButtonRemover extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonRemover(String textoButton) {
            super(textoButton);
        }

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonRemove) {
                JOptionPane.showMessageDialog(panel,
                        "Estou removendo",
                        "Removendo",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            // Executa Acao...
        }
    }
	
	private class ButtonCreditar extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonCreditar(String textoButton) {
            super(textoButton);
        }

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonCredit) {
                JOptionPane.showMessageDialog(panel,
                    "Estou creditando",
                    "Creditando",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
	
	private class ButtonDebitar extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonDebitar(String textoButton) {
            super(textoButton);
        }
        
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonDebit) {
                JOptionPane.showMessageDialog(panel,
                        "Estou Debitando",
                        "Debitando",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
	
	private class ButtonRenderJuros extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonRenderJuros(String textoButton) {
            super(textoButton);
        }
        
        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonRendJuros) {
                JOptionPane.showMessageDialog(panel,
                    "Estou Rendendo Juros",
                    "Rendendo Juros",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
	
	private class ButtonDebitJuros extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonDebitJuros(String textoButton) {
            super(textoButton);
        }

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonDebitJuros) {
                JOptionPane.showMessageDialog(panel,
                        "Estou Debitando Juros",
                        "Debitando Juros",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
	
	private class ButtonProcurar extends AbstractAction {
        private static final long serialVersionUID = 1L;
        
        public ButtonProcurar(String textoButton) {
            super(textoButton);
        }

        public void actionPerformed(ActionEvent event) {
            if(event.getSource() == buttonSearch) {
                JOptionPane.showMessageDialog(panel,
                        "Estou Pesquisando",
                        "Pesquisando",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
	
	public static void main(String[] args) {
		
		new TrabalhoDeJava();

	}

}