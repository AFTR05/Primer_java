package ejercicio4;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
             /*    Diseñe un programa en JAVA que permita relacionar los datos de 5 facturas así:
        a. Tenga en cuenta que debe saber cuántos productos por factura deben ser relacionados
        b. Solicite el nombre del producto
        c. Solicite la cantidad del producto
        d. Solicite el precio del producto por unidad
        e. Calcule el valor total por cada factura
        f. Calcule el valor total de las 5 facturas.
        hacer con arreglo de 5 de valor total*/
        /*Primera factura***********************************************************************************************************************************************************/
        System.out.println("Factura 1");
        /*Primer producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto1_1=new Productos();
        producto1_1.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 1"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 1")));
        Detallesproduct detallesproduct1_1=new Detallesproduct();
        detallesproduct1_1.setDetallesProducto(producto1_1,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 1")));
        /*Segundo producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto1_2=new Productos();
        producto1_2.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 2"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 2")));
        Detallesproduct detallesproduct1_2=new Detallesproduct();
        detallesproduct1_2.setDetallesProducto(producto1_2,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 2")));
        /*Tercer producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto1_3=new Productos();
        producto1_3.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 3"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 3")));
        Detallesproduct detallesproduct1_3=new Detallesproduct();
        detallesproduct1_3.setDetallesProducto(producto1_3,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 3")));
        /*Cuarto producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto1_4=new Productos();
        producto1_4.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 4"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 4")));
        Detallesproduct detallesproduct1_4=new Detallesproduct();
        detallesproduct1_4.setDetallesProducto(producto1_4,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 4")));
        /*Quinto producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto1_5=new Productos();
        producto1_5.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 5"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 5")));
        Detallesproduct detallesproduct1_5=new Detallesproduct();
        detallesproduct1_5.setDetallesProducto(producto1_5,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 5")));
        /*Creacion factura--------------------------------------------------------------------------------------------------------------------------------------*/
        Factura factura1=new Factura();
        factura1.setProductoT(detallesproduct1_1,detallesproduct1_2,detallesproduct1_3,detallesproduct1_4,detallesproduct1_5);



/*Segunda factura     ****************************************************************************************************************************-----------------------------------------------*/

        System.out.println("Factura 2");

/*Primer producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto2_1=new Productos();
        producto2_1.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 1"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 1")));
        Detallesproduct detallesproduct2_1=new Detallesproduct();
        detallesproduct2_1.setDetallesProducto(producto2_1,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 1")));

/*Segundo producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto2_2=new Productos();
        producto2_2.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 2"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 2")));
        Detallesproduct detallesproduct2_2=new Detallesproduct();
        detallesproduct2_2.setDetallesProducto(producto2_2,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 2")));

/*Tercer producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto2_3=new Productos();
        producto2_3.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 3"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 3")));
        Detallesproduct detallesproduct2_3=new Detallesproduct();
        detallesproduct2_3.setDetallesProducto(producto2_3,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 3")));

/*Cuarto producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto2_4=new Productos();
        producto2_4.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 4"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 4")));
        Detallesproduct detallesproduct2_4=new Detallesproduct();
        detallesproduct2_4.setDetallesProducto(producto2_4,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 4")));

/*Quinto producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto2_5=new Productos();
        producto2_5.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 5"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 5")));
        Detallesproduct detallesproduct2_5=new Detallesproduct();
        detallesproduct2_5.setDetallesProducto(producto2_5,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 5")));

/*Creacion factura--------------------------------------------------------------------------------------------------------------------------------------*/

        Factura factura2=new Factura();
        factura2.setProductoT(detallesproduct2_1,detallesproduct2_2,detallesproduct2_3,detallesproduct2_4,detallesproduct2_5);


/*Tercera factura*************************************************************************************************************************************/

        System.out.println("Factura 3");

