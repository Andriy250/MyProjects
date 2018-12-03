public class Main {

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("vova");
        StringBuilder origin = new StringBuilder(str);
        StringBuilder[] arr = new StringBuilder[str.length()];
        arr[0] = new StringBuilder(str);
        for(int i = 1; i < str.length(); ++i){
            char firstChar = str.charAt(0);
            str.deleteCharAt(0);
            str.append(firstChar);
            arr[i] = new StringBuilder(str);
        }

        print(arr);

        sort(arr);

        System.out.println("\n\n\n\n");

        print(arr);

        StringBuilder tempStr = new StringBuilder();
        int rightNumber = 0;
        String lastChars = "";
        for (int i =0 ; i < arr.length; ++i){
            rightNumber = (arr[i].toString().equals(origin.toString()))? i + 1 : rightNumber;
            lastChars += arr[i].charAt(str.length() - 1);
        }
        System.out.println(lastChars + ", " + rightNumber);


    }

    private static void print(StringBuilder[] arr){
        for(StringBuilder temp : arr){
            System.out.println(temp);

        }
    }

    private static void sort(StringBuilder[] arr){
        for(int i = 0; i < arr.length; ++i){
            int counter = 0;
            for(int j = 1; j < arr.length; ++j){
                if (arr[j - 1].charAt(counter) > arr[j].charAt(counter)){
                    StringBuilder temp = new StringBuilder(arr[j - 1]);
                    arr[j - 1] = new StringBuilder(arr[j]);
                    arr[j] = new StringBuilder(temp);
                    counter = 0;
                } else if (arr[j - 1].charAt(counter) == arr[j].charAt(counter)){
                    counter = 1;
                    j--;
                }
            }
        }
    }
}
