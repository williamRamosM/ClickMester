import javax.swing.*;
import javax.swing.plaf.synth.ColorType;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela1 extends javax.swing.JFrame implements ActionListener { //Tela principal

    //Olá cliente, obrigado por baixar o Clicker Mester!
    //INFORMAÇÂO INPORTANTE A BAIXO:
    // por favor nao modifique o sistema já escrito, isso pode gerar um erro fatal em todo o sistema do jogo.

    private JButton botao = new JButton("Click Me");
    private JButton botaoAtualizar = new JButton("Atualizar: 1x");
    private JButton botaoConquista = new JButton("Conquistas");
    private JButton loja = new JButton("Loja");
    private JButton conf = new JButton("Configuracoes");
    private JLabel pontuacao = new JLabel("Pontuação: 0");
    private JLabel novaConquista = new JLabel("Nova Conquista!");
    private JLabel vercao = new JLabel("Versão: 1.7.2025");

    Tela2 tela = new Tela2(this);
    Tela3 tela3 = new Tela3(this);
    Tela4 tela4 = new Tela4(this);

    private int ponto = 0, num = 1, aumentoValor = 1, click = 0, click2 = 0, click3 = 0, pontosDeConq = 0, pontosDeConq2 = 0, verificar = 0, verificar2 = 0, verificar3 = 0, verificar4 = 0;

    public Tela1() {

        tela.setVisible(false);
        tela3.setVisible(false);
        tela4.setVisible(false);

        getContentPane().add(conf);
        getContentPane().add(loja);
        getContentPane().add(botao);
        getContentPane().add(botaoAtualizar);
        getContentPane().add(botaoConquista);
        getContentPane().add(pontuacao);
        getContentPane().add(vercao);
        getContentPane().add(novaConquista);

        setLayout(null);
        setTitle("Clicker Mester - Beta");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(Tela1.class.getResource("/imagens/logo.png")));
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        novaConquista.setBounds(650, 0, 150, 30);
        vercao.setBounds(1, 0, 100, 30);
        pontuacao.setBounds(315, 0, 300, 100);
        botao.setBounds(255, 200, 300, 100);
        botaoAtualizar.setBounds(105, 500, 150, 50);
        botaoConquista.setBounds(670, 500, 100, 50);
        loja.setBounds(670, 430, 100, 50);
        conf.setBounds(670, 370, 100, 50);

        pontuacao.setFont(new Font("Tahoma", Font.PLAIN, 26));
        novaConquista.setFont(new Font("Tahoma", Font.PLAIN, 15));

        novaConquista.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        botao.addActionListener(this);
        botaoAtualizar.addActionListener(this);
        botaoConquista.addActionListener(this);
        loja.addActionListener(this);
        conf.addActionListener(this);

        conf.setVisible(false);
        loja.setVisible(true);
        botao.setVisible(true);
        botaoAtualizar.setVisible(true);
        botaoConquista.setVisible(true);
        pontuacao.setVisible(true);
        vercao.setVisible(true);
        novaConquista.setVisible(false);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == botao){
            System.out.println("Clicked!");
            ponto+= num;
            pontosDeConq += num;
            pontosDeConq2 += num;
            System.out.println("Pontos de conquista 1: " + pontosDeConq);
            System.out.println("Pontos de conquista 2: " + pontosDeConq2);
        }

        if(e.getSource() == botaoAtualizar){

            int x = 100 * aumentoValor;

            if(ponto >= x){
                num++;
                botaoAtualizar.setText("Atualizar: " + (num) +"x");
                aumentoValor++;
                verificar += 5;
                ponto -= x;
            }
        }

        if(e.getSource() == botaoConquista){
            click++;
            if(click == 1){
                tela = new Tela2(this);
                tela3.setVisible(false);
            }
            else
            {
                click = 0;
                tela.setVisible(false);
            }
        }

        if(e.getSource() == loja){

            click2++;
            if(click2 == 1){
                tela3 = new Tela3(this);
                tela.setVisible(false);
            }
            else
            {
                click2 = 0;
                tela3.setVisible(false);
            }
        }

        if(e.getSource() == conf){

            click3++;
            if(click3 == 1){
                tela4 = new Tela4(this);
                tela.setVisible(false);
            }
            else
            {
                click3 = 0;
                tela4.setVisible(false);
            }
        }

        pontuacao.setText("Pontuação: " + ponto);
        tela.atualizaConquistas(pontosDeConq, pontosDeConq2, verificar, verificar2);
        tela3.compraVerificada(verificar3, verificar4);

    }

    public void mostrarConquista(int very){

            Timer timer = new Timer(500, null);
            timer.addActionListener(new ActionListener() {
                private boolean visivel = true;
                private int contador = 0;

                @Override
                public void actionPerformed(ActionEvent e) {
                    novaConquista.setVisible(visivel);
                    visivel = !visivel; // alterna entre true e false
                    contador++;

                    if (contador >= 6) { // após 6 piscadas (3x on/off)
                        novaConquista.setVisible(false);
                        ((Timer) e.getSource()).stop(); // para o timer
                    }
                }
            });
            timer.start();

    }

    public void calularPonto(int valor, int id){

        if(ponto >= valor){

            verificar3 = 0;

            if(valor == 500000){
                ponto -= valor;
                verificar2 ++;
            }
            else if(valor == 100){
                ponto -= valor;
                verificar2 ++;
                pontosDeConq2 *= 0;
            }
            else if(id == 1){ // Compras (0,1,2,3,...)
                ponto -= valor;
                verificar3 = 1;
                verificar4 += 1;
            }
            else if(id == 2) {
                ponto -= valor;
                verificar3 = 2;
                verificar4 += 1;
            }
            else if(id == 3){
                ponto -= valor;
                verificar3 = 3;
            }
            else if(id == 4){
                ponto -= valor;
                verificar3 = 4;
            }
            else if(id == 5){
                ponto -= valor;
                verificar3 = 5;
            }
            else if(id == 6){
                ponto -= valor;
                verificar3 = 6;
            }
            else if(id == 7){
                ponto -= valor;
                verificar3 = 7;
            }
            else if(id == 8){
                ponto -= valor;
                verificar3 = 8;
            }
            else if(id == 9){
                ponto -= valor;
                verificar3 = 9;
            }
            else{
                System.out.println("System: Nao possui pontos necessarios!! [verificacao 2]");
            }

        }
        else{
            System.out.println("System: Nao possui pontos necessarios!! [verificacao 1]");
        }
    }

    public void trocarCorBotao(int id){

        if(id == 999)
        {
            botao.setBackground(UIManager.getColor("Panel.background"));
        }

        if(id == 1){
            botao.setBackground(Color.blue);
        }
        else if(id == 2){
            botao.setBackground(Color.red);
        }
        else if(id == 3){
            botao.setBackground(Color.yellow);
        }
        else if(id == 4){
            botao.setBackground(Color.orange);
        }
        else if(id == 5){
            botao.setBackground(Color.cyan);
        }
        else if(id == 6){
            botao.setBackground(Color.pink);
        }
        else if(id == 7){
            botao.setBackground(new Color(99,33,99));
        }
        else if(id == 8){
            botao.setBackground(Color.black);
        }
        else if(id == 9){
            botao.setBackground(Color.gray);
        }

    }
}
