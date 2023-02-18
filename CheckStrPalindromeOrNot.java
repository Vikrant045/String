 public class CheckStrPalindromeOrNot{

    public static boolean CheckStrPalindrome(String st) {
int i =0;
    int last = st.length()-1;
    while(i<=last){
        if(st.charAt(i)==st.charAt(last)){
            i++;
            last--;
            return true;

        }
        else{
            break;
        }
    }
    return false;
        
    }

    public static void main(String args[]) {

        String st ="VIKRant";
       System.out.println(CheckStrPalindrome(st)); 


        
    }
 }