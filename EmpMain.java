public class EmpMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Вася", "Сварщик", 210);
        System.out.println(employee1.getinfo(6));

    }
}
//Создать класс Работник, в котором будет 3 поля: имя, должность, зарплата.
//В конструкторе с параметрами проинициализировать все поля
//Добавить метода с параметром int, типо возвращаемого значение - String, который возращает информацию о сотруднике,
// а так же о сумме зарплаты, которую он получил за последние i месяцев.