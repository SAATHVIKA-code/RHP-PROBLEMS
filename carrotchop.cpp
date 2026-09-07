#include <iostream>
#include <algorithm>
#include <vector>
void solve(){
  int N,M;
cin>>N>>M;
vector<int> cnt(M+1,0);
for(int ctr=1;ctr<=M;ctr++){
  int curr;
  cin>>curr;
cnt[curr]++;
}
vector<int> psum(M+1,0);
for(int i=1;i<=M;i++){
psum[i]=psum[i-1]+cnt[i];
}
int ans=0;
for(int x=1;x<=M;x++){
int carrotcnt=psum[M]-psum[x-1];
if(2*x<=M){
carrotcnt+=cnt[2*x];
}
ans=max(ans,carrotcnt);
}
cout<<ans<<endl;
}

  int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int tc=1;
    while(tc--){
    	solve();
    }


    return 0;
}
