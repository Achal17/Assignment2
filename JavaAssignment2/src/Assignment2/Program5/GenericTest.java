package Assignment2.Program5;

public class GenericTest extends Generic<Integer> {

	@Override
	public Integer add(Integer a, Integer b) {
		return a+b;
	}
	
	public Long add(Long a, Long b) {
		return a+b;
	}
	
	public Float add(Float a, Float b) {
		return a+b;
	}

	@Override
	public Integer mul(Integer x, Integer y) {
		return x*y;
	}
	
	public Long mul(Long x, Long y) {
		return x*y;
	}
	
	public Float mul(Float x, Float y) {
		return x*y;
	}
}
