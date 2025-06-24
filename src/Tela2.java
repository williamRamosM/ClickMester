import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela2 extends javax.swing.JFrame implements ActionListener { // Tela conquista

    //Olá cliente, obrigado por baixar o Clicker Mester!
    //INFORMAÇÂO INPORTANTE A BAIXO:
    // por favor nao modifique o sistema já escrito, isso pode gerar um erro fatal em todo o sistema do jogo.

    private JButton botao2 = new JButton();
    private JButton botao = new JButton();
    private JLabel infoBotao = new JLabel();
    private JLabel pontTotal = new JLabel();
    private JLabel conq0 = new JLabel();
    private JLabel conq1 = new JLabel();
    private JLabel conq2 = new JLabel();
    private JLabel conq3 = new JLabel();
    private JLabel conq4 = new JLabel();
    private JLabel conq5 = new JLabel();
    private JLabel conq6 = new JLabel();
    private JLabel conq7 = new JLabel();
    private JLabel conq8 = new JLabel();

    private int verificar = 0;
    private Tela1 tela;

    public Tela2(Tela1 tela){

        this.tela = tela;

        getContentPane().add(botao2);
        getContentPane().add(botao);
        getContentPane().add(infoBotao);
        getContentPane().add(pontTotal);
        getContentPane().add(conq0);
        getContentPane().add(conq1);
        getContentPane().add(conq2);
        getContentPane().add(conq3);
        getContentPane().add(conq4);
        getContentPane().add(conq5);
        getContentPane().add(conq6);
        getContentPane().add(conq7);
        getContentPane().add(conq8);

        setLayout(null);
        setTitle("Clicker Mester - Conquistas");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(Tela1.class.getResource("/imagens/logo.png")));
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao2.setBounds(125, 450, 145, 50);
        botao.setBounds(125, 450, 145, 50);
        infoBotao.setBounds(134, 500, 200, 30);
        pontTotal.setBounds(145,530,300,30);
        conq1.setBounds(1, 0, 300, 30);
        conq2.setBounds(1, 20, 300, 30);
        conq3.setBounds(1, 40, 300, 30);
        conq4.setBounds(1, 60, 300, 30);
        conq5.setBounds(1, 80, 300, 30);
        conq6.setBounds(1, 100, 300, 30);
        conq7.setBounds(1, 120, 300, 30);
        conq8.setBounds(1, 140, 300, 30);
        conq0.setBounds(15, 160, 300, 30);

        infoBotao.setFont(new Font("Tahoma", Font.PLAIN, 12));
        pontTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq0.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq7.setFont(new Font("Tahoma", Font.PLAIN, 15));
        conq8.setFont(new Font("Tahoma", Font.PLAIN, 15));

        botao.addActionListener(this);
        botao2.addActionListener(this);

        botao2.setText("Desbloquear - Admin!!");
        botao.setText("Desbloquear - ???");
        infoBotao.setText("[Custa - 500000 pontos]");
        pontTotal.setText("Ponto Total: 0");
        conq0.setText("--> ???.. <--        [Nao conquistado]");
        conq1.setText("Atingi 100 pontos!   [Nao conquistado]");
        conq2.setText("Atingi 500 pontos!   [Nao conquistado]");
        conq3.setText("Atingi 1000 pontos!  [Nao conquistado]");
        conq4.setText("Atingi 1500 pontos!  [Nao conquistado]");
        conq5.setText("Atingi 2000 pontos!  [Nao conquistado]");
        conq6.setText("Atingi 2500 pontos!  [Nao conquistado]");
        conq7.setText("Atingi 3000 pontos!  [Nao conquistado]");
        conq8.setText("Atingi 10000 pontos! [Nao conquistado]");

        botao2.setVisible(false);
        botao.setVisible(false);
        infoBotao.setVisible(false);
        pontTotal.setVisible(true);
        conq0.setVisible(true);
        conq1.setVisible(true);
        conq2.setVisible(true);
        conq3.setVisible(true);
        conq4.setVisible(true);
        conq5.setVisible(true);
        conq6.setVisible(true);
        conq7.setVisible(true);
        conq8.setVisible(true);

    }

    public void atualizaConquistas(int ponto, int ponto2, int verificar, int novoValor){

        if(ponto >= 100){
            conq1.setText("Atingi 100 pontos!  [conquistado]");
        }

        if(ponto >= 500){
            conq2.setText("Atingi 500 pontos!  [conquistado]");
        }

        if(ponto >= 1000){
            conq3.setText("Atingi 1000 pontos!  [conquistado]");
        }

        if(ponto >= 1500){
            conq4.setText("Atingi 1500 pontos!  [conquistado]");
        }

        if(ponto >= 2000){
            conq5.setText("Atingi 2000 pontos!  [conquistado]");
        }

        if(ponto >= 2500){
            conq6.setText("Atingi 2500 pontos!  [conquistado]");
        }

        if(ponto >= 3000){
            conq7.setText("Atingi 3000 pontos!  [conquistado]");
        }

        if(ponto >= 10000){
            conq8.setText("Atingi 10000 pontos!  [conquistado]");

        }

        if(ponto >= 500000){
            botao.setVisible(true);
            infoBotao.setVisible(true);
        }

        if(ponto == 100){
            tela.mostrarConquista(1);
        }

        if(ponto >= 500 && ponto <= 500 + verificar){
            tela.mostrarConquista(2);
        }

        if(ponto >= 1000 && ponto <= 1000 + verificar){
            tela.mostrarConquista(3);
        }

        if(ponto >= 1500 && ponto <= 1500 + verificar){
            tela.mostrarConquista(4);
        }

        if(ponto >= 2000 && ponto <= 2000 + verificar){
            tela.mostrarConquista(5);
        }

        if(ponto >= 2500 && ponto <= 2500 + verificar){
            tela.mostrarConquista(6);
        }

        if(ponto >= 3000 && ponto <= 3000 + verificar){
            tela.mostrarConquista(7);
        }
        if(ponto >= 10000 && ponto <= 10000 + verificar){
            tela.mostrarConquista(8);
        }

        if(novoValor == 1){
            botao.setVisible(false);
            botao2.setVisible(true);
            infoBotao.setText("[Custa - 100 pontos]");
            conq0.setText("Admin!!  [Nao conquistado]");

        }

        if(novoValor == 2){
            botao2.setVisible(false);
            infoBotao.setVisible(false);
            conq0.setText("Admin!!  [conquistado]");
            botao.setVisible(false);

        }

        if(ponto2 >= 0){
            pontTotal.setText("Pontos Totais: "+ponto2);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botao){
            tela.calularPonto(500000,0);
        }

        if (e.getSource() == botao2){
            tela.calularPonto(100, 0);
        }


    }
}
