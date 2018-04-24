import Interview.Interview;
import Robot.Robot;

import java.util.List;

public class Main {

    // In Config auslagern
    private static String InterviewPath = "Interviews\\";
    // In Config auslagern

    public static List<Robot> Robots;
    public static List<Interview> AlleInterviews;
    public static Interview CurrentInterview;

    public static void main()
    {

    System.out.println("Bitte wählen Sie eine Interview-ID zum abspielen aus:");
    AlleInterviews = Interview.GetAllInterviews();

    for(Interview IteratedInterview: AlleInterviews)
    {
    IteratedInterview.print();
    }

    int input_ID = Integer.parseInt(System.console().readLine());
    CurrentInterview = Interview.FincInterview(input_ID, AlleInterviews);

    }


}
