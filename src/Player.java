
public class Player implements Playable
{
	private String name;
	private String color;//"black" or "white"
	
	
	
	public Player(String name,String color)
	{
		this.name=name;
		this.color=color;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) 
	{
		this.color = color;
	}
	
	public boolean putDownChess(ChessBoard board,int row,int col)
	{

		if(board.getGrid()[row][col]==null)
		{
			board.getGrid()[row][col]=new Chess(this.color);//创造实例
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
