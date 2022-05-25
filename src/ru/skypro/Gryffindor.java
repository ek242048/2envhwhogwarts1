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

    public static void compareGryffindors(Gryffindor a, Gryffindor b, Gryffindor c) {
        int aTotalScore = a.getNobility() + a.getHonor() + a.getBrave();
        int bTotalScore = b.getNobility() + b.getHonor() + b.getBrave();
        int cTotalScore = c.getNobility() + c.getHonor() + c.getBrave();

        if ( aTotalScore > bTotalScore && aTotalScore > cTotalScore ) {
            System.out.println(a.getName() + " " + a.getSurname() + " - лучший гриффиндорец!!! Общий балл - " + aTotalScore);
        } else {
            if(bTotalScore > aTotalScore && bTotalScore > cTotalScore) {
                System.out.println(b.getName() + " " + b.getSurname() + " - лучший гриффиндорец!!! Общий балл - " + bTotalScore);
            } else {
                System.out.println(c.getName() + " " + c.getSurname() + " - лучший гриффиндорец!!! Общий балл - " + cTotalScore);
            }

        }

    }


}
