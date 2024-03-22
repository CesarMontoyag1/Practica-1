package SkyBeings;
import BeingsOfTheEarth.EarthBeign;
import CreatorPackage.LivingBeings;
public class SkyBeingGeneric extends LivingBeings implements SkyBeing, EarthBeign {

    private String Tipo;
    public SkyBeingGeneric (String Tipo){
        this.Tipo=Tipo;

    }

    @Override
    public void born() {
        System.out.println(Tipo+" ha nacido en el cielo");

    }

    @Override
    public void grow() {
        System.out.println(Tipo+" ha crecido en el cielo");

    }

    @Override
    public void reproduce() {
        System.out.println(Tipo+"se ha reproducido en el cielo");

    }

    @Override
    public void respawn() {
        System.out.println(Tipo+" ha hecho respawn en el cielo");

    }

    @Override
    public void die() {
        System.out.println(Tipo+" ha muerto en el cielo");

    }

    @Override
    public void fly() {
        System.out.println(Tipo+" puede volar en el cielo");

    }

    @Override
    public void changeDimensionChange() {

        System.out.println(Tipo+" ha cambiado de dimension en el cielo");

    }
}
