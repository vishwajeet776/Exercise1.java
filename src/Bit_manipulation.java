public class Bit_manipulation {
    public static void main(String[] args) {
        int a=8;
//        int pos=0;
        int cout=0;
//GET BIT
//        System.out.println(1<<pos);
        for (int i=0;i<4;i++) {
            if ((1 << i & a) == 0) {
                System.out.println("bit was 0");

            } else {
                System.out.println("bit was 1");
                cout++;
            }
        }
        System.out.println(cout);

    }
}
