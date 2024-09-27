public class Main {
    public static void main(String[] args) {

        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);

        //Задача 3
        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;
        System.out.println(dog + " " + cat + " " + paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);

        //Задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //Задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog =  frog + 4;
        System.out.println(frog);

        //Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);

        //Задача 7
        var reminderBoxers = boxer2 % boxer1;
        System.out.println(reminderBoxers);

        //Задача 8
        //Первая
        System.out.println("Всего работников в компании - " + 640 / 8 +" человек.");
        //Вторая
        var morePeople = (640/ 8) + 94;
        System.out.println("Если в компании работает " + morePeople + " человекa, то всего " + 640/morePeople + " часа работы может быть поделено междусотрудниками.");
    }
}