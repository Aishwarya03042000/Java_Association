class Developer9
{
	String name;
	String eMail;
	Address9[] address;
	
	Developer9(String name, String eMail)
	{
		System.out.println("invoking Developer9 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress9(Address9[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress9()");
		this.address = address;
	}
	void displayDeveloper9Properties()
	{
		System.out.println("DeveloperName: "+this.name);
		System.out.println("DeveloperE-Mail: "+this.eMail);
		
		if(this.address!=null)
		{
			System.out.println("DeveloperAddress: "+this.address.length);
			for(int i=0; i<this.address.length; i++)
			{
				System.out.println(this.address[i]);
			}
		}
	}
}