import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela3 extends javax.swing.JFrame implements ActionListener {

    //Olá cliente, obrigado por baixar o Clicker Mester!
    //INFORMAÇÂO INPORTANTE A BAIXO:
    // por favor nao modifique o sistema já escrito, isso pode gerar um erro fatal em todo o sistema do jogo.

    private JLabel infoItem0 = new JLabel();
    private JLabel infoItem1 = new JLabel();
    private JLabel infoItem2 = new JLabel();
    private JLabel infoItem3 = new JLabel();
    private JLabel infoItem4 = new JLabel();
    private JLabel infoItem5 = new JLabel();
    private JLabel infoItem6 = new JLabel();
    private JLabel infoItem7 = new JLabel();
    private JLabel infoItem8 = new JLabel();

    private JButton botaoItem0 = new JButton();
    private JButton botaoItem1 = new JButton();
    private JButton botaoItem2 = new JButton();
    private JButton botaoItem3 = new JButton();
    private JButton botaoItem4 = new JButton();
    private JButton botaoItem5 = new JButton();
    private JButton botaoItem6 = new JButton();
    private JButton botaoItem7 = new JButton();
    private JButton botaoItem8 = new JButton();

    private JButton botaoItemComprado0 = new JButton();
    private JButton botaoItemComprado1 = new JButton();
    private JButton botaoItemComprado2 = new JButton();
    private JButton botaoItemComprado3 = new JButton();
    private JButton botaoItemComprado4 = new JButton();
    private JButton botaoItemComprado5 = new JButton();
    private JButton botaoItemComprado6 = new JButton();
    private JButton botaoItemComprado7 = new JButton();
    private JButton botaoItemComprado8 = new JButton();

    private JButton botaoReverter = new JButton();

    private  int verificarEstado0 = 0, verificarEstado1 = 0, verificarEstado2 = 0, verificarEstado3 = 0, verificarEstado4 = 0, verificarEstado5 = 0, verificarEstado6 = 0, verificarEstado7 = 0, verificarEstado8 = 0;


    private Tela1 tela;

    public Tela3(Tela1 tela) {

        this.tela = tela;

        getContentPane().add(infoItem0);
        getContentPane().add(infoItem1);
        getContentPane().add(infoItem2);
        getContentPane().add(infoItem3);
        getContentPane().add(infoItem4);
        getContentPane().add(infoItem5);
        getContentPane().add(infoItem6);
        getContentPane().add(infoItem7);
        getContentPane().add(infoItem8);

        getContentPane().add(botaoItem0);
        getContentPane().add(botaoItem1);
        getContentPane().add(botaoItem2);
        getContentPane().add(botaoItem3);
        getContentPane().add(botaoItem4);
        getContentPane().add(botaoItem5);
        getContentPane().add(botaoItem6);
        getContentPane().add(botaoItem7);
        getContentPane().add(botaoItem8);

        getContentPane().add(botaoItemComprado0);
        getContentPane().add(botaoItemComprado1);
        getContentPane().add(botaoItemComprado2);
        getContentPane().add(botaoItemComprado3);
        getContentPane().add(botaoItemComprado4);
        getContentPane().add(botaoItemComprado5);
        getContentPane().add(botaoItemComprado6);
        getContentPane().add(botaoItemComprado7);
        getContentPane().add(botaoItemComprado8);

        getContentPane().add(botaoReverter);

        setLayout(null);
        setTitle("Clicker Mester - Loja");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(Tela1.class.getResource("/imagens/logo.png")));
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoItem0.setBounds(125, 0, 300, 30);
        infoItem1.setBounds(125, 45, 300, 30);
        infoItem2.setBounds(125, 85, 300, 30);
        infoItem3.setBounds(125, 125, 300, 30);
        infoItem4.setBounds(125, 165, 300, 30);
        infoItem5.setBounds(125, 205, 300, 30);
        infoItem6.setBounds(125, 245, 300, 30);
        infoItem7.setBounds(125, 285, 300, 30);
        infoItem8.setBounds(125, 325, 300, 30);

        botaoItem0.setBounds(5,5,100,30);
        botaoItem1.setBounds(5,45,100,30);
        botaoItem2.setBounds(5,85,100,30);
        botaoItem3.setBounds(5,125,100,30);
        botaoItem4.setBounds(5,165,100,30);
        botaoItem5.setBounds(5,205,100,30);
        botaoItem6.setBounds(5,245,100,30);
        botaoItem7.setBounds(5,285,100,30);
        botaoItem8.setBounds(5,325,100,30);

        botaoItemComprado0.setBounds(5,5,100,30);
        botaoItemComprado1.setBounds(5,45,100,30);
        botaoItemComprado2.setBounds(5,85,100,30);
        botaoItemComprado3.setBounds(5,125,100,30);
        botaoItemComprado4.setBounds(5,165,100,30);
        botaoItemComprado5.setBounds(5,205,100,30);
        botaoItemComprado6.setBounds(5,245,100,30);
        botaoItemComprado7.setBounds(5,285,100,30);
        botaoItemComprado8.setBounds(5,325,100,30);

        botaoReverter.setBounds(145,500,100,30);

        infoItem0.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem2.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem3.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem4.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem5.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem6.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem7.setFont(new Font("Tahoma", Font.PLAIN, 13));
        infoItem8.setFont(new Font("Tahoma", Font.PLAIN, 13));

        infoItem0.setText("Cor Do Botao [ Azul ] - 150 pontos");
        infoItem1.setText("Cor Do Botao [ Vermelho ] - 250 pontos");
        infoItem2.setText("Cor Do Botao [ Amarelo ] - 350 pontos");
        infoItem3.setText("Cor Do Botao [ Laranja ] - 450 pontos");
        infoItem4.setText("Cor Do Botao [ Ciano ] - 550 pontos");
        infoItem5.setText("Cor Do Botao [ Rosa ] - 650 pontos");
        infoItem6.setText("Cor Do Botao [ Roxo ] - 750 pontos");
        infoItem7.setText("Cor Do Botao [ Preto ] - 850 pontos");
        infoItem8.setText("Cor Do Botao [ Cinza ] - 950 pontos");

        botaoItem0.setText("Comprar!");
        botaoItem1.setText("Comprar!");
        botaoItem2.setText("Comprar!");
        botaoItem3.setText("Comprar!");
        botaoItem4.setText("Comprar!");
        botaoItem5.setText("Comprar!");
        botaoItem6.setText("Comprar!");
        botaoItem7.setText("Comprar!");
        botaoItem8.setText("Comprar!");

        botaoItemComprado0.setText("Comprado!");
        botaoItemComprado1.setText("Comprado!");
        botaoItemComprado2.setText("Comprado!");
        botaoItemComprado3.setText("Comprado!");
        botaoItemComprado4.setText("Comprado!");
        botaoItemComprado5.setText("Comprado!");
        botaoItemComprado6.setText("Comprado!");
        botaoItemComprado7.setText("Comprado!");
        botaoItemComprado8.setText("Comprado!");

        botaoReverter.setText("Reverter!");

        botaoItem0.addActionListener(this);
        botaoItem1.addActionListener(this);
        botaoItem2.addActionListener(this);
        botaoItem3.addActionListener(this);
        botaoItem4.addActionListener(this);
        botaoItem5.addActionListener(this);
        botaoItem6.addActionListener(this);
        botaoItem7.addActionListener(this);
        botaoItem8.addActionListener(this);

        botaoItemComprado0.addActionListener(this);
        botaoItemComprado1.addActionListener(this);
        botaoItemComprado2.addActionListener(this);
        botaoItemComprado3.addActionListener(this);
        botaoItemComprado4.addActionListener(this);
        botaoItemComprado5.addActionListener(this);
        botaoItemComprado6.addActionListener(this);
        botaoItemComprado7.addActionListener(this);
        botaoItemComprado8.addActionListener(this);

        botaoReverter.addActionListener(this);

        infoItem0.setVisible(true);
        infoItem1.setVisible(true);
        infoItem2.setVisible(true);
        infoItem3.setVisible(true);
        infoItem4.setVisible(true);
        infoItem5.setVisible(true);
        infoItem6.setVisible(true);
        infoItem7.setVisible(true);
        infoItem8.setVisible(true);

        botaoItem0.setVisible(true);
        botaoItem1.setVisible(true);
        botaoItem2.setVisible(true);
        botaoItem3.setVisible(true);
        botaoItem4.setVisible(true);
        botaoItem5.setVisible(true);
        botaoItem6.setVisible(true);
        botaoItem7.setVisible(true);
        botaoItem8.setVisible(true);

        botaoItemComprado0.setVisible(false);
        botaoItemComprado1.setVisible(false);
        botaoItemComprado2.setVisible(false);
        botaoItemComprado3.setVisible(false);
        botaoItemComprado4.setVisible(false);
        botaoItemComprado5.setVisible(false);
        botaoItemComprado6.setVisible(false);
        botaoItemComprado7.setVisible(false);
        botaoItemComprado8.setVisible(false);

        botaoReverter.setVisible(true);
    }

    public void compraVerificada(int verificar, int id){

        if(verificar == 1){
            botaoItem0.setVisible(false);
            botaoItemComprado0.setVisible(true);
            infoItem0.setText("Cor Do Botao [ Azul ]");
            verificarEstado0 = 1;
        }

        if(verificar == 2){
            botaoItem1.setVisible(false);
            botaoItemComprado1.setVisible(true);
            infoItem1.setText("Cor Do Botao [ Vermelho ]");
            verificarEstado1 = 1;
        }

        if(verificar == 3){
            botaoItem2.setVisible(false);
            botaoItemComprado2.setVisible(true);
            infoItem2.setText("Cor Do Botao [ Amarelo ]");
            verificarEstado2 = 1;
        }

        if(verificar == 4){
            botaoItem3.setVisible(false);
            botaoItemComprado3.setVisible(true);
            infoItem3.setText("Cor Do Botao [ Laranja ]");
        }

        if(verificar == 5){
            botaoItem4.setVisible(false);
            botaoItemComprado4.setVisible(true);
            infoItem4.setText("Cor Do Botao [ Ciano ]");
        }

        if(verificar == 6){
            botaoItem5.setVisible(false);
            botaoItemComprado5.setVisible(true);
            infoItem5.setText("Cor Do Botao [ Rosa ]");
        }

        if(verificar == 7){
            botaoItem6.setVisible(false);
            botaoItemComprado6.setVisible(true);
            infoItem6.setText("Cor Do Botao [ Roxo ]");
        }

        if(verificar == 8){
            botaoItem7.setVisible(false);
            botaoItemComprado7.setVisible(true);
            infoItem7.setText("Cor Do Botao [ Preto ]");
        }

        if(verificar == 9){
            botaoItem8.setVisible(false);
            botaoItemComprado8.setVisible(true);
            infoItem8.setText("Cor Do Botao [ Cinza ]");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botaoItem0){
            tela.calularPonto(150, 1);
        }

        if(e.getSource() == botaoItem1){
            tela.calularPonto(250, 2);
        }

        if(e.getSource() == botaoItem2){
            tela.calularPonto(350, 3);
        }

        if(e.getSource() == botaoItem3){
            tela.calularPonto(450, 4);
        }

        if(e.getSource() == botaoItem4){
            tela.calularPonto(550, 5);
        }

        if(e.getSource() == botaoItem5){
            tela.calularPonto(650, 6);
        }

        if(e.getSource() == botaoItem6){
            tela.calularPonto(750, 7);
        }

        if(e.getSource() == botaoItem7){
            tela.calularPonto(850, 8);
        }

        if(e.getSource() == botaoItem8){
            tela.calularPonto(950, 9);
        }

        //------------------------------------------

        if(e.getSource() == botaoItemComprado0){
            tela.trocarCorBotao(1);
        }

        if(e.getSource() == botaoItemComprado1){
            tela.trocarCorBotao(2);
        }

        if(e.getSource() == botaoItemComprado2){
            tela.trocarCorBotao(3);
        }

        if(e.getSource() == botaoItemComprado3){
            tela.trocarCorBotao(4);
        }

        if(e.getSource() == botaoItemComprado4){
            tela.trocarCorBotao(5);
        }

        if(e.getSource() == botaoItemComprado5){
            tela.trocarCorBotao(6);
        }

        if(e.getSource() == botaoItemComprado6){
            tela.trocarCorBotao(7);
        }

        if(e.getSource() == botaoItemComprado7){
            tela.trocarCorBotao(8);
        }

        if(e.getSource() == botaoItemComprado8){
            tela.trocarCorBotao(9);
        }

        //----------------------------------------

        //---------------------------------------------
        if(e.getSource() == botaoReverter){
            tela.trocarCorBotao(999);
        }
    }

}
