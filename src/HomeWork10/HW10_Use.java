package HomeWork10;

import java.util.*;

public class HW10_Use {
    public static void main(String[] args) {
        Map<Integer,String> ssnData = new HashMap<>();
        ssnData.put(101, "Happy");
        ssnData.put(102, "Very Happy");
        ssnData.put(1000, "Peace");
        ssnData.put(9898, "stay healthy");
        // Print the key-value as shows below:
        // 101 -> Happy
        // 102 -> Very Happy
        // 1000 -> Peace
        // 9898 -> stay healthy
        List<String> words = new ArrayList<>();
        words.add("happy");
        words.add("peace");
        words.add("joy");
        words.add("grow");
        words.add("joy");
        words.add("laugh");
        words.add("happy");
        words.add("laugh");
        words.add("joy");
        //["happy", "peace", "joy", "grow", "joy", "laugh", "happy", "laugh", "joy"];
        HomeWork10 a1 = new HomeWork10();
        //a1.getTogether(ssnData);


        String[] words2 = {"haPPy", "peace", "JOy", "grow", "joy", "HApPy", "laugh", "HaPpy", "laugh", "joy"};
        List<String> wordsList = Arrays.asList(words2);
        /**for: HAPPY : for: if equal to 2 ->
         *              equal to 3
         *              equal to 9
         *              count ++
         *        IF count >1 && !map.contain (happy) -> Map <happy, count>;
         *    PEACE:if equal to 2 ->
         *          *              equal to 3
         *          *              equal to 9
         *          *              count ++
         *    ...
         *    JOY: if equal to 2 ->
         *          *              equal to 3
         *          *              equal to 9
         *          *              count ++
        **/

        //System.out.println(a1.returnDuplicates(wordsList));

        /**Create method that will print the keys with same value, else "All keys have different values"
        //     *
        //     * Input to method -> [{101="happy"}, {102="peace"}, {103="Happy"}, {104="learn"}, {105="PEaCe"}, {106="HAPPY"}]
        //     * Output (print) ->
        //     *      "happy" with keys -> 101, 103, 106
        //     *      "peace" with keys -> 102, 105
        **/

        Map < Integer, String > myMap = new HashMap<>();
        myMap.put(101, "happy");
        myMap.put(102, "peace");
        myMap.put(103, "Happy");
        myMap.put(104, "learn");
        myMap.put(105, "PEaCe");
        myMap.put(106, "HAPPY");
        a1.keysWithCommonValues(myMap);

        /**Set <Integer> allKeys = myMap.keySet();
        Map <String, Set<Integer>> valueAndKeys = new HashMap<>();
        Set <Integer> keysWithCommonValues = new HashSet<>();       //all unique
        for (int i =0; i<allKeys.size(); i++) {
            String valueForKey = myMap.get(i);
            for (int j = i + 1; j < allKeys.size() - 1; j++) {
                if (valueForKey.equalsIgnoreCase(myMap.get(j))) {
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

        /**Set <Integer> allKeys = myMap.keySet();
        Map <String, Set<Integer>> valueAndKeys = new HashMap<>();
        Set <Integer> keysWithCommonValues = new HashSet<>();       //all unique
        for (Integer firstKey :allKeys) {
            String valueForKey = myMap.get(firstKey);
            for (Integer secondKey : allKeys) {
                if (firstKey != secondKey) {
                    if (myMap.get(secondKey).equalsIgnoreCase(valueForKey)) {
                        keysWithCommonValues.add(firstKey);
                        keysWithCommonValues.add(secondKey);
                    }
                }
            }
            if (keysWithCommonValues.size() > 0) {
                valueAndKeys.put(valueForKey.toLowerCase(), keysWithCommonValues);      //?
            }
        }
            if ( valueAndKeys.size()>0) {
                for ( String word : valueAndKeys.keySet()) {
                    System.out.println(word + " with keys -> " + valueAndKeys.get(word));
                }
            } else {
                System.out.println("All keys have different values");
            }
        }
         **/
    }
}


        /**
         *
         * first key  :
         *  v1 == v2 if yes -> get the keys for v1 and v2 . Store in list {kays}
         *      v3
         *      ..
         *      v6
         *
         *
        **/







