class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int j=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            map.put(fruits[i],1+map.getOrDefault(fruits[i],0));
            if(map.size()>2){
                while(map.size()>2){
                   map.put(fruits[j],map.get(fruits[j])-1);
                   if(map.get(fruits[j])==0){
                    map.remove(fruits[j]);
                   }
                   j++;
                }
            }
                max=Math.max(max,i-j+1);
        }
        return max;
    }
}
