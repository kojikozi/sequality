package sequality;

public class Calculate {
    public String cal1(int x, int y) {
        int sum = x + y;
        double ave = (double)sum / 2;
        String str = "Sum of " + x + " and " + y + " is " + sum + ". Average is " + ave + ".";
        return str;
    }

    public String cal2() {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum = sum + i;
        }
        double ave = (double)sum / 10;
        String str = "Sum of 1 to 10 is " + sum + ". Average is " + ave + ".";
        return str;
    }

    public String cal3() {
        int sum_o = 0;
        int sum_e = 0;
        for (int i = 1; i <= 10; i++){
            if (i % 2 != 0){
                sum_o = sum_o + i;
            } else {
                sum_e = sum_e + i;
            }
        }
        String str = "Sum of odd of 1 to 10 is " + sum_o + ". Sum of even is " + sum_e + ".";
        return str;
    }

}