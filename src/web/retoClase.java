package web;

public class retoClase {
    public static void main(String[] args) {
        String cadena ="https://www.url.com/categoria/user_name_#/perfil";
        String[] extraccion=cadena.split("_");
        System.out.println("Hola "+ extraccion[1]+ " buenos días.");
    }
}
