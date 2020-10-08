public class HomeWork6 {
        //I. Create a method to find average of an int-array
        //    public static void arrayAvg(int[] arr) {

    public static double averageArr(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        double aver = (total * 1.0)/arr.length;
        return aver;
    }

    /**Deepak, I did it with enhanced loop, but when I was trying to use a for loop and typing "int i= 0, i<arr.length" condition, it said
     that 'i' is already used and underlined it with red:
     double aver = 0;
        for (int i =0, i < arr.length, i++) {..
     although I just started the code? For the next for loop I, actually, copied the for loop from the previous HW,
     changed variables, and there were no problems with ' i's '.  What was a reason fot that? thank you!
    **/

    //II. String[] names = {"john" , "michael" , "gphilipppre" , "philip" , "ilena" , "palena" , "fahry"}
    // String nameToSearch = "philip";
    // Create a method (NO return) that will print the index of given name in the given array


    public static void indOfName (String[] names, String nameToSearch) {

        int index =0;
        for (int i=0; i< names.length; i++) {
            if (names[i] == nameToSearch) {
                index = i ;
            }
        }
    }
    
    public static void main(String[] args) {

        int[] arr = {3,5,6};
        System.out.println(averageArr(arr));

    }


}
