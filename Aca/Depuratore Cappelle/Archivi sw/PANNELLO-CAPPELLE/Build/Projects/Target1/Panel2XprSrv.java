package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import gpclasses.plugins.script.*;
import java.util.Date;
import gpclasses.plugins.diag.*;
import gpclasses.util.misc.*;

public class Panel2XprSrv extends CgpExpressionServer
{
	public float executeFloatExpression(int i)
	{
		switch (i)
		{
			case 1000:
			case 1002:
			case 1004:
			case 1006:
			case 1008:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)0.0);
				}
			case 1001:
			case 1003:
			case 1005:
			case 1007:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)100.0);
				}
			case 1009:
				{
					quality = CgpTag.TAG_QUALITY_GOOD;
					return ((float)20.0);
				}
		}
		return 0.0f;
	}

}
