
public class Gcd {
	public int findGcd(int m,int n) {
		while(n!=0) {
			int rem=m/n;
			m=n;
			n=rem;
		}
		return m;
	}

}
