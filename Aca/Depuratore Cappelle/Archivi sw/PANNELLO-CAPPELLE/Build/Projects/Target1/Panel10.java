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

public class Panel10 extends CgpPanel
{
	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay VisualizzatoreNumerico01;
	public CgpNumericDisplay VisualizzatoreNumerico02;
	public CgpNumericDisplay VisualizzatoreNumerico03;
	public CgpNumericDisplay VisualizzatoreNumerico04;
	public CgpNumericDisplay VisualizzatoreNumerico05;
	public CgpNumericDisplay VisualizzatoreNumerico06;
	public CgpNumericDisplay VisualizzatoreNumerico07;
	public CgpNumericDisplay VisualizzatoreNumerico08;
	public CgpNumericDisplay VisualizzatoreNumerico09;
	public CgpNumericDisplay VisualizzatoreNumerico10;
	public CgpNumericDisplay VisualizzatoreNumerico11;
	public CgpNumericDisplay VisualizzatoreNumerico12;
	public CgpNumericDisplay VisualizzatoreNumerico13;
	public CgpNumericDisplay VisualizzatoreNumerico14;
	public CgpNumericDisplay VisualizzatoreNumerico15;
	public CgpNumericDisplay VisualizzatoreNumerico16;
	public CgpNumericDisplay VisualizzatoreNumerico17;
	public CgpNumericDisplay VisualizzatoreNumerico18;
	public CgpNumericDisplay VisualizzatoreNumerico19;
	public CgpNumericDisplay VisualizzatoreNumerico20;
	public Switch_0015 Tasto01;
	public Switch_0015 Tasto02;
	public Switch_0015 Tasto03;
	public Switch_0015 Tasto04;
	CgpFont F1;
	CgpFont F28_0;
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
		return "Contaore";
	}
	public int getPanelID()
	{
		return 10;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();
		ButtonIndietro2 = new Switch_0002(0, 200, 59, 239, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap1.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro2.image01 = nativeImage0;
		ButtonIndietro2.image02 = nativeImage0;

		CgpFont	fonts28[];
		String	labels28[];
		fonts28 = new CgpFont[1];
		labels28 = new String[1];

		labels28[0] = " ";

		F28_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts28[0] = F28_0;

		ButtonIndietro2.buzzer = true;

		ButtonIndietro2.switchFonts = fonts28;
		ButtonIndietro2.labels = labels28;

		int intArray0[] = {0x00ffffff, };
		ButtonIndietro2.labelClr = intArray0;
		int intArray1[] = {0x00777777, };
		ButtonIndietro2.label3DClr = intArray1;
		ButtonIndietro2.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro2.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro2.alwaysDrawBackground = false;

		ButtonIndietro2.init();

		VisualizzatoreNumerico01 = new CgpNumericDisplay(58, 78, 77, 97, panelContext, this);
		VisualizzatoreNumerico01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico01.variable = TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa;
		VisualizzatoreNumerico01.zeroSuppress = true;
		VisualizzatoreNumerico01.zeroDisplay = true;
		VisualizzatoreNumerico01.displayDigits = 2;
		VisualizzatoreNumerico01.decimalPlaces = 0;
		VisualizzatoreNumerico01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		CgpFont	fonts30[][] = {
			{ textFont0 },
			};
		VisualizzatoreNumerico01.fonts = fonts30;
		VisualizzatoreNumerico01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico01.enableInput = false;
		VisualizzatoreNumerico01.barcode = false;
		VisualizzatoreNumerico01.frameColor = 0x00333333;
		VisualizzatoreNumerico01.foreColor = 0x00000000;
		VisualizzatoreNumerico01.textColor = 0x00ffffff;
		VisualizzatoreNumerico01.text3DColor = 0x00000000;
		VisualizzatoreNumerico01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico01.changeColor = false;
		VisualizzatoreNumerico01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		VisualizzatoreNumerico01.drawObject = displayDraw0;
		VisualizzatoreNumerico01.alwaysDrawBackground = false;
		VisualizzatoreNumerico01.init();

		VisualizzatoreNumerico02 = new CgpNumericDisplay(89, 78, 107, 97, panelContext, this);
		VisualizzatoreNumerico02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico02.variable = TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa;
		VisualizzatoreNumerico02.zeroSuppress = true;
		VisualizzatoreNumerico02.zeroDisplay = true;
		VisualizzatoreNumerico02.displayDigits = 2;
		VisualizzatoreNumerico02.decimalPlaces = 0;
		VisualizzatoreNumerico02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico02.fonts = fonts30;
		VisualizzatoreNumerico02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico02.enableInput = false;
		VisualizzatoreNumerico02.barcode = false;
		VisualizzatoreNumerico02.frameColor = 0x00333333;
		VisualizzatoreNumerico02.foreColor = 0x00000000;
		VisualizzatoreNumerico02.textColor = 0x00ffffff;
		VisualizzatoreNumerico02.text3DColor = 0x00000000;
		VisualizzatoreNumerico02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico02.changeColor = false;
		VisualizzatoreNumerico02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico02.drawObject = displayDraw0;
		VisualizzatoreNumerico02.alwaysDrawBackground = true;
		VisualizzatoreNumerico02.init();

		VisualizzatoreNumerico03 = new CgpNumericDisplay(119, 78, 138, 97, panelContext, this);
		VisualizzatoreNumerico03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico03.variable = TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa;
		VisualizzatoreNumerico03.zeroSuppress = true;
		VisualizzatoreNumerico03.zeroDisplay = true;
		VisualizzatoreNumerico03.displayDigits = 2;
		VisualizzatoreNumerico03.decimalPlaces = 0;
		VisualizzatoreNumerico03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico03.fonts = fonts30;
		VisualizzatoreNumerico03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico03.enableInput = false;
		VisualizzatoreNumerico03.barcode = false;
		VisualizzatoreNumerico03.frameColor = 0x00333333;
		VisualizzatoreNumerico03.foreColor = 0x00000000;
		VisualizzatoreNumerico03.textColor = 0x00ffffff;
		VisualizzatoreNumerico03.text3DColor = 0x00000000;
		VisualizzatoreNumerico03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico03.changeColor = false;
		VisualizzatoreNumerico03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico03.drawObject = displayDraw0;
		VisualizzatoreNumerico03.alwaysDrawBackground = true;
		VisualizzatoreNumerico03.init();

		CgpText Testo02 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			74,	// x1
			80,	// y1
			94,	// x2
			98,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo02.set3DColor(0x00777777);

		CgpText Testo03 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			104,	// x1
			80,	// y1
			124,	// x2
			98,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo03.set3DColor(0x00777777);

		CgpText Testo04 = new CgpText
		(
			"Motore 1",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			31,	// x1
			56,	// y1
			130,	// x2
			75,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo04.set3DColor(0x00777777);

		CgpText Testo06 = new CgpText
		(
			"4 Poli",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			0,	// x1
			102,	// y1
			66,	// x2
			121,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo06.set3DColor(0x00777777);

		VisualizzatoreNumerico04 = new CgpNumericDisplay(58, 100, 77, 119, panelContext, this);
		VisualizzatoreNumerico04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico04.variable = TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta;
		VisualizzatoreNumerico04.zeroSuppress = true;
		VisualizzatoreNumerico04.zeroDisplay = true;
		VisualizzatoreNumerico04.displayDigits = 2;
		VisualizzatoreNumerico04.decimalPlaces = 0;
		VisualizzatoreNumerico04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico04.fonts = fonts30;
		VisualizzatoreNumerico04.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico04.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico04.enableInput = false;
		VisualizzatoreNumerico04.barcode = false;
		VisualizzatoreNumerico04.frameColor = 0x00333333;
		VisualizzatoreNumerico04.foreColor = 0x00000000;
		VisualizzatoreNumerico04.textColor = 0x00ffffff;
		VisualizzatoreNumerico04.text3DColor = 0x00000000;
		VisualizzatoreNumerico04.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico04.changeColor = false;
		VisualizzatoreNumerico04.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico04.drawObject = displayDraw0;
		VisualizzatoreNumerico04.alwaysDrawBackground = true;
		VisualizzatoreNumerico04.init();

		VisualizzatoreNumerico05 = new CgpNumericDisplay(89, 100, 107, 119, panelContext, this);
		VisualizzatoreNumerico05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico05.variable = TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta;
		VisualizzatoreNumerico05.zeroSuppress = true;
		VisualizzatoreNumerico05.zeroDisplay = true;
		VisualizzatoreNumerico05.displayDigits = 2;
		VisualizzatoreNumerico05.decimalPlaces = 0;
		VisualizzatoreNumerico05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico05.fonts = fonts30;
		VisualizzatoreNumerico05.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico05.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico05.enableInput = false;
		VisualizzatoreNumerico05.barcode = false;
		VisualizzatoreNumerico05.frameColor = 0x00333333;
		VisualizzatoreNumerico05.foreColor = 0x00000000;
		VisualizzatoreNumerico05.textColor = 0x00ffffff;
		VisualizzatoreNumerico05.text3DColor = 0x00000000;
		VisualizzatoreNumerico05.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico05.changeColor = false;
		VisualizzatoreNumerico05.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico05.drawObject = displayDraw0;
		VisualizzatoreNumerico05.alwaysDrawBackground = true;
		VisualizzatoreNumerico05.init();

		VisualizzatoreNumerico06 = new CgpNumericDisplay(119, 100, 138, 119, panelContext, this);
		VisualizzatoreNumerico06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico06.variable = TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta;
		VisualizzatoreNumerico06.zeroSuppress = true;
		VisualizzatoreNumerico06.zeroDisplay = true;
		VisualizzatoreNumerico06.displayDigits = 2;
		VisualizzatoreNumerico06.decimalPlaces = 0;
		VisualizzatoreNumerico06.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico06.fonts = fonts30;
		VisualizzatoreNumerico06.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico06.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico06.enableInput = false;
		VisualizzatoreNumerico06.barcode = false;
		VisualizzatoreNumerico06.frameColor = 0x00333333;
		VisualizzatoreNumerico06.foreColor = 0x00000000;
		VisualizzatoreNumerico06.textColor = 0x00ffffff;
		VisualizzatoreNumerico06.text3DColor = 0x00000000;
		VisualizzatoreNumerico06.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico06.changeColor = false;
		VisualizzatoreNumerico06.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico06.drawObject = displayDraw0;
		VisualizzatoreNumerico06.alwaysDrawBackground = true;
		VisualizzatoreNumerico06.init();

		CgpText Testo07 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			74,	// x1
			102,	// y1
			94,	// x2
			120,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo07.set3DColor(0x00777777);

		CgpText Testo08 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			104,	// x1
			102,	// y1
			124,	// x2
			120,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo08.set3DColor(0x00777777);

		CgpText Testo09 = new CgpText
		(
			"2 Poli",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			1,	// x1
			158,	// y1
			67,	// x2
			177,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo09.set3DColor(0x00777777);

		VisualizzatoreNumerico07 = new CgpNumericDisplay(59, 156, 78, 175, panelContext, this);
		VisualizzatoreNumerico07.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico07.variable = TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa;
		VisualizzatoreNumerico07.zeroSuppress = true;
		VisualizzatoreNumerico07.zeroDisplay = true;
		VisualizzatoreNumerico07.displayDigits = 2;
		VisualizzatoreNumerico07.decimalPlaces = 0;
		VisualizzatoreNumerico07.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico07.fonts = fonts30;
		VisualizzatoreNumerico07.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico07.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico07.enableInput = false;
		VisualizzatoreNumerico07.barcode = false;
		VisualizzatoreNumerico07.frameColor = 0x00333333;
		VisualizzatoreNumerico07.foreColor = 0x00000000;
		VisualizzatoreNumerico07.textColor = 0x00ffffff;
		VisualizzatoreNumerico07.text3DColor = 0x00000000;
		VisualizzatoreNumerico07.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico07.changeColor = false;
		VisualizzatoreNumerico07.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico07.drawObject = displayDraw0;
		VisualizzatoreNumerico07.alwaysDrawBackground = true;
		VisualizzatoreNumerico07.init();

		VisualizzatoreNumerico08 = new CgpNumericDisplay(90, 156, 108, 175, panelContext, this);
		VisualizzatoreNumerico08.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico08.variable = TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa;
		VisualizzatoreNumerico08.zeroSuppress = true;
		VisualizzatoreNumerico08.zeroDisplay = true;
		VisualizzatoreNumerico08.displayDigits = 2;
		VisualizzatoreNumerico08.decimalPlaces = 0;
		VisualizzatoreNumerico08.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico08.fonts = fonts30;
		VisualizzatoreNumerico08.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico08.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico08.enableInput = false;
		VisualizzatoreNumerico08.barcode = false;
		VisualizzatoreNumerico08.frameColor = 0x00333333;
		VisualizzatoreNumerico08.foreColor = 0x00000000;
		VisualizzatoreNumerico08.textColor = 0x00ffffff;
		VisualizzatoreNumerico08.text3DColor = 0x00000000;
		VisualizzatoreNumerico08.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico08.changeColor = false;
		VisualizzatoreNumerico08.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico08.drawObject = displayDraw0;
		VisualizzatoreNumerico08.alwaysDrawBackground = true;
		VisualizzatoreNumerico08.init();

		VisualizzatoreNumerico09 = new CgpNumericDisplay(120, 156, 139, 175, panelContext, this);
		VisualizzatoreNumerico09.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico09.variable = TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa;
		VisualizzatoreNumerico09.zeroSuppress = true;
		VisualizzatoreNumerico09.zeroDisplay = true;
		VisualizzatoreNumerico09.displayDigits = 2;
		VisualizzatoreNumerico09.decimalPlaces = 0;
		VisualizzatoreNumerico09.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico09.fonts = fonts30;
		VisualizzatoreNumerico09.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico09.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico09.enableInput = false;
		VisualizzatoreNumerico09.barcode = false;
		VisualizzatoreNumerico09.frameColor = 0x00333333;
		VisualizzatoreNumerico09.foreColor = 0x00000000;
		VisualizzatoreNumerico09.textColor = 0x00ffffff;
		VisualizzatoreNumerico09.text3DColor = 0x00000000;
		VisualizzatoreNumerico09.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico09.changeColor = false;
		VisualizzatoreNumerico09.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico09.drawObject = displayDraw0;
		VisualizzatoreNumerico09.alwaysDrawBackground = true;
		VisualizzatoreNumerico09.init();

		CgpText Testo10 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			75,	// x1
			158,	// y1
			95,	// x2
			176,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo10.set3DColor(0x00777777);

		CgpText Testo11 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			105,	// x1
			158,	// y1
			125,	// x2
			176,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo11.set3DColor(0x00777777);

		CgpText Testo12 = new CgpText
		(
			"Motore 2",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			32,	// x1
			134,	// y1
			131,	// x2
			153,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo12.set3DColor(0x00777777);

		CgpText Testo13 = new CgpText
		(
			"4 Poli",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			1,	// x1
			180,	// y1
			67,	// x2
			199,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo13.set3DColor(0x00777777);

		VisualizzatoreNumerico10 = new CgpNumericDisplay(59, 178, 78, 197, panelContext, this);
		VisualizzatoreNumerico10.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico10.variable = TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta;
		VisualizzatoreNumerico10.zeroSuppress = true;
		VisualizzatoreNumerico10.zeroDisplay = true;
		VisualizzatoreNumerico10.displayDigits = 2;
		VisualizzatoreNumerico10.decimalPlaces = 0;
		VisualizzatoreNumerico10.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico10.fonts = fonts30;
		VisualizzatoreNumerico10.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico10.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico10.enableInput = false;
		VisualizzatoreNumerico10.barcode = false;
		VisualizzatoreNumerico10.frameColor = 0x00333333;
		VisualizzatoreNumerico10.foreColor = 0x00000000;
		VisualizzatoreNumerico10.textColor = 0x00ffffff;
		VisualizzatoreNumerico10.text3DColor = 0x00000000;
		VisualizzatoreNumerico10.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico10.changeColor = false;
		VisualizzatoreNumerico10.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico10.drawObject = displayDraw0;
		VisualizzatoreNumerico10.alwaysDrawBackground = true;
		VisualizzatoreNumerico10.init();

		VisualizzatoreNumerico11 = new CgpNumericDisplay(90, 178, 108, 197, panelContext, this);
		VisualizzatoreNumerico11.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico11.variable = TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta;
		VisualizzatoreNumerico11.zeroSuppress = true;
		VisualizzatoreNumerico11.zeroDisplay = true;
		VisualizzatoreNumerico11.displayDigits = 2;
		VisualizzatoreNumerico11.decimalPlaces = 0;
		VisualizzatoreNumerico11.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico11.fonts = fonts30;
		VisualizzatoreNumerico11.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico11.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico11.enableInput = false;
		VisualizzatoreNumerico11.barcode = false;
		VisualizzatoreNumerico11.frameColor = 0x00333333;
		VisualizzatoreNumerico11.foreColor = 0x00000000;
		VisualizzatoreNumerico11.textColor = 0x00ffffff;
		VisualizzatoreNumerico11.text3DColor = 0x00000000;
		VisualizzatoreNumerico11.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico11.changeColor = false;
		VisualizzatoreNumerico11.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico11.drawObject = displayDraw0;
		VisualizzatoreNumerico11.alwaysDrawBackground = true;
		VisualizzatoreNumerico11.init();

		VisualizzatoreNumerico12 = new CgpNumericDisplay(120, 178, 139, 197, panelContext, this);
		VisualizzatoreNumerico12.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico12.variable = TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta;
		VisualizzatoreNumerico12.zeroSuppress = true;
		VisualizzatoreNumerico12.zeroDisplay = true;
		VisualizzatoreNumerico12.displayDigits = 2;
		VisualizzatoreNumerico12.decimalPlaces = 0;
		VisualizzatoreNumerico12.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico12.fonts = fonts30;
		VisualizzatoreNumerico12.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico12.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico12.enableInput = false;
		VisualizzatoreNumerico12.barcode = false;
		VisualizzatoreNumerico12.frameColor = 0x00333333;
		VisualizzatoreNumerico12.foreColor = 0x00000000;
		VisualizzatoreNumerico12.textColor = 0x00ffffff;
		VisualizzatoreNumerico12.text3DColor = 0x00000000;
		VisualizzatoreNumerico12.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico12.changeColor = false;
		VisualizzatoreNumerico12.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico12.drawObject = displayDraw0;
		VisualizzatoreNumerico12.alwaysDrawBackground = true;
		VisualizzatoreNumerico12.init();

		CgpText Testo14 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			75,	// x1
			180,	// y1
			95,	// x2
			198,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo14.set3DColor(0x00777777);

		CgpText Testo15 = new CgpText
		(
			":",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			105,	// x1
			180,	// y1
			125,	// x2
			198,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo15.set3DColor(0x00777777);

		CgpText Testo16 = new CgpText
		(
			"Ore Preallarme",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			161,	// x1
			44,	// y1
			260,	// x2
			79,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo16.set3DColor(0x00777777);

		CgpText Testo17 = new CgpText
		(
			"Ore Allarme",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F28_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			249,	// x1
			44,	// y1
			313,	// x2
			79,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo17.set3DColor(0x00777777);

		VisualizzatoreNumerico13 = new CgpNumericDisplay(192, 78, 232, 97, panelContext, this);
		VisualizzatoreNumerico13.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico13.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa;
		VisualizzatoreNumerico13.zeroSuppress = true;
		VisualizzatoreNumerico13.zeroDisplay = true;
		VisualizzatoreNumerico13.displayDigits = 4;
		VisualizzatoreNumerico13.decimalPlaces = 0;
		VisualizzatoreNumerico13.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico13.fonts = fonts30;
		VisualizzatoreNumerico13.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico13.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico13.enableInput = true;
		VisualizzatoreNumerico13.displayPopupKeypad = true;
		VisualizzatoreNumerico13.keypad = decKeypad;
		VisualizzatoreNumerico13.beepOnTouch = false;
		VisualizzatoreNumerico13.barcode = false;
		VisualizzatoreNumerico13.frameColor = 0x00333333;
		VisualizzatoreNumerico13.foreColor = 0x00000000;
		VisualizzatoreNumerico13.textColor = 0x00ffffff;
		VisualizzatoreNumerico13.text3DColor = 0x00000000;
		VisualizzatoreNumerico13.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico13.changeColor = false;
		VisualizzatoreNumerico13.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico13.drawObject = displayDraw0;
		VisualizzatoreNumerico13.alwaysDrawBackground = true;
		VisualizzatoreNumerico13.init();

		VisualizzatoreNumerico14 = new CgpNumericDisplay(259, 77, 299, 96, panelContext, this);
		VisualizzatoreNumerico14.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico14.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa;
		VisualizzatoreNumerico14.zeroSuppress = true;
		VisualizzatoreNumerico14.zeroDisplay = true;
		VisualizzatoreNumerico14.displayDigits = 4;
		VisualizzatoreNumerico14.decimalPlaces = 0;
		VisualizzatoreNumerico14.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico14.fonts = fonts30;
		VisualizzatoreNumerico14.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico14.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico14.enableInput = true;
		VisualizzatoreNumerico14.displayPopupKeypad = true;
		VisualizzatoreNumerico14.keypad = decKeypad;
		VisualizzatoreNumerico14.beepOnTouch = false;
		VisualizzatoreNumerico14.barcode = false;
		VisualizzatoreNumerico14.frameColor = 0x00333333;
		VisualizzatoreNumerico14.foreColor = 0x00000000;
		VisualizzatoreNumerico14.textColor = 0x00ffffff;
		VisualizzatoreNumerico14.text3DColor = 0x00000000;
		VisualizzatoreNumerico14.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico14.changeColor = false;
		VisualizzatoreNumerico14.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico14.drawObject = displayDraw0;
		VisualizzatoreNumerico14.alwaysDrawBackground = true;
		VisualizzatoreNumerico14.init();

		VisualizzatoreNumerico15 = new CgpNumericDisplay(192, 98, 232, 117, panelContext, this);
		VisualizzatoreNumerico15.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico15.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta;
		VisualizzatoreNumerico15.zeroSuppress = true;
		VisualizzatoreNumerico15.zeroDisplay = true;
		VisualizzatoreNumerico15.displayDigits = 4;
		VisualizzatoreNumerico15.decimalPlaces = 0;
		VisualizzatoreNumerico15.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico15.fonts = fonts30;
		VisualizzatoreNumerico15.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico15.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico15.enableInput = true;
		VisualizzatoreNumerico15.displayPopupKeypad = true;
		VisualizzatoreNumerico15.keypad = decKeypad;
		VisualizzatoreNumerico15.beepOnTouch = false;
		VisualizzatoreNumerico15.barcode = false;
		VisualizzatoreNumerico15.frameColor = 0x00333333;
		VisualizzatoreNumerico15.foreColor = 0x00000000;
		VisualizzatoreNumerico15.textColor = 0x00ffffff;
		VisualizzatoreNumerico15.text3DColor = 0x00000000;
		VisualizzatoreNumerico15.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico15.changeColor = false;
		VisualizzatoreNumerico15.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico15.drawObject = displayDraw0;
		VisualizzatoreNumerico15.alwaysDrawBackground = true;
		VisualizzatoreNumerico15.init();

		VisualizzatoreNumerico16 = new CgpNumericDisplay(260, 97, 300, 116, panelContext, this);
		VisualizzatoreNumerico16.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico16.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta;
		VisualizzatoreNumerico16.zeroSuppress = true;
		VisualizzatoreNumerico16.zeroDisplay = true;
		VisualizzatoreNumerico16.displayDigits = 4;
		VisualizzatoreNumerico16.decimalPlaces = 0;
		VisualizzatoreNumerico16.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico16.fonts = fonts30;
		VisualizzatoreNumerico16.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico16.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico16.enableInput = true;
		VisualizzatoreNumerico16.displayPopupKeypad = true;
		VisualizzatoreNumerico16.keypad = decKeypad;
		VisualizzatoreNumerico16.beepOnTouch = false;
		VisualizzatoreNumerico16.barcode = false;
		VisualizzatoreNumerico16.frameColor = 0x00333333;
		VisualizzatoreNumerico16.foreColor = 0x00000000;
		VisualizzatoreNumerico16.textColor = 0x00ffffff;
		VisualizzatoreNumerico16.text3DColor = 0x00000000;
		VisualizzatoreNumerico16.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico16.changeColor = false;
		VisualizzatoreNumerico16.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico16.drawObject = displayDraw0;
		VisualizzatoreNumerico16.alwaysDrawBackground = true;
		VisualizzatoreNumerico16.init();

		VisualizzatoreNumerico17 = new CgpNumericDisplay(192, 157, 232, 176, panelContext, this);
		VisualizzatoreNumerico17.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico17.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa;
		VisualizzatoreNumerico17.zeroSuppress = true;
		VisualizzatoreNumerico17.zeroDisplay = true;
		VisualizzatoreNumerico17.displayDigits = 4;
		VisualizzatoreNumerico17.decimalPlaces = 0;
		VisualizzatoreNumerico17.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico17.fonts = fonts30;
		VisualizzatoreNumerico17.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico17.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico17.enableInput = true;
		VisualizzatoreNumerico17.displayPopupKeypad = true;
		VisualizzatoreNumerico17.keypad = decKeypad;
		VisualizzatoreNumerico17.beepOnTouch = false;
		VisualizzatoreNumerico17.barcode = false;
		VisualizzatoreNumerico17.frameColor = 0x00333333;
		VisualizzatoreNumerico17.foreColor = 0x00000000;
		VisualizzatoreNumerico17.textColor = 0x00ffffff;
		VisualizzatoreNumerico17.text3DColor = 0x00000000;
		VisualizzatoreNumerico17.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico17.changeColor = false;
		VisualizzatoreNumerico17.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico17.drawObject = displayDraw0;
		VisualizzatoreNumerico17.alwaysDrawBackground = true;
		VisualizzatoreNumerico17.init();

		VisualizzatoreNumerico18 = new CgpNumericDisplay(259, 156, 299, 175, panelContext, this);
		VisualizzatoreNumerico18.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico18.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa;
		VisualizzatoreNumerico18.zeroSuppress = true;
		VisualizzatoreNumerico18.zeroDisplay = true;
		VisualizzatoreNumerico18.displayDigits = 4;
		VisualizzatoreNumerico18.decimalPlaces = 0;
		VisualizzatoreNumerico18.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico18.fonts = fonts30;
		VisualizzatoreNumerico18.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico18.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico18.enableInput = true;
		VisualizzatoreNumerico18.displayPopupKeypad = true;
		VisualizzatoreNumerico18.keypad = decKeypad;
		VisualizzatoreNumerico18.beepOnTouch = false;
		VisualizzatoreNumerico18.barcode = false;
		VisualizzatoreNumerico18.frameColor = 0x00333333;
		VisualizzatoreNumerico18.foreColor = 0x00000000;
		VisualizzatoreNumerico18.textColor = 0x00ffffff;
		VisualizzatoreNumerico18.text3DColor = 0x00000000;
		VisualizzatoreNumerico18.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico18.changeColor = false;
		VisualizzatoreNumerico18.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico18.drawObject = displayDraw0;
		VisualizzatoreNumerico18.alwaysDrawBackground = true;
		VisualizzatoreNumerico18.init();

		VisualizzatoreNumerico19 = new CgpNumericDisplay(192, 177, 232, 196, panelContext, this);
		VisualizzatoreNumerico19.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico19.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta;
		VisualizzatoreNumerico19.zeroSuppress = true;
		VisualizzatoreNumerico19.zeroDisplay = true;
		VisualizzatoreNumerico19.displayDigits = 4;
		VisualizzatoreNumerico19.decimalPlaces = 0;
		VisualizzatoreNumerico19.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico19.fonts = fonts30;
		VisualizzatoreNumerico19.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico19.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico19.enableInput = true;
		VisualizzatoreNumerico19.displayPopupKeypad = true;
		VisualizzatoreNumerico19.keypad = decKeypad;
		VisualizzatoreNumerico19.beepOnTouch = false;
		VisualizzatoreNumerico19.barcode = false;
		VisualizzatoreNumerico19.frameColor = 0x00333333;
		VisualizzatoreNumerico19.foreColor = 0x00000000;
		VisualizzatoreNumerico19.textColor = 0x00ffffff;
		VisualizzatoreNumerico19.text3DColor = 0x00000000;
		VisualizzatoreNumerico19.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico19.changeColor = false;
		VisualizzatoreNumerico19.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico19.drawObject = displayDraw0;
		VisualizzatoreNumerico19.alwaysDrawBackground = true;
		VisualizzatoreNumerico19.init();

		VisualizzatoreNumerico20 = new CgpNumericDisplay(260, 176, 300, 195, panelContext, this);
		VisualizzatoreNumerico20.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		VisualizzatoreNumerico20.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta;
		VisualizzatoreNumerico20.zeroSuppress = true;
		VisualizzatoreNumerico20.zeroDisplay = true;
		VisualizzatoreNumerico20.displayDigits = 4;
		VisualizzatoreNumerico20.decimalPlaces = 0;
		VisualizzatoreNumerico20.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		VisualizzatoreNumerico20.fonts = fonts30;
		VisualizzatoreNumerico20.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreNumerico20.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreNumerico20.enableInput = true;
		VisualizzatoreNumerico20.displayPopupKeypad = true;
		VisualizzatoreNumerico20.keypad = decKeypad;
		VisualizzatoreNumerico20.beepOnTouch = false;
		VisualizzatoreNumerico20.barcode = false;
		VisualizzatoreNumerico20.frameColor = 0x00333333;
		VisualizzatoreNumerico20.foreColor = 0x00000000;
		VisualizzatoreNumerico20.textColor = 0x00ffffff;
		VisualizzatoreNumerico20.text3DColor = 0x00000000;
		VisualizzatoreNumerico20.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico20.changeColor = false;
		VisualizzatoreNumerico20.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreNumerico20.drawObject = displayDraw0;
		VisualizzatoreNumerico20.alwaysDrawBackground = true;
		VisualizzatoreNumerico20.init();
		Tasto01 = new Switch_0015(142, 77, 187, 96, panelContext, this);
		Tasto01.foreClr = 0x00777777;
		Tasto01.backClr = 0x00000000;
		Tasto01.pattern = 1;

		CgpFont	fonts67[];
		String	labels67[];
		fonts67 = new CgpFont[1];
		labels67 = new String[1];

		labels67[0] = "Reset";
		fonts67[0] = F28_0;

		Tasto01.buzzer = true;

		Tasto01.switchFonts = fonts67;
		Tasto01.labels = labels67;

		Tasto01.labelClr = intArray0;
		int intArray2[] = {0x00000000, };
		Tasto01.label3DClr = intArray2;
		Tasto01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto01.bit0 = TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Bassa;
		Tasto01.alwaysDrawBackground = false;

		Tasto01.init();
		Tasto02 = new Switch_0015(142, 99, 187, 118, panelContext, this);
		Tasto02.foreClr = 0x00777777;
		Tasto02.backClr = 0x00000000;
		Tasto02.pattern = 1;

		CgpFont	fonts68[];
		String	labels68[];
		fonts68 = new CgpFont[1];
		labels68 = new String[1];

		labels68[0] = "Reset";
		fonts68[0] = F28_0;

		Tasto02.buzzer = true;

		Tasto02.switchFonts = fonts68;
		Tasto02.labels = labels68;

		Tasto02.labelClr = intArray0;
		Tasto02.label3DClr = intArray2;
		Tasto02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto02.bit0 = TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Alta;
		Tasto02.alwaysDrawBackground = false;

		Tasto02.init();
		Tasto03 = new Switch_0015(143, 155, 188, 174, panelContext, this);
		Tasto03.foreClr = 0x00777777;
		Tasto03.backClr = 0x00000000;
		Tasto03.pattern = 1;

		CgpFont	fonts69[];
		String	labels69[];
		fonts69 = new CgpFont[1];
		labels69 = new String[1];

		labels69[0] = "Reset";
		fonts69[0] = F28_0;

		Tasto03.buzzer = true;

		Tasto03.switchFonts = fonts69;
		Tasto03.labels = labels69;

		Tasto03.labelClr = intArray0;
		Tasto03.label3DClr = intArray2;
		Tasto03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto03.bit0 = TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Bassa;
		Tasto03.alwaysDrawBackground = false;

		Tasto03.init();
		Tasto04 = new Switch_0015(143, 177, 188, 196, panelContext, this);
		Tasto04.foreClr = 0x00777777;
		Tasto04.backClr = 0x00000000;
		Tasto04.pattern = 1;

		CgpFont	fonts70[];
		String	labels70[];
		fonts70 = new CgpFont[1];
		labels70 = new String[1];

		labels70[0] = "Reset";
		fonts70[0] = F28_0;

		Tasto04.buzzer = true;

		Tasto04.switchFonts = fonts70;
		Tasto04.labels = labels70;

		Tasto04.labelClr = intArray0;
		Tasto04.label3DClr = intArray2;
		Tasto04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto04.bit0 = TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Alta;
		Tasto04.alwaysDrawBackground = false;

		Tasto04.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa.addEventListener(VisualizzatoreNumerico01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa.addEventListener(VisualizzatoreNumerico02, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa.addEventListener(VisualizzatoreNumerico03, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta.addEventListener(VisualizzatoreNumerico04, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta.addEventListener(VisualizzatoreNumerico05, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta.addEventListener(VisualizzatoreNumerico06, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa.addEventListener(VisualizzatoreNumerico07, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa.addEventListener(VisualizzatoreNumerico08, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa.addEventListener(VisualizzatoreNumerico09, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta.addEventListener(VisualizzatoreNumerico10, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta.addEventListener(VisualizzatoreNumerico11, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta.addEventListener(VisualizzatoreNumerico12, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa.addEventListener(VisualizzatoreNumerico13, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa.addEventListener(VisualizzatoreNumerico14, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta.addEventListener(VisualizzatoreNumerico15, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta.addEventListener(VisualizzatoreNumerico16, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa.addEventListener(VisualizzatoreNumerico17, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa.addEventListener(VisualizzatoreNumerico18, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta.addEventListener(VisualizzatoreNumerico19, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta.addEventListener(VisualizzatoreNumerico20, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[41];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = VisualizzatoreNumerico01;
		zOrderList[2] = VisualizzatoreNumerico02;
		zOrderList[3] = VisualizzatoreNumerico03;
		zOrderList[4] = Testo02;
		zOrderList[5] = Testo03;
		zOrderList[6] = Testo04;
		zOrderList[7] = Testo06;
		zOrderList[8] = VisualizzatoreNumerico04;
		zOrderList[9] = VisualizzatoreNumerico05;
		zOrderList[10] = VisualizzatoreNumerico06;
		zOrderList[11] = Testo07;
		zOrderList[12] = Testo08;
		zOrderList[13] = Testo09;
		zOrderList[14] = VisualizzatoreNumerico07;
		zOrderList[15] = VisualizzatoreNumerico08;
		zOrderList[16] = VisualizzatoreNumerico09;
		zOrderList[17] = Testo10;
		zOrderList[18] = Testo11;
		zOrderList[19] = Testo12;
		zOrderList[20] = Testo13;
		zOrderList[21] = VisualizzatoreNumerico10;
		zOrderList[22] = VisualizzatoreNumerico11;
		zOrderList[23] = VisualizzatoreNumerico12;
		zOrderList[24] = Testo14;
		zOrderList[25] = Testo15;
		zOrderList[26] = Testo16;
		zOrderList[27] = Testo17;
		zOrderList[28] = VisualizzatoreNumerico13;
		zOrderList[29] = VisualizzatoreNumerico14;
		zOrderList[30] = VisualizzatoreNumerico15;
		zOrderList[31] = VisualizzatoreNumerico16;
		zOrderList[32] = VisualizzatoreNumerico17;
		zOrderList[33] = VisualizzatoreNumerico18;
		zOrderList[34] = VisualizzatoreNumerico19;
		zOrderList[35] = VisualizzatoreNumerico20;
		zOrderList[36] = Tasto01;
		zOrderList[37] = Tasto02;
		zOrderList[38] = Tasto03;
		zOrderList[39] = Tasto04;
		zOrderList[40] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			Tasto04,
			Tasto03,
			Tasto02,
			Tasto01,
			VisualizzatoreNumerico20,
			VisualizzatoreNumerico19,
			VisualizzatoreNumerico18,
			VisualizzatoreNumerico17,
			VisualizzatoreNumerico16,
			VisualizzatoreNumerico15,
			VisualizzatoreNumerico14,
			VisualizzatoreNumerico13,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();

		Tasto04.shutdown();

		Tasto03.shutdown();

		Tasto02.shutdown();

		Tasto01.shutdown();

		VisualizzatoreNumerico20.shutdown();

		VisualizzatoreNumerico19.shutdown();

		VisualizzatoreNumerico18.shutdown();

		VisualizzatoreNumerico17.shutdown();

		VisualizzatoreNumerico16.shutdown();

		VisualizzatoreNumerico15.shutdown();

		VisualizzatoreNumerico14.shutdown();

		VisualizzatoreNumerico13.shutdown();

		VisualizzatoreNumerico12.shutdown();

		VisualizzatoreNumerico11.shutdown();

		VisualizzatoreNumerico10.shutdown();

		VisualizzatoreNumerico09.shutdown();

		VisualizzatoreNumerico08.shutdown();

		VisualizzatoreNumerico07.shutdown();

		VisualizzatoreNumerico06.shutdown();

		VisualizzatoreNumerico05.shutdown();

		VisualizzatoreNumerico04.shutdown();

		VisualizzatoreNumerico03.shutdown();

		VisualizzatoreNumerico02.shutdown();

		VisualizzatoreNumerico01.shutdown();

		ButtonIndietro2.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Rettangolo02
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			2 + _dx,	// x
			131 + _dy,	// y
			314,	// width
			76,	// height
			0x00777777,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			38,	// arc width
			38	// arc height
		);
		// Rettangolo01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			2 + _dx,	// x
			48 + _dy,	// y
			314,	// width
			77,	// height
			0x00777777,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			38,	// arc width
			38	// arc height
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
			"Ore Lavoro Impianto",	// text
			0 + _dx,	// x
			0 + _dy,	// y
			320,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1	// font type
		);
		// Testo01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"2 Poli",	// text
			0 + _dx,	// x
			80 + _dy,	// y
			67,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F28_0	// font type
		);
		VisualizzatoreNumerico01.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
