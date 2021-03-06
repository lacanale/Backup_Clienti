package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.util.misc.*;

public class D_Display08 extends CgpNumericDisplayDraw
{

	public D_Display08 (int _x1Offset, int _y1Offset, int _x2Offset, int _y2Offset)
	{
		super(_x1Offset, _y1Offset, _x2Offset, _y2Offset);
	}

	public void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2,  int frameClr, int foreClr)
	{
		// Rectangle
		c.fillRectWithBorder(
			0x00ffffff,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 0),
			(y1 + 0),
			(x2 - 0)-(x1 + 0)+1,
			(y2 - 0)-(y1 + 0)+1,
			frameClr,	// ForeColor
			0x00000000,	// BackColor
			1,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

		// 3DRect
		c.drawBevelButton(
			(x1 + 1),
			(y1 + 1),
			(x2 - 1),
			(y2 - 1),
			frameClr,	// ForeColor
			0x00000000,	// BackColor
			1,	// Pattern
			frameClr,	// LineColor
			0x00000000,	// ShadowColor
			4	// line width
		);

		// Line
		c.drawLine(
			(x2 - 0),
			(y1 + 0),
			(x2 - 5),
			(y1 + 5),
			0x00ffffff,	// LineColor
			0x00000000,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Line
		c.drawLine(
			(x1 + 5),
			(y2 - 5),
			(x1 + 0),
			(y2 - 0),
			0x00ffffff,	// LineColor
			0x00000000,	// BackColor
			CgpLinePattern.LINE_SOLID,
			1,	// line width
			CgpPolyLine.ARROW_NONE 	// line end style
		);

		// Rectangle
		c.fillRectWithBorder(
			0x00ffffff,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + 5),
			(y1 + 5),
			(x2 - 5)-(x1 + 5)+1,
			(y2 - 5)-(y1 + 5)+1,
			foreClr,	// ForeColor
			0x00000000,	// BackColor
			1,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
	public void draw(CgpCanvas c, int x1, int y1, int x2, int y2, int frameClr, int foreClr)
	{
	}
}
