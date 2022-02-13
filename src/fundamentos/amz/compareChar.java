package fundamentos.amz;

import java.util.Arrays;

public class compareChar {

    public static void main(String[] args) {

        String brackets[] = {"{", "[", "(", ")", "]", "}"};
        String s1, s2, s3;


        String brackts01 = brackets[0].concat(brackets[5]);
        String bracket02 = brackets[1].concat(brackets[4]);
        String bracket03 = brackets[2].concat(brackets[3]);


        if (brackts01.equals("{}")) {
            s1 = "YES";
        } else {
            s1 = "NO";
        }

        if (bracket02.equals("[]")) {
            s2 = "YES";
        } else {
            s2 = "NO";
        }


        if (bracket03.equals("()")) {
            s3 = "YES";
        } else {
            s3 = "NO";
        }

        if (s1.equals("YES") && s2.equals("YES") && s3.equals("YES")) {
            System.out.println(Arrays.stream(brackets).toList());
            System.out.println(" This is balanced");

        } else {
            System.out.println(Arrays.stream(brackets).toList());
            System.out.println(" This not balanced");
        }
    }
}
