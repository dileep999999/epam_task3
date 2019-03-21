/*sorting the array #epam_task6*/

import java.util.*;
public class SortTheArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Demo2 d=new Demo2();
             d.store(a,n,k);
             
    }
    
}
  class Demo2
{
    void store(int a[],int n, int k)
    {
        HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
        ArrayList<Integer>  al=new ArrayList<Integer>();
        for(int j=0;j<n;j++)
        {
            m.put(a[j],a[j]%k);
            al.add(a[j]);
        }
        Sort1 sort=new Sort1(m);
        Collections.sort(al,sort);
        for(int r:al)
        {
            System.out.print(r+" ");
        }
        
    }
}
 class Sort1   implements Comparator<Integer>
{
       private final Map<Integer,Integer> fm;
       Sort1(Map<Integer,Integer> m)
       {
           fm=m;
       }
       public int compare(Integer k1,Integer k2)
       {
             int valuecmp=fm.get(k2).compareTo(fm.get(k1));
             int keycmp=k1.compareTo(k2);
             if(valuecmp==0)
                return keycmp;
             else
                 return valuecmp;
       }             
       
}