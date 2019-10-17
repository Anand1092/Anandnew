package org.company;

public class CompanyInfo {
private void companyName() {
	System.out.println("SCB");
}
private void companyId() {
	System.out.println("123456");
}
private void companyAddress() {
	System.out.println("Karapakkam");
}
public static void main(String[] args ) {
	CompanyInfo c = new CompanyInfo();
				c.companyName();
				c.companyId();
				c.companyAddress();
}
}