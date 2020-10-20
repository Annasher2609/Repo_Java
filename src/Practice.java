public class Practice {
    //"hello", "peace", "happy" , "hello", "Happy", "hello"

    public String findDuplicates(String[] arr) {
        String duplicates = "";
        String given = "";
        for (int m = 0; m < arr.length; m++) {
            given = given + arr[m].toUpperCase() + " ";
        }

        for (int i = 0; i < arr.length; i++) {
            if (!(given.indexOf(arr[i].toUpperCase()) == given.lastIndexOf(arr[i].toUpperCase())) && (!duplicates.contains(arr[i].toUpperCase()))) {

                duplicates = duplicates + arr[i].toUpperCase() + " ";
            }
        }
        return duplicates.toLowerCase();
    }

    public int numberOfV(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)=='i' || str.charAt(i)== 'i') {
                    count++;
                }
            }
            return count;
        }


    public int firstPerfectSq(int[] arr) {
        int firstPerfectS = 0;
        boolean foundPerfectSq = false;
        int num = 0;
        for (int i = 0; i < 20; i++) {
            num = i * i;
            for (int m = 0; m < arr.length; m++) {
                if (num == arr[m]) {
                    foundPerfectSq = true;
                    firstPerfectS = arr[m];
                    break;
                }
            }
        }
        if (foundPerfectSq) {

        }return firstPerfectS;
    }
    //return number of even N in []
    public int countEvens(int[] numbers) {
        int num = 0;
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                num++;
            }
        }return num;
    }
    //diff btw LARGEST and SMALLEST nums
    public int bigDiff(int[] num2) {
        int max =num2[0];
        int min =num2[0];
        int res = 0;
        for (int i = 1; i<num2.length; i++) {
            if (num2[i]>max) {
                max = num2[i];
            }
            if (num2[i]< min) {
                min = num2[i];
            }
        }
        res = max - min ;
        return res;
    }

    public int centeredAverage(int[] num3) {
        int max = num3[0];
        int min = num3[0];
        int average = 0;
        int count = 0;
        for (int i = 1; i < num3.length; i++) {
            if (num3[i] > max) {
                max = num3[i];
            }
            if (num3[i] < min) {
                min = num3[i];
            }
        }
        for (int i = 0; i < num3.length; i++) {
            count = count + num3[i];
            average = (count - min - max) / (num3.length - 2);
        }
        return average;
    }
        //sum except 13 and next number
        public int sum13(int[] nums) {
            int sum =0;
            for (int i = 0;i <nums.length ;i++) {
                if (nums[i] != 13) {
                    sum+=nums[i];
                }else if (nums[i] == 13 && i < nums.length -1 ) {
                    nums[i]=0;
                    nums[i+1] =0;
                }
            }return sum;
        }
        //sum till 6 adn after 7 in a string
    /**?????????public int sum67(int[] nums) {
     int sum =0;
     int ignoreSum =0;
     for (int i =0; i<nums.length; i++) {
     if (nums[i] == 6) {
     for (int m =i; m == 7 ; m++) {
     nums[m]=0;
     ignoreSum = m;
     } nums [ignoreSum] = 0;
    **/
     public int sum67(int[] arr) {
        int sum =0;
         int indexStop = 0;
         int sumToIgnore = 0;
         int indexToStart = 0;
         for (int i=0; i< arr.length; i++) {
            if ( arr[i] != 6) {
               sum = sum + arr[i];
            } else if (arr[i]==6) {
                indexToStart = i;
                for (int m = indexToStart; m<arr.length; m++) {
                    if (arr[m]==7) {
                        indexStop = m;
                        for (int j=arr[indexToStart]; j == arr[indexStop]; j++) {
                            sumToIgnore = sumToIgnore +arr[j];
                        }break;
                    }
                }
            }

        }return sum-sumToIgnore;
    }
    public int sum672(int[] nums)
    {
        int sum = 0;
        boolean sixMode = false;
        for(int i = 0; i < nums.length; i++) {
            if(sixMode) {
                if(nums[i] == 7)
                    sixMode = false;
            } else if(nums[i] == 6)
                sixMode = true;
            else
                sum += nums[i];
        }
        return sum;
    }

    /*
        5. Write a method to print(no return) the common values between two arrays (string arrays)
     * Input arrays:
     *  arr1 -> {"hello", "peace", "happy" , "hello", "Happy", "hello", "laugh"}
     *  arr2 -> {"hello", "grow", "laugh" , "peace"}
     * Method should print -> hello, peace, laugh
         */

    public String printDoubles (String[] arr1, String[] arr2) {
        String[] result ={};
        String resSplit = "";
        for (int i = 0; i<arr1.length; i++) {
            for (int m =0;m< arr2.length; m++ ){
                if (arr1[i] == arr2[m]) {
                    for (int j = 0; j< result.length; j++) {
                        if (arr1[i] != result[j]) {
                            resSplit = arr1[i] + " ";
                        }
                    }

                }
            }
        }return resSplit;
    }
    // if contains 2 after 2
    public boolean has22(int[] nums) {
        boolean doesItContain = false;
        for (int i =0; i<nums.length-1; i++) {
            if (nums[i] == 2 && nums[i+1]==2) {
                doesItContain =true;
                break;
            }else
                doesItContain = false;
        }
        return doesItContain;
    }
    //contains no 1 and 3
    public boolean lucky13(int[] nums) {
        boolean ifContains = false;
        if (nums.length==0) {
            return true;
        }else
            for (int i =0; i<nums.length; i++) {
                if (nums[i]==1 || nums[i]== 3) {
                    return  false;
                }
            }return true;
    }
        //if sum of 2's is 8
        public boolean sum28(int[] nums) {
            boolean if28 = false;
            int sumOf2 =0;
            for(int i = 0; i<nums.length; i++) {
                if (nums[i]==2) {
                    sumOf2 += nums[i];
                }
            }
            if (sumOf2==8) {
                return true;
            }return false;
        }
        //nums of y and z at the end of words
    public int countYZ(String str) {
        int count = 0;
        String[] arr = str.split(" ");
        for (int i=0; i< arr.length; i++) {
            if(arr[i].charAt((arr[i].length()-1)) == 'y' || arr[i].charAt((arr[i].length()-1)) == 'z') {
                count++;
            }
        }return count;
    }

}







