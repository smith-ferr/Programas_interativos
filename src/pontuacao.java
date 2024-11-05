import java.util.Scanner;
public class pontuacao {
    public int[] numeros = {10, 20, 30};

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int pontos = 0;
        System.out.println("Seja bem vindo, pressiona S para continuar");
        String string = scanner.nextLine();
        if (string.equals("s")) {
            System.out.println("Qual a capital do Brasil?");
            string = scanner.nextLine();
            if (string.equals("Brasilia")) {
                pontos++;
                System.out.println("Voce pontuou!");
                System.out.println("Voce deseja continuar? (s) ou desistir?  (d)");
                string = scanner.nextLine();
                if (string.equals("s")) {
                    //Proxima pergunta
                    System.out.println("Em qual continente fica o Brasil?");
                    string = scanner.nextLine();
                    if (string.equals("america do sul")) {
                        pontos++;
                        System.out.println("Voce pontuou!");
                        System.out.println("Voce deseja continuar? (s) ou desistir?  (d)");
                        string = scanner.nextLine();
                        if (string.equals("s")) {
                            System.out.println("Belo Horizonte é a capital de qual estado??");
                            string = scanner.nextLine();
                            if (string.equals("Minas Gerais")) {
                                System.out.println("Voce ganhou!");
                                System.out.println("Sua pontuação final foi de: " + pontos);
                            } else {
                                System.out.println("Gameover, sua pontuação foi de: " + pontos);
                            }
                        } else {
                            System.out.println("Gameover, sua pontuação foi de: " + pontos);
                        }
                    } else {
                        System.out.println("Gameover, sua pontuação foi de: " + pontos);
                    }
                } else {
                    System.out.println("Gameover, sua pontuação foi de: " + pontos);
                }
            } else {
                System.out.println("Gameover, sua pontuação foi de: " + pontos);
            }
        } else {
            System.out.println("Acabou o jogo... voce pontuou 0");
        }
    }
}

