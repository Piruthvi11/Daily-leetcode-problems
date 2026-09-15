class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
        
            if(map.containsKey(arr[i]))
            {
                 map.put(arr[i],map.get(arr[i])+1); // get returns value  if 1-1(time) now checking 1 its already appeared so 1,get returns value so 1+1=2 now 1-2.
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        // after this in map eg-1
        // 1 → 3(values)
        // 2 → 2(values)
        // 3 → 1(values)


        // Check whether counts are unique
        HashSet<Integer> set= new HashSet<>();
        for(int count: map.values()) // Take each value from map.values() and temporarily put it into the variable named count.
        {
            if(set.contains(count)) // count(3) count(2) count(1)  
            {
                return false;
            }
            set.add(count);  // set={3,2,1}
        }
        return true;
    }
}
