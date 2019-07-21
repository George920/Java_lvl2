

public class Main {
    public static void main(String[] args) {
        String str1 = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0"; // normal process
        String str2 = "l 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0"; // NumberFormatException
        String str3 = "1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0\n5 6 0 2"; // ArrayIndexOutOfBoundsException
        //printArr(stringToArr(str1));
        System.out.println(stringArrToInt(stringToArr(str1)));
        //System.out.println(stringArrToInt(stringToArr(str2)));
        //System.out.println(stringArrToInt(stringToArr(str3)));


    }

    static String[][] stringToArr (String str) {
        String[] arr = str.split("\n");
        String[][] result = new String[arr.length][arr.length];
          try {
              for (int i = 0; i < arr.length; i++) {
                  String[] arrSpace = arr[i].split(" ");
                  for (int j = 0; j < arr.length; j++) {
                      result[i][j] = arrSpace[j];
                  }
              }
          } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("stringToArr: " + e);
              e.printStackTrace();
              System.exit(0);
          }
        return result;
    }

    static int stringArrToInt(String[][] arr){
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    sum+= Integer.parseInt(arr[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("stringArrToInt: " + e);
            e.printStackTrace();
            System.exit(0);
        }
        return sum/2;
    }

    static void printArr (String[][] arr){
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println();
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }        System.out.println();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("printArr: " + e);
            e.printStackTrace();
            System.exit(0);
        }
    }
}
