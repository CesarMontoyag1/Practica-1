package BeingsOfTheEarth;
import CreatorPackage.LivingBeings;
import SkyBeings.SkyBeing;
public class Humano extends LivingBeings implements SkyBeing,EarthBeign {

    //Metodos de LivingBeings
    @Override
    public void born() {
        System.out.println("Soy humano y he nacido");

    }

    @Override
    public void grow() {
        System.out.println("Soy humano y he crecido");


    }



    @Override
    public void reproduce() {
        System.out.println("Soy humano y me he reproducido");


    }

    @Override
    public void die() {
        System.out.println("Soy humano y he muerto");


    }

    //---------------------//

    //Metodos de SkyBeing
    @Override
    public void fly() {
        System.out.println("Soy humano y puedo volar en mi nave");


    }

    @Override
    public void changeDimensionChange() {
        System.out.println("Soy humano y he cambiado de dimension");


    }

    //---------------------//

    //Metodos de EarthBeing
    @Override
    public void respawn() {
        System.out.println("Soy humano y he hecho respawn");


    }
    public void caminar(){
        System.out.println("soy humano y he caminado");
    }

}
