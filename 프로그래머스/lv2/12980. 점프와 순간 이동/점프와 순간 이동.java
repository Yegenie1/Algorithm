import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        for (int mid = n; mid >= 1; mid/=2) {
			if (mid % 2 ==1) {
				ans++;
			}
			
		}

        return ans;
    }
}