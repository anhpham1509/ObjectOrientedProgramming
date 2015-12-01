/**
 * Created by DuyAnhPham on 17/09/15.
 */
public class Wizard {

    MagicHat newMagicHat = new MagicHat();

    public Wizard(MagicHat magicHat){
        this.setNewMagicHat(magicHat);
    }

    public MagicHat getNewMagicHat() {
        return newMagicHat;
    }

    public void setNewMagicHat(MagicHat newMagicHat) {
        this.newMagicHat = newMagicHat;
    }

    public void makeTrick(){
        System.out.println("Making a new trick!");
        MagicAnimal newAnimal = this.newMagicHat.giveAnimal();
        newAnimal.move();
    }

    public static void main(String[] arg){
        MagicHat newMagicHat = new MagicHat();
        MagicAnimal newAnimal = newMagicHat.giveAnimal();
        newAnimal.move();
    }
}
