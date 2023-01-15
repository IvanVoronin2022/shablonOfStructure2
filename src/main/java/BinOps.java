public class BinOps {

    public String sum(String a, String b) {
        int firstValue = Integer.parseInt(a, 2);
        int secondValue = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstValue + secondValue);

    }

    public String mult(String a, String b) {
        int firstValue = Integer.parseInt(a, 2);
        int secondValue = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstValue * secondValue);
    }
}
