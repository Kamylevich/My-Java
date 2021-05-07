public class HumanMain {
    //Создать класс Человек в котором будет 3 поля: имя, возраст, вес
    //В Классе Main создать 5 экземпляров класса Человек, присвоить значения их полям
    // и вывести на экран их средний вес.
    public static void main(String[] args) {
        Human Human1 = new Human();
        Human1.name = "Ray" ;
        Human1.age = 34;
        Human1.weight = 76;
        Human Human2 = new Human();
        Human2.name = "Jim";
        Human2.age = 21;
        Human2.weight = 65;
        Human Human3 = new Human();
        Human3.name = "John";
        Human3.age = 51;
        Human3.weight = 80;
        Human Human4 = new Human();
        Human4.name = "Brad";
        Human4.age = 28;
        Human4.weight = 73;
        Human Human5 = new Human();
        Human5.name = "Vic";
        Human5.age = 29;
        Human5.weight = 79;
        double avg_weight = (Human1.weight+ Human2.weight+ Human3.weight+ Human4.weight+ Human5.weight)/5;
        System.out.println(avg_weight);

    }
}
