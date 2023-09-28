import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.CardLayout;

public class ex5CardLayout extends JFrame {
    public ex5CardLayout(){
        super("Exercicio 5 - Quiz");
        //criar um painel principal -> Cardlayout
        CardLayout cl = new CardLayout();
        JPanel mainCard = new JPanel(cl);// set do layout
        this.add(mainCard);
        //criar os card
        //card 1
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Jogo Quiz - Seja Bem Vindo"));
        JButton but1 = new JButton("Start"); //botão do primeiro card
        card1.add(but1);
        mainCard.add(card1, "Start");
        //card 2 -> primeira pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Qual meu nome?"));
        JTextField resposta1 = new JTextField("20");
        card2.add(resposta1);
        JButton but2 = new JButton("Avançar");
        card2.add(but2);

        this.setVisible(true);
        this.setSize(500, 500);


    }
    
}