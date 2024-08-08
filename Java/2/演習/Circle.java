class Circle {
  public static void main(String[] args) {
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area;

    area = radius * radius * pi;

    // 小数点第3位以降を切り捨て
    // キャストを使って切り捨てする
    area = (int) (area * 100); // 小数点を右に二つずらして、整数を作る
    area = area / 100; // 小数点を左に二つずらして戻す

    System.out.println("半径：" + radius);
    System.out.println("面積：" + area);
  }
}
