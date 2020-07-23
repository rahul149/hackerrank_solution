#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int n,q;
    cin>>n>>q;
    std::vector<int> a[n];
    for(int i=0;i<n;i++){
        int l;
        cin>>l;
        int ar[l];

        for(int j=0;j<l;j++)
            cin>>ar[j];
        a[i].assign(ar,ar+l);
    }
    for(int i=0;i<q;i++)
    {
        int x,y;
        cin>>x>>y;
        cout<<a[x][y]<<endl;
    }
    return 0;
}
