import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite um texto: ");
        String x;

        x = sc.next();
        System.out.printf("Você digitou o texto: %s%n", x);


        //Observe que o println eh independente da localizacao (Locale), diferente do printf, que eh sensivel a ela
        //para int e double, o processo eh o mesmo, mas com nextInt() e nextDouble()
        //para char, nao tem nextChar(), entao se usa: sc.next().charAt(0), ou outro elemento

        //Tambem eh possivel ler varios tipos de dados de uma vez:
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //Quando quer que o scanner leia até a quebra de linha, usar sc.nextLine()
        //CUIDAR QUE O NEXT LINE CONSOME QUEBRAS DE LINHA ANTERIORES. Caso misture
        //nextInt ou outro com nextLine na sequencia, dar um sc.nextLine() sozinho pra consumir a quebra de linha e dar
        //certo


        sc.close();
    }
}

