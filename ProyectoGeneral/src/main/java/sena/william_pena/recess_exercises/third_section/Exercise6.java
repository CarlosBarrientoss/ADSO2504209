package sena.william_pena.recess_exercises.third_section;

import java.util.ArrayList;

public class Exercise6 {
    public static void main(String... args) {
        for (int i = 0; i < 999; i++) {
            String num = String.valueOf(i + 1);

            if (num.length() == 1) {
                num = "00" + num;
            } else if (num.length() == 2) {
                num = "0" + num;
            }

            String[] digits = num.strip().split("");

            StringBuilder sb = new StringBuilder(digits[0]);

            for (int j = 1; j < digits.length; j++) {
                sb.append("-" + digits[j]);
            }

            num = sb.toString().replace("3", "E");
            System.out.println(num);
        }
    }
}
