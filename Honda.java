package övning2;

public class Honda extends Bilfabrik {
    public Honda(String bil3) {
        super.märke = bil3;
    }


    @Override
    public void märketpåbilen() {
        System.out.println(Bilmärke.HONDA);
    }
}
