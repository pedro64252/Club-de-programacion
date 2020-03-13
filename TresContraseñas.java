import java.util.*;
public class TresContraseñas
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraEs = "";
        String contra1 = "";
        String contra2 = "";
        String contra3 = "";

        System.out.println("INTRODUCE LA CONTRASEÑA QUE SE ESTABLECERA");
        contraEs = sc.nextLine();
        System.out.println("INTRODUCE LA CONTRASEÑA PARA ACCESO 1");
        contra1 = sc.nextLine();
        System.out.println("INTRODUCE LA CONTRASEÑA PARA ACCESO 2");
        contra2 = sc.nextLine();
        System.out.println("INTRODUCE LA CONTRASEÑA PARA ACCESO 3");
        contra3 = sc.nextLine();
        if (contraEs.equals(contra1)&&contraEs.equals(contra2)&&contraEs.equals(contra3)) {
            System.out.println("ACCESO CONCEDIDO");
        } else {
            System.out.println("CONTRASEÑAS INCORRECTAs");

        }
    }

}
