#include<iostream>
#include<string.h>
#include<stdio.h>
using namespace std;
int main ()
{
char str1[50],i;
  int l=0;
gets(str1);
 while(str1[i]!='\0')
    {
        l++;
        i++;
    }
cout << "The number of letters in the name is "<<l;
return 0;
}