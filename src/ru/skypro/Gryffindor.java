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

    public void compareGryffindors (Gryffindor[]gryffindors) {
        int totalScore = nobility + honor + brave;
        for (int i = 0; i < gryffindors.length; i++) {
        }
        System.out.println(totalScore);
    }


}
