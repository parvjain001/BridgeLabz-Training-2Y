public class PenDivision {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;       // Division Operator
        int remainingPens = totalPens % students;         // Modulus Operator
        System.out.println(
            "The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens
        );
    }
}
