package epam.task9;
public class App 
{
	public String swap(String result)
	{
	int l=result.length();
	char a=result.charAt(0);
	char b=result.charAt(1);
	if(a=='A'&& b!='A')
	{
      result=result.substring(1,l);
	}
	else if(a=='A'&& b=='A') {
		result=result.substring(2,l);
	}
	else if(b=='A'&& a!='A') {
		result=result.charAt(0)+result.substring(2,l);
	}
	return result;
	}
}
