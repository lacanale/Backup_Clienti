package Projects.Target1;

import gpclasses.util.misc.*;
public class _IndexIntResource1 extends CgpResIntIndex
{
	public _IndexIntResource1()
	{
		valueArray = new int[11];
		valueArray[0] = 0;
		valueArray[1] = 1;
		valueArray[2] = 2;
		valueArray[3] = 3;
		valueArray[4] = 4;
		valueArray[5] = 5;
		valueArray[6] = 6;
		valueArray[7] = 7;
		valueArray[8] = 8;
		valueArray[9] = 9;
		valueArray[10] = 10;
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
		else if(value == 3)
			index = 3;
		else if(value == 4)
			index = 4;
		else if(value == 5)
			index = 5;
		else if(value == 6)
			index = 6;
		else if(value == 7)
			index = 7;
		else if(value == 8)
			index = 8;
		else if(value == 9)
			index = 9;
		else if(value == 10)
			index = 10;
		return index;
	}
}
