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

public class Panel2 extends CgpPanel
{
	public Panel2XprSrv exprServer;

	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay AvvioM1Bassa;
	public CgpNumericDisplay AvvioM1Alta;
	public CgpNumericDisplay AvvioM2Bassa;
	public CgpNumericDisplay AvvioM2Alta;
	public Switch_0013 ButtonIndietro01;
	public CgpNumericDisplay AnomaliaMotori01;
	CgpFont F1_0;
	CgpFont F6;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel2XprSrv();
	}
	public String getPanelName()
	{
		return "Setup1";
	}
	public int getPanelID()
	{
		return 2;
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

		AvvioM1Bassa = new CgpNumericDisplay(180, 56, 239, 79, panelContext, this);
		AvvioM1Bassa.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		AvvioM1Bassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		AvvioM1Bassa.variable = TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin1;
		AvvioM1Bassa.zeroSuppress = true;
		AvvioM1Bassa.zeroDisplay = true;
		AvvioM1Bassa.displayDigits = 3;
		AvvioM1Bassa.decimalPlaces = 3;
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
		AvvioM1Bassa.exprServer = exprServer;
		AvvioM1Bassa.useLocalMinMax  = true;
		AvvioM1Bassa.minExpr   = 1000;
		AvvioM1Bassa.maxExpr   = 1001;
		AvvioM1Bassa.init();

		AvvioM1Alta = new CgpNumericDisplay(180, 80, 239, 99, panelContext, this);
		AvvioM1Alta.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		AvvioM1Alta.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		AvvioM1Alta.variable = TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin2;
		AvvioM1Alta.zeroSuppress = true;
		AvvioM1Alta.zeroDisplay = true;
		AvvioM1Alta.displayDigits = 3;
		AvvioM1Alta.decimalPlaces = 3;
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
		AvvioM1Alta.exprServer = exprServer;
		AvvioM1Alta.useLocalMinMax  = true;
		AvvioM1Alta.minExpr   = 1002;
		AvvioM1Alta.maxExpr   = 1003;
		AvvioM1Alta.init();

		AvvioM2Bassa = new CgpNumericDisplay(180, 100, 239, 119, panelContext, this);
		AvvioM2Bassa.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		AvvioM2Bassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		AvvioM2Bassa.variable = TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax1;
		AvvioM2Bassa.zeroSuppress = true;
		AvvioM2Bassa.zeroDisplay = true;
		AvvioM2Bassa.displayDigits = 3;
		AvvioM2Bassa.decimalPlaces = 3;
		AvvioM2Bassa.fonts = fonts7;
		AvvioM2Bassa.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AvvioM2Bassa.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AvvioM2Bassa.enableInput = true;
		AvvioM2Bassa.displayPopupKeypad = true;
		AvvioM2Bassa.keypad = decKeypad;
		AvvioM2Bassa.beepOnTouch = false;
		AvvioM2Bassa.barcode = false;
		AvvioM2Bassa.frameColor = 0x00333333;
		AvvioM2Bassa.foreColor = 0x00000000;
		AvvioM2Bassa.textColor = 0x00ffffff;
		AvvioM2Bassa.text3DColor = 0x00000000;
		AvvioM2Bassa.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM2Bassa.changeColor = false;
		AvvioM2Bassa.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM2Bassa.drawObject = displayDraw0;
		AvvioM2Bassa.alwaysDrawBackground = true;
		AvvioM2Bassa.exprServer = exprServer;
		AvvioM2Bassa.useLocalMinMax  = true;
		AvvioM2Bassa.minExpr   = 1004;
		AvvioM2Bassa.maxExpr   = 1005;
		AvvioM2Bassa.init();

		AvvioM2Alta = new CgpNumericDisplay(180, 120, 239, 139, panelContext, this);
		AvvioM2Alta.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		AvvioM2Alta.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		AvvioM2Alta.variable = TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax2;
		AvvioM2Alta.zeroSuppress = true;
		AvvioM2Alta.zeroDisplay = true;
		AvvioM2Alta.displayDigits = 3;
		AvvioM2Alta.decimalPlaces = 3;
		AvvioM2Alta.fonts = fonts7;
		AvvioM2Alta.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AvvioM2Alta.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AvvioM2Alta.enableInput = true;
		AvvioM2Alta.displayPopupKeypad = true;
		AvvioM2Alta.keypad = decKeypad;
		AvvioM2Alta.beepOnTouch = false;
		AvvioM2Alta.barcode = false;
		AvvioM2Alta.frameColor = 0x00333333;
		AvvioM2Alta.foreColor = 0x00000000;
		AvvioM2Alta.textColor = 0x00ffffff;
		AvvioM2Alta.text3DColor = 0x00000000;
		AvvioM2Alta.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM2Alta.changeColor = false;
		AvvioM2Alta.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AvvioM2Alta.drawObject = displayDraw0;
		AvvioM2Alta.alwaysDrawBackground = true;
		AvvioM2Alta.exprServer = exprServer;
		AvvioM2Alta.useLocalMinMax  = true;
		AvvioM2Alta.minExpr   = 1006;
		AvvioM2Alta.maxExpr   = 1007;
		AvvioM2Alta.init();

		CgpText Testo06 = new CgpText
		(
			"%",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			240,	// x1
			60,	// y1
			279,	// x2
			79,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo06.set3DColor(0x00777777);
		ButtonIndietro01 = new Switch_0013(260, 200, 319, 239, panelContext, this);
		nativeImage1 = new CgpGraphicFile( "Bitmap42.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro01.image01 = nativeImage1;
		ButtonIndietro01.image02 = nativeImage1;

		CgpFont	fonts19[];
		String	labels19[];
		fonts19 = new CgpFont[1];
		labels19 = new String[1];

		labels19[0] = " ";
		fonts19[0] = F1_0;

		ButtonIndietro01.buzzer = true;

		ButtonIndietro01.switchFonts = fonts19;
		ButtonIndietro01.labels = labels19;

		ButtonIndietro01.labelClr = intArray0;
		ButtonIndietro01.label3DClr = intArray1;
		ButtonIndietro01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro01.panelChange0 = 8;
		ButtonIndietro01.exprServer = exprServer;
		ButtonIndietro01.alwaysDrawBackground = false;

		ButtonIndietro01.init();

		CgpText Testo07 = new CgpText
		(
			"%",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			244,	// x1
			83,	// y1
			276,	// x2
			96,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo07.set3DColor(0x00777777);

		CgpText Testo08 = new CgpText
		(
			"%",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			244,	// x1
			103,	// y1
			276,	// x2
			116,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo08.set3DColor(0x00777777);

		CgpText Testo09 = new CgpText
		(
			"%",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			244,	// x1
			122,	// y1
			276,	// x2
			135,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo09.set3DColor(0x00777777);

		CgpText Testo12 = new CgpText
		(
			"Valore Attuale",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			180,	// y1
			161,	// x2
			199,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo12.set3DColor(0x00777777);

		AnomaliaMotori01 = new CgpNumericDisplay(180, 180, 239, 199, panelContext, this);
		AnomaliaMotori01.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		AnomaliaMotori01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		AnomaliaMotori01.variable = TagDB.PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno;
		AnomaliaMotori01.zeroSuppress = true;
		AnomaliaMotori01.zeroDisplay = true;
		AnomaliaMotori01.displayDigits = 3;
		AnomaliaMotori01.decimalPlaces = 3;
		AnomaliaMotori01.fonts = fonts7;
		AnomaliaMotori01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		AnomaliaMotori01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		AnomaliaMotori01.enableInput = true;
		AnomaliaMotori01.displayPopupKeypad = true;
		AnomaliaMotori01.keypad = decKeypad;
		AnomaliaMotori01.beepOnTouch = false;
		AnomaliaMotori01.barcode = false;
		AnomaliaMotori01.frameColor = 0x00333333;
		AnomaliaMotori01.foreColor = 0x00000000;
		AnomaliaMotori01.textColor = 0x00ffffff;
		AnomaliaMotori01.text3DColor = 0x00000000;
		AnomaliaMotori01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AnomaliaMotori01.changeColor = false;
		AnomaliaMotori01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		AnomaliaMotori01.drawObject = displayDraw0;
		AnomaliaMotori01.alwaysDrawBackground = true;
		AnomaliaMotori01.exprServer = exprServer;
		AnomaliaMotori01.useLocalMinMax  = true;
		AnomaliaMotori01.minExpr   = 1008;
		AnomaliaMotori01.maxExpr   = 1009;
		AnomaliaMotori01.init();

		CgpText Testo13 = new CgpText
		(
			"%",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			247,	// x1
			183,	// y1
			279,	// x2
			196,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo13.set3DColor(0x00777777);
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin1.addEventListener(AvvioM1Bassa, 0, panelContext);
		TagDB._Seconds.addEventListener(AvvioM1Bassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin2.addEventListener(AvvioM1Alta, 0, panelContext);
		TagDB._Seconds.addEventListener(AvvioM1Alta, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax1.addEventListener(AvvioM2Bassa, 0, panelContext);
		TagDB._Seconds.addEventListener(AvvioM2Bassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax2.addEventListener(AvvioM2Alta, 0, panelContext);
		TagDB._Seconds.addEventListener(AvvioM2Alta, 0, panelContext);
		TagDB._Seconds.addEventListener(AnomaliaMotori01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno.addEventListener(AnomaliaMotori01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[14];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = AvvioM1Bassa;
		zOrderList[2] = AvvioM1Alta;
		zOrderList[3] = AvvioM2Bassa;
		zOrderList[4] = AvvioM2Alta;
		zOrderList[5] = Testo06;
		zOrderList[6] = ButtonIndietro01;
		zOrderList[7] = Testo07;
		zOrderList[8] = Testo08;
		zOrderList[9] = Testo09;
		zOrderList[10] = Testo12;
		zOrderList[11] = AnomaliaMotori01;
		zOrderList[12] = Testo13;
		zOrderList[13] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			AnomaliaMotori01,
			ButtonIndietro01,
			AvvioM2Alta,
			AvvioM2Bassa,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax1);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax2);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin1);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin2);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();
		nativeImage1.clean();

		AnomaliaMotori01.shutdown();

		ButtonIndietro01.shutdown();

		AvvioM2Alta.shutdown();

		AvvioM2Bassa.shutdown();

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
			"Inserz. M1 2 Poli",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			162,	// width
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
			"Inserz. M1 4 Poli",	// text
			0 + _dx,	// x
			80 + _dy,	// y
			162,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1_0	// font type
		);
		// Testo03
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Inserz. M2 2 Poli",	// text
			0 + _dx,	// x
			100 + _dy,	// y
			162,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1_0	// font type
		);
		// Testo04
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Inserz. M2 4 Poli",	// text
			0 + _dx,	// x
			120 + _dy,	// y
			162,	// width
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
			"Impostazione Parametri",	// text
			0 + _dx,	// x
			0 + _dy,	// y
			320,	// width
			40,	// height
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
