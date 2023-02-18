import java.util.Arrays;

public class ToCheckAnagramString {

    public static void main(String args[]) {

        String st1 ="Heart";
        String st2 ="traeH";
        System.out.println(st1);
        System.out.println(st2);

        st1 = st1.toLowerCase();
        st2 = st2.toLowerCase();

        if(st1.length()==st2.length()){

            char ch1[] = st1.toCharArray();
            char ch2[] = st2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean result = Arrays.equals(ch1, ch2);
            if(result){
                System.out.println("Strings are Anagrams");
            }
            else{
                System.out.println("Strings are not Anagrams");
            }
        }
        else{
            System.out.println("Strings are not Anagrams");
        }


        
    }
    
}
