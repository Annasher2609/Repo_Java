package HomeWork9;

import java.util.ArrayList;

public class From_The_Lab {
    //Create a method that is able to find/return the string occurring maximum number of times in given ArrayList.


    public String returnStringMaxTimesOccurring (ArrayList arr) {
       // ArrayList<String> arr = new ArrayList<>();
        arr.add("happy");
        arr.add("grow");
        arr.add("laugh");
        arr.add("grow");
        arr.add("happy");
        arr.add("peace");
        arr.add("happy");
        arr.add("laugh");
        int max =0;
        String maxTimesOccurring = "";
        ArrayList<Integer> res = new ArrayList<>();
        int occurrence =0;
        for(int j =0; j<arr.size(); j++) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(j) == arr.get(i) && j != i ) {
                    occurrence++;
                }
            }res.add(occurrence);
            occurrence =0;
        }
        for (int i=0; i<res.size();i++) {
            if (res.get(i)>max) {
                max= res.get(i);
            }
        }
        int indOfMax = res.indexOf(max);
        maxTimesOccurring = maxTimesOccurring + arr.get(indOfMax);
        return maxTimesOccurring;
    }

}
