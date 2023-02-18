public class StringCompression {

    public static String  compress(String str) {

        StringBuilder comp = new StringBuilder("");
       
        for(int i=0 ;i<str.length();i++){
            int count =1;
            while(i<str.length()-1 &&  str.charAt(i)==str.charAt(i+1) ){
                count ++;
                i++;
            }
            comp.append(str.charAt(i));
            if(count>1){
                comp.append(count);

            }
        }
        return comp.toString();
        
    }
    public static void main(String args[]) {
        String str ="abbbbcccdddeefgghii";
        System.out.println(str);
        System.out.println(compress(str));
        
    }
    
}
