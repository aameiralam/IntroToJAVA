package Day3and4;

public class JumpingStatements {
    public static void main(String[] args) {

//        break; to stop the loop

        for(int i=0; i<100;i++){
            if(i==28){
                System.out.println(i);
                break;
            }
        }

//        continue; to skip the current iteration


        for(int x=1; x<20;x++){
            if(x%3==0 || x%4==0){
                System.out.println("skipped");
                continue;


            }
            System.out.println(x);
        }








    }
}
