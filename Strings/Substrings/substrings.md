> # Substring Template

```
static int findSubstring(String s) {
    int[] charCount = new int[128]; // Assuming the input is limited to ASCII characters
    int counter = 0; // Tracks how many criteria have been met
    int start = 0, end = 0;
    int result = /* initial value based on the problem, e.g., Integer.MAX_VALUE for finding a minimum */;

    // Optional: Initialize the charCount array or other tracking structures as needed
    for (/* your initialization condition */) {
        // Initialize charCount or any other structures based on problem requirements
    }

    while (end < s.length()) {
        char endChar = s.charAt(end);
        charCount[endChar]++;
        end++;

        // Update the counter or any other condition tracking based on the problem's requirements
        if (/* condition after decrementing charCount[endChar] */) {
            counter++;
        }

        // Condition to adjust the window by moving the 'start' pointer
        while (/* condition to maintain or adjust the window */) {

            // Update the result variable if the current window satisfies the condition
            result = /* update result based on the problem's goal, like Math.min(result, end - start) */;

            char startChar = s.charAt(start);
            charCount[startChar]--;
            start++;

            // Adjust the counter or any other tracking variables as you slide the start pointer
            if (/* condition after incrementing charCount[startChar] */) {
                counter--;
            }
        }

        // Optional: Update result if needed after adjusting the window
    }

    // Return the result based on the problem's requirements
    return /* result, or a default value if no valid result was found */;
}

```