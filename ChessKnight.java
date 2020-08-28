public class MyClass {
    public static void main(String args[]) {
        System.out.println(Chess(5));
        System.out.print("THE ANSWER IS ");
    }
    public static int Chess(int n)
    {
        int x = 0;
        int y = 0;
        int m = KM(x,y,n);
        return m;
    }
    public static int KM(int x, int y, int n)
    {
        //System.out.print("X IS " + x + ", ");
        //System.out.println("Y IS " + y);
        //System.out.println();
        if(x == n-1 && y == n-1)
        {
            return 0;
        }
        int xc = (n-1) - x;
        int yc = (n-1) - y;
        int a = Integer.MAX_VALUE;
        //System.out.println(xc);
        //System.out.println(yc);
        //System.out.println("A IS " + a);
        //System.out.println("A IS " + (a - 1));
        int b = Integer.MAX_VALUE;
        
        if (in 3x3 box) {
            do_something:
        } else {
            do_something_else;
        }
        
        if(xc < 3)
        {
            if(yc < 3)
            {
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
                    a = KM(x-2,y+1,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(xc == 2 && yc == 2)
                {
                    a = KM(x+1,y+2,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(xc == 1 && yc == 0)
                {
                    a = KM(x+1,y-2,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(yc == 1 && xc == 0)
                {
                    a = KM(x-2,y+1,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(xc == 2 && yc == 1)
                {
                    a = KM(x+2,y+1,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(xc == 1 && yc == 2)
                {
                    a = KM(x+1,y+2,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
                if(xc == 1 && yc == 1)
                {
                    a = KM(x-1,y-2,n);
                    //System.out.println("A IS " + a);
                    //System.out.print("THE LINE IS ");
                    System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
                }
            }
        }
        if(x < n-2)
        {
            if(y < n-1)
            {
                a = KM(x + 2,y + 1,n);
                //System.out.println(a + " FOR HORIZONTAL UP");
            }
        }
        if(x < n - 1)
        {
            if(y < n - 2)
            {
                b = KM(x + 1,y + 2,n);
                //System.out.println(b + " FOR VERTICAL RIGHT");
            }
        }
        if(a < b && a != Integer.MAX_VALUE)
        {
            //System.out.println("A IS LESS THAN B");
            //System.out.println("A IS " + a);
            //System.out.println("B IS " + b);
            return a + 1;
        }
        else if(b != Integer.MAX_VALUE)
        {
        //System.out.println("B IS LESS THAN OR EQUAL TO A");
        //System.out.println("A IS " + a);
        //System.out.println("B IS " + b);
        return b + 1;
        }
        return b - 1;
    }
}
