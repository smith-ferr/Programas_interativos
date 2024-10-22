import java.util.Scanner;
public class pontuacao {
    public int [] numeros = {10, 20, 30};

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Seja bem vindo, pressiona S para continuar");
        String string = scanner.nextLine();
        if(string.equals("s")) {
            System.out.println("Qual a capital do Brasil?");
            string  = scanner.nextLine();
            if(string.equals("Brasilia")) {
                pontos++;
                System.out.println("Voce pontuou!");
            }else {
                System.out.println("Gameover, sua pontuação foi de: "+ pontos);
            }
        }else {
            System.out.println("Aacabou o jogo... Voce pontuou 0");

        }
    }

}
