package ru.skypro;

public class Ravenclaw extends Hogwarts{
    private int intellect;
    private int wisdom;
    private int humor;
    private int creativity;

    public Ravenclaw(String name, String surname, String faculty, int magic, int transgression, int intellect, int wisdom, int humor, int creativity) {
        super(name, surname, faculty, magic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.humor = humor;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", ум=" + intellect +
                ", мудрость=" + wisdom +
                ", остроумие=" + humor +
                ", креативность=" + creativity;
    }
}
