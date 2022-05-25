package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Гарри","Поттер","Гриффиндор",90,70,80,85,95);
        Gryffindor hermione = new Gryffindor("Гермиона","Грейнджер", "Гриффиндор", 80,65,84,87, 73);
        Gryffindor ron = new Gryffindor("Рон","Уизли","Гриффиндор",40,70,65,70,80);
        Hufflepuff zaccary = new Hufflepuff("Захария","Смит","Пуффендуй",50,30,62,40,54);
        Hufflepuff cedrick = new Hufflepuff("Седрик","Диггори","Пуффендуй",80,60,75,80,85);
        Hufflepuff justin = new Hufflepuff("Джастин","Финч-Флетчли","Пуффендуй",30,54,42,30,56);
        Ravenclaw chjoy = new Ravenclaw("Чжоу","Чанг","Когтевран",74,26,61,43,55,41);
        Ravenclaw padme = new Ravenclaw("Падма","Патил","Когтевран",62,46,65,79,65,84);
        Ravenclaw marcus = new Ravenclaw("Маркус","Белби","Когтевран",41,37,52,30,28,45);
        Slytherin draco = new Slytherin("Драко","Малфой","Слизерин",84,42,85,40,87,30,95);
        Slytherin grehem = new Slytherin("Грехэм","Монтегю","Слизерин",46,21,48,20,61,24,41);
        Slytherin gregory = new Slytherin("Грегори","Гойл","Слизерин",39,28,15,10,5,34,20);



        Hogwarts [] hogwartsStudents = {
                new Hogwarts("Гарри", "Поттер","Гриффиндор", 90, 70),
                new Hogwarts("Гермиона","Грейнджер", "Гриффиндор", 80,65),
                new Hogwarts("Рон","Уизли","Гриффиндор",40,70),
                new Hogwarts("Захария","Смит","Пуффендуй",50,30),
                new Hogwarts("Седрик","Диггори","Пуффендуй",80,60),
                new Hogwarts("Джастин","Финч-Флетчли","Пуффендуй",30,54),
                new Hogwarts("Чжоу","Чанг","Когтевран",74,26),
                new Hogwarts("Падма","Патил","Когтевран",62,46),
                new Hogwarts("Маркус","Белби","Когтевран",41,37),
                new Hogwarts("Драко","Малфой","Слизерин",84,42),
                new Hogwarts("Грехэм","Монтегю","Слизерин",46,21),
                new Hogwarts("Грегори","Гойл","Слизерин",39,28),
        };


        Gryffindor [] gryffindors = {
                new Gryffindor("Гарри", "Поттер","Гриффиндор", 90, 70, 80, 85, 95),
                new Gryffindor("Гермиона","Грейнджер", "Гриффиндор", 80,65,84,87, 73),
                new Gryffindor("Рон","Уизли","Гриффиндор",40,70,65,70,80),
        };

        Hufflepuff [] hufflepuffs = {
                new Hufflepuff("Захария","Смит","Пуффендуй",50,30,62,40,54),
                new Hufflepuff("Седрик","Диггори","Пуффендуй",80,60,75,80,85),
                new Hufflepuff("Джастин","Финч-Флетчли","Пуффендуй",30,54,42,30,56),
        };

        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу","Чанг","Когтевран",74,26,61,43,55,41),
                new Ravenclaw("Падма","Патил","Когтевран",62,46,65,79,65,84),
                new Ravenclaw("Маркус","Белби","Когтевран",41,37,52,30,28,45),
        };

        Slytherin [] slytherins = {
                new Slytherin("Драко","Малфой","Слизерин",84,42,85,40,87,30,95),
                new Slytherin("Грехэм","Монтегю","Слизерин",46,21,48,20,61,24,41),
                new Slytherin("Грегори","Гойл","Слизерин",39,28,15,10,5,34,20),
        };

        Hogwarts.print(hogwartsStudents);
        Hogwarts.print(gryffindors);
        Hogwarts.print(hufflepuffs);
        Hogwarts.print(ravenclaws);
        Hogwarts.print(slytherins);

        printSeparator("ЛУЧШИЕ УЧЕНИКИ ФАКУЛЬТЕТОВ");
        Gryffindor.compareGryffindors(harryPotter,hermione,ron);
        Hufflepuff.compareHufflepuffs(zaccary,cedrick,justin);
        Ravenclaw.compareRavenclaws(chjoy,padme,marcus);
        Slytherin.compareSlytherins(draco,grehem,gregory);

        printSeparator("СРАВНЕНИЕ УЧЕНИКОВ ХОГВАРТСА");

        Hogwarts.compareStudens(harryPotter,draco);
        Hogwarts.compareStudens(ron,padme);
        Hogwarts.compareStudens(gregory,harryPotter);


    }

    public static void printSeparator (String text) {
        System.out.println();
        System.out.println( "******* " + text + " *******" );
        System.out.println();
    }

}
