class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int low = 0, high = people.length - 1;
        while(low <= high){
            int total = people[low] + people[high];
            if(total <= limit){
                low++;
                high--;
            } else {
                high--;
            }
            count++;
        }
        return count;
    }
}