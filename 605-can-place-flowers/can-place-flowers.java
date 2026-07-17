class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l=flowerbed.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(flowerbed[i]==0){
                list.add(i);
            }
        }
        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            if(num-1<0 ||  flowerbed[num-1]==0){
               if(num+1>=l|| flowerbed[num+1]==0){
                flowerbed[num]=1;
                n--;
            }
        }
    }
    return n<=0;
}
}