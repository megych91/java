public class Pythagorean {
    public static void main(String[] args){
        Pythagorean result = new Pythagorean(); 
        result.calculateHypotenuse(4, 4);
        result.calculateHypotenuse(2, 2);
        result.calculateHypotenuse(6, 6);
    }
    public double calculateHypotenuse(int legA, int legB) {
        double squareRoot = legA * legA + legB * legB;
        System.out.println(squareRoot);
        return squareRoot;
    }
}