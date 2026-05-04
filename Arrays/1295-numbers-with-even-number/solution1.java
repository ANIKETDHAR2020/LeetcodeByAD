public class Evenno {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        int result = findnums(nums);
        System.out.println("Count: " + result);
    }

    static boolean even(int num){
        int numberofdigits = digits(num);
        return numberofdigits % 2 == 0;
    }

    static int digits(int num){
        if(num < 0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

    static int findnums(int[] nums){
        int count = 0;

        for(int num : nums){
            if(even(num))
                count++;
        }

        return count;
    }
}
