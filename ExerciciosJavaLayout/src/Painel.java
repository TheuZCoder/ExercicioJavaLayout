import java.awt.CardLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JFrame {
    private JPanel panel;
    private CardLayout cardLayout;

    public Painel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home");
        
        panel = new JPanel();
        cardLayout = new CardLayout();
        panel.setLayout(cardLayout);

        createCard("Home");
        createCard("Login");
        createCard("Cadastro");

        cardLayout.show(panel, "Home");

        getContentPane().add(panel);
        setSize(300, 300);
    }

    private void createCard(String cardName) {
        JPanel card = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(3, 3, 3, 3);

        if (cardName.equals("Home")) {
            JLabel cabecalho = new JLabel("Bem Vindo ao meu APP!");
            JButton button1 = new JButton("Login");
            JButton button2 = new JButton("Cadastro");

            constraints.gridy = 0;
            card.add(cabecalho, constraints);
            constraints.gridy = 1;
            card.add(button1, constraints);
            constraints.gridy = 2;
            card.add(button2, constraints);

            button1.addActionListener(e -> cardLayout.show(panel, "Login"));
            button2.addActionListener(e -> cardLayout.show(panel, "Cadastro"));
        } else if (cardName.equals("Login")) {
            JLabel log = new JLabel("Faça o Login Abaixo!");
            JTextField logg = new JTextField("Usuario");
            JTextField senha = new JTextField("Senha");
            JButton buttonhome = new JButton("Home");
            JButton buttoncad = new JButton("Cadastro");

            constraints.gridy = 0;
            card.add(log, constraints);
            constraints.gridy = 1;
            card.add(logg, constraints);
            constraints.gridy = 2;
            card.add(senha, constraints);
            constraints.gridy = 3;
            card.add(buttonhome, constraints);
            constraints.gridy = 4;
            card.add(buttoncad, constraints);

            buttonhome.addActionListener(e -> cardLayout.show(panel, "Home"));
            buttoncad.addActionListener(e -> cardLayout.show(panel, "Cadastro"));
        } else if (cardName.equals("Cadastro")) {
            JLabel log = new JLabel("Faça o Cadastro Abaixo!");
            JTextField logg = new JTextField("Digite um Usuario");
            JTextField senha = new JTextField("Digite uma Senha");
            JTextField cpf = new JTextField("Digite seu CPF");
            JTextField email = new JTextField("Digite seu Email");
            JButton buttonhome = new JButton("Home");
            JButton buttonclo = new JButton("Login");

            constraints.gridy = 0;
            card.add(log, constraints);
            constraints.gridy = 1;
            card.add(logg, constraints);
            constraints.gridy = 2;
            card.add(senha, constraints);
            constraints.gridy = 3;
            card.add(cpf, constraints);
            constraints.gridy = 4;
            card.add(email, constraints);
            constraints.gridy = 5;
            card.add(buttonhome, constraints);
            constraints.gridy = 6;
            card.add(buttonclo, constraints);

            buttonhome.addActionListener(e -> cardLayout.show(panel, "Home"));
            buttonclo.addActionListener(e -> cardLayout.show(panel, "Login"));

        }

        panel.add(card, cardName);
    }
}
