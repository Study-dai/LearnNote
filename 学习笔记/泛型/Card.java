package package1201;

public class Card {
    public int rank;
    public String suit;


    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;

    }
    public static void main(String[] args) {
        Card p=new Card(1,"♣");
        Card q=new Card(1,"♥");
        Card  o=p;

        System.out.println(p==q);
        System.out.println(p==o);
        System.out.println(p.equals(o));
        System.out.println(q.equals(p));

    }
}
