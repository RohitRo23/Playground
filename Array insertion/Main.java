#include<iostream>
using namespace std;
int main()
{
    int n,l,m;
    cout<<"Enter the number of elements in the array\n";
    cin>>n;
    int a[n];
    cout<<"Enter the elements in the array\n";
    for(int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"Enter the location where you wish to insert an element\n";
    cin>>l;
    if(l>=n)
    {
      cout<<"Invalid Input";
      exit(0);
    }
    cout<<"Enter the value to insert\n";
    cin>>m;
    cout<<"Array after insertion is\n";
    for(int i=0;i<l-1;i++)
    {
        cout<<a[i]<<endl;
    }
    cout<<m<<endl;
    for(int i=l-1;i<n;i++)
    {
        cout<<a[i]<<endl;
    }
}