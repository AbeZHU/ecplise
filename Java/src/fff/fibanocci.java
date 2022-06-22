package fff;

public class fibanocci {
public static void main(String[] args) {
	int count = 100;
	int second =1;
	int series=0 ;
	while(second<count) {
		
		System.out.println(series);

		series=series+second;
		second=series;
		
	}
}
}
