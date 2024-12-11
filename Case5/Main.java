import java.util.ArrayList;
import java.util.List;

public class Main {
    static void alphabeticPyramid(){
        int startingAscii = 65;
        int totalPrinted = 1;
        int columnLength = 5;
        int rowLength = 9;
        int emptySpaceLength = columnLength -1;

        for(int i = 0; i< columnLength;i++){
            int printed = 0;
            for(int j=0; j< rowLength; j++) {
                if(j < emptySpaceLength){
                    System.out.print(" ");
                }else if(printed < totalPrinted){
                    System.out.print(Character.toChars(startingAscii));
                    printed++;
                    startingAscii++;
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            totalPrinted += 2;
            emptySpaceLength--;
            System.out.println();
        }
    }



    static List<Integer> getPascalTriangleRow(int depth){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 1; i <= depth; i++) {
            int previous = list.get(i-1);
            int current = previous * (depth - i + 1) / i;
            list.add(current);
        }
        return list;
    }

    static void pascalTriangle(int depth){
        int totalPrinted = 1;

        int emptySpaceLength = depth -1;

        for(int i = 0; i < depth; i++){
            int printed = 0;
            List<Integer> fibonacciSequence = getPascalTriangleRow(i);
            for(int j=0; j< depth; j++) {
                int toPrint = fibonacciSequence.get(printed);
                if(j < emptySpaceLength){
                    System.out.print(" ");
                }else if(printed <= totalPrinted){
                    System.out.print(toPrint);
                    System.out.print(" ");
                    printed++;
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            totalPrinted += 1;
            emptySpaceLength--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphabeticPyramid();
        System.out.println("###########################################");
        pascalTriangle(7);
    }
}
