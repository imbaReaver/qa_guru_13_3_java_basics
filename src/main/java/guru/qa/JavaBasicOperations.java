package guru.qa;

public class JavaBasicOperations {
    public static void main(String[] args) {
        boolean bool = true; // true, false
        char character = 'a'; // символ UTF-16 (буквы и цифры)

        byte aByte = -128; // от -128 до 127
        short aShort = 32767; // от -32768 до 32767
        int aInt = 2147483647; // от -2147483648 до 2147483647
        int aInt0 = 2147483647 + 1;
        int aInt1 = 2147483647 * 1000;

        long aLong = 9223372036854775807L; // от -9223372036854775808 до 9223372036854775807

        float aFloat = 0.3663462F; // от 2^(-149) до (2-2^(-23))*2^(127)
        double aDbl = 0.25345345; // от 2^(-1074) до (2-2^(-52))*2^(1023)

        int[] arr = new int [] {1, 2, 3};
        String str = "Hola!";

        System.out.println(aInt + aDbl);
        System.out.println(aInt + aDbl - aShort);
        System.out.println(aInt0); // переполнение
        System.out.println(aInt1);
        System.out.println(aInt0 > aInt);
        System.out.println(arr[1] * arr[2]);
        System.out.println(str);

        boolean andExample = (aInt > aInt0) && !(aShort <= aFloat);
        boolean orExample = (aInt == aLong) || (aDbl != aFloat);

        System.out.println(andExample);
        System.out.println(orExample);

        int additionEx = 3 + 8;
        int subtractEx = 3 - 8;
        int multiplyEx = 3 * 8;
        int divisionEx = 3 / 8;
        int divisionRemainderEx = 3 % 8;
        System.out.println(additionEx);
        System.out.println(subtractEx);
        System.out.println(multiplyEx);
        System.out.println(divisionEx);
        System.out.println(divisionRemainderEx);

        int maxRes = 2147483647 + 1;
        int minRes = -2147483648 - 1;
        System.out.println(maxRes);
        System.out.println(minRes);

        System.out.println(300 + 6543534526236234L);

        if (str != null && str.length() >= 3) {
            System.out.println(str + " Check your e-mail!");
        } else {
            System.out.println("Your text contains less than 3 characters");
        }
    }

}
