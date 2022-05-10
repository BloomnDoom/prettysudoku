object Main
{
  def main(args:Array[String])=
  {
    renderSudoku(Array(
      Array(3, 1, 6, 5, 7, 8, 4, 9, 2),
      Array(5, 2, 9, 1, 3, 4, 7, 6, 8),
      Array(4, 8, 7, 6, 2, 9, 5, 3, 1),
      Array(2, 6, 3, 0, 1, 0, 0, 8, 0),
      Array(9, 7, 4, 8, 6, 3, 0, 0, 5),
      Array(8, 5, 1, 0, 9, 0, 6, 0, 0),
      Array(1, 3, 0, 0, 0, 0, 2, 5, 0),
      Array(0, 0, 0, 0, 0, 0, 0, 7, 4),
      Array(0, 0, 5, 2, 0, 6, 3, 0, 0)
    ));
  }
  def renderSudoku(grid:Array[Array[Int]]):Unit=
  {
    var rowCount,colCount=0;
    for(row<-grid)
    {
      if(colCount%6==0) println("+-------+-------+-------+");
      colCount+=2;
      for(elem<-row)
      {
        if(rowCount%3==0) print("| ");
        if(elem==0) print(" ")
        else print(elem);
        print(" ");
        rowCount+=1;
      }
      println("|");
    }
    println("+-------+-------+-------+");
  }
}
