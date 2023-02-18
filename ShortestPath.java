public class ShortestPath {

    public static double ShortPath(String st) {

        int x =0;
        int y=0;

        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch=='N')
            {
                y++;
            }
            else if(ch=='S')
            {
                y--;
            }
            else if(ch=='E')
            {
                x++;
            }
            else
            {
                x--;
            }
        }
        int X1 = x*x;
        int Y1 = y*y;

        double ans =  Math.sqrt(X1+Y1);

        return ans;

        
    }

    public static void main(String args[]) {

        String st = "NS";
       System.out.println(ShortPath(st)); 
        
    }
    
}
