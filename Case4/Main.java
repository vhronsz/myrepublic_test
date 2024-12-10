import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int firstSeriesStart = 5;
        int thirdSeriestStart = 1;

        //Print series
        for(int i=0; i < 10; i++){
            if(i == 0){
                System.out.print(firstSeriesStart + " ");
            }else {
                firstSeriesStart += (3);
                System.out.print(firstSeriesStart + " ");
            }
        }
        System.out.println("");

        //Print series
        int secondSeriesStart = 5;
        int add = 3;
        for(int i=0; i < 10; i++){
            if(i == 0 ){
                System.out.print(secondSeriesStart + " ");
            }else{
                System.out.print(secondSeriesStart+add + " ");
                secondSeriesStart = secondSeriesStart+add;
                add+=2;
            }
        }
        System.out.println("");
        //Print series
        for(int i=1; i <= 10; i++){
            System.out.print(i*i + " ");
        }
    }
}
