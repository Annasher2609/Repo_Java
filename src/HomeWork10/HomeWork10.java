package HomeWork10;

import java.util.*;

public class HomeWork10 {
    //from the class Nov 2nd

    //Create a method which can tell if given List<Integer> contains duplicate data or not.
    //      Input: List<Integer>
    //      Return type: boolean
    public boolean ifAnyDoubles (List<Integer> myList) {
        HashSet<Integer> mySet = new HashSet<Integer>(myList);
        boolean result;
        if (myList.size() == mySet.size()) {
            result = false;
        } else {
            result = true;
        }return result;
    }
    //from the class Nov 2nd II

   // Map<Integer,String> ssnData = new HashMap<>();
    //    ssnData.put(101, "Happy");
     //   ssnData.put(102, "Very Happy");
      //  ssnData.put(1000, "Peace");
       // ssnData.put(9898, "stay healthy");
    // Print the key-value as shows below:
    // 101 -> Happy
    // 102 -> Very Happy
    // 1000 -> Peace
    // 9898 -> stay healthy

    public void getTogether (Map<Integer, String> given) {
        Set<Integer> allKeys = given.keySet();
        List<Integer> keysList = new ArrayList<>(allKeys);

        for (int i = 0; i<keysList.size(); i++) {
            String word = given.get(keysList.get(i));
            System.out.println(keysList.get(i) + " -> " + word );
        }
    }
    //HW I.
    //Create a method, that will return all duplicates values with count from the given List<String>
    //List<String> words = {"happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"};
    //Output:
    //happy - 2
    //joy - 3
    //laugh - 2
    /**
     * Deepak, I also added .toLowerCase() for the first "for-loop", coz , if you change the first appearance of a word,
     * to format like ThIS, then it compares everything to this format, and doesnt work properly.
     * Plus, at the end, was trying to make the return looking like "happy - 2". But it still not three lines ((
    **/
    public List<String> returnDuplicates (List<String> wordsList) {
        Map<String, Integer> doublesCount = new HashMap<>();
        List<String> allValuesDuplicates = new ArrayList<>();
        for (int j = 0; j < wordsList.size(); j++) {
            String word = wordsList.get(j).toLowerCase();
            int count = 1;
            for (int m = j + 1; m < wordsList.size(); m++) {
                if (wordsList.get(m).equalsIgnoreCase(word)) {
                    count++;
                }
            }
            if (count > 1 && !doublesCount.containsKey(word.toLowerCase())) {
                doublesCount.put(word.toLowerCase(), count);
                allValuesDuplicates.add(word);
            }
        }
        List<String> results = new ArrayList<>();
        for (int i = 0; i < allValuesDuplicates.size(); i++) {
            String forResult = allValuesDuplicates.get(i) + " - " + doublesCount.get(allValuesDuplicates.get(i));
            results.add(forResult);

        }
        return results;
    }




    //HW II.
    //Create a hashMap with any numbers of key-value pairs from the user
    //     * Key should be Integer
    //     * Value should be String
    //     *
    //     * Create method that will print the keys with same value, else "All keys have different values"
    //     *
    //     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
    //     * Output (print) ->
    //     *      "happy" with keys -> 101, 103, 106
    //     *      "peace" with keys -> 102, 105
    //     *
    //     * Input to method -> [{111="happy"}, {98="peace"}, {10="LAugh"}, {55="learn"}, {101="Grow"}]
    //     * Output (print) ->
    //     *      All keys have different values
    public void keysWithCommonValues (Map <Integer, String> myMap) {
    Set <Integer> allKeys = myMap.keySet();
    Map <String, Set<Integer>> valueAndKeys = new HashMap<>();
    Set <Integer> keysWithCommonValues = new HashSet<>();       //all unique
        for (int i =0; i<allKeys.size(); i++) {
        String valueForKey = myMap.get(i);
        for (int j = i + 1; j < allKeys.size() - 1; j++) {
            if (valueForKey.equalsIgnoreCase(myMap.get(j))) {           //???
                keysWithCommonValues.add(i);
                keysWithCommonValues.add(j);
            }
        }

        if (keysWithCommonValues.size()>0) {
            valueAndKeys.put(valueForKey.toLowerCase(), keysWithCommonValues);
        }
        if ( valueAndKeys.size()>0) {
            for ( String word : valueAndKeys.keySet()) {
                System.out.println(word + " with keys -> " + valueAndKeys.get(word));
            }
        } else {
            System.out.println("All keys have different values");
        }
    }
}

/** [{101="happy"}, {102="joy"}, {103="happy"}, {104, "peace"}, {105, "joy"}, {106, "happy"}]
         * store all values ---> ["happy", "happy", "joy", "peace", "joy", "happy"] --> using values();
  * find duplicates (in Set) from all values ---> ["happy", "joy"]
         * find keys which has values mentioned in above Set
public String keysOfTheSameValues (Map <Integer, String> myMap) {

}

**/



   }





