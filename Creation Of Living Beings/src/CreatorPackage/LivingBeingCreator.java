package CreatorPackage;

import BeingsOfTheEarth.EarthBeingGeneric;
import BeingsOfTheEarth.Humano;
import SkyBeings.SkyBeingGeneric;
public class LivingBeingCreator implements Creator {
    public static  LivingBeings createLivingBeings(String Procedencia, String Tipo){
        Procedencia=Procedencia.toUpperCase();
        switch (Procedencia) {
            case "EARTH":
                if (Tipo.equalsIgnoreCase("HUMANO")) {
                    Humano humano= new Humano();
                    return humano;
                } else {
                    return new EarthBeingGeneric(Tipo);
                }
            case "SKY":
                return new SkyBeingGeneric(Tipo);
            default:
                System.out.println("Tipo de ser no encontrado");
                return null;


        }

    }

}


