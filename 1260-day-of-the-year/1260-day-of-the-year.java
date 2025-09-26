class Solution {
    public boolean isleap(int n){
        return (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0));
    }

    public int dayOfYear(String date) {
        String[] split = date.split("\\-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

        int sum = 0;
        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isleap(year)) {  // February in leap year
                sum += 29;
            } else {
                sum += days[i];
            }
        }
        return sum + day;
    }
}
