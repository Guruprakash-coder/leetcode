class RandomizedSet {
    ArrayList<Integer> list;

    public RandomizedSet() {
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        
        for(int i=0;i<list.size();i++){
            if(list.get(i)==val){
                return false;
            }
        }
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
         for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == val) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        int min=0;
        int max=list.size()-1;
        int randomNum = min + (int)(Math.random() * ((max - min) + 1));
        return list.get(randomNum);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */