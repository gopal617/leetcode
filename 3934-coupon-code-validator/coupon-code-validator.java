class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        HashSet<String> h = new HashSet<>();
        Collections.addAll(h,"electronics","grocery","pharmacy","restaurant");
        List<String[]> l = new ArrayList<>();
        for(int i=0;i<code.length;i++){
            if(code[i].matches("^[a-zA-Z0-9_]+$") && h.contains(businessLine[i]) && isActive[i]){
                l.add(new String[]{businessLine[i],code[i]});
            }
        }
        Collections.sort(l,(a,b) ->{
            if(!a[0].equals(b[0])){
                return a[0].compareTo(b[0]);
            }
            else{
                return a[1].compareTo(b[1]);
            }
        });
        List<String> l1 =new ArrayList<>();
        for(String[] a : l){
            l1.add(a[1]);
        }
        return l1;
    }
}