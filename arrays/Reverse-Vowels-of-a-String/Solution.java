class Solution {
    public String reverseVowels(String s) {
        char[] chars= s.toCharArray();
        int left=0;
        int right=chars.length-1;
        while(left<right){
        while(left<right && !isVowel(chars[left]))
            {
                   left++;
            }
            while(left<right && !isVowel(chars[right]))
            {
                   right--;
            }
            if(left<right)
            {
                        char temp=chars[left];
                        chars[left]=chars[right];
                        chars[right]=temp;
                        left++;
                        right--;
            }
        }     
        return new String(chars);
    }
    private boolean isVowel(char ch) { // private → this method is used only inside this class
        ch = Character.toLowerCase(ch);       // boolean-it returns true or false
        return ch == 'a' || ch == 'e' || ch == 'i' ||  //- isVowel// method name
               ch == 'o' || ch == 'u';  // char ch → receives one character
    }
}
