package ru.skypro;

public class Gryffindor  extends Hogwarts{
    private int nobility;
    private int honor;
    private int brave;

    public Gryffindor(String name, String surname,String faculty, int magic, int transgression, int nobility, int honor, int brave) {
        super(name, surname, faculty, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBrave() {
        return brave;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", благородство=" + nobility +
                ", честь=" + honor +
                ", храбрость=" + brave ;
    }

    public static void compareGryffindors(Gryffindor a, Gryffindor b) {
        int aTotalScore = a.getNobility() + a.getHonor() + a.getBrave();
        int bTotalScore = b.getNobility() + b.getHonor() + b.getBrave();

        if ( aTotalScore > bTotalScore ) {
            System.out.println(a.getName() + " " + a.getSurname() + " - лучший гриффиндорец, чем " + b.getName() + " " + b.getSurname() + "!!! Общий балл - " + aTotalScore);
        } else {
            if(bTotalScore > aTotalScore) {
                System.out.println(b.getName() + " " + b.getSurname() + " - лучший гриффиндорец, чем " + a.getName() + " " + a.getSurname() + "!!! Общий балл - " + bTotalScore);
            } else {
                System.out.println("Гриффиндорцы " + a.getName() + " " + a.getSurname() + " и " + b.getName() +" " +b.getSurname() + "равны в своих качествах");
            }

        }

    }


}
