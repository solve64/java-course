	private boolean solve(Object gameState)
	{
		if(isWinner(gameState))
		{
			return true;
		}
		
		for(Object nextState : nextStates)
		{
			if(solve(nextState))
			{
				return true;
			}
		}
		
		return false;
	}
