package HomeWork.Day2;

public class Argentina {

    private String playerFirstName;
    private String playerLastName;
    private double playerSalary;
    private int trainingDays;
    static String TeamName;


    public String getPlayerFirstName(){
        return playerFirstName;
    }

    public void updatePlayerFirstName(String inputPlayerFirstName){
        playerFirstName=inputPlayerFirstName;
    }

    public String getPlayerLastName(){
        return playerLastName;
    }

    public void updatePlayerLastName(String inputPlayerLastName){
        playerLastName=inputPlayerLastName;
    }
    public double getPlayerSalary(){
        return playerSalary;
    }

    public void updatePlayerSalary(double inputPlayerSalary){
        playerSalary=inputPlayerSalary;
    }
    public int getTrainingDays(){
        return trainingDays;
    }

    public void updateTrainingDays(int inputTrainingDays){
        trainingDays=inputTrainingDays;
    }

    public static String getTeamName(){
        return TeamName;
    }

    public void updateTeamName(String inputTeamName){
        TeamName=inputTeamName;
    }



}
