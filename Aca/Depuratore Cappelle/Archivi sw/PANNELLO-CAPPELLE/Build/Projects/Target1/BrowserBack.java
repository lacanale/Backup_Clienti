package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class BrowserBack
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, CgpGraphicFile image, boolean pressed, int lamp)
{
if(pressed)
{
	if(lamp > 0)
	{
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + 0),
				(y1 + 0)
			);

		}
	}
	else
	{
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + 0),
				(y1 + 0)
			);

		}
	}
}
else
{
	if(lamp > 0)
	{
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + 0),
				(y1 + 0)
			);

		}
	}
	else
	{
		// Image
		if(image != null)
		{
			c.drawImage(
				image,
				(x1 + 0),
				(y1 + 0)
			);

		}
	}
}
}
}
