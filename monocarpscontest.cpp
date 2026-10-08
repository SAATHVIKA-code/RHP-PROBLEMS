#include <bits/stdc++.h>
using namespace std;
int solve(){
	int n;
	cin>>n;
	int arr[n];
	int cnt=0;
	for(int i=0;i<n;i++){
		cin>>arr[i];
		if(arr[i]==0){
			cnt++;
		}
	}
	if(cnt==0||cnt==1){
		return -1;
	}
	if(arr[0]==1&&arr[n-1]==1){
		return 2;
	}
	else if(arr[0]==1||arr[n-1]==1){
		return 1;
	}
	else if(arr[0]==0&&arr[n-1]==0){
		return 0;
	}
}
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int tc;
    cin>>tc;
    while(tc--){
    	cout<<solve()<<endl;
    }
    
}
