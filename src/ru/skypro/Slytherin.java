package ru.skypro;

public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustOfPower;

    public Slytherin(String name, String surname, String faculty, int magic, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustOfPower) {
        super(name, surname, faculty, magic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustOfPower = lustOfPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustOfPower() {
        return lustOfPower;
    }

    public void setLustOfPower(int lustOfPower) {
        this.lustOfPower = lustOfPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", хитрость=" + trick +
                ", решительность=" + determination +
                ", амбициозность=" + ambition +
                ", находчивость=" + resourcefulness +
                ", жажда власти=" + lustOfPower;
    }

    public static void compareSlytherins(Slytherin a, Slytherin b, Slytherin c) {
        int aTotalScore = a.getTrick() + a.getDetermination() + a.getAmbition() + a.getResourcefulness() + a.getLustOfPower();
        int bTotalScore = b.getTrick() + b.getDetermination() + b.getAmbition() + b.getResourcefulness() + b.getLustOfPower();
        int cTotalScore = c.getTrick() + c.getDetermination() + c.getAmbition() + c.getResourcefulness() + c.getLustOfPower();

        if ( aTotalScore > bTotalScore && aTotalScore > cTotalScore ) {
            System.out.println(a.getName() + " " + a.getSurname() + " - лучший ученик факультета Слизерин!!! Общий балл - " + aTotalScore);
        } else {
            if(bTotalScore > aTotalScore && bTotalScore > cTotalScore) {
                System.out.println(b.getName() + " " + b.getSurname() + " - лучший ученик факультета Слизерин!!! Общий балл - " + bTotalScore);
            } else {
                System.out.println(c.getName() + " " + c.getSurname() + " - лучший ученик факультета Слизерин!!! Общий балл - " + cTotalScore);
            }

        }

    }

}
