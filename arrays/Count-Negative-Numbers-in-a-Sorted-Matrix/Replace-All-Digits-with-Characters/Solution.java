class Solution {
    public String replaceDigits(String s) {
        char[] chars=s.toCharArray();
        // chars = ['a', '1', 'c', '1', 'e', '1']

        for(int i=1;i<chars.length;i+=2) // because we want to look odd index 
        {
           int digit=chars[i]-'0';   // to make  1 as b we want a+1=b so for that 1 (this line) '1'-'0'=1  here 1(number)
           chars[i]= (char)(chars[i-1]+digit); // prevoious character is a+1=b 'a'+1 = b but we want a character  so we are using char() 
        }
        return new String(chars);
    }
}
