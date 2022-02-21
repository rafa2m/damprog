package dam.temasiete.flujos.aleatorio;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Date;

public class Empleado {
	public static final int NAME_SIZE = 40;
	public static final int RECORD_SIZE = 2 * NAME_SIZE + 20;
	private String name;
	private double salary;
	private Date hireDay;
	public Empleado(String n, double s, Date d)
	{
		name = n;
		salary = s;
		hireDay = d;
	}
	public Empleado() {}
	public void print()
	{
		System.out.println(name + " " + salary + " " + hireYear());
	}
	public void raiseSalary(double byPercent)
	{
		salary *= 1 + byPercent / 100;
	}
	public int hireYear()
	{
		return hireDay.getYear();
	}
	public void writeData(DataOutput out) throws IOException
	{
		DataIO.writeFixedString(name, NAME_SIZE, out);
		out.writeDouble(salary);
		out.writeInt(hireDay.getYear());
		out.writeInt(hireDay.getMonth());
		out.writeInt(hireDay.getDay());
	}
	public void readData(DataInput in) throws IOException
	{
		name = DataIO.readFixedString(NAME_SIZE, in);
		salary = in.readDouble();
		int y = in.readInt();
		int m = in.readInt();
		int d = in.readInt();
		hireDay = new Date(y, m, d);
	}

}
