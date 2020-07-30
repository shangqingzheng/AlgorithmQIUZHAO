class Solution {
    //[5,5,10,10,20]  false
	//贪心算法。
    public boolean lemonadeChange(int[] bills) {
        int five_flag = 0;
        int ten_flag = 0;
        if (bills[0] != 5) {
            return false;
        }

        for (int bill: bills) {
            if (five_flag <= 0 && ten_flag <= 0 && bill!=5) {
                return false;
            }
            if (bill == 5) {
                five_flag++;
            } else if (bill == 10 && five_flag < 1) {
                return false;
            } else if (bill == 10){
                five_flag--;
                ten_flag++;
            } else if (bill == 20 && five_flag < 1) {
                return false;
            } else if (bill == 20) {
                if (ten_flag >= 1) {
                    ten_flag--;
                    five_flag--;
                } else if (five_flag < 3) {
                    return false;
                } else {
                    five_flag = five_flag-3;
                }
            }
        }
        return true;//(five_flag>=0 && ten_flag>=0) ? true: false;
    }
	
}