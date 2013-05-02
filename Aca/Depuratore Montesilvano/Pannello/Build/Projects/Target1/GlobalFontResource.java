package Projects.Target1;

import gpclasses.util.misc.*;
import gpclasses.util.misc.*;
import gpclasses.graphics.*;
import gpclasses.baseclasses.*;
public class GlobalFontResource
{
	private static CgpFont fontArray[][];
	private static CgpFont defaultFont[];
	static
	{
		fontArray = new CgpFont[1][1];
		fontArray[0][0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
	}

	static public CgpFont getItemFromIndex(int index, int language)
	{
		return fontArray[language][index];
	}
}
