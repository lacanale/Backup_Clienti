package Projects.Target1;

import gpclasses.util.misc.*;
public class _IndexIntResource0 extends CgpResIntIndex
{
	public _IndexIntResource0()
	{
		valueArray = new int[3];
		valueArray[0] = 0;
		valueArray[1] = 1;
		valueArray[2] = 2;
	}

	public int getIndexFromValue(int value)
	{
		int index=-1;
		if(value == 0)
			index = 0;
		else if(value == 1)
			index = 1;
		else if(value == 2)
			index = 2;
		return index;
	}
}
