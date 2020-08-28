import java.util.ArrayList;
public class MyClass {
    public static ArrayList<Integer>CN;
    public static void main(String args[]) {
        int [][] s = CreateSodoku();
        for(int r = 0;r < 9;r++)
        {
            for(int c = 0; c < 9;c++)
            {
                System.out.print(s[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static int [][] CreateSodoku()
    {
        int [][] matrix = new int [9][9];
        boolean CheckSodoku = false;
        for(int a = 0; a < 9;a++)
        {
            for(int b = 0;b < 9;b++)
            {
                matrix[a][b] = (int)(Math.random()*9) + 1;
            }
        }
        for(int r = 0;r < 9;r++)
        {
            for(int c = 0; c < 9;c++)
            {
                System.out.print(matrix[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }
        while(CheckSodoku == false)
        {
            //System.out.println("CHECK");
            while(CRIS(matrix) != -1)
            {
                int c = CRIS(matrix);
                //System.out.println(c);
                System.out.println("THE ROW THAT NEEDS TO BE FIXED IS " + c);
                for(int d = 0; d < 9;d++)
                {
                    matrix[c][d] = (int)(Math.random()*9) + 1;
                }
                int e = 0;
                System.out.println("THE NEW ROW IS");
                while(e < 9)
                {
                //System.out.print(matrix[c][e]);
                e++;
                }
            }
            while(CCIS(matrix) != -1)
            {
                int e = CCIS(matrix);
                for(int f = 0; f < 9;f++)
                {
                    matrix[f][e] = (int)(Math.random()*9) + 1;
                }
            }
            while(CBIS(matrix) != -1)
            {
                int g = CBIS(matrix);
                if(g == 1)
                {
                    for(int h = 0;h < 3;h++)
                    {
                        for(int i = 0; i < 3;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 2)
                {
                    for(int h = 0;h < 3;h++)
                    {
                        for(int i = 3; i < 6;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 3)
                {
                    for(int h = 0;h < 3;h++)
                    {
                        for(int i = 6; i < 9;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 4)
                {
                    for(int h = 3;h < 6;h++)
                    {
                        for(int i = 0; i < 3;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 5)
                {
                    for(int h = 3;h < 6;h++)
                    {
                        for(int i = 3; i < 6;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 6)
                {
                    for(int h = 3;h < 6;h++)
                    {
                        for(int i = 6; i < 9;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 7)
                {
                    for(int h = 6;h < 9;h++)
                    {
                        for(int i = 0; i < 3;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 8)
                {
                    for(int h = 6;h < 9;h++)
                    {
                        for(int i = 3; i < 6;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
                if(g == 9)
                {
                    for(int h = 6;h < 9;h++)
                    {
                        for(int i = 6; i < 9;i++)
                        {
                            matrix[h][i] = (int)(Math.random()*9) + 1;
                        }
                    }
                }
            }
            CheckSodoku = CS(matrix);
        }
        return matrix;
    }
    public static int CRIS(int [][] matrix)
    {
        CN = new ArrayList<Integer>();
        int a = 0;
        while(a < 9)
        {
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int b = 0; b < 9;b++)
            {
                System.out.println(matrix[a][b]);
                for(int c = 0; c < CN.size();c++)
                {
                   if(matrix[a][b] == CN.get(c))
                   {
                       //System.out.println(CN.get(c));
                       CN.remove(c);
                       c--;
                   }
                }
            }
            if(CN.size() != 0)
            {
            while(CN.size() > 0)
            CN.remove(0);
            return a;
            }
        }
        return -1;
    }
    public static int CCIS(int [][] matrix)
    {
        int a = 0;
        CN = new ArrayList<Integer>();
        while(a < 9)
        {
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int b = 0; b < 9;b++)
            {
                for(int c = 0; c < CN.size();c++)
                {
                   if(matrix[b][a] == CN.get(c))
                   {
                       CN.remove(c);
                   }
                }
            }
            if(CN.size() != 0)
            return a;
            a++;
        }
        return -1;
    }
    public static int CBIS(int [][] matrix)
    {
        CN = new ArrayList<Integer>();
        int a = 1;
        for(int h = 0;h < 3;h++)
        {
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 0; i < 3;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
            
        }
        a++;
        for(int h = 0;h < 3;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 3; i < 6;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 0;h < 3;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 6; i < 9;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 3;h < 6;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 0; i < 3;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 3;h < 6;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 3; i < 6;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 3;h < 6;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 6; i < 9;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 6;h < 9;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 0; i < 3;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 6;h < 9;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 3; i < 6;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size()!= 0)
                {
                    return a;
                }
            }
        }
        a++;
        for(int h = 6;h < 9;h++)
        {
            //CN = new ArrayList<Integer>();
            for(int j = 1;j < 10;j++)
            {
                CN.add(j);
            }
            for(int i = 6; i < 9;i++)
            {
                for(int j = 0; j < CN.size();j++)
                {
                    if(matrix[h][i] == CN.get(j))
                    {
                        CN.remove(j);
                    }
                }
                if(CN.size() != 0)
                {
                    return a;
                }
            }
        }
        return -1;
    }
    public static boolean CS(int [][] matrix)
    {
        if(CRIS(matrix) == -1)
        {
            if(CCIS(matrix) == -1)
            {
                if(CBIS(matrix) == -1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
