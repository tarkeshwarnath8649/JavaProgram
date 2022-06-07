package NumberPrograms;

public class FindMissingNo {

    public static void main(String[] args) {

        int a = 12345789;
        int b =a;

        int count = 0;
        while (a != 0) {
            a = a / 10;
            ++count;
        }

        int total = (count + 1) * (count + 2) / 2;
        
        while(b!=0){
            int digit = b%10;
            total -=digit;
            b=b/10;
        }
        System.out.println(total);
    }

}
