class  Developer1
{
	String name;
	String eMail;
	Address1[] address;
	
	Developer1(String name, String eMail)
	{
		System.out.println("invoking Developer1 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress1(Address1[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress1()");
		this.address = address;
	}
	void displayDeveloper1Properties()
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