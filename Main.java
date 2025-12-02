import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        StudentDAO sdao = new StudentDAO();
        ResultDAO rdao = new ResultDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Result Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Result");
            System.out.println("6. View Results");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    sdao.addStudent(new Student(id, name, course));
                    break;

                case 2:
                    sdao.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    sdao.updateStudent(uid, newName);
                    break;

                case 4:
                    System.out.print("Enter ID to Delete: ");
                    int did = sc.nextInt();
                    sdao.deleteStudent(did);
                    break;

                case 5:
                    System.out.print("Enter Student ID: ");
                    int rid = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    rdao.addResult(new Result(rid, marks, ""));
                    break;

                case 6:
                    rdao.viewResults();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
