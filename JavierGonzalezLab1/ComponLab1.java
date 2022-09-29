
import java.util.ArrayList;

public class ComponLab1 {

    public static void main(String[] args) {

        StudentTest St = new StudentTest();

        for(int i=0;i<St.sList.size();i++){
            System.out.printf("%04d, %-12s", St.sList.get(i).ID,
                    St.sList.get(i).lastName, args);
            for(int j=0;j<St.sList.get(i).courses.size();j++){
                System.out.printf("%s",St.sList.get(i).courses.get(j), args);
                if(j<St.sList.get(i).courses.size()-1)
                    System.out.printf(", ");
                else
                    System.out.printf("\n");
            }
        }
    }
    
}
