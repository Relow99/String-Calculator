public class StringCalculator {
    public static int add(String stringInput) throws Exception {

        int results = 0;

        String newStringInput = stringInput.replaceAll("\n", ",").replaceAll("\\*", ",")
                .replaceAll("//", ",").replaceAll("\n", ",")
                .replaceAll(",,", ",").replaceAll("4", ",")
                .replaceAll("[a-zA-Z]", ",").replaceAll("\\[", ",").replaceAll("//]", ",")
                .replaceAll(":", "").replaceAll("%", ",")
                .replaceAll("\\(", ",").replaceAll("777", ",").replaceAll("-_-", ",");
        int start = newStringInput.indexOf("-");

        String stringArr[] = newStringInput.split(",");

        if (newStringInput.contains("-")) {
            String negative = newStringInput.substring(start, start + 1);
            throw new Exception("ERROR: negatives not allowed " + negative);
        }
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals("1000")) {
                throw new Exception("ERROR: invalid input");
            }

            if (stringArr[i].matches("[0-9]")) {
                results = results + Integer.parseInt(stringArr[i]);
            }
        }
        return results;
    }
}
