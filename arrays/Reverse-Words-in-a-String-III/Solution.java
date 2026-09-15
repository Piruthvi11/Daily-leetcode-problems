class Solution {
    public String reverseWords(String s) {
       char[]chars= s.toCharArray(); // creating array because we can modify and swap where charAr(i) doesn't modify
        int start=0;
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]==' ')
            {
               int left=start;  //eg"mr ding " left=0 for m and right=i-1 because ther is space so we are subtracting 
               int right=i-1;

                while(left<right) // swapping 
            {
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            start=i+1; //eg"mr ding" i=2(space) now we want d so i=i+1; for(next word)
            }
        }
        // for last word
        int left=start;  // here start=i+1(so left= i+1)for"mr ding" checking  for(d)
        int right=chars.length-1; // last word so chars.length-1
        while(left<right)
            {
                char temp=chars[left];
                chars[left]=chars[right];
                chars[right]=temp;
                left++;
                right--;
            }
            return new String(chars); // So we convert the character array back into a String
            // Convert chars into a String and return it.
    }
}
