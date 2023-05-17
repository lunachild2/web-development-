package exam01;

public class Ex01 {
    public static void main(String[] args) {

        int num = 1, total = 0; // 초기식

        while(num <= 100) { // 조건식
            //total = total + num;
            total += num;
            //num = num + 1;
            num++; // 증가식
        }

        System.out.println(total);



    }
}
