import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela4 extends JFrame implements ActionListener { //configuraçao
    //Olá cliente, obrigado por baixar o Clicker Mester!
    //INFORMAÇÂO INPORTANTE A BAIXO:
    // por favor nao modifique o sistema já escrito, isso pode gerar um erro fatal em todo o sistema do jogo.

        private JButton botao = new JButton();
        private JButton botao2 = new JButton();
        private JLabel infor = new JLabel();

        private Tela1 tela;

       public Tela4(Tela1 tela) {
            this.tela = tela;

            getContentPane().add(botao);
            getContentPane().add(botao2);
            getContentPane().add(infor);

            setLayout(null);
            setTitle("Clicker Mester - Configuracao");
            //setIconImage(Toolkit.getDefaultToolkit().getImage(Tela1.class.getResource("/imagens/logo.png")));
            setSize(400, 600);
            setResizable(false);
            setLocationRelativeTo(null);
            setVisible(true);
            //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            botao.setBounds(125, 450, 145, 50);
            botao2.setBounds(125, 450, 145, 50);

            infor.setFont(new Font("Tahoma", Font.PLAIN, 15));

            botao.addActionListener(this);
            botao2.addActionListener(this);

            botao.setText("Modo Branco");
            botao2.setText("Modo Cinza");

            infor.setFont(new Font("Tahoma", Font.PLAIN, 13));

            botao.setVisible(true);
            botao2.setVisible(true);
            infor.setVisible(true);

        }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
