public class parkir {
    public static void main(String[] args) {
        int jam = 20;
        if (jam < 12) {
            System.out.println("Pagi, tarif Rp 5.000");
        } else if (12 <= jam && jam < 18) {
            System.out.println("Siang, tarif Rp 7.000");
        } else {
            System.out.println("Malam, tarif Rp 10.000");
        }
    }
}
