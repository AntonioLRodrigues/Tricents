package elementos;

import org.openqa.selenium.By;

public class Elementos {

	// Enter Vehicle Data
	
	private By Make = By.id("make");
	private By Mercedes = By.xpath("//option[@value='Mercedes Benz']");		
	private By Model = By.id("model");
	private By Moto = By.xpath("//option[@value='Motorcycle']");	
	private By Cylinder = By.id("cylindercapacity");
	private By Engine = By.id("engineperformance");
	private By DateOfManu = By.id("dateofmanufacture");
	private By NumberOfSeats = By.name("Number of Seats Motorcycle");
	private By Number = By.cssSelector("#numberofseats > option:nth-child(3)");	
	private By RightHandDrive = By.cssSelector("#insurance-form > div > section:nth-child(1) > div:nth-child(7) > p > label:nth-child(1) > span");
	private By NumberOfSeats2 = By.xpath("//*[@id=\"numberofseatsmotorcycle\"]/option[3]");
	private By Number2 = By.cssSelector("#numberofseats > option:nth-child(3)");
	private By FuelType = By.id("fuel");
	private By Diesel = By.xpath("//option[@value='Diesel']");
	private By Payload = By.id("payload");
	private By TotalWeight = By.id("totalweight");
	private By ListPrice = By.id("listprice");
	private By LicensePlateNumber = By.id("licenseplatenumber");
	private By AnnualMileage = By.id("annualmileage");
	private By Next1 = By.id("nextenterinsurantdata");
	
	
	// Enter Insurant Data

	private By FistName = By.id("firstname");
	private By LastName = By.id("lastname");
	private By DateofBirth = By.id("birthdate");
	private By Gender = By.cssSelector("#insurance-form > div > section:nth-child(2) > div:nth-child(4) > p > label:nth-child(1) > span");
	private By StreetAddress = By.id("streetaddress");
	private By Country = By.id("country");
	private By Brazil = By.xpath("//option[@value='Brazil']");	
	private By ZipCode = By.id("zipcode");
	private By City = By.id("city");
	private By Occupation = By.id("occupation");
	private By Unemployed = By.xpath("//option[@value='Unemployed']");	
	private By Hobbies = By.cssSelector("#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(5) > span");
	private By Website = By.id("website");
	private By Open = By.id("open");
	private By Next2 = By.id("nextenterproductdata");
	
	
	// Enter Product Data
	
	private By StartDate = By.id("startdate");
	private By InsuranceSum = By.id("insurancesum");
	private By Valor = By.xpath("//*[@id=\"insurancesum\"]/option[9]");
	private By MeritRating = By.id("meritrating");
	private By Bonus = By.xpath("//option[@value='Bonus 9']");
	private By DamageInsurance = By.id("damageinsurance");
	private By FullCoverage = By.xpath("//option[@value='Full Coverage']");
	private By OptionalProducts = By.cssSelector("#insurance-form > div > section:nth-child(3) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(1) > span");
	private By CourtesyCar = By.id("courtesycar");
	private By Yes = By.xpath("//option[@value='Yes']");
	private By Next3 = By.id("nextselectpriceoption");
	
	
	// Select Price Option
	
	private By SelectOption = By.cssSelector("#priceTable > tfoot > tr > th.group > label:nth-child(4) > span");
	private By Next4 = By.id("nextsendquote");
	
	
	//Send Quote
	
	private By Email = By.id("email");
	private By Phone = By.id("phone");
	private By Username = By.id("username");
	private By Password = By.id("password");
	private By ConfirmePass = By.id("confirmpassword");
	private By Comments = By.id("Comments");
	private By Send = By.id("sendemail");
	private By ValidaText = By.xpath("/html/body/div[4]/h2");
	private By Ok = By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
	
	public By getOk() {
		return Ok;
	}
	public By getValidaText() {
		return ValidaText;
	}
	public By getEmail() {
		return Email;
	}
	public By getPhone() {
		return Phone;
	}
	public By getUsername() {
		return Username;
	}
	public By getPassword() {
		return Password;
	}
	public By getConfirmePass() {
		return ConfirmePass;
	}
	public By getComments() {
		return Comments;
	}
	public By getSend() {
		return Send;
	}
	public By getNext4() {
		return Next4;
	}
	public By getSelectOption() {
		return SelectOption;
	}
	public By getStartDate() {
		return StartDate;
	}
	public By getInsuranceSum() {
		return InsuranceSum;
	}
	public By getValor() {
		return Valor;
	}
	public By getMeritRating() {
		return MeritRating;
	}
	public By getBonus() {
		return Bonus;
	}
	public By getDamageInsurance() {
		return DamageInsurance;
	}
	public By getFullCoverage() {
		return FullCoverage;
	}
	public By getOptionalProducts() {
		return OptionalProducts;
	}
	public By getCourtesyCar() {
		return CourtesyCar;
	}
	public By getYes() {
		return Yes;
	}
	public By getNext3() {
		return Next3;
	}
	public By getFistName() {
		return FistName;
	}
	public By getLastName() {
		return LastName;
	}
	public By getDateofBirth() {
		return DateofBirth;
	}
	public By getGender() {
		return Gender;
	}
	public By getStreetAddress() {
		return StreetAddress;
	}
	public By getCountry() {
		return Country;
	}
	public By getBrazil() {
		return Brazil;
	}
	public By getZipCode() {
		return ZipCode;
	}
	public By getCity() {
		return City;
	}
	public By getOccupation() {
		return Occupation;
	}
	public By getUnemployed() {
		return Unemployed;
	}
	public By getHobbies() {
		return Hobbies;
	}
	public By getWebsite() {
		return Website;
	}
	public By getOpen() {
		return Open;
	}
	public By getNext2() {
		return Next2;
	}
	
	public By getMake() {
		return Make;
	}
	public By getMercedes() {
		return Mercedes;
	}
	public By getModel() {
		return Model;
	}
	public By getMoto() {
		return Moto;
	}
	public By getCylinder() {
		return Cylinder;
	}
	public By getEngine() {
		return Engine;
	}
	public By getDateOfManu() {
		return DateOfManu;
	}
	public By getNumberOfSeats() {
		return NumberOfSeats;
	}
	public By getNumber() {
		return Number;
	}
	public By getRightHandDrive() {
		return RightHandDrive;
	}
	public By getNumberOfSeats2() {
		return NumberOfSeats2;
	}
	public By getNumber2() {
		return Number2;
	}
	public By getFuelType() {
		return FuelType;
	}
	public By getDiesel() {
		return Diesel;
	}
	public By getPayload() {
		return Payload;
	}
	public By getTotalWeight() {
		return TotalWeight;
	}
	public By getListPrice() {
		return ListPrice;
	}
	public By getLicensePlateNumber() {
		return LicensePlateNumber;
	}
	public By getAnnualMileage() {
		return AnnualMileage;
	}
	public By getNext1() {
		return Next1;
	}
	
	
	
	
	
}
