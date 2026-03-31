public class countConsonent {
   
    public static int countConsonants(String str) {
        if (str == null) return 0;

        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));

            if (Character.isLetter(c) && !(vowels.indexOf(c) != -1)) {
            count++;
               
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "aeiour";
        System.out.println(countConsonants(str)); // example
    }

}
