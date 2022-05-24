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
}
