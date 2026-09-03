class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1=new StringBuilder();
         StringBuilder result2=new StringBuilder();
         for(int i=0;i<word1.length;i++)
         {
            result1.append(word1[i]);
         }
          for(int i=0;i<word2.length;i++)
         {
            result2.append(word2[i]);
         }
         return result1.toString().equals(result2.toString());

    }
     
}