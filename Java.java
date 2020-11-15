import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String a,c,b;
    a = input.next();
    b = input.next();
    c = input.next();
    if((a.compareTo("vertebrado")) == 0){
    if((b.compareTo("ave")) == 0){
        if((c.compareTo("carnivoro")) == 0){
            System.out.printf("aguia\n");
        }
        else if((c.compareTo("onivoro")) == 0){
            System.out.printf("pomba\n");
        }
    }
    else if((b.compareTo("mamifero")) == 0){
        if((c.compareTo("onivoro")) == 0){
            System.out.printf("homem\n");
        }
        else if((c.compareTo("herbivoro")) == 0){
            System.out.printf("vaca\n");
        }
    }
    }
    else if((a.compareTo("invertebrado"))==0){
        if((b.compareTo("inseto"))==0){
            if((c.compareTo("hematofago"))==0){
                System.out.printf("pulga\n");
            }
            else if((c.compareTo("herbivoro"))==0){
                System.out.printf("lagarta\n");
            }
    }
    else if((b.compareTo("anelideo"))==0){
        if((c.compareTo("hematofago"))==0){
            System.out.printf("sanguessuga\n");
        }
        else if((c.compareTo("onivoro"))==0){
            System.out.printf("minhoca\n");
        }
    }
   } 
 }
}
