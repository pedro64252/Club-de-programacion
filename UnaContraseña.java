import java.util.*;
public class UnaContraseña
{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String contraEs = "";
        String contraAc = "";
        System.out.println("INTRODUCE LA CONTRASE�A QUE SE ESTABLECERA");
        contraEs = sc.nextLine();
        System.out.println("INTRODUCE LA CONTRASE�A PARA ACCESO");
        contraAc = sc.nextLine();
        if (contraEs.equals(contraAc)) {
            System.out.println("ACCESO CONCEDIDO");
        } else {
            System.out.println("CONTRASE�A INCORRECTA");

        }

    }
}
