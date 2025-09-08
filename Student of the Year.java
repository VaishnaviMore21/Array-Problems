/*Function to sort students with respect to their marks
 * v : vector input with student name and their marks
 * N : size of vector
 * Your need to implement comparator to sort on the basis of marks.
 */
vector<pair<string, int>> sortMarks(vector<pair<string, int>> v, int N) {

    // Complete the code and return the sorted vector
      sort(v.begin(), v.end(), [](pair<string, int> &a, pair<string, int> &b) {
        if (a.second != b.second)
            return a.second > b.second; // Higher marks first
        return a.first < b.first;       // Alphabetical if marks are equal
    });
    return v;
}
