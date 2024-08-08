class LoopMessage {
  public static void main(String[] args) {
    // メッセージを10回表示（While文）
    int i = 1;

    while (i < 11) { // (i <= 10)の方がいい
      System.out.println(i + "回目：メッセージを表示");
      i++;
    }
  }
}
