public class Employee {
    String name;
    String position;
    int sallary;
    int i;

    Employee(String name, String position, int sallary) {
        this.name = name;
        this.position = position;
        this.sallary = sallary;
    }

    String getinfo(int month) {
        return "Имя: " + name +"." +" Должность: " + position +"."+ " Зарплата: " + sallary + "."+" За последние " + month + " месяцев получил " + month * sallary + " долларов.";


    }
}
