
/**
 * @ author Akhila
 *
 * Mouse over on an Element
 *
 **/
public static void MouseOver(WebElement we) 
{
	Actions actObj=new Actions(driver);
	actObj.moveToElement(we).build().perform();
}
//////////////////////////////////////////////////////////
/**
 * @ author Akhila
 *
 * Get Current Time Stamp
 *
 **/
public static String fn_GetTimeStamp()
{
	DateFormat DF=DateFormat.getDateTimeInstance();
	Date dte=new Date();
	String DateValue=DF.format(dte);
	DateValue=DateValue.replaceAll(":", "_");
	DateValue=DateValue.replaceAll(",", "");
	return DateValue;
}
//////////////////////////////////////////////////////////
/**
 * @ author Akhila
 *
 * select the dropdown using "select by visible text", so pass VisibleText as 'Yellow' to funtion
 *
 **/
public static void fn_Select(WebElement WE, String VisibleText)
{
	Select selObj=new Select(WE);
	selObj.selectByVisibleText(VisibleText);
}
//////////////////////////////////////////////////////////
/**
 * @ author Akhila
 *
 * select the dropdown using "select by index", so pass IndexValue as '2'
 *
 **/ 
public static void fn_Select(WebElement WE, int IndexValue)
{
	Select selObj=new Select(WE);
	selObj.selectByIndex(IndexValue);
}
//////////////////////////////////////////////////////////
/**
 * @ author Akhila
 *
 * select the dropdown using "select by value", so pass Value as 'thirdcolor'
 *
 **/  
public static void fn_Select(WebElement WE, String Value)
{
	Select selObj=new Select(WE);
	selObj.selectByValue(Value);
}