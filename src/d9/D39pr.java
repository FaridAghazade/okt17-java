package d9;

public class D39pr {
  int fac(int n) {
	  if (n == 1) {
		return 1;
	}
	  return n* fac(n-1);
  }
}
