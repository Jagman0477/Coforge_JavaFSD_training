// Each class like Strings have their own version of overridden form of .equals() function

public class IcecreamParlour {

	private int id;
	private String name;
	
	public IcecreamParlour(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "IcecreamParlour [id=" + id + ", name=" + name + "]";
	}
	
	@Override // Overriding equals 'cause .equals() from base Object class doesn't compare the contents in this case
	public boolean equals(Object o) {
		IcecreamParlour p = (IcecreamParlour) o;
		if(p instanceof IcecreamParlour) { // Checks if given object belongs to same class or not
			if(p.id == this.id && p.name == this.name)
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		IcecreamParlour p1 = new IcecreamParlour(8074, "Billu ice cream wala");
		IcecreamParlour p2 = new IcecreamParlour(8074, "Billu ice cream wala");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}
	
}