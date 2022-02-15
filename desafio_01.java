//Vai ser mostrado na tela do usuário por meio da caixa de mensagem uma escada, onde os degraus são formados por "*".


import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class desafio_01 {

    public static void main(String[] args) {
        int n;
        String saida;

        JTextArea texto = new JTextArea(10,10);
        saida ="Escada java\n";

        for(n=0;n<6;n++){

            switch(n) {
                case 0: saida+="     *\n"; break;
                case 1: saida+="    **\n"; break;
                case 2: saida+="   ***\n"; break;
                case 3: saida+="  ****\n"; break;
                case 4: saida+=" *****\n"; break;
                case 5: saida+="******\n"; break;
            }
        }

        texto.setText(saida);
        JOptionPane.showMessageDialog(null,texto);     
    }
}  
