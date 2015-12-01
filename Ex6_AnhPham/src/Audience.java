/**
 * Created by DuyAnhPham on 17/09/15.
 */
public class Audience {
    private Person[] audienceList = new Person[10];

    public Audience(){
        for (int i = 0; i < 10; i++) {
            Person newPerson = new Person();
            this.audienceList[i] = newPerson;
        }
    }

    public void clap(){
        for (Person p:audienceList){
            p.clap();
        }
    }
}
