//E-Destruction
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;
int find(vector<int> &ldr,int node){
	if(node!=ldr[node]){
		ldr[node]=find(ldr,ldr[node]);
	}
	return ldr[node];
}
void join(vector<int> &ldr,int lt,int rt){
	ldr[find(ldr,lt)]=find(ldr,rt);
}
int main(){
	int N;
	cin>>N;
	int E;
	cin>>E;
	vector<int> ldr(N+1);
	vector<pair<int,pair<int,int>>> edges;// can use tuple?
	for(int node=1;node<=N;node++){
		ldr[node]=node;
	}
	while(E--){
		int a,b,cost;
		cin>>a>>b>>cost;
		if(cost<=0){
			join(ldr,a,b);
		}else{
			edges.push_back(make_pair(cost,make_pair(a,b)));
		}
	}
	long long rewards=0;
	sort(edges.begin(),edges.end());
	for(auto &edge : edges){
    int cost = edge.first;
    auto p = edge.second;
    int a = p.first, b = p.second;


		if(find(ldr,a)!=find(ldr,b)){
			join(ldr,a,b);
		}else{
			rewards+=cost;
		}
	}
	cout<<rewards<<endl;
	}
