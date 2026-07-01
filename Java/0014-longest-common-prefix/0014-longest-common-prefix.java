class Solution {
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        String prefix = "";

        //traverse each character of the first string
        for(int i = 0; i < first.length(); i++){

            char currentChar = first.charAt(i);

            //compare with all remaining strings
            for(int j=1; j < strs.length; j++){

                //check if current string is shorter
                if(i >= strs[j].length()){
                    return prefix;
                }

                //check if characetrs are different
                if(currentChar != strs[j].charAt(i)){
                    return prefix;
                }
            }

            //characters is common in all strings
            prefix += currentChar;
        }
        return prefix;
}
}