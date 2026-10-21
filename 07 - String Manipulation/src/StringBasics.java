public class StringBasics {

    public static void main(String[] args) {

        String word = "computer";

        System.out.println("Length: " + word.length());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Substring 0-3: " + word.substring(0, 3));
        System.out.println("Position of put: " + word.indexOf("put"));
        System.out.println("Equals computer: " + word.equals("computer"));

        char firstLetter = word.charAt(0);
        System.out.println("First letter as char: " + firstLetter);

        for (int i = 0; i < word.length(); i++) {
            System.out.println(i + ": " + word.charAt(i));
        }
    }
}
