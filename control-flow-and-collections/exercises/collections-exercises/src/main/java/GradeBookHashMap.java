import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBookHashMap {

    public HashMap<Integer, String> buildRoster(String name, int Id) {

        HashMap<Integer, String> roster = new HashMap<>();
        String student;
        int id;

        Scanner input = new Scanner(System.in);
        input.useDelimiter(",");

        System.out.println("Enter Student Id and Student name seperated by a comma: ");

        do {
            student = input.nextLine();
            id = input.nextInt();

            if (!student.equals("")) {
                roster.put(id, student);
            }
        } while (!student.equals(""));

        input.close();

        return roster;
    }

    public static void printRoster(HashMap<Integer, String> roster) {

        for (Map.Entry<Integer, String> student : roster.entrySet()) {
            System.out.println("Class Roster: \nStudent: " + student.getValue() + "ID: " + student.getKey());
        }

    }
}
