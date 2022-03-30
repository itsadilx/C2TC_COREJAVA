package javacollection3;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo
{
	

		public static void main(String[] args)
		{
			LinkedHashSet hs=new LinkedHashSet();
			hs.add(11);
			hs.add(22);
			hs.add(33);
			hs.add(44);
			hs.add(4);
			System.out.println(hs);
			hs.add(11);
			hs.add(null);
			hs.add(null);
			System.out.println(hs);
		}

	}
