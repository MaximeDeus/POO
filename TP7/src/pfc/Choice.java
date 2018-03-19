package pfc;

public enum Choice {
  Rock,
  Scissor,
  Paper;

  public int compareChoice(Choice c){
    switch (this) {
      case Rock:
        if (c == Scissor) return 1;
        if (c == Paper) return -1;
        return 0;

      case Scissor:
        if (c == Paper) return 1;
        if (c == Rock) return -1;
        return 0;

      case Paper:
        if (c == Rock) return 1;
        if (c == Scissor) return -1;
      default:
        return 0;
    }
  }
}
