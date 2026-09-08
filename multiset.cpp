#include <iostream>
#include <vector>
#include <string>
using namespace std;
void solve(){
    int n;
    cin>>n;
    int arr[n];
    vector<int> zi;
    for(int i=0;i<n;i++){
        cin>>arr[i];
        if(arr[i]==0){
            zi.push_back(i);
        }
    }//we pushed zero index
    if(zi.size()==1){
        cout<<"NO"<<endl;
    }
    else{
        string ans(n,'C');
        //more zeroes are present
        if(zi.size()==0){
            ans[0]='A';
            ans[1]='B';
        }
        else{
        int fzi=zi[0];
        ans[fzi]='B';
        for(int ind:zi){
            if(ind!=fzi){
               ans[ind]='A';
            }
        }
        }
    cout<<"YES"<<endl;
    cout<<ans<<endl;
    }
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
