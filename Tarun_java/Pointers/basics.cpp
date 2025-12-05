#include<iostream>
using namespace std;

int main(){
    int size=5;
    int arr[size]={10,2,3,4,5};

    //Pointer pointing to the entire array
    int* ptr=arr;

    for(int i=0;i<size;i++){
        cout<<"The value at index " <<i<<" is "<<*(arr+i)<<endl;
    }
    
    return 0;
}
