package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.baseclasses.CgpReferenceTag;
import gpclasses.system.CgpRefTagFactory;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.script.*;
import gpclasses.userScripts.*;
import gpclasses.alarms.*;

import java.text.Format;

import java.util.Vector;

public class Panel9 extends CgpPanel
{
	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay AvvioM1Bassa;
	public CgpNumericDisplay AvvioM1Alta;
	public CgpNumericDisplay AvvioM1Alta01;
	CgpFont F1_0;
	CgpFont F6;
	CgpGraphicFile nativeImage0;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
	}
	public String getPanelName()
	{
		return "Setup3";
	}
	public int getPanelID()
	{
		return 9;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F6 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();
		ButtonIndietro2 = new Switch_0002(0, 200, 59, 239, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap1.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro2.image01 = nativeImage0;
		ButtonIndietro2.image02 = nativeImage0;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = " ";

		F1_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts1[0] = F1_0;

		ButtonIndietro2.buzzer = true;

		ButtonIndietro2.switchFonts = fonts1;
		ButtonIndietro2.labels = labels1;

		int intArray0[] = {0x00ffffff, };
		ButtonIndietro2.labelClr = intArray0;
		int intArray1[] = {0x00777777, };
		ButtonIndietro2.label3DClr = intArray1;
		ButtonIndietro2.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro2.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro2.alwaysDrawBackground = false;

		ButtonIndietro2.init();

		AvvioM1Bassa = new CgpNumericDisplay(220, 60, 279, 79, panelContext, this);
		AvvioM1Bassa.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		AvvioM1Bassa.variable = TagDB.PLC_ApparecchiaturaModbus01$Kp_Ossigeno;
		AvvioM1Bassa.zeroSuppress = true;
		AvvioM1Bassa.zeroDisplay = true;
		AvvioM1Bassa.displayDigits = 6;
		AvvioM1Bassa.decimalPlaces = 0;
		AvvioM1Bassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		CgpFont	fonts7[][] = {
			{ textFont0 },
			};
		AvvioM1Bassa.fonts = fonts7;
		AvvioM1Bassa.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AvvioM1Bassa.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AvvioM1Bassa.enableInput = true;
		AvvioM1Bassa.displayPopupKeypad = true;
		AvvioM1Bassa.keypad = decKeypad;
		AvvioM1Bassa.beepOnTouch = false;
		AvvioM1Bassa.barcode = false;
		AvvioM1Bassa.frameColor = 0x00333333;
		AvvioM1Bassa.foreColor = 0x00000000;
		AvvioM1Bassa.textColor = 0x00ffffff;
		AvvioM1Bassa.text3DColor = 0x00000000;
		AvvioM1Bassa.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM1Bassa.changeColor = false;
		AvvioM1Bassa.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		AvvioM1Bassa.drawObject = displayDraw0;
		AvvioM1Bassa.alwaysDrawBackground = false;
		AvvioM1Bassa.init();

		AvvioM1Alta = new CgpNumericDisplay(220, 80, 279, 99, panelContext, this);
		AvvioM1Alta.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		AvvioM1Alta.variable = TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT;
		AvvioM1Alta.zeroSuppress = true;
		AvvioM1Alta.zeroDisplay = true;
		AvvioM1Alta.displayDigits = 6;
		AvvioM1Alta.decimalPlaces = 0;
		AvvioM1Alta.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		AvvioM1Alta.fonts = fonts7;
		AvvioM1Alta.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AvvioM1Alta.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AvvioM1Alta.enableInput = true;
		AvvioM1Alta.displayPopupKeypad = true;
		AvvioM1Alta.keypad = decKeypad;
		AvvioM1Alta.beepOnTouch = false;
		AvvioM1Alta.barcode = false;
		AvvioM1Alta.frameColor = 0x00333333;
		AvvioM1Alta.foreColor = 0x00000000;
		AvvioM1Alta.textColor = 0x00ffffff;
		AvvioM1Alta.text3DColor = 0x00000000;
		AvvioM1Alta.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM1Alta.changeColor = false;
		AvvioM1Alta.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM1Alta.drawObject = displayDraw0;
		AvvioM1Alta.alwaysDrawBackground = true;
		AvvioM1Alta.init();

		CgpText Testo03 = new CgpText
		(
			"Isteresi",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			100,	// y1
			199,	// x2
			119,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo03.set3DColor(0x00777777);

		AvvioM1Alta01 = new CgpNumericDisplay(220, 100, 279, 119, panelContext, this);
		AvvioM1Alta01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		AvvioM1Alta01.variable = TagDB.PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno;
		AvvioM1Alta01.zeroSuppress = true;
		AvvioM1Alta01.zeroDisplay = true;
		AvvioM1Alta01.displayDigits = 6;
		AvvioM1Alta01.decimalPlaces = 0;
		AvvioM1Alta01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		AvvioM1Alta01.fonts = fonts7;
		AvvioM1Alta01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AvvioM1Alta01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AvvioM1Alta01.enableInput = true;
		AvvioM1Alta01.displayPopupKeypad = true;
		AvvioM1Alta01.keypad = decKeypad;
		AvvioM1Alta01.beepOnTouch = false;
		AvvioM1Alta01.barcode = false;
		AvvioM1Alta01.frameColor = 0x00333333;
		AvvioM1Alta01.foreColor = 0x00000000;
		AvvioM1Alta01.textColor = 0x00ffffff;
		AvvioM1Alta01.text3DColor = 0x00000000;
		AvvioM1Alta01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM1Alta01.changeColor = false;
		AvvioM1Alta01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM1Alta01.drawObject = displayDraw0;
		AvvioM1Alta01.alwaysDrawBackground = true;
		AvvioM1Alta01.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$Kp_Ossigeno.addEventListener(AvvioM1Bassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT.addEventListener(AvvioM1Alta, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno.addEventListener(AvvioM1Alta01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[6];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = AvvioM1Bassa;
		zOrderList[2] = AvvioM1Alta;
		zOrderList[3] = Testo03;
		zOrderList[4] = AvvioM1Alta01;
		zOrderList[5] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			AvvioM1Alta01,
			AvvioM1Alta,
			AvvioM1Bassa,
			ButtonIndietro2,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$Kp_Ossigeno);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();

		AvvioM1Alta01.shutdown();

		AvvioM1Alta.shutdown();

		AvvioM1Bassa.shutdown();

		ButtonIndietro2.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Testo01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Guadagno Proporz. (Kp)",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			200,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1_0	// font type
		);
		// Testo02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Fattore Integrativo",	// text
			0 + _dx,	// x
			80 + _dy,	// y
			200,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1_0	// font type
		);
		// Testo05
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00888888,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Impostazione Parametri\nRedox",	// text
			0 + _dx,	// x
			0 + _dy,	// y
			320,	// width
			60,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F6	// font type
		);
		AvvioM1Bassa.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
