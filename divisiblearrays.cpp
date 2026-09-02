#include <bits/stdc++.h>
#include <iostream>
#include <map>
#include <vector>
#include <algorithm>
using namespace std;
void solve(){
	
  int n,k;
  cin>>n>>k;
  int arr[n+1];
  arr[0]=0;
  for(int i=1;i<n+1;i++){
    cin>>arr[i];
    
  }
  //one map is needed to get the index of remainder
  map<int,int> idx;
  //one map is needed to get the cntbut idx[6]=1 then//// in val[0]=0
  idx[0]=0;
 vector<int>val(n+1);
  val[0]=0;
  long long sum=0;
  //6 8 2 2 6 
  for(int i=1;i<n+1;i++){
    sum=sum+arr[i];
    long long rem=sum%k;
    
    //so if remainder exits already then we need to find max of val[idx[rem]]+1 or val[idx[rem]-1]
    //so here we need to check whether the key rem is present in the map
    if(idx.find(rem)!=idx.end()){
      
      val[i]=max(val[i-1],val[idx[rem]]+1);
    }
    else{
      val[i]=val[i-1];
    }
    idx[rem]=i;
    }
  
  cout<<val[n]<<endl;
  
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
