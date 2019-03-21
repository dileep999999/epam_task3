
/* Rod cutting problem #epam_task1*/
import java.util.*;

public class Epam_task {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner sc=new Scanner(System.in);
        int cnt;
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {   cnt=-1;
            int n=sc.nextInt();
            n=n+1;
            while(n>1)
            {   cnt++;
              // n=(int)Math.ceil(((double)n)/2);}
               n=n/2;
            }
            System.out.println(cnt);
        }
    }
    
}
