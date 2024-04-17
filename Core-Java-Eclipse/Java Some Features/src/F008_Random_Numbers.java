import java.util.Random;

/*
Three ways to generate Random Numbers in Java:
1) java.util.Random class [int randomNum = rand.nextInt(max – min + 1) + min;]
2) Math.random method : Can Generate Random Numbers of double type.
	[int randomNum = min + (int)(Math.random() * ((max – min) + 1));]
3) ThreadLocalRandom class (ThreadLocalRandom.current().nextInt();)
*/
// 1 and 2 are useful in setting specific range for random number generation

public class F008_Random_Numbers {

	public static void main(String[] args) {
		//1) java.util.Random
		Random randy = new Random();
		int randomNo = randy.nextInt(100);	//0 included and 100 excluded
		System.out.println(randomNo);
		System.out.println(randy.nextDouble());
		System.out.println(randy.nextBoolean());
		//Range
		System.out.println(randy.nextInt(1000-500+1) + 500); //max = 1000, min = 500 (Both included)
		
		
		//2) Math.random()  -> normally return 'double' between 0 and 1
		System.out.println(Math.random());
		//Range
		System.out.println((int)(Math.random() * (1000 - 500 + 1)) + 500); //max-1000(inc), min-500 (inc)

	}
/*
java.security.SecureRandom class: This class provides a cryptographically strong random number 
 * generator (RNG). A cryptographically strong random number minimally complies with the statistical 
 * random number generator tests specified in FIPS 140-2, Security Requirements for Cryptographic Modules,
 * section 4.9.1. Additionally, SecureRandom must produce non-deterministic output. Therefore any seed
 * material passed to a SecureRandom object must be unpredictable, and all SecureRandom output sequences
 * must be cryptographically strong.
 
java.util.Random class: The classes defined in Random are not cryptographically strong, and the numbers
 chosen are not completely random because a definite mathematical algorithm 
 (based on Donald E. Knuth’s subtractive random number generator algorithm) is used to select them. 
 Therefore, it is not safe to use this class for tasks that require a high level of security, like creating 
 a random password etc. 

Random vs SecureRandom
1) Size: A Random class has only 48 bits whereas SecureRandom can have up to 128 bits. So the 
chances of repeating in SecureRandom are smaller.
2) Seed Generation: Random uses the system clock as the seed/or to generate the seed. So they 
can be reproduced easily if the attacker knows the time at which the seed was generated. But 
SecureRandom takes Random Data from your OS (they can be interval between keystrokes etc – most 
OS collect these data and store them in files – /dev/random and /dev/urandom in case of Linux/solaris) 
and use that as the seed.
3) Breaking the code: In case of random, just 2^48 attempts are required, with today’s advanced CPU‘s 
it is possible to break it in practical time. But for securerandom 2^128 attempts will be required, 
which will take years and years to break even with today’s advanced machines.
4) Generating Function: The standard Oracle JDK 7 implementation uses what’s called a 
Linear Congruential Generator to produce random values in java.util.Random. Whereas Secure Random 
implements SHA1PRNG algorithm, which uses SHA1 to generate pseudo-random numbers. The algorithm 
computes the SHA-1 hash over a true random number(uses an entropy source) and then concatenates it 
with a 64-bit counter which increments by 1 on each operation.
5) Security: Consequently, the java.util. The random class must not be used either for 
security-critical applications or for protecting sensitive data. 
*/

}
