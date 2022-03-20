package variables_datatypes;

public class SCJ_String {
	public static void main(String[] args)
	{
	String name = "te";
	switch (name.toLowerCase()) 
	{
	case "author":
	System.out.println("Adil");
	break;
	case "team":
	System.out.println("Team Java Full Stack");
	break;
	case "editor":
	System.out.println("Rahul & Raj");
	break;
	default:
	System.out.println("Invalid entry");
	break;
	}
	}	}