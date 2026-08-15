class MyHashSet {
    public List<Integer>ans;

    public MyHashSet() {
        ans = new ArrayList<>();
        
    }
    
    public void add(int key) {
        if(!ans.contains(key)){
            ans.add(key);
        }
    }
    
    public void remove(int key) {
        ans.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return ans.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */