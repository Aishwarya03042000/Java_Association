class Developer7
{
	String name;
	String eMail;
	Address7[] address;
	
	Developer7(String name, String eMail)
	{
		System.out.println("invoking Developer7 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress7(Address7[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress7()");
		this.address = address;
	}
	void displayDeveloper7Properties()
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