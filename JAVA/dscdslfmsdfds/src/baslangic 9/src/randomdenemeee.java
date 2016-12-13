import java.util.Scanner;
import java.util.Random;
public class randomdenemeee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int gecici , size;
		int dizi[];
		int k;
		int sayac=0;
		size = input.nextInt();
		dizi= new int[size];
		for (int i=0;i<size ;){
			sayac++;
			System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r"+sayac);
			gecici = random.nextInt(100);
			for ( k=0;k<i;k++){
				System.out.println("\r\r\r\r\r\r\r\r\r\r\r\r\r\r" +sayac);
				sayac++;
				if (gecici == dizi[k])
					break;
			}
			if (dizi[k]==gecici)
				continue;
			dizi[i]= gecici;
			i++;
		}
		boolean degisim = true;
	while (degisim){
		degisim = false;
		for (int i=0;i<size-1; i++){
			if (dizi[i]>dizi[i+1]){
			gecici = dizi[i];
			dizi[i]=dizi[i+1];
			dizi[i+1]= gecici;
			degisim = true;
			}
		}
	}
		for (int i=0;i<size ;i++){
			System.out.println(dizi[i]);
		}
	
	System.out.println("\n\n\n\n\n"+sayac);
	}

}
