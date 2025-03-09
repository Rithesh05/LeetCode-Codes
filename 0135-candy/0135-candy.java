import java.util.Arrays;

class Solution {
    int[] changeHappened(int[] ratings, int[] answers, int i) {
        while ((i + 1) <= ratings.length - 1 && ratings[i] < ratings[i + 1]) {
            if(answers[i+1]<=answers[i]){
            answers[i + 1] = answers[i] + 1;
            }
            i++;
        }
        return answers;
    }

    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] answers = new int[n];
        Arrays.fill(answers, 1);

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return (ratings[0] > ratings[1] || ratings[0] < ratings[1]) ? 3 : 2;
        }

        for (int i = n - 1; i >= 0; i--) {
            if ((i + 1) < n && (i - 1) >= 0 && ratings[i - 1] < ratings[i] && ratings[i] > ratings[i + 1]) {
                answers[i] = Math.max(answers[i - 1], answers[i + 1]) + 1;
                answers = changeHappened(ratings, answers, i);
            } else {
                if ((i + 1) < n && ratings[i] > ratings[i + 1]) {
                    answers[i] = answers[i + 1] + 1;
                    answers = changeHappened(ratings, answers, i);
                }
                if ((i - 1) >= 0 && ratings[i - 1] < ratings[i]) {
                    answers[i] = answers[i - 1] + 1;
                    answers = changeHappened(ratings, answers, i);
                }
            }
        }

        int sum = 0;
        for (int num : answers) {
            sum += num;
        }
        return sum;
    }
}
