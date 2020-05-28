#include <bits/stdc++.h> 
using namespace std; 

void printCollatz(int n) 
{ 
	// We simply follow steps 
	// while we do not reach 1 

} 

// Driver code 
int main() 
{ 
	
	int n,count=0;
	cin>>n;
		while (n != 1) 
	{ 
		count=count+1;
		cout << n << "\n"; 

		// If n is odd 
		if (n & 1) 
			n = 3*n + 1; 

		// If even 
		else
			n = n/2; 
	} 

	// Print 1 at the end 
	cout << n<<"\n"<<count;
	
	return 0; 
} 