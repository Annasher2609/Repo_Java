public class MathLibrary {
    //add two int numbers

    public int addTwo (int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    // sub two ints
    public int subTwo (int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    public int multiplyTwo (int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    public double divideTwo (int num1, int num2) {
        double result = 0.00;
        if (num2 != 0) {
            result = (num1 * 1.0) / num2;
        }
        return result;
    }

    public String findDuplicates(String[] arr) {
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j< arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    res = arr[j];
                }
            }
        }
        return res;
    }

    //String [] dub = res.split(" ");
        //for (int i=0; i< dub.length; i++) {
      //  for (int j =i+1; j< dub.length; j++) {
        //    if (dub[i].equalsIgnoreCase(dub[j])) { //System.out.println();
           //     abc = abc + dub - dub[j];
             //   i++;
              //  break;
       // return abc;




}
