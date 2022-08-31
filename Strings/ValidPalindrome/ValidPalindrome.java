package ValidPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String lc = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        char[] ch = lc.toCharArray();
        char[] ch2;
        for(int i = 0;i<s.length();i++){
            if(ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122 || ch[i] >=48 && ch[i] <= 57){
                str.append(ch[i]);
            }
        }
        char[] fch = new char[str.length()];

        str.getChars(0,str.length(),fch,0);

        for(int i=0;i<fch.length;i++){
            System.out.print(fch[i]);
        }

        int start = 0;
        int end = fch.length-1;

        while(start <= end){
            if(fch[start]!=fch[end]){
                System.out.println("false");
            }
            else{
                start++;
                end--;
            }

        }

        System.out.println("true");

       // System.out.println("-------");


       // System.out.println(str);


    }
}
