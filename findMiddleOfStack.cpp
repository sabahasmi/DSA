#include <iostream>
#include<stack>
using namespace std;
void printMiddle(stack<int>&s,int count){
  if(count==0){
    cout<<s.top()<<endl;
    return;
  }
  int topElement=s.top();
  s.pop();
  count--;
  //recursion
  printMiddle(s,count);
  // back tracking
  s.push(topElement);
}

int main() {
  stack<int>s;
  s.push(10);
  s.push(10);
  s.push(10);
  s.push(10);
  s.push(10);
  s.push(10);
  int count=s.size()/2;
  printMiddle(s,count);
  return 0;
}