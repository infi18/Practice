import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grades {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        List<Integer> newGrade = new ArrayList<>();
        for (int i : grades) {
            if (i >= 38) {

                if ((i % 5) == 3 || (i % 5) == 4 ){

                    i = (i - (i % 5) + 5) ;
                }

            }

            newGrade.add(i);
        }
                return newGrade;
    }



    public static void main(String[] args) {

        Integer[] grades = {30 , 41 , 78, 94, 52};
        List<Integer> oldGrade = new ArrayList<>(Arrays.asList(grades));
        List<Integer> result = gradingStudents(oldGrade);
        for(int ans: result ){
            System.out.println(ans);
        }

    }
}
