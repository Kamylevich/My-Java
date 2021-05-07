public class Dog {
    String Name;
    String Breed;
    int Speed;

    void run() {
        String result = "";

        for (int i = 0; i < Speed; i++) {
            result += "бегу";
            if (i == Speed - 1) {
                result += ".";
            } else {
                result += ", ";

            }
        }
        System.out.println(result);
    }

    String info() {
        return "Кличка: " + Name +"."+ " Порода: " + Breed+"." + " Скорость " + Speed+"км/ч.";
    }
}
