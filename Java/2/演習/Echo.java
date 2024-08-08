class Echo {
  public static void main(String[] args) {
    // コマンドラインの入力文字列を表示（for文）

    for (String s : args) { // int i = 0; args.length;i++
      System.out.println(s);
    }
  }
}
