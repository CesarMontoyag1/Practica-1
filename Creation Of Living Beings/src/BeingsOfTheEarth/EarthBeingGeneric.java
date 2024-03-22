package BeingsOfTheEarth;

import CreatorPackage.LivingBeings;

public class EarthBeingGeneric extends LivingBeings implements EarthBeign{
    private String Tipo;
    public EarthBeingGeneric (String Tipo){
        this.Tipo=Tipo;

    }

    @Override
    public void born() {
        System.out.println(Tipo+" ha nacido en la tierra");

    }

    @Override
    public void grow() {
        System.out.println(Tipo+" ha crecido en la tierra");

    }

    @Override
    protected void reproduce() {
        System.out.println(Tipo+" se ha reproducido en la tierra");

    }

    @Override
    public void respawn() {
        System.out.println(Tipo+" ha hecho respawn en la tierra");

    }

    @Override
    public void die() {
        System.out.println(Tipo+" ha muerto en la tierra");

    }
}
