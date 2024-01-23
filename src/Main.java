public class Main {
    public static void main(String[] args) {
        //Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //Задача 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

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
        frog = frog + 4;
        System.out.println(frog);

        //Задача 6
        var boxer1_weight = 78.2;
        var boxer2_weight = 82.7;
        var weightSum = boxer1_weight + boxer2_weight;
        System.out.println(weightSum);
        System.out.println(boxer1_weight - boxer2_weight);

        //Задача 7
        var weightDiff_1 = boxer2_weight - boxer1_weight;
        var weightDiff_2 = boxer2_weight % boxer1_weight;
        System.out.println(weightDiff_1);
        System.out.println(weightDiff_2);

        //Задача 8
        var all_time = 640;
        var work_time = 8;
        var employees = all_time / work_time;
        System.out.println("Всего работников в компании - " + employees + " человек");

        employees = employees + 94;
        all_time = work_time * employees;
        System.out.println(
                "Если в компании работает " + employees + " человек, то всего "
                        + all_time + " часов работы может быть поделено между сотрудниками");


    }
}