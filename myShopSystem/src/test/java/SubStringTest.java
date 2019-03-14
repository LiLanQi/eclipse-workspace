
public class SubStringTest {

	public static void main(String[] args) {
		String detailAddress = "河南省郑州市高新区科学大道100号郑州大学";
		String province = detailAddress.substring(0, detailAddress.indexOf('省'));
		String city = detailAddress.substring(detailAddress.indexOf('省') + 1, detailAddress.indexOf('市'));
		String area = detailAddress.substring(detailAddress.indexOf('市') + 1, detailAddress.indexOf('区'));
		String location = detailAddress.substring(detailAddress.indexOf('区') + 1, detailAddress.length());
		System.out.println(province);
		System.out.println(city);
		System.out.println(area);
		System.out.println(location);
	}
}
