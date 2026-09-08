#include <iostream>
#include <algorithm>
using namespace std;
void solve(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    //doing the operation results storing them and finding max will surely cause TLE
  //at any step be it 1,00,000 our eeq and eoqs wont give same 2 and 0 but all eeq and eoq within themselves do that
    int on,eoq,eeq;
    for(int i=0;i<n;i++){
        if(arr[i]%2!=0){
            on++;
        }
        //odd number condition over
        else{
            if((arr[i]/2)%2==0){
                //eeq
                eeq++;
            }
            else{
                //eoq
                eoq++;
            }
        }
    }
    int fm=max(on,eeq);
    int sm=max(fm,eoq);
    cout<<sm<<endl;
    
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
