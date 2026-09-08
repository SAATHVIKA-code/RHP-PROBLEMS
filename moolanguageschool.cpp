#include <iostream>
#include <vector>
#include <string>
using namespace std;
void solve(){
    int n,k;
    cin>>n>>k;
    int f=n/k;//no of farms
    string owners;
    cin>>owners;
    bool o[f];
    for(int i=0;i<f;i++){
        o[i]=false;
    }
    for(int i=0;i<owners.size();i++){
        if(owners[i]=='0'){
            o[i/k]=true;
        }
       
    }
    int cnt=0;
    for(int i=0;i<f;i++){
        if(o[i]==false){
            cnt++;
        }
    }
    cout<<cnt<<endl;
    
}
int main(){
     ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int tc;
    cin>>tc;
    while(tc--){
    	solve();
    }
 
 
    return 0;
}
