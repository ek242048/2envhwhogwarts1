package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int diligense;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, String faculty, int magic, int transgression, int diligense, int loyalty, int honesty) {
        super(name, surname, faculty, magic, transgression);
        this.diligense = diligense;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligense() {
        return diligense;
    }

    public void setDiligense(int diligense) {
        this.diligense = diligense;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", трудолюбие=" + diligense +
                ", верность=" + loyalty +
                ", честность=" + honesty;
    }

    public static void compareHufflepuffs(Hufflepuff a, Hufflepuff b) {
        int aTotalScore = a.getDiligense() + a.getLoyalty() + a.getHonesty();
        int bTotalScore = b.getDiligense() + b.getLoyalty() + b.getHonesty();

        if ( aTotalScore > bTotalScore ) {
            System.out.println(a.getName() + " " + a.getSurname() + " - лучший ученик Пуффендуя, чем " + b.getName() + " " + b.getSurname() + "!!! Общий балл - " + aTotalScore);
        } else {
            if(bTotalScore > aTotalScore ) {
                System.out.println(b.getName() + " " + b.getSurname() + " - лучший ученик Пуффендуя, чем " + a.getName() + " " + a.getSurname() + "!!! Общий балл - " + bTotalScore);
            } else {
                System.out.println("Ученики факультета Пуффендуй " + a.getName() + " " + a.getSurname() + " и " + b.getName() + " " + b.getSurname() + "равны");
            }

        }

    }

}
