public class MainStringCal {
    public static void main( String[] args) {
        try {
            System.out.println(StringCalculator.add("1,2,3,4"));
            System.out.println(StringCalculator.add("1\n2,3"));
            System.out.println(StringCalculator.add("//;\n1,2"));
            System.out.println(StringCalculator.add("//4\n142"));
            System.out.println(StringCalculator.add("//***\n1***2***3"));
            System.out.println(StringCalculator.add("//[:D][%]\n1:D2%3"));
            System.out.println(StringCalculator.add("3//;\n1000,1;2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    add("//;\n1;2")
//// should return 3
//
//    add("//4\n142")
//// should return 3
}
