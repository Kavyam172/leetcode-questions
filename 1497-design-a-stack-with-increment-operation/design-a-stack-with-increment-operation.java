class CustomStack {
    int maxSize;
    int curr;
    ArrayList<Integer> stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new ArrayList<>();
        curr = 0;
    }
    
    public void push(int x) {
        if(curr<maxSize){
            stack.add(x);
            curr++;
        }
    }
    
    public int pop() {
        if(stack.isEmpty()){
            return -1;
        }
        int res = stack.get(curr-1);
        stack.remove(curr-1);
        curr--;
        return res;
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,curr);i++){
            stack.set(i,stack.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */