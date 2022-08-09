public class Minimax
{
	public int minimax(Object gameState, int depth, boolean max, Object nextMove)
	{
		if(depth<=0 || isGameOver(gameState))
		{
			return getScore(gameState);
		}
		
		int value=max?-999:999;
		
		for(Object nextState : getNextStates(gameState))
		{
			int v=minimax(nextState,depth-1,!max,null);
			
			if((max && v>value) || (!max && v<value))
			{
				value=v;
				
				if(nextMove!=null)
				{
					nextMove.set(nextState);
				}
			}
		}
		
		return value;
	}
}