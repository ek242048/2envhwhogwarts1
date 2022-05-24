package ru.skypro;

public class Hogwarts {
    private String name;
    private String surname;
    private String faculty;
    private int magic;
    private int transgression;

    public Hogwarts(String name, String surname, String faculty, int magic, int transgression) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.magic = magic;
        this.transgression = transgression;
    }

    public static void print(Hogwarts[] hogwartsStudents) {
        for (int i = 0; i < hogwartsStudents.length; i++) {
            Hogwarts hogwarts = hogwartsStudents[i];
            System.out.println(hogwartsStudents[i]);


        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgression() {
        return transgression;
    }

    @Override
    public String toString() {
        return  "" + name + " " + surname + ": факультет - " + faculty +
                ", способность колдовать=" + magic +
                ", трансгрессия=" + transgression;
    }

    public static void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindors[i]);
        }
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuffs[i]);
        }
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaws[i]);
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherins[i]);
        }
        System.out.println();
    }
}
