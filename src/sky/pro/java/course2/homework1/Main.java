package sky.pro.java.course2.homework1;

public class Main {
    public static void main(String[] args){
        Gryffindor ghary = new Gryffindor("Гарри Поттер", 80, 70, 70, 100, 90);
        Gryffindor germ=new Gryffindor("Гермиона Грейнджер",70,40,60,0,80);
        Gryffindor ron=new Gryffindor("Рон Уизли",20,30,30,0,30);
        Cogtevran chang=new Cogtevran("Чжоу Чанг",20,30,30,0,30,40);
        Cogtevran padma=new Cogtevran("Падма Патил",20,30,30,0,30,32);
        Cogtevran balby=new Cogtevran("Маркус Белби",20,30,30,0,30,23);
        Slytherin draco=new Slytherin("Драко Малфой",20,30,30,10,0,30,40);
        Slytherin grexem=new Slytherin("Грэхэм Монтегю",20,30,30,40,0,30,32);
        Slytherin goel=new Slytherin("Грегори Гойл",20,30,30,30,0,30,23);
        Hufflepuff smit=new Hufflepuff("Захария Смит",30,10,0,30,40);
        Hufflepuff sedr=new Hufflepuff("Седрик Диггори",30,40,0,30,32);
        Hufflepuff dzast=new Hufflepuff("Джастин Финч-Флетчли",30,30,0,30,23);


        Hogwards.comparisonSchool(ron,chang);
        Gryffindor.calculatingBestFaculty(ron,ghary);
        Hogwards.printStud(germ);
    }

}
