class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq =new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(int num:map.keySet()){
            pq.add(new int[]{num, map.get(num)});
        }
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            int[] p=pq.poll();
            arr[i]=p[0];
        }
        return arr;
    }
}