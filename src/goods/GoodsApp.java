package goods;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();

		camera.setName("Nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);
		
		Goods goods2 = new Goods("Nikon2", 100,200, 200000);

		System.out.println("상품이름 : " + camera.getName());
		System.out.println("상품가격 : " + camera.getPrice());
		System.out.println("재고수량 : " + camera.getCountStock());
		System.out.println("팔린개수 : " + camera.getCountSold());
		
	}
}