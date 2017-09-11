    public T remove() 
    {
		Random r = new Random();
		T result = null;
		Node searchingNode = firstNode;

		if(numberOfEntries == 0)
			return result;

		int randomNum = r.nextInt(numberOfEntries);//WHY DOES THIS HAVE TO GO HERE?

		if(randomNum == 0)
		{
			result = this.firstNode.data;
			this.firstNode = this.firstNode.next;
			numberOfEntries--;
		}
		else
		{
			searchingNode = firstNode;
			for(int i = 1; i < randomNum; i++)
				searchingNode = searchingNode.next;

			result = searchingNode.next.data;
			searchingNode.next = searchingNode.next.next;
			numberOfEntries--;
		}

  /*    if (firstNode != null)
        {
            result = firstNode.data;
            firstNode = firstNode.next; // remove first node from chain
            numberOfEntries--;
        } // end if
  */

        return result;
    } // end remove
    
    public boolean equals(LinkedBag<T> aBag)
    {
        boolean result = true; // result of comparison of bags
        Node thisNode = firstNode;
        Node tempArgument = aBag.firstNode;

		if(this.numberOfEntries != aBag.numberOfEntries)
			result = false;
		else if(this.isEmpty() && aBag.isEmpty())
			result = true;
		else

        	for(int i = 0; i < this.numberOfEntries; i++)

        		if(getFrequencyOf(thisNode.data) == aBag.getFrequencyOf(tempArgument.data))
        		{
					result = true;
				}
        		else
        			result = false;

        return result;
    }  // end equals