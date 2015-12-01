/**
 * Created by DuyAnhPham on 17/09/15.
 */
public class Main {

    public static void main(String[] arg){

        MagicHat newMagicHat = new MagicHat();
        Wizard newWizard = new Wizard(newMagicHat);

        Audience newAudience = new Audience();

        for (int i = 0; i < 10; i++) {
            newWizard.makeTrick();
            newAudience.clap();
            System.out.println();
            System.out.println();
        }
    }
}
