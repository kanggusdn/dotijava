package upgrade;

public class Chapter08_OverridingTest1 {
	public static void main(String[] args) {
		Chapter08_Customer customerLee = new Chapter08_Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;

		Chapter08_VIPCustomer customerKim = new Chapter08_VIPCustomer(10020, "김유신", 12345);
		customerKim.bonusPoint = 10000;

		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
	}
}
