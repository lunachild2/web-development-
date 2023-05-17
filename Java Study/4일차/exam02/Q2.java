package exam02;

public class Q2 {
    public static void main(String[] args) {

        int room = 0;
        int student = 1;

        for(int i = 0; i < 10; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.printf("학생%d,방번호%d번\n",student,room);
                student++;
            }
            room++;
            System.out.println();
        }


    }
}
