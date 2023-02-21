package POJO;

import java.lang.*;

// Class to test above bean
public class beans
{
	public static void main(String[] args) throws Exception
	{
		Bean bean = new Bean();
	
		try{
            bean.setProperty(0);
            
        }
		catch(Exception e){
            System.out.println("Throws error After setting to 0: " + bean.getProperty());
        }
	
		bean.setProperty(5);
		System.out.println("After setting to valid" +
					" value: " + bean.getProperty());
	}
}

// Java program to illustrate JavaBeans
class Bean
{
	// private field property
	private Integer property;
	Bean()
	{
		// No-arg constructor
	}
	
	// setter method for property
	public void setProperty(Integer property) throws Exception
	{
		if (property == 0)
		{
			// if property is 0 return
			return;
		}
		this.property=property;
	}
	
	// getter method for property
	public Integer getProperty() throws Exception
	{
		if (property == 0)
		{
			// if property is 0 return null
			return null;
		}
		return property;
	}
}
	


