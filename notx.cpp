#include <iostream>
using namespace std;
void solve(){
  int n;
  cin>>n;
  for(int i=1;i<=3;i++){
    if(i!=n){
      cout<<i<<endl;
      break;
    }
  }
}
int main(){
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);
  int tc=1;
  while(tc--){
    solve();
  }
  return 0;
}
