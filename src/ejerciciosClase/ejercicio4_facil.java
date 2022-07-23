package ejerciciosClase;
import javax.swing.*;
public class ejercicio4_facil {
    public static void main(String[] args){
        /*    Diseñe un programa en JAVA que permita relacionar los datos de 5 facturas así:
        a. Tenga en cuenta que debe saber cuántos productos por factura deben ser relacionados
        b. Solicite el nombre del producto
        c. Solicite la cantidad del producto
        d. Solicite el precio del producto por unidad
        e. Calcule el valor total por cada factura
        f. Calcule el valor total de las 5 facturas.
        hacer con arreglo de 5 de valor total*/
        System.out.println("Hola mi pana se van a realizar 5 facturas y se mostraran el producto total y el valor total");
        int[][] arreglofacturas=new int[2][5];
        int conti;
        for(int x=0;x<5;x++){
            System.out.println("Factura "+(x+1));
            do {
                String nameproduct=JOptionPane.showInputDialog("Nombre del producto");
                int preciproduct=Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto"));
                int cantiproduct=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto"));
                arreglofacturas[0][x]=arreglofacturas[0][x]+(preciproduct*cantiproduct);
                arreglofacturas[1][x]=arreglofacturas[1][x]+cantiproduct;
                conti=JOptionPane.showConfirmDialog(null, "Quiere continuar con su factura?", "Confirmar continuacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            } while (conti==0);
        }
        int valor_total=0;
        for(int i=0;i<5;i++){
            System.out.println("La factura "+(i+1)+" tiene "+(arreglofacturas[1][i])+" productos con un valor total de "+(arreglofacturas[0][i]));
            valor_total=valor_total+arreglofacturas[0][i];
        }
        System.out.println("La valor total de todas las facturas es "+valor_total);

/*        int[] arre=new int[5];
        arre[0]=3;
        arre[1]=5;
        arre[2]=6;
        arre[3]=7;
        arre[4]=9;
        for(int x=0;x<5;x++){
            System.out.println(arre[x]);
        }*/

    }
}
