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

    public static void print(Hogwarts[] hogwartsStudents) {
        System.out.println("Все ученики Хогвартса:");
        for (int i = 0; i < hogwartsStudents.length; i++) {
            Hogwarts hogwarts = hogwartsStudents[i];
            System.out.println(hogwartsStudents[i]);
        }
        System.out.println();
    }

    public static void print(Gryffindor[] gryffindors) {
        System.out.println("Ученики факультета Гриффиндор:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindors[i]);
        }
        System.out.println();
    }

    public static void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Ученики факультета Пуффендуй:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuffs[i]);
        }
        System.out.println();
    }

    public static void print(Ravenclaw[] ravenclaws) {
        System.out.println("Ученики факультета Когтевран:");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaws[i]);
        }
        System.out.println();
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Ученики факультета Слизерин: ");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherins[i]);
        }
        System.out.println();
    }


    public static void compareStudens(Hogwarts a, Hogwarts b) {
        if (a.getMagic() > b.getMagic() && a.getTransgression() > b.getTransgression()) {
            System.out.println(a.getName() + " " + a.getSurname() + " из факультета " + a.getFaculty() + " обладает большей магической силой и дальше трансгрессирует, чем "
                    + b.getName() + " " + b.getSurname() + " из факультета " + b.getFaculty());

        } else if (a.getMagic() > b.getMagic() && a.getTransgression() < b.getTransgression()) {
            System.out.println(a.getName() + " " + a.getSurname() + " из факультета " + a.getFaculty() +
                    " обладает большей магической силой, чем " + b.getName() + " " + b.getSurname() + " из факультета " + b.getFaculty()
                    + " но способность к трансгрессии хуже");

        } else if (a.getMagic() < b.getMagic() && a.getTransgression() > b.getTransgression()) {
            System.out.println(a.getName() + " " + a.getSurname() + " из факультета " + a.getFaculty() + " обладает меньшей магической силой, но зато дальше трансгрессирует, чем "
                    + b.getName() + " " + b.getSurname() + " из факультета " + b.getFaculty());

        } else {
            System.out.println(a.getName() + " " + a.getSurname() + " из факультета " + a.getFaculty() + " обладает меньшей магической силой и хуже трансгрессирует, чем "
                    + b.getName() + " " + b.getSurname() + " из факультета " + b.getFaculty());
        }
    }
}
