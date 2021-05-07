public class Rect {
    double length;
    double width;

    void setDimens (double length, double width) {
        this.length = length;
        this.width = width;
    }

    double per() {
        return (length + width)*2 ;
    }
    double S () {
        return length* width ;
    }

}
