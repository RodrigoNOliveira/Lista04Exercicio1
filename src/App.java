import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*Faça um programa que receba um número inteiro, e verifique se ele está entre 100 e 200.
Se estiver dentro desta faixa, imprima “Você digitou um número entre 100 e 200”, senão
imprima “Você digitou um número fora da faixa”.*/
    System.out.println();
    String numero;
    int inteiro;  
    numero = JOptionPane.showInputDialog(null, "Digite um número inteiro" );
    inteiro = Integer.parseInt(numero);
    if (inteiro >=100 & inteiro <=200 ){
        System.out.println("Você digitou um número entre 100 e 200");
    }
    else {
        System.out.println("Você digitou um número fora da faixa");
    }
    System.out.println();
    }
}
