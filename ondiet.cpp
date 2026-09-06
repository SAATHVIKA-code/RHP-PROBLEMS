#include <iostream>
#include <vector>
using namespace std;
int main() {
  int N, M; long long int K;
  cin>>N>>M>>K;
  vector<int> arr(N);
  vector<bool> eaten(N, false);
  for (int i=0; i<N; i++) cin>>arr[i];
  long long int cur = 0;
  for (int i=0; i<N; i++) {
    if (i >= M) {
      if (eaten[i-M]) {
        cur -= arr[i-M];
      }
    }
    if(arr[i] + cur <= K) {
      cout<<"Yes"<<endl;
      cur += arr[i];
      eaten[i] = true;
    } else {
      cout<<"No"<<endl;
    }
  }
}
