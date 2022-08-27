
public class Product 
{

	int pid;
	String pType;
	double qty;







	public Product(int pid,String pType,double qty) 
	{
		super();
		this.pid=pid;
		this.pType=pType;
		this.qty=qty;

	}







	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pType=" + pType + ", qty=" + qty + "]";
	}







	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pType == null) ? 0 : pType.hashCode());
		result = prime * result + pid;
		long temp;
		temp = Double.doubleToLongBits(qty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (pType == null) {
			if (other.pType != null)
				return false;
		} else if (!pType.equals(other.pType))
			return false;
		if (pid != other.pid)
			return false;
		if (Double.doubleToLongBits(qty) != Double.doubleToLongBits(other.qty))
			return false;
		return true;
	}


}
