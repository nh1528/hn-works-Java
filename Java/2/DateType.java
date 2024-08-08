class DataType {
  public static void main(String[] args) {
    // 変数の初期化をしている
    int month = 12;
    int day = 29;
    float weight = 63.0f; // floatだからfをつけてる
    double height = 168.5;
    char bloodType = 'Ａ';// 文字を代入するからシングルクォーテーション

    // 変数を初期化する
    String name = "菅原";
    // Sは大文字、文字はダブルクォーテーションで囲む

    System.out.println("こんにちは！" + name + "です。");
    System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
    System.out.println("誕生日は" + month + "月" + day + "日、");
    System.out.println("血液型は" + bloodType + "型です。");
    System.out.println("チャンネル登録や拡散よろしくお願いします！");
  }
}
