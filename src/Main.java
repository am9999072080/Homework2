public class Main {
    public static void main(String[] args) {
        tasks1_3();
        tasks4_5();
        tasks6_8();
    }
    public static void tasks1_3(){
        System.out.println("Задача 1");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 2");
        dog=dog + 4;
        cat=cat + 4;
        paper=paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задача 3");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void tasks4_5(){
        System.out.println("Задача 4");
        var friend=19;
        System.out.println(friend);
        friend=friend + 2;
        System.out.println(friend);
        friend=friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog * 10;
        System.out.println(frog);
        frog=frog / 3.5;
        System.out.println(frog);
        frog=frog + 4;
        System.out.println(frog);
    }
    public static void tasks6_8(){
        System.out.println("Задача 6");
        var weightBoxer1=78.2;
        var weightBoxer2=82.7;
        var totalWeightBoxers=weightBoxer1 + weightBoxer2;
        System.out.println(totalWeightBoxers);
        var difWeightBoxers=weightBoxer2 - weightBoxer1;
        System.out.println(difWeightBoxers);

        System.out.println("Задача 7");
        //Задача 7.1
        difWeightBoxers=weightBoxer2 - weightBoxer1;
        System.out.println(difWeightBoxers);
        //Задача 7.2
        difWeightBoxers=weightBoxer2 % weightBoxer1;
        System.out.println(difWeightBoxers);

        System.out.println("Задача 8");
        var totalTime=640.0;
        var personTime=8.0;
        //Задача 8.1
        var allPersons=totalTime / personTime;
        System.out.println("Всего работников в компании — "+allPersons+" человек");
        //Задача 8.2
        allPersons=allPersons + 94;
        totalTime=allPersons * personTime;
        System.out.println("Если в компании работает "+allPersons+" человек, то всего "+totalTime+" часов работы может быть поделено между сотрудниками");
    }
}