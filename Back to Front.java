/*Function to print vector in reverse order
 * using iterator
 * it1 : arr.rbegin(), reverse iterator
 * it2 : arr.rend(), reverse iterator
 */
void reverseIterator(vector<int>::reverse_iterator it1,
                     vector<int>::reverse_iterator it2) {

    // Your code here
    
for (auto it = it1; it != it2; ++it) {
        cout << *it << " ";
    }
    cout << endl;
}
