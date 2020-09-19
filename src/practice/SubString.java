package practice;

/*
* #392 判断子串
* "sdf","sdff"==>true
* "sdf","sffd"==>false
*/
public class SubString {
//    双指针
    public static boolean test(String s,String t){
        if (s.equals("")){
            return true;
        }
        int j=0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j)==t.charAt(i)){
                   j++;
                   if (j==s.length()){
                       return true;
                   }
            }
        }return false;
    }

    public static void main(String[] args) {
        System.out.println(test("acb", "sabcafsd"));
    }


}
