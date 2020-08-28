public class MyClass {
    public static void main(String args[]) {
        System.out.println(Chess(5));
    }
    public static int Chess(int n)
    {
        int x = 1;
        int y = 1;
        int m = 0;
        while(x != n && y != n)
        {
            if(TGTBT(x,y,n) == true)
            {
                m += RNOS(x,y,n);
                x = n;
                y = n;
            }
            else
            {
                int temp = x;
                x = (x > y) ? x + 1: x + 2;
                y = (temp > y) ? y + 2: y + 1;
                m++;
            }
        }
        return m;
    }
    /* TGTBT means try get 3 X 3
       RNOS means return # of steps
    */
    public static boolean TGTBT(int x, int y, int n)
    {
        int tbt = n - 2;
        if(x + 2 >= tbt && x + 2 <= n && y + 1 >= tbt && y + 1 <= n)
        {
            return true;
            
        }
        if(x + 1 >= tbt && x + 1 <= n && y + 2 >= tbt && y + 2 <= n)
        {
            return true;
        }
        return false;
    }
    public static int RNOS(int x, int y, int n)
    {
        int nx = n;
        int ny = n;
        if(x + 1 == nx - 2 && y + 2 == ny - 1)
        {
            return 2;
        }
        if(x + 1 == nx - 1 && y + 2 == ny - 2)
        {
           return 2; 
        }
        if(x + 2 == nx - 2 && y + 1 == ny - 1)
        {
            return 2;
        }
        if(x + 2 == nx - 1 && y + 1 == ny - 2)
        {
           return 2; 
        }
        if(x + 1 == nx - 2 && y + 2 == ny)
        {
            return 3;
        }
        if(x + 1 == nx && y + 2 == ny - 2)
        {
           return 3; 
        }
        if(x + 2 == nx - 2 && y + 1 == ny)
        {
            return 3;
        }
        if(x + 2 == nx && y + 1 == ny - 2)
        {
           return 3; 
        }
        if(x + 2 == nx - 1 && y + 1 == ny)
        {
            return 4;
        }
        if(x + 1 == nx - 1 && y + 2 == ny)
        {
            return 4; 
        }
        if(x + 2 == nx&& y + 1 == ny - 1)
        {
            return 4;
        }
        if(x + 1 == nx && y + 2 == ny - 1)
        {
           return 4; 
        }
        if(x + 2 == nx - 2 && y + 1 == ny - 2)
        {
            return 5;
        }
        if(x + 1 == nx - 2 && y + 2 == ny - 2)
        {
           return 5; 
        }
        if(x + 2 == nx - 1 && y + 1 == ny - 1)
        {
            return 5;
        }
        if(x + 1 == nx - 1 && y + 2 == ny - 1)
        {
           return 5; 
        }
        return -1;
    }
}
