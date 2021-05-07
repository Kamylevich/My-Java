public class MyDay {
    public static void main(String[] args) {
        int time = 16;
        int weather = 2;
        boolean sun = weather == 1;
        boolean rain = weather == 2;
        boolean timeUp = time >= 11 && time <= 24;
        if (timeUp && sun) {
            System.out.println("Walk!!");
        }
        if (!timeUp) {
            System.out.println("Sleep!");
        }
        if (timeUp && !sun) {
            System.out.println("Read the book!");
        }
    }
}