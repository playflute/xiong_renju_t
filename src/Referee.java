
public class Referee implements Judgeable
{


	private String judgeRow(ChessBoard board)
	{

		for(int i=0;i<15;i++)
		{
			int blackCount=0;
			int whiteCount=0;
			for(int j=0;j<15;j++)
			{
				if(board.getGrid()[i][j]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[i][j].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[i][j].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}
	
	
	
	private String judgeCol(ChessBoard board)
	{

		for(int i=0;i<15;i++)
		{
			int blackCount=0;
			int whiteCount=0;
			for(int j=0;j<15;j++)
			{
				if(board.getGrid()[j][i]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[j][i].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[j][i].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}
	
	
	private String judgeTopleftTriangel(ChessBoard board)
	{

		for(int sum=4;sum<15;sum++)
		{
			int blackCount=0;
			int whiteCount=0;
			for(int i=0;i<=sum;i++)
			{
				if(board.getGrid()[i][sum-i]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[i][sum-i].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[i][sum-i].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}
	
	
	private String judgeBottomrightTriangel(ChessBoard board)
	{

		for(int sum=14;sum<=24;sum++)
		{
			int blackCount=0;
			int whiteCount=0;
			int a=0;
			for(int j=14;j>=sum-14;j--)
			{
				
				if(board.getGrid()[sum-j][j]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[sum-j][j].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[sum-j][j].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}
	

	private String judgeBottomleftTriangel(ChessBoard board)
	{

		for(int i=0;i<=10;i++)
		{
			int blackCount=0;
			int whiteCount=0;
			for(int j=0;j<=14&&i+j<=14;j++)
			{
				if(board.getGrid()[i+j][j]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[i+j][j].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[i+j][j].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}

	
	private String judgeTopRightTriangel(ChessBoard board)
	{

		for(int i=0;i<=10;i++)
		{
			int blackCount=0;
			int whiteCount=0;
			for(int j=0;j<=14&&i+j<=14;j++)
			{
				if(board.getGrid()[j][i+j]==null)
				{
					whiteCount=0;
					blackCount=0;
				}
				else if(board.getGrid()[j][i+j].getColor().equals("black"))
				{
					whiteCount=0;
					blackCount+=1;
				}
				else if(board.getGrid()[j][i+j].getColor().equals("white"))
				{
					whiteCount+=1;
					blackCount=0;
				}
				
				
				if(blackCount==5)
				{
					return "Black win";
				}
				else if(whiteCount==5)
				{
					return "White win";
				}
				
			}
		}
		return "No winner";
	}

	
	public String judge(ChessBoard board)
	{
		if(
				this.judgeRow(board).equals("White win")
				||this.judgeCol(board).equals("White win")
				||this.judgeBottomleftTriangel(board).equals("White win")
				||this.judgeBottomrightTriangel(board).equals("White win")
				||this.judgeTopleftTriangel(board).equals("White win")
				||this.judgeTopRightTriangel(board).equals("White win")
		  )
		{
			return "White win";
		}
		else if(
				this.judgeRow(board).equals("Black win")
				||this.judgeCol(board).equals("White win")
				||this.judgeBottomleftTriangel(board).equals("Black win")
				||this.judgeBottomrightTriangel(board).equals("Black win")
				||this.judgeTopleftTriangel(board).equals("Black win")
				||this.judgeTopRightTriangel(board).equals("Black win")
				)
		{
			return "Black win";
		}
		else 
		{
			return "No winner";
		}
	}

}
