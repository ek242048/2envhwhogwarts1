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

    public static void compareSlytherins(Slytherin a, Slytherin b) {
        int aTotalScore = a.getTrick() + a.getDetermination() + a.getAmbition() + a.getResourcefulness() + a.getLustOfPower();
        int bTotalScore = b.getTrick() + b.getDetermination() + b.getAmbition() + b.getResourcefulness() + b.getLustOfPower();

        if ( aTotalScore > bTotalScore ) {
            System.out.println(a.getName() + " " + a.getSurname() + " - лучший слизеринец, чем " + b.getName() + " " + b.getSurname()+ "!!! Общий балл - " + aTotalScore);
        } else {
            if(bTotalScore > aTotalScore ) {
                System.out.println(b.getName() + " " + b.getSurname() + " - лучший слизеринец, чем" + a.getName() + " " + a.getSurname() + "!!! Общий балл - " + bTotalScore);
            } else {
                System.out.println("Ученики факультета Слизерин " + a.getName() + " " + a.getSurname() + " и " + b.getName() + " " + b.getSurname() + "равны");
            }

        }

    }

}
