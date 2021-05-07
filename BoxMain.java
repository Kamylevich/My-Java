public class BoxMain {
    public static void main(String[] args) {


        Box Box1 = new Box();
        Box1.length = 5;
        Box1.height = 5;
        Box1.wigth = 5;
        Box Box2 = new Box();
        Box2.height = 10;
        Box2.length = 10;
        Box2.wigth = 10;
        Box1.showVolume();
        Box2.showVolume();
    }
}
