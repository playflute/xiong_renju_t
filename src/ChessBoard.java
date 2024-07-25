public class ChessBoard 
{
	private Chess[][] grid;	
	
	public ChessBoard()
	{
		grid=new Chess[15][15];
	}

	
	public Chess[][] getGrid()
	{
		return grid;
	}
	
	public void showChessBoard()
	{
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<15;j++)
			{
				if(grid[i][j]==null)
				{
					System.out.print("E");
					System.out.print("|");
				}
				else if(grid[i][j].getColor()=="white")
				{
					System.out.print("W");
					System.out.print("|");
				}
				else
				{
					System.out.print("B");
					System.out.print("|");
				}
			}
			System.out.println();
			System.out.println("------------------------------");
		}
	}
	
	

	

}
