package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class TextList_0006 extends CgpSmartObject
{
	private CgpCanvas c = null;
	private int quality = 0;
	public int langID = 0;
	public CgpResColor colorRes;
	public CgpResText textRes;
	private int colors[] = null;
	private CgpFont font;
	private CgpTextFontObj textFontIndex;
	public int vertAlign;
	public int horzAlign;
	public int labelX;
	public int labelY;
	public int labelWidth;
	public int labelHeight;
	public CgpResIntIndex indexRes;
	private boolean bInvalidState = false;
	public int nNumStates = 0;
	public CgpTag	variableTag = null;
	public int	variableExpr = -1;
	private int currentValue = -1;
	private boolean	bSpinkeypadShowed = false;
	public CgpExpressionServer exprServer;

	public TextList_0006(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
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

		Display08.draw(c,x1,y1,x2,y2,colors[colorRes.FRAME], colors[colorRes.PLATE], false, 0);
		c.drawStringWithBorder(0, colors[colorRes.TEXT], CgpColor.makeTransparentColor(0), colors[colorRes.THREED], 1, CgpLinePattern.LINE_NONE, textFontIndex.text, labelX, labelY, labelWidth, labelHeight, CgpText.DISPLAY_ANGLE_0, CgpText.DISPLAY_DIRECTION_HORIZONTAL, horzAlign, vertAlign, 0, font);
		if(quality == CgpTag.TAG_QUALITY_UNKNOWN)
		{
			c.fillRectWithBorder(	0x00000000, 1, CgpLinePattern.LINE_NONE, x1, y1,
				x2 - x1 + 1, y2 - y1 + 1, 0x80000000, 0x00000000 ,
				CgpFillPattern.FILL_DOWNWARD_DIAGONAL, CgpRectangle.SQUARE_CORNERS, 1, 1);
		}
	}

	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			checkSecurity();
		}
		int newValue = 0;
		if (variableExpr == -1)
		{
			newValue = variableTag.getIntValue(0);
			quality = variableTag.getTagDataQuality();
		}
		else
		{
			newValue = exprServer.executeIntExpression(variableExpr);
			quality = exprServer.quality;
		}

		if(!bSpinkeypadShowed || colors == null)
		{
			currentValue = newValue;
			int nIndex = indexRes.getIndexFromValue(currentValue);
			if(nIndex >= nNumStates || nIndex <= -1)
			{
				nIndex = -1;
				bInvalidState = true;
			}
			else
				bInvalidState = false;
			colors = colorRes.getItemFromIndex(nIndex);
			textFontIndex = textRes.getItemFromIndex(nIndex, langID);
			font = GlobalFontResource.getItemFromIndex(textFontIndex.fontID, langID);
		}
		return true;
	}

	public void onInit()
	{
		initLabelSize();
	}

	public void move(int sDelta, boolean bHoriz)
	{
		super.move(sDelta,bHoriz);
		initLabelSize();
	}

	public void initLabelSize()
	{
		labelX = (x1 + 6);
		labelY = (y1 + 6);
		labelWidth = (x2 - 6)-(x1 + 6)+1;
		labelHeight = (y2 - 6)-(y1 + 6)+1;
	}

	public String FormatInitalValue()
	{
		String initialValue;
		int nKeypadDecimal = 2;
		initialValue = Integer.toString(currentValue);
		if (nKeypadDecimal > 0)
		{
			boolean neg = false;
			if (currentValue < 0)
			{
				neg = true;
				initialValue = Integer.toString(Math.abs(currentValue));
			}
			int initialLength = initialValue.length();
			if (initialLength <= nKeypadDecimal)
			{
				String decValue = "0" + CgpLocater.Decimal_Symbol;
				for (int i=0; i < nKeypadDecimal; i++)
				{
					if (i >= nKeypadDecimal - initialLength)
					{
						decValue = decValue + initialValue;
						break;
					}
					else
					{
						decValue = decValue + "0";
					}
				}
				initialValue = decValue;
			}

			if (neg && initialValue.indexOf("-") == -1)
				initialValue = "-" + initialValue;
		}
		return initialValue;
	}
}

