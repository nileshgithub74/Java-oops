public class MajorityElement {

    public static int FindCandidate(int[] arr) {
        int n = arr.length;
        int count = 0;
        int candidate = arr[0];

        // Step 1: Find potential candidate
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                candidate = arr[i];
            }

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if candidate is majority
        count = 0;
        for (int x : arr) {
            if (x == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            return candidate;
        }

        return -1; // No majority
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 }; // 👈 Example where 2 is majority
        int result = FindCandidate(arr);
        
        System.out.println(result == -1 ? "No Majority Element" : "Majority Element: " + result);
    }
}