/*Primer producto--------------------------------------------------------------------------------------------------------------------------------------*/
        Productos producto3_1=new Productos();
        producto3_1.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 1"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 1")));
        Detallesproduct detallesproduct3_1=new Detallesproduct();
        detallesproduct3_1.setDetallesProducto(producto3_1,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 1")));

/*Segundo producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto3_2=new Productos();
        producto3_2.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 2"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 2")));
        Detallesproduct detallesproduct3_2=new Detallesproduct();
        detallesproduct3_2.setDetallesProducto(producto3_2,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 2")));

/*Tercer producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto3_3=new Productos();
        producto3_3.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 3"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 3")));
        Detallesproduct detallesproduct3_3=new Detallesproduct();
        detallesproduct3_3.setDetallesProducto(producto3_3,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 3")));

/*Cuarto producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto3_4=new Productos();
        producto3_4.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 4"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 4")));
        Detallesproduct detallesproduct3_4=new Detallesproduct();
        detallesproduct3_4.setDetallesProducto(producto3_4,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 4")));

/*Quinto producto--------------------------------------------------------------------------------------------------------------------------------------*/

        Productos producto3_5=new Productos();
        producto3_5.setProducto(JOptionPane.showInputDialog("Digite el nombre de su producto 5"),Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio de este producto 5")));
        Detallesproduct detallesproduct3_5=new Detallesproduct();
        detallesproduct3_5.setDetallesProducto(producto3_5,Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de este producto 5")));

/*Creacion factura--------------------------------------------------------------------------------------------------------------------------------------*/

        Factura factura3=new Factura();
        factura3.setProductoT(detallesproduct3_1,detallesproduct3_2,detallesproduct3_3,detallesproduct3_4,detallesproduct3_5);


/*        Impresion de imformacion ******************************************************************************************************************************/

        /*Impresion factura 1-----------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Factura 1----------------------------------------------------------------------------------------------------------------");
        System.out.println("Producto 1: "+producto1_1.getNombre()+" Precio: "+ producto1_1.getPrecio()+"  Cantidad: "+ detallesproduct1_1.getCantidad()+ " Valor: "+ (detallesproduct1_1.getCantidad()*producto1_1.getPrecio()));
        System.out.println("Producto 2: "+producto1_2.getNombre()+" Precio: "+ producto1_2.getPrecio()+"  Cantidad: "+ detallesproduct1_2.getCantidad()+ " Valor: "+ (detallesproduct1_2.getCantidad()*producto1_2.getPrecio()));
        System.out.println("Producto 3: "+producto1_3.getNombre()+" Precio: "+ producto1_3.getPrecio()+"  Cantidad: "+ detallesproduct1_3.getCantidad()+ " Valor: "+ (detallesproduct1_3.getCantidad()*producto1_3.getPrecio()));
        System.out.println("Producto 4: "+producto1_4.getNombre()+" Precio: "+ producto1_4.getPrecio()+"  Cantidad: "+ detallesproduct1_4.getCantidad()+ " Valor: "+ (detallesproduct1_4.getCantidad()*producto1_4.getPrecio()));
        System.out.println("Producto 5: "+producto1_5.getNombre()+" Precio: "+ producto1_5.getPrecio()+"  Cantidad: "+ detallesproduct1_5.getCantidad()+ " Valor: "+ (detallesproduct1_5.getCantidad()*producto1_5.getPrecio()));

        /*Impresion factura 2-----------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Factura 2----------------------------------------------------------------------------------------------------------------");
        System.out.println("Producto 1: "+producto2_1.getNombre()+" Precio: "+ producto2_1.getPrecio()+"  Cantidad: "+ detallesproduct2_1.getCantidad()+ " Valor: "+ (detallesproduct2_1.getCantidad()*producto2_1.getPrecio()));
        System.out.println("Producto 2: "+producto2_2.getNombre()+" Precio: "+ producto2_2.getPrecio()+"  Cantidad: "+ detallesproduct2_2.getCantidad()+ " Valor: "+ (detallesproduct2_2.getCantidad()*producto2_2.getPrecio()));
        System.out.println("Producto 3: "+producto2_3.getNombre()+" Precio: "+ producto2_3.getPrecio()+"  Cantidad: "+ detallesproduct2_3.getCantidad()+ " Valor: "+ (detallesproduct2_3.getCantidad()*producto2_3.getPrecio()));
        System.out.println("Producto 4: "+producto2_4.getNombre()+" Precio: "+ producto2_4.getPrecio()+"  Cantidad: "+ detallesproduct2_4.getCantidad()+ " Valor: "+ (detallesproduct2_4.getCantidad()*producto2_4.getPrecio()));
        System.out.println("Producto 5: "+producto2_5.getNombre()+" Precio: "+ producto2_5.getPrecio()+"  Cantidad: "+ detallesproduct2_5.getCantidad()+ " Valor: "+ (detallesproduct2_5.getCantidad()*producto2_5.getPrecio()));

        /*Impresion factura 3-----------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Factura 3----------------------------------------------------------------------------------------------------------------");
        System.out.println("Producto 1: "+producto3_1.getNombre()+" Precio: "+ producto3_1.getPrecio()+"  Cantidad: "+ detallesproduct3_1.getCantidad()+ " Valor: "+ (detallesproduct3_1.getCantidad()*producto3_1.getPrecio()));
        System.out.println("Producto 2: "+producto3_2.getNombre()+" Precio: "+ producto3_2.getPrecio()+"  Cantidad: "+ detallesproduct3_2.getCantidad()+ " Valor: "+ (detallesproduct3_2.getCantidad()*producto3_2.getPrecio()));
        System.out.println("Producto 3: "+producto3_3.getNombre()+" Precio: "+ producto3_3.getPrecio()+"  Cantidad: "+ detallesproduct3_3.getCantidad()+ " Valor: "+ (detallesproduct3_3.getCantidad()*producto3_3.getPrecio()));
        System.out.println("Producto 4: "+producto3_4.getNombre()+" Precio: "+ producto3_4.getPrecio()+"  Cantidad: "+ detallesproduct3_4.getCantidad()+ " Valor: "+ (detallesproduct3_4.getCantidad()*producto3_4.getPrecio()));
        System.out.println("Producto 5: "+producto3_5.getNombre()+" Precio: "+ producto3_5.getPrecio()+"  Cantidad: "+ detallesproduct3_5.getCantidad()+ " Valor: "+ (detallesproduct3_5.getCantidad()*producto3_5.getPrecio()));

        /*Impresion valor total---------------------------------------------------------------------------------------------------------------------------*/
        System.out.println("Total----------------------------------------------------------------------------------------------------------------");
        System.out.println("Valor total: "+((detallesproduct1_1.getCantidad()*producto1_1.getPrecio())+(detallesproduct1_2.getCantidad()*producto1_2.getPrecio())+(detallesproduct1_3.getCantidad()*producto1_3.getPrecio())+(detallesproduct1_4.getCantidad()*producto1_4.getPrecio())+(detallesproduct1_5.getCantidad()*producto1_5.getPrecio()))+((detallesproduct2_1.getCantidad()*producto2_1.getPrecio())+(detallesproduct2_2.getCantidad()*producto2_2.getPrecio())+(detallesproduct2_3.getCantidad()*producto2_3.getPrecio())+(detallesproduct2_4.getCantidad()*producto2_4.getPrecio())+(detallesproduct2_5.getCantidad()*producto2_5.getPrecio()))+((detallesproduct3_1.getCantidad()*producto3_1.getPrecio())+(detallesproduct3_2.getCantidad()*producto3_2.getPrecio())+(detallesproduct3_3.getCantidad()*producto3_3.getPrecio())+(detallesproduct3_4.getCantidad()*producto3_4.getPrecio())+(detallesproduct3_5.getCantidad()*producto3_5.getPrecio())));

    }
}
