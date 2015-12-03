#include "../../std_lib_facilities.h"

int main()
{
  double x {2.7};
  int y {x};

  int a {1000};
  char b {a};

  char b1 {1000};
  char b2 {48};

  double d = 0;
  while (cin >> d) {
    int i = d;
    char c = i;
    int i2 = c;
    cout << "d==" << d << " i==" << i << " i2==" << i2 << " char(" << c << ")\n";
  }
}
