package day02;

public class LoopSample {
	public static void main(String[] args) {
		int num = 0, i = 1;
		while (i <= 100) {
			if (i % 3 == 0) {
				System.out.println(i + " ");
				num++;
			}
			//��ӡǰ5��
			if (num == 5) {
				break;
			}
			i++;
		}
	}

}
