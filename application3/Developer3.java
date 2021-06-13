class Developer3
{
	String name;
	String eMail;
	Address3[] address;
	
	Developer3(String name, String eMail)
	{
		System.out.println("invoking Developer3 in constructor");
		this.name = name;
		this.eMail = eMail;
	}
	void initAddress3(Address3[] address)
	{
		if(address!=null)
		System.out.println("invoking method initAddress3()");
		this.address = address;
	}
	void displayDeveloper3Properties()
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