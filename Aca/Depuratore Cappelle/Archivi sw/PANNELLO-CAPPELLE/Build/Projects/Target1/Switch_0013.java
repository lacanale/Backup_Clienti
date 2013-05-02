package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

import gpclasses.util.io.*;

public class Switch_0013 extends CgpSmartObject
{
	private boolean secured = false;
	public int securityLevel = -1;
	public CgpFont[] switchFonts;
	public String[] labels;
	public int langID;

	public int[] labelClr;
	public int[] label3DClr;
	public int direction;

	public int vertAlign;

	public int horzAlign;

	public CgpGraphicFile	image01;
	public CgpGraphicFile	image02;
	private boolean	pressed = false;
	public boolean	buzzer = false;

	private String[]	curLabels;
	private CgpFont[]	curFont;
	private CgpCanvas	c;
	public int	panelChange0;
	public CgpExpressionServer exprServer;

	public Switch_0013(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void drawBackground(CgpCanvas c)
	{
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);

		CgpGraphicFile image;
		if(!pressed)
			image = image01;
		else
			image = image02;
		BrowserForward.draw(c,x1,y1,x2,y2,
			image,
			pressed,
			0);

		int labelX = (x1 + 0);
		int labelY = (y1 + 0);
		int labelWidth = (x2 - 0)-(x1 + 0)+1;
		int labelHeight = (y2 - 0)-(y1 + 0)+1;

		curLabels = labels;
		curFont = switchFonts;

		c.drawStringWithBorder(CgpColor.makeTransparentColor(0), labelClr[0], CgpColor.makeTransparentColor(0), label3DClr[0], 1, 1, curLabels[0], labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[0]);
	}

	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			if(CgpSecurityControl.securityControl.testSecurityAccess(securityLevel))
			{
				secured = false;
				this.clearSecured();
			}
			else
			{
				secured = true;
				this.setSecured();
			}
		}
		return true;
	}

	public boolean onPointerPress(CgpPointerEvent PointerEvent)
	{
		if(secured)
		{
			if (drawSecuredType != DRAW_SECURED_INVISIBLE)
			{
				if(CgpSecurityControl.securityControl.lockedObjectLoginPanel > -1)
					CgpTagDB._CurPanelID.write(CgpSecurityControl.securityControl.lockedObjectLoginPanel);
				return false;
			}
			else
			{
				return false;
			}
		}
		if(PointerEvent.getRepeatCount() == 0)
		{
			pressed = true;
			if(buzzer)
				CgpSystem.beep(false);

			// When Actions
			CgpTagDB._CurPanelID.write(panelChange0);
		}

		// While Actions

		return true;
	}

	synchronized public boolean onPointerRelease()
	{
		if (secured)
			return false;
		pressed = false;

		// When Actions

		// While Actions

		// Release Actions
		return true;
	}

	public void onInit()
	{
		curFont = switchFonts;
		curLabels = labels;
	}

}

