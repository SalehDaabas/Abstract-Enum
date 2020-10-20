package övning2;

public class Audi extends Bilfabrik {

    public Audi(String bil2) {
        super.märke = bil2;
    }

    @Override
    public void märketpåbilen() {
        System.out.println(Bilmärke.AUDI);
    }
}
