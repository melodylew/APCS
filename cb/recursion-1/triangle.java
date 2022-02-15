public class Triangle{
  public int triangle(int rows) {
    if (rows <= 1) {
      return rows;
    }
    return rows + triangle(rows - 1);
  }
}
