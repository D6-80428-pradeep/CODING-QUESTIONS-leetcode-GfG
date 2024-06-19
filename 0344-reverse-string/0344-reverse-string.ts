/**
 Do not return anything, modify s in-place instead.
 */
function reverseString(s: string[]): void {
    let start = 0;
    let end = s.length - 1;

    while (start < end) {
        // Swap the elements at the start and end indices
        let temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // Move towards the middle
        start++;
        end--;
    }
}
