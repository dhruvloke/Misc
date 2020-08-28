import java.util.ArrayList;
public class MyClass {
    private static ArrayList<Integer>CheckNumber;
    public static void main(String args[]) {
        int [][] matrix = new int [9][9];
        matrix[0][0] = 5; 
        matrix[0][1] = 8;
        matrix[0][2] = 6;
        matrix[0][3] = 3;
        matrix[0][4] = 7; 
        matrix[0][5] = 4;
        matrix[0][6] = 9;
        matrix[0][7] = 1;
        matrix[0][8] = 2; 
        matrix[1][0] = 1;
        matrix[1][1] = 3;
        matrix[1][2] = 7;
        matrix[1][3] = 9; 
        matrix[1][4] = 5;
        matrix[1][5] = 2;
        matrix[1][6] = 8;
        matrix[1][7] = 6;
        matrix[1][8] = 4;
        matrix[2][0] = 2; 
        matrix[2][1] = 4;
        matrix[2][2] = 9;
        matrix[2][3] = 8;
        matrix[2][4] = 1; 
        matrix[2][5] = 6;
        matrix[2][6] = 5;
        matrix[2][7] = 7;
        matrix[2][8] = 3; 
        matrix[3][0] = 8;
        matrix[3][1] = 7;
        matrix[3][2] = 2;
        matrix[3][3] = 5; 
        matrix[3][4] = 4;
        matrix[3][5] = 3;
        matrix[3][6] = 1;
        matrix[3][7] = 9;
        matrix[3][8] = 6;
        matrix[4][0] = 6; 
        matrix[4][1] = 9;
        matrix[4][2] = 3;
        matrix[4][3] = 7;
        matrix[4][4] = 8; 
        matrix[4][5] = 1;
        matrix[4][6] = 2;
        matrix[4][7] = 4;
        matrix[4][8] = 5; 
        matrix[5][0] = 4;
        matrix[5][1] = 1;
        matrix[5][2] = 5;
        matrix[5][3] = 6; 
        matrix[5][4] = 2;
        matrix[5][5] = 9;
        matrix[5][6] = 7;
        matrix[5][7] = 3;
        matrix[5][8] = 8;
        matrix[6][0] = 9; 
        matrix[6][1] = 5;
        matrix[6][2] = 4;
        matrix[6][3] = 2;
        matrix[6][4] = 3; 
        matrix[6][5] = 7;
        matrix[6][6] = 6;
        matrix[6][7] = 8;
        matrix[6][8] = 1; 
        matrix[7][0] = 7;
        matrix[7][1] = 2;
        matrix[7][2] = 1;
        matrix[7][3] = 4; 
        matrix[7][4] = 6;
        matrix[7][5] = 8;
        matrix[7][6] = 3;
        matrix[7][7] = 5;
        matrix[7][8] = 9;
        matrix[8][0] = 3;
        matrix[8][1] = 6;
        matrix[8][2] = 8;
        matrix[8][3] = 1; 
        matrix[8][4] = 9;
        matrix[8][5] = 5;
        matrix[8][6] = 4;
        matrix[8][7] = 2;
        matrix[8][8] = 7;
        System.out.println(CheckSodoku(matrix));
        }
    public static String CheckSodoku(int [][] matrix)
    {
        for(int x = 0; x < matrix.length;x++)
        {
            for(int y = 0; y < matrix.length;y++)
            {
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int [] row = new int [9];
        for(int r = 0; r < matrix.length;r++)
        {
            for(int c = 0; c < matrix.length;c++)
            {
                row[c] = matrix[r][c];
                //System.out.println(row[c]);
            }
            if(CheckRow(row) == false)
            {
                //System.out.println("CHECK");
                return "THIS IS NOT A SODOKU";
            }
        }
        int [] column = new int [9];
        int a = 0;
        while(a < 9)
        {
            for(int c = 0; c < matrix.length;c++)
            {
                column[c] = matrix[c][a];
            }
            if(CheckColumn(column) == false)
            {
                System.out.println("CHECK COLUMN " + a);
                return "THIS IS NOT A SODOKU";
            }
            a++;
        }
        int b = 0;
        int first = 0;
        int second = 0;
        int [] box = new int [9];
        while(b < 3)
        {
            int e = 0;
            for(int c = first; c < first + 3;c++)
            {
                for(int d = second;d < second + 3;d++)
                {
                    //System.out.println(c);
                    //System.out.println(d);
                    box[e] = matrix[c][d];
                    e++;
                }
            }
            second += 3;
            if(CheckBox(box) == false)
            {
                System.out.println("CHECK BOX " + b);
                return "THIS IS NOT A SODOKU";
            }
            b++;
        }
        first = 3;
        second = 0;
        while(b < 6)
        {
            int e = 0;
            for(int c = first; c < first + 3;c++)
            {
                for(int d = second;d < second + 3;d++)
                {
                    //System.out.println(c);
                    //System.out.println(d);
                    box[e] = matrix[c][d];
                    e++;
                }
            }
            second += 3;
            if(CheckBox(box) == false)
            {
                System.out.println("CHECK BOX " + b);
                return "THIS IS NOT A SODOKU";
            }
            b++;
        }
        first = 6;
        second = 0;
        while(b < 9)
        {
            int e = 0;
            for(int c = first; c < first + 3;c++)
            {
                for(int d = second;d < second + 3;d++)
                {
                    //System.out.println(c);
                    //System.out.println(d);
                    box[e] = matrix[c][d];
                    e++;
                }
            }
            second += 3;
            if(CheckBox(box) == false)
            {
                System.out.println("CHECK BOX " + b);
                return "THIS IS NOT A SODOKU";
            }
            b++;
        }
        return "THIS IS A SODOKU";
    }    
    public static boolean CheckRow(int [] row)
    {
        CheckNumber = new ArrayList<Integer>();
        for(int j = 0; j < 9;j++)
        {
            CheckNumber.add(j+1);
            //System.out.println(CheckNumber.get(j));
        }
        int a = 0;
        while(a < 9)
        {
        for(int i = 0; i < CheckNumber.size();i++)
        {
            if(row[a]== CheckNumber.get(i))
            {
                //System.out.println(row[a]);
                //System.out.println(CheckNumber.get(i));
                CheckNumber.remove(i);
            }
        }
        a++;
        }
        if(CheckNumber.size() != 0)
        return false;
        return true;
    }
    public static boolean CheckColumn(int [] column)
    {
        CheckNumber = new ArrayList<Integer>();
        for(int j = 1; j < 10;j++)
        {
            CheckNumber.add(j);
        }
        int a = 0;
        while(a < 9)
        {
        for(int i = 0; i < CheckNumber.size();i++)
        {
            if(column[a]== CheckNumber.get(i))
            CheckNumber.remove(i);
        }
        a++;
        }
        if(CheckNumber.size() != 0)
        return false;
        return true;
    }
    public static boolean CheckBox(int [] box)
    {
        int z = 0;
        while(z < 9)
        {
            //System.out.println(box[z]);
            z++;
        }
        CheckNumber = new ArrayList<Integer>();
        for(int j = 1; j < 10;j++)
        {
            CheckNumber.add(j);
        }
        int a = 0;
        while(a < 9)
        {
        for(int i = 0; i < CheckNumber.size();i++)
        {
            if(box[a]== CheckNumber.get(i))
            CheckNumber.remove(i);
        }
        a++;
        }
        if(CheckNumber.size() != 0)
        return false;
        return true;
    }
}
