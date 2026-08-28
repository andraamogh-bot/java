public class StudentMarksArray {
    public static void main(String[] args) {
        int[] marks = {80 , 75, 90, 65, 85};

        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total Marks = " + total);
    }
}
