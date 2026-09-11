#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int main(){
  int n;
  cin>>n;
  vector<int> pr;
  vector<int> del;
  vector<int> ch;
  for(int i=0;i<n;i++){
    int nu;
    cin>>nu;
    auto it=find(pr.begin(),pr.end(),nu);
    if(it==pr.end()){
    //element is not there
    pr.push_back(nu);
  }
  else{
    *it=-1;
    del.push_back(nu);
  }
}
int cnt=0;
for(int e:pr){
    if(e!=-1){
  cnt++;
    }
}
cout<<cnt<<endl;
}
