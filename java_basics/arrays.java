import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        
        //1d array
        int[] marks = new int[3];
        marks[0] = 97; 
        marks[1] = 90;
        marks[2] = 95;

        System.out.println(marks[0]); 
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        //sort
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] marks1 = {97, 90, 95};

        //2d array
        int[][] finalmarks = {
            {97, 90, 95},
            {85, 80, 75}
        };

        System.out.println(finalmarks[0][0]); // 97
        System.out.println(finalmarks[1][2]); // 75
    }
}