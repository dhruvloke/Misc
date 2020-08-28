import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
        System.out.println(Chess(3));
    }
    public static int Chess(int n)
    {
        
    }
    public static boolean Check3X3(int x, int y, int n)
    {
        int xc = (n-1) - x;
        int yc = (n-1) - y;
        if(xc < 3 && yc < 3)
        {
            return true;
        }
        return false;
    }
    public static int KM(int x, int y, int n)
    {
        if(x == n -1 && y == n - 1)
        {
            return 0;
        }
        if(Check3X3(x,y,n) == true)
        {
            int xc = (n - 1) - x;
            int yc = (n-1) - y;
            int a = Integer.MAX_VALUE;
            int b = Integer.MAX_VALUE;
            int c = Integer.MAX_VALUE;
            int d = Integer.MAX_VALUE;
            int e = Integer.MAX_VALUE;
            int f = Integer.MAX_VALUE;
            int g = Integer.MAX_VALUE;
            int h = Integer.MAX_VALUE;
            if(xc == 2 && yc == 0)
            {
                a = KM(x+1,y-2,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(yc == 2 && xc == 0)
            {
                System.out.print("X IS " + x + ", ");
                System.out.println("Y IS " + y);
                System.out.println();
                b = KM(x-2,y+1,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(xc == 2 && yc == 2)
            {
                c = KM(x+1,y+2,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(xc == 1 && yc == 0)
            {
                d = KM(x+1,y-2,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(yc == 1 && xc == 0)
            {
                e = KM(x-2,y+1,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(xc == 2 && yc == 1)
            {
                f = KM(x+2,y+1,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(xc == 1 && yc == 2)
            {
                g = KM(x+1,y+2,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            if(xc == 1 && yc == 1)
            {
                h = KM(x-1,y-2,n);
                //System.out.println("A IS " + a);
                //System.out.print("THE LINE IS ");
                System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            }
            
        }
        else 
        {
            int i = Integer.MAX_VALUE;
            int j = Integer.MAX_VALUE;
            int k = Integer.MAX_VALUE;
            int l = Integer.MAX_VALUE;
            if(x < n - 2 && y < n -1)
            {
                i = KM(x + 2,y + 1,n);
            }
            if(x < n - 1 && y < n - 2)
            {
                j = KM(x + 1, y + 2,n)
            }
            if(x >= n - 2 && x < n -1)
            {
                k = KM(y + 2)
            }
            if(y >= n - 2 && y < n - 1)
            {
                l  = KM()
            }
        }
    }
}
