
public class MyClass {
    private static int finder;
    public static void main(String args[]) {
        int [] sorted = {1,2,3,4,5,6,7,8};
        finder = 0;
        System.out.println(BS(1,sorted,finder));
    }
    
    public static int BS(int x,int [] sorted,int slider)
    {
        int middle = sorted.length/2;
        System.out.println("MIDDLE IS " + middle);
        finder += slider;
        System.out.println(finder);
        if(sorted.length == 1)
        {
            if(sorted[0] == x)
            {
                System.out.println("1. THE INDEX IS " + finder);
                return finder;
            }
        }
        else if(sorted.length % 2 == 1)
        {
            //System.out.println("THE ARRAY LENGTH IS " + sorted.length);
            if(sorted[middle] == x)
            {
                finder += middle;
                System.out.println("2. THE INDEX IS " + finder);
                return finder;
            }
            else if(sorted[middle] < x)
            {
                int [] temp = new int [middle];
                int j = 0;
                for(int i = middle;i < sorted.length;i++)
                {
                    temp[j] = sorted[i];
                    j++;
                }
                System.out.println("1. RECURSION BC " + x + " IS MORE THAN " + sorted[middle]);
                int a = 0;
                while(a < temp.length)
                {
                System.out.print(temp[a]);
                a++;
                }
                System.out.println();
                return (BS(x,temp,middle));
            }
            else
            {
                int [] temp = new int [middle];
                int j = 0;
                for(int i = 0; i < middle;i++)
                {
                    temp[j] = sorted[i];
                    j++;
                }
                System.out.println("2. RECURSION BC " + x + " IS LESS THAN " + sorted[middle]);
                int a = 0;
                while(a < temp.length)
                {
                System.out.print(temp[a]);
                a++;
                }
                System.out.println();
                return (BS(x,temp,0));
            }
        }
        else if(sorted.length % 2 == 0)
        {
            //System.out.println("THE ARRAY LENGTH IS " + sorted.length);
            if(sorted[middle] == x)
            {
                finder += middle;
                System.out.println("3. THE INDEX IS " + finder);
                return finder;
            }
            else if(sorted[middle] < x)
            {
                int [] temp = new int [middle];
                int j = 0;
                for(int i = middle;i < sorted.length;i++)
                {
                    temp[j] = sorted[i];
                    j++;
                }
                System.out.println("RECURSION BC " + x + " IS MORE THAN " + sorted[middle]);
                int a = 0;
                while(a < temp.length)
                {
                System.out.print(temp[a]);
                a++;
                }
                System.out.println();
                return (BS(x,temp,middle));
            }
            else
            {
                int [] temp = new int [middle];
                int j = 0;
                for(int i = 0; i < middle;i++)
                {
                    temp[j] = sorted[i];
                    j++;
                }
                System.out.println("RECURSION BC " + x + " IS LESS THAN " + sorted[middle]);
                int a = 0;
                while(a < temp.length)
                {
                System.out.print(temp[a]);
                a++;
                }
                System.out.println();
                return (BS(x,temp,0));
            }
        }
        System.out.println(-1);
        return -1;
    }
}
