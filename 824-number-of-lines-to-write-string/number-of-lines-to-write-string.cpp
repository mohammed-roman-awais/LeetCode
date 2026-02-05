class Solution {
public:
    vector<int> numberOfLines(vector<int>& widths, string s) {
        int lines = 1;
        int pixels = 0;
        for (int i = 0; i < s.length(); i++) {
            int w = widths[s[i] - 'a'];
            if (pixels + w <= 100) {
                pixels += w;
            } else {
                lines++;
                pixels = w;
            }
        }
        return {lines, pixels};
    }
};