package superdomino;
import java.util.Scanner;
//perico los palotes
public class Superdomino {
    public static void main(String args[]) {
        Scanner introducir = new Scanner(System.in);
        int nfichas, extremoiz, extremodr, cantidad = 1,p,derecha=0,izquierda=0;
        int valor = 0, x = 0;
        boolean compr=false;
        String cadena,delimitador,basura;
        //inicio do-while (filtrar que no se introduzcan mas de 10000 fichas ni menos de 1)
        do {
            System.out.print(" Introduce el numero de fichas para jugar  ");
            nfichas = introducir.nextInt();
        } while (((nfichas < 1) || (nfichas > 10000)));
        //fin do-while
        int fichas[][] = new int[nfichas][2];
        //inicio while (cortar string cadena)
        basura=introducir.nextLine();
        System.out.println(" Si la ficha es correcta se avisara" );
        while (x < fichas.length) {
                    
            do{
                System.out.println(" Introduce los valores de la ficha Estructura=(numero  numero) " );
                cadena=introducir.nextLine();
                delimitador=("[ ]");
                String subcadena[] =cadena.split(delimitador);               
                p=subcadena.length;
                 if (p==2){
                fichas[x][0] = Integer.parseInt(subcadena[0]);
                fichas[x][1] = Integer.parseInt(subcadena[1]);
                 }
                    }while ((fichas [x][0]<=1) || (fichas [x][0]>=25000) || (fichas [x][1]<=1) || (fichas [x][1]>=25000)||(p!=2) );
                System.out.println (" LA FICHA ES CORRECTA"); 
            x++;
        }
        //fin while(cortar string cadena)
        extremoiz = fichas[0][0];
        extremodr = fichas[0][1];
        x = 1;
        while (x < fichas.length) {
            if (fichas[x][0] == extremodr) {
                cantidad++;
                extremodr = fichas[x][1];
            } else if (extremoiz == fichas[x][0]) {
                cantidad++;
                extremoiz = fichas[x][1];
            } else if (extremoiz == fichas[x][1]) {
                cantidad++;
                extremoiz = fichas[x][0];
            } else if (extremodr == fichas[x][1]) {
                cantidad++;
                extremodr = fichas[x][0];
            }
            x++;
        }
        System.out.println("Se han podido unir: " + cantidad+"  fichas");
    }
}
