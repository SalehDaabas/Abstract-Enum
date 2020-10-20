package övning2;

public class Bmw extends Bilfabrik{

    public Bmw(String bil1) {
        super.märke = bil1;
    }

    @Override
    public void märketpåbilen(){
        System.out.println(Bilmärke.BMW);


}

}
