package aplication;

import entities.Rend;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner leia = new Scanner(System.in);
        // 1 -o program é iniciado com a pergunta
        // depois com a resposta passamos a pegar os dados
        //nome,email,quarto finalizando com os dados indo para dentro do objeto
        //1
        System.out.print("How many rooms will be rented? ");
        Rend[] vect = new Rend[10];
        int num = leia.nextInt();
        //2
        for(int i =0;i<= num;i++){
            System.out.println();
            System.out.print("nome: ");
            String name = leia.nextLine();
            System.out.println();
            System.out.print("email: ");
            String email = leia.nextLine();
            System.out.println();
            System.out.print("Quarto: ");
            int room = leia.nextInt();
            //3
            vect[room] = new Rend(name,email);
        }
        System.out.println();
        System.out.println("Busy rooms: ");
        for(int i =0;i<10;i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }
        leia.close();

    }
}
