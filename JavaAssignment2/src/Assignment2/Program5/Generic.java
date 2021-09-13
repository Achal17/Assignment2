//To create generic class which will perform operations on all Number types

package Assignment2.Program5;

public abstract class Generic<T extends Number> {
	public abstract T add(T a, T b);
	public abstract T mul(T x, T y);
}
