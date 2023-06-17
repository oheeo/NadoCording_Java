package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ASKII) : 미국 표준 코드
        char c = 'A';  // 알파벳 대문자(A)는 65 부터 시작, 소문자(a)는 97 부터 시작, 숫자(0)는 48 부터 시작.
        System.out.println(c);
        System.out.println((int)c);  // 65

        c = 'B';
        System.out.println(c);
        System.out.println((int)c);  // 66

        c++;
        System.out.println(c);  // C
        System.out.println((int)c);  // 67

        c = '1';
        System.out.println(c);  // 1
        System.out.println((int)c);  // 49


        String[][] seats3 = new String[10][15];
        char eng = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(eng) + (j+1);
            }
            eng++;
        }

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("eng = " + eng);
    }
    
}
