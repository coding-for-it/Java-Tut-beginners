public class strings {
    public static void main(String[] args) {
        //strings-immutable
        //concatenate
        String firstName = "Nimisha";
        String lastName = "Rajendra";
        String fullName = firstName + " " + lastName;
        //print
        System.out.println("Full Name: " + fullName);

        //charAt
        char firstChar = fullName.charAt(0);
        //print
        System.out.println("First Character: " + firstChar);

        //length
        int nameLength = fullName.length();
        //print
        System.out.println("Name Length: " + nameLength);

        //replace
        String replacedName = fullName.replace("Nimisha", "Vilas");
        //print
        System.out.println("Replaced Name: " + replacedName);

        //substring
        String subName = fullName.substring(0, 4);// "Nimi"
        //print
        System.out.println("Substring: " + subName);
    }
}
