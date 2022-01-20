package String;

public class PrintDuplicate {
    static final int CharLength=256;
    public static void main(String[] args) {
        String str = "test string";
        PrintDuplicateString(str);
    }

    public static void PrintDuplicateString(String str) {
        int count []= new int [CharLength];
        fillCharCount(str,count);
        for(int i=0;i<CharLength;i++){
            if(count[i]>1){
                System.out.println((char)(i)+ " , count = " + count[i]);
            }
        }
    }

    public static void fillCharCount(String str, int[] count) {
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
    }
    
}
