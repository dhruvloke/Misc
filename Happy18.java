import java.util.ArrayList;
public class MyClass {
    private static ArrayList<Integer>HappyNumbers;
    private static ArrayList<Integer>EndlessLoop;
    public static void main(String args[]) {
        Happy18(390,571);
    }
    public static void Happy18(int start, int finish)
    {
        HappyNumbers = new ArrayList<Integer>();
        EndlessLoop = new ArrayList<Integer>();
        //EndlessLoop.add(0);
        for(int i = start; i <= finish;i++)
        {
            int index = EndlessLoop.size();
            ASOD(i,i,index);
        }
        for(int c = 0;c < HappyNumbers.size();c++)
        {
            System.out.println(HappyNumbers.get(c));
        }
        
    }
    public static void ASOD(int i, int original,int index)
    {
        int copy = i;
        int SquareSum = 0;
        while(copy != 0)
        {
            SquareSum += (copy % 10) * (copy % 10);
            copy /= 10;
        }
        CheckIfOne(i, SquareSum,original,index);
        
    }
    public static void CheckIfOne(int i, int copy1, int original,int index)
    {
        if(copy1 == 1)
        {
            HappyNumbers.add(original);
            for(int m = EndlessLoop.size()-1;m >= index;m--)
            {
                EndlessLoop.remove(m);
                
            }
            return;
        }
        else
        {
            CheckIfEndless(copy1,original,index);
        }
    }
    public static void CheckIfEndless(int copy2, int original,int index)
    {
        for(int i = 0; i < EndlessLoop.size();i++)
        {
            if(copy2 == EndlessLoop.get(i))
            {
                return;
            }
        }    
        EndlessLoop.add(copy2);
        //for(int c = 0;c < EndlessLoop.size();c++)
        //{
        //    System.out.println(EndlessLoop);
        //}
        ASOD(copy2,original,index);
    }
}
