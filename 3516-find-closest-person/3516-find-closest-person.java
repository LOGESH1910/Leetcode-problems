class Solution {
    public int findClosest(int x, int y, int z) {
        int val=z-x;
        int val1=z-y;
        int con=Math.abs(val);
        int con1=Math.abs(val1);
        if(con<con1)return 1;
        else if(con==con1)return 0;
        else return 2;
    }
}