import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
        String [][] matrix = new String [3][3];
        matrix[0][0] = "o";
        matrix[0][1] = "i";
        matrix[0][2] = "x";
        matrix[1][0] = "o";
        matrix[1][1] = "n";
        matrix[1][2] = "o";
        matrix[2][0] = "i";
        matrix[2][1] = "z";
        matrix[2][2] = "i";
        ArrayList<String>B = Boggle(matrix);
        for(int i = 0; i < B.size();i++)
        {
            System.out.println(B.get(i));
        }
    }
    public static void PrintArrayList(ArrayList<String>array)
    {
        //System.out.println("THE ARRAY SIZE IS " + array.length);
        for(int y = 0; y < array.size();y++)
        {
            System.out.print(array.get(y) + " ");
        }
        System.out.println();
        //System.out.print("THE LINE IS ");
        //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
    }
    public static ArrayList<String> Boggle(String [][] matrix)
    {
        for(int x = 0; x < matrix.length;x++)
        {
            for(int y = 0; y < matrix.length;y++)
            {
                System.out.print(matrix[x][y]);
                System.out.print(" ");
            }
            System.out.println();
        }
        ArrayList<String>Words = new ArrayList<String>();
        for(int r = 0; r < matrix.length;r++)
        {
            for(int c = 0; c < matrix.length;c++)
            {
                //System.out.println("THE NEW LETTER IS " + matrix[r][c]);
                ArrayList<String>TEMP = new ArrayList<String>();
                TEMP = AWFSL(r,c,matrix);
                //System.out.println(TEMP.size());
                for(int i = 0;i < TEMP.size();i++)
                {
                    //System.out.println();
                    String temp = TEMP.get(i);
                    if(temp.length() >= 3)
                    {
                        int checker = 0;
                        for(int j = 0; j < Words.size();j++)
                        {
                            if(Words.get(j).equals(temp) == true)
                            {
                                checker++;
                            }
                        }
                        if(checker == 0)
                        {
                            Words.add(temp);
                        }
                    }
                }
            }
        }
        return Words;
    }
    public static ArrayList<String> AWFSL(int x, int y, String [][] matrix)
    {
        //System.out.println("THE STARTING POSITION IS " + matrix[x][y]);
        ArrayList<String>ALO = new ArrayList<String>();
        ArrayList<Integer>XI = new ArrayList<Integer>();
        ArrayList<Integer>YI = new ArrayList<Integer>();
        String a = CP(x,y,x-1,y-1,matrix);
        String b = CP(x,y,x-1,y,matrix);
        String c = CP(x,y,x-1,y+1,matrix);
        String d = CP(x,y,x,y+1,matrix);
        String e = CP(x,y,x+1,y+1,matrix);
        String f = CP(x,y,x+1,y,matrix);
        String g = CP(x,y,x+1,y-1,matrix);
        String h = CP(x,y,x,y-1,matrix);
        ALO.add(a);
        XI.add(x-1);
        YI.add(y-1);
        ALO.add(b);
        XI.add(x-1);
        YI.add(y);
        ALO.add(c);
        XI.add(x-1);
        YI.add(y+1);
        ALO.add(d);
        XI.add(x);
        YI.add(y+1);
        ALO.add(e);
        XI.add(x+1);
        YI.add(y+1);
        ALO.add(f);
        XI.add(x+1);
        YI.add(y);
        ALO.add(g);
        XI.add(x+1);
        YI.add(y-1);
        ALO.add(h);
        XI.add(x);
        YI.add(y-1);
        for(int i = 0; i < ALO.size();i++)
        {
            if(ALO.get(i).equals("hello") == true)
            {
                ALO.remove(i);
                XI.remove(i);
                YI.remove(i);
                i--;
            }
            else
            {
                //System.out.println(ALO.get(i));
            }
        }
        if(ALO.size() == 0)
        {
            ALO.add(matrix[x][y]);
            return ALO;
        }
        ArrayList<String>WF = new ArrayList<String>();
        //System.out.println("THE ORIGINAL IS " + matrix[x][y]);
        //System.out.println("ALO CONTAINS ");
        //PrintArrayList(ALO);
        for(int j = 0; j < ALO.size();j++)
        {
            //System.out.print("POSITION J IS ");
            //System.out.println(ALO.get(j));
            ArrayList<String>TEMP = new ArrayList<String>();
            //System.out.println("THE NEW START IS " + ALO.get(j));
            TEMP = AWFSL(XI.get(j),YI.get(j),matrix);
            //System.out.println("TEMP CONTAINS ");
            //PrintArrayList(TEMP);
            //System.out.println(TEMP.size());
            for(int l = 0; l < TEMP.size();l++)
            {
                //System.out.println("THE ORIGINAL IS " + matrix[x][y]);
                WF.add(matrix[x][y] + TEMP.get(l));
                //System.out.println("PART OF THE WORD IS " + WF.get(WF.size()-1));
            }
        }
        if(WF.size() == 0)
        {
            //System.out.print("THE LINE IS ");
            //System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
            //System.out.println("ALO CONTAINS ");
            //PrintArrayList(ALO);
            return ALO;
        }
        //System.out.println("WF CONTAINS ");
        //PrintArrayList(WF);
        return WF;
    }
    public static String CP(int x, int y, int nx, int ny,String [][] matrix)
    {
        if(nx >= matrix.length || ny >= matrix.length || nx < 0 || ny < 0)
        {
            return "hello";
        }
        //System.out.println("X IS " + x);
        //System.out.println("Y IS " + y);
        //System.out.println("NX IS " + nx);
        //System.out.println("NY IS " + ny);
        if(matrix[nx][ny].compareTo(matrix[x][y]) > 0)
        {
            //System.out.println("(" + nx + "," + ny + ") = " + matrix[nx][ny]);
            //System.out.println("COMPARE TO " + matrix[x][y]);
            return matrix[nx][ny];
        }
        return "hello";
    }
}
