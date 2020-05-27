#include "../../std_lib_facilities.h"

int main()
{
  string first_name = "";
  string friend_name = "";  
  char friend_sex;
  int age;

  cout << "Enter name: ";
  cin >> first_name;
  cout << "Dear " << first_name << ",\n";
  cout << "How are you? I am fine. I miss you.\n";
  cout << "Enter friend's name: ";
  cin >> friend_name;
  cout << "Have you ever met " << friend_name << "?\n";
  cout << "Friend's sex? m for male, f for female: ";
  cin >> friend_sex;
  if (friend_sex == 'm') {
    cout << "If you see " << friend_name << ", tell him to call me.\n"; 
  } else {
    cout << "If you see " << friend_name << ", tell her to call me.\n"; 
  }
  cout << "Enter age: ";
  cin >> age;
  cout << "I heard that it was your " << age << "-birthday few weeks ago!\n";
  if (age <= 0 || age >= 100) {
    simple_error("Don't fool around!");
  }
  if (age < 12) {
    cout << "You will become " << age + 1 << " next year.\n";
  } 
  if (age == 17) {
    cout << "You will be able to vote next year.\n";
  }
  if (age > 70) {
    cout << "Are you enjoying your life?\n";
  }
  cout << "Your friends,\n\n\n";
}
