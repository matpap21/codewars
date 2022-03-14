package Multiplesof3and5;

public class Solution {
    public int solution(int number) {
        //TODO: Code stuff here

        int sum = 0;
        int i;
        for (i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;

            }
        }
        return sum;
    }
}