class RandomizedSet {

    public HashSet<Integer> hashSet ;
    public Random random ;

    public RandomizedSet() {
        hashSet = new HashSet<>(); 
        random = new Random();
    }

    public boolean insert(int val) {
        if (hashSet.contains(val)) return false;
         hashSet.add(val);
         return true;
    }

    public boolean remove(int val) {
        if (!hashSet.contains(val)) return false;
        hashSet.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] arrayNumbers = hashSet.toArray(new Integer[hashSet.size()]);
        return arrayNumbers[random.nextInt(hashSet.size())];    
    }
 
}
