#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  if (age>=13&&time>=13.00)
    cout<<"$5.00";
    else
    if (age>=13&&time<=13)
    cout<<"$8.00";
    else
    if (age<=13&&time>=13)
    cout<<"$2.00";
  else
    cout<<"$4.00";
}