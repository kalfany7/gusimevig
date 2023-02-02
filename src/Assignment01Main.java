import java.util.Scanner;

public class Assignment01Main {
    public static void main(String[] args)
    {
        System.out.println("Please input group size:");
        Scanner input = new Scanner(System.in);
        int groupSize = input.nextInt();
        System.out.println("The group has " + groupSize + " students.");

        Group newGroup = new Group(groupSize);

        for (int i = 0; i < groupSize; i++)
        {
            Student tempStudent = new Student(input.nextInt(), input.next(), input.next());
            newGroup.addToGroup(tempStudent);
        }

        for (int i = 0; i < groupSize; i++) {
            System.out.println(newGroup.students[i].getName() + ", s" + newGroup.students[i].getSnumber());
        }

        int Snumber = input.nextInt();

        while (Snumber > 0)
        {
            int i = 0;
            Student tempStudent = new Student(Snumber, input.next(), input.next());
            while (i < newGroup.students.length)
            {
                if (tempStudent.Snumber == newGroup.students[i].Snumber)
                {
                    newGroup.students[i].changeName(tempStudent.firstName, tempStudent.lastName);
                    i = newGroup.students.length;
                } else {
                i++;
                }
            }
            Snumber = input.nextInt();
        }
        
        for (int i = 0; i < groupSize; i++) {
            System.out.println(newGroup.students[i].getName() + ", s" + newGroup.students[i].getSnumber());
        }

        input.close();
    }
}

