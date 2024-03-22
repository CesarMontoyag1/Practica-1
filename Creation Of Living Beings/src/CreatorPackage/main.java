package CreatorPackage;
import java.util.Scanner;
import BeingsOfTheEarth.EarthBeign;
import BeingsOfTheEarth.EarthBeingGeneric;
import BeingsOfTheEarth.Humano;
import SkyBeings.SkyBeingGeneric;
public class main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int opcion=0;
        while (opcion!=4){
            System.out.println("Bienvenvido a la creacion de seres vivos ¿que deseas crear?");
            System.out.println("1. Crear Humano");
            System.out.println("2. Crear ser de la tierra");
            System.out.println("3. Crear ser del cielo");
            System.out.println("4. Salir");
            opcion=scanner.nextInt();
            if (opcion==1){
                LivingBeings humano= LivingBeingCreator.createLivingBeings("earth","humano");
                ((Humano)humano).born();
                humano.grow();
                ((Humano) humano).caminar();
                humano.reproduce();
                ((Humano) humano).changeDimensionChange();
                ((Humano) humano).fly();
                humano.die();
                ((Humano) humano).respawn();
            }
            if (opcion==2){
                System.out.println("¿Que tipo der ser vivo en la tierra quieres crear?");
                String Tiposervivo;
                Tiposervivo= scanner.next();
                LivingBeings sertierra= LivingBeingCreator.createLivingBeings("earth",Tiposervivo);
                ((EarthBeingGeneric)sertierra).born();
                sertierra.grow();
                sertierra.reproduce();
                sertierra.die();
                ((EarthBeingGeneric) sertierra).respawn();

            }
            if (opcion==3){
                System.out.println("¿Que tipo der ser vivo en el cielo quieres crear?");
                String Tiposervivosky= scanner.next();
                LivingBeings sercielo= LivingBeingCreator.createLivingBeings("sky",Tiposervivosky);
                ((SkyBeingGeneric)sercielo).born();
                sercielo.grow();
                sercielo.reproduce();
                sercielo.die();
                ((SkyBeingGeneric) sercielo).respawn();
                ((SkyBeingGeneric) sercielo).fly();
                ((SkyBeingGeneric) sercielo).changeDimensionChange();
            }
        }
    }
}
