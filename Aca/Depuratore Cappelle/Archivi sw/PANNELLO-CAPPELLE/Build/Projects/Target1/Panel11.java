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

public class Panel11 extends CgpPanel
{
	public CgpNumericDisplay VisualizzatoreOssigeno;
	public TextList_0006 VisualizzatoreMessaggi01;
	public TextList_0006 VisualizzatoreMessaggi02;
	public CgpNumericDisplay VisualizzatoreOssigeno02;
	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay VisualizzatoreOssigeno01;
	public CgpNumericDisplay VisualizzatoreOssigeno03;
	public TextList_0006 VisualizzatoreMessaggi03;
	CgpResIntIndex _IndexIntResource1 = new _IndexIntResource1();
	CgpResIntIndex _IndexIntResource0 = new _IndexIntResource0();
	CgpResText _TextResource1 = new _TextResource1();
	CgpResColor _ColorResource0 = new _ColorResource0();
	CgpResText _TextResource2 = new _TextResource2();
	CgpFont F6;
	CgpFont F12;
	CgpFont F22;
	CgpFont LBBannerAllarme01Font[];
	CgpGraphicFile nativeImage0;
	public CgpSmartKeypadDec  decKeypad;
	private CgpMasterPanel masterPanel = null;
	public static CgpAlarmSummary BannerAllarme01;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		String BannerAllarme01Strings[];
		CgpFont BannerAllarme01Fonts[];

		CgpStringDB dbBannerAllarme01_0;
		BannerAllarme01Strings = new String[2];
		BannerAllarme01Strings[0] = "Data";
		BannerAllarme01Strings[1] = "Ora";
		BannerAllarme01Fonts = new CgpFont[2];
		BannerAllarme01Fonts[0] = new CgpFont("TCP8x13", CgpFont.BOLD, (byte)13, (byte)8);
		BannerAllarme01Fonts[1] = BannerAllarme01Fonts[0];
		dbBannerAllarme01_0 = new CgpStringDB(BannerAllarme01Strings, BannerAllarme01Fonts);

		CgpStringDB BannerAllarme01DBList[] =
		{
			dbBannerAllarme01_0,
		};

		int LBBannerAllarme01Widths[] = {
			100,
			219,
			319,
		};

		int LBBannerAllarme01Lengths[] = {
			9999,
			9999,
			9999,
		};
		LBBannerAllarme01Font = new CgpFont[1];
		LBBannerAllarme01Font[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		int BannerAllarme01_columns[] = {
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_MESSAGE,
		};

		CgpAlarmFormatter BannerAllarme01_formatter = new CgpAlarmFormatter(CgpDate.DD_MM_YY, CgpDate.H24_MM_SS,"",
			BannerAllarme01_columns, null);
		BannerAllarme01 = new CgpAlarmSummary(
			0,
			0,
			319,
			29,
			true,
			IgpAlarmGroupConstants.ACTIVE_DISP_MODE,
			TagDB.GruppoAllarme1,
			BannerAllarme01_formatter,
			LBBannerAllarme01Font,
			panelContext
		);
		CgpDoubleLineListBox BannerAllarme01_listbox = new CgpDoubleLineListBox(
			0,
			0,
			319,
			29,
			LBBannerAllarme01Font[0],
			0x00000000,
			3,
			LBBannerAllarme01Widths,
			LBBannerAllarme01Lengths,
			true,
			true,
			true,
			0,
			0,
			false,
			false,
			false,
			BannerAllarme01,
			0,
			panelContext
		);
		CgpAlarmColorMgr BannerAllarme01_Colors	= new CgpAlarmColorMgr();
		int[] BannerAllarme01_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] BannerAllarme01_DefaultBackColors	= { 0x000101ff, 0x0001ffff, 0x00888888, 0x0001ff01 };
		int[] BannerAllarme01_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] BannerAllarme01_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		BannerAllarme01_Colors.defaultTextColors	= BannerAllarme01_DefaultTextColors;
		BannerAllarme01_Colors.defaultBackColors	= BannerAllarme01_DefaultBackColors;
		BannerAllarme01_Colors.defaultTextBlink = BannerAllarme01_DefaultTextBlink;
		BannerAllarme01_Colors.defaultBackBlink = BannerAllarme01_DefaultBackBlink;
		BannerAllarme01.setColorSet(BannerAllarme01_Colors);

		BannerAllarme01_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		BannerAllarme01_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		BannerAllarme01_listbox.setFixedTextColors(0x00000000, 0x00888888);
		BannerAllarme01.setListBox(BannerAllarme01_listbox);
		BannerAllarme01.setAutoCursorOn(true);
		BannerAllarme01.setSortBy(CgpAlarmSummary.SORT_BY_STATE_SEVERITY);
		BannerAllarme01.enableSubDisplay();

	}
	public String getPanelName()
	{
		return "Monitor";
	}
	public int getPanelID()
	{
		return 11;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("TCP6x10", CgpFont.PLAIN, (byte)10, (byte)6);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();

		VisualizzatoreOssigeno = new CgpNumericDisplay(139, 58, 198, 91, panelContext, this);
		VisualizzatoreOssigeno.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		VisualizzatoreOssigeno.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		VisualizzatoreOssigeno.variable = TagDB.PLC_ApparecchiaturaModbus01$SondaREDOXScalata;
		VisualizzatoreOssigeno.zeroSuppress = true;
		VisualizzatoreOssigeno.zeroDisplay = false;
		VisualizzatoreOssigeno.displayDigits = 3;
		VisualizzatoreOssigeno.decimalPlaces = 3;
		CgpFont	fonts5[][] = {
			{ textFont0 },
			};
		VisualizzatoreOssigeno.fonts = fonts5;
		VisualizzatoreOssigeno.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreOssigeno.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreOssigeno.enableInput = false;
		VisualizzatoreOssigeno.barcode = false;
		VisualizzatoreOssigeno.frameColor = 0x00333333;
		VisualizzatoreOssigeno.foreColor = 0x00000000;
		VisualizzatoreOssigeno.textColor = 0x00ffffff;
		VisualizzatoreOssigeno.text3DColor = 0x00000000;
		VisualizzatoreOssigeno.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno.changeColor = false;
		VisualizzatoreOssigeno.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_Display08(6,6,6,6);
		VisualizzatoreOssigeno.drawObject = displayDraw0;
		VisualizzatoreOssigeno.alwaysDrawBackground = false;
		VisualizzatoreOssigeno.init();

		F6 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		CgpText Testo01 = new CgpText
		(
			"REDOX",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F6,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			3,	// x1
			57,	// y1
			119,	// x2
			96,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo01.set3DColor(0x00777777);

		VisualizzatoreMessaggi01 = new TextList_0006(54, 142, 153, 171, panelContext, this);
		VisualizzatoreMessaggi01.nNumStates = 3;
		VisualizzatoreMessaggi01.variableTag = TagDB.PLC_ApparecchiaturaModbus01$StatoM1;
		VisualizzatoreMessaggi01.colorRes = _ColorResource0;
		VisualizzatoreMessaggi01.textRes = _TextResource2;
		VisualizzatoreMessaggi01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreMessaggi01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreMessaggi01.indexRes = _IndexIntResource0;
		VisualizzatoreMessaggi01.alwaysDrawBackground = false;

		VisualizzatoreMessaggi01.init();

		VisualizzatoreMessaggi02 = new TextList_0006(211, 142, 310, 171, panelContext, this);
		VisualizzatoreMessaggi02.nNumStates = 3;
		VisualizzatoreMessaggi02.variableTag = TagDB.PLC_ApparecchiaturaModbus01$StatoM2;
		VisualizzatoreMessaggi02.colorRes = _ColorResource0;
		VisualizzatoreMessaggi02.textRes = _TextResource2;
		VisualizzatoreMessaggi02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreMessaggi02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreMessaggi02.indexRes = _IndexIntResource0;
		VisualizzatoreMessaggi02.alwaysDrawBackground = false;

		VisualizzatoreMessaggi02.init();

		F12 = new CgpFont("TCP13x23", CgpFont.PLAIN, (byte)23, (byte)13);

		CgpText Testo03 = new CgpText
		(
			"M1",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F12,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			14,	// x1
			143,	// y1
			53,	// x2
			172,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo03.set3DColor(0x00777777);

		CgpText Testo04 = new CgpText
		(
			"M2",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F12,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			171,	// x1
			142,	// y1
			210,	// x2
			172,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo04.set3DColor(0x00777777);

		F22 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		CgpText Testo05 = new CgpText
		(
			"mg/l",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F22,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			139,	// x1
			36,	// y1
			198,	// x2
			55,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo05.set3DColor(0x00777777);

		VisualizzatoreOssigeno02 = new CgpNumericDisplay(257, 58, 316, 91, panelContext, this);
		VisualizzatoreOssigeno02.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		VisualizzatoreOssigeno02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		VisualizzatoreOssigeno02.variable = TagDB.PLC_ApparecchiaturaModbus01$SetPointREDOX;
		VisualizzatoreOssigeno02.zeroSuppress = true;
		VisualizzatoreOssigeno02.zeroDisplay = false;
		VisualizzatoreOssigeno02.displayDigits = 3;
		VisualizzatoreOssigeno02.decimalPlaces = 3;
		VisualizzatoreOssigeno02.fonts = fonts5;
		VisualizzatoreOssigeno02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreOssigeno02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreOssigeno02.enableInput = true;
		VisualizzatoreOssigeno02.displayPopupKeypad = true;
		VisualizzatoreOssigeno02.keypad = decKeypad;
		VisualizzatoreOssigeno02.beepOnTouch = false;
		VisualizzatoreOssigeno02.barcode = false;
		VisualizzatoreOssigeno02.frameColor = 0x00333333;
		VisualizzatoreOssigeno02.foreColor = 0x00000000;
		VisualizzatoreOssigeno02.textColor = 0x00ffffff;
		VisualizzatoreOssigeno02.text3DColor = 0x00000000;
		VisualizzatoreOssigeno02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno02.changeColor = false;
		VisualizzatoreOssigeno02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno02.drawObject = displayDraw0;
		VisualizzatoreOssigeno02.alwaysDrawBackground = true;
		VisualizzatoreOssigeno02.init();

		CgpText Testo06 = new CgpText
		(
			"Setpoint",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F22,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			254,	// x1
			36,	// y1
			319,	// x2
			55,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo06.set3DColor(0x00777777);

		CgpPolyLine Linea01 = new CgpPolyLine
		(
			226,	// x1
			41,	// y1
			226,	// x2
			95,	// y2
			0x00ffffff,	// borderFgColor
			0x00000000,	// bg
			(byte)1,	// lineWidth
			CgpLinePattern.LINE_SOLID,
			CgpPolyLine.ARROW_NONE,	// LineEndStyle
			0,
			this
		);

		CgpPolyLine Linea02 = new CgpPolyLine
		(
			120,	// x1
			53,	// y1
			320,	// x2
			53,	// y2
			0x00ffffff,	// borderFgColor
			0x00000000,	// bg
			(byte)1,	// lineWidth
			CgpLinePattern.LINE_SOLID,
			CgpPolyLine.ARROW_NONE,	// LineEndStyle
			0,
			this
		);
		ButtonIndietro2 = new Switch_0002(0, 200, 59, 239, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap1.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro2.image01 = nativeImage0;
		ButtonIndietro2.image02 = nativeImage0;

		CgpFont	fonts41[];
		String	labels41[];
		fonts41 = new CgpFont[1];
		labels41 = new String[1];

		labels41[0] = " ";
		fonts41[0] = F22;

		ButtonIndietro2.buzzer = true;

		ButtonIndietro2.switchFonts = fonts41;
		ButtonIndietro2.labels = labels41;

		int intArray0[] = {0x00ffffff, };
		ButtonIndietro2.labelClr = intArray0;
		int intArray1[] = {0x00777777, };
		ButtonIndietro2.label3DClr = intArray1;
		ButtonIndietro2.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro2.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro2.alwaysDrawBackground = false;

		ButtonIndietro2.init();

		VisualizzatoreOssigeno01 = new CgpNumericDisplay(139, 101, 198, 134, panelContext, this);
		VisualizzatoreOssigeno01.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		VisualizzatoreOssigeno01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		VisualizzatoreOssigeno01.variable = TagDB.PLC_ApparecchiaturaModbus01$SondaOSSIGENOScalata;
		VisualizzatoreOssigeno01.zeroSuppress = true;
		VisualizzatoreOssigeno01.zeroDisplay = false;
		VisualizzatoreOssigeno01.displayDigits = 3;
		VisualizzatoreOssigeno01.decimalPlaces = 3;
		VisualizzatoreOssigeno01.fonts = fonts5;
		VisualizzatoreOssigeno01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreOssigeno01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreOssigeno01.enableInput = false;
		VisualizzatoreOssigeno01.barcode = false;
		VisualizzatoreOssigeno01.frameColor = 0x00333333;
		VisualizzatoreOssigeno01.foreColor = 0x00000000;
		VisualizzatoreOssigeno01.textColor = 0x00ffffff;
		VisualizzatoreOssigeno01.text3DColor = 0x00000000;
		VisualizzatoreOssigeno01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno01.changeColor = false;
		VisualizzatoreOssigeno01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno01.drawObject = displayDraw0;
		VisualizzatoreOssigeno01.alwaysDrawBackground = true;
		VisualizzatoreOssigeno01.init();

		CgpText Testo02 = new CgpText
		(
			"OSSIGENO",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F6,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			3,	// x1
			100,	// y1
			119,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo02.set3DColor(0x00777777);

		VisualizzatoreOssigeno03 = new CgpNumericDisplay(257, 101, 316, 134, panelContext, this);
		VisualizzatoreOssigeno03.dataType = CgpNumericDisplay.DATA_TYPE_FLOAT;
		VisualizzatoreOssigeno03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_FLOAT;
		VisualizzatoreOssigeno03.variable = TagDB.PLC_ApparecchiaturaModbus01$SetPointOSSIGENO;
		VisualizzatoreOssigeno03.zeroSuppress = true;
		VisualizzatoreOssigeno03.zeroDisplay = false;
		VisualizzatoreOssigeno03.displayDigits = 3;
		VisualizzatoreOssigeno03.decimalPlaces = 3;
		VisualizzatoreOssigeno03.fonts = fonts5;
		VisualizzatoreOssigeno03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreOssigeno03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreOssigeno03.enableInput = true;
		VisualizzatoreOssigeno03.displayPopupKeypad = true;
		VisualizzatoreOssigeno03.keypad = decKeypad;
		VisualizzatoreOssigeno03.beepOnTouch = false;
		VisualizzatoreOssigeno03.barcode = false;
		VisualizzatoreOssigeno03.frameColor = 0x00333333;
		VisualizzatoreOssigeno03.foreColor = 0x00000000;
		VisualizzatoreOssigeno03.textColor = 0x00ffffff;
		VisualizzatoreOssigeno03.text3DColor = 0x00000000;
		VisualizzatoreOssigeno03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno03.changeColor = false;
		VisualizzatoreOssigeno03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreOssigeno03.drawObject = displayDraw0;
		VisualizzatoreOssigeno03.alwaysDrawBackground = true;
		VisualizzatoreOssigeno03.init();

		CgpRectangle Rettangolo03 = new CgpRectangle
		(
			14,	// x1
			176,	// y1
			199,	// x2
			205,	// y2
			CgpRectangle.ARC_CORNERS,	// corner type
			15,	// Width of round corner
			15,	// Height of round corner
			0x00ffffff,	// borderFgColor
			0x00000000,	// bg
			0x00777777,	// fg
			(byte)1,	// lineWidth
			CgpLinePattern.LINE_SOLID,
			(byte)1,	// fillStyle
			0,
			this
		);

		VisualizzatoreMessaggi03 = new TextList_0006(200, 177, 309, 206, panelContext, this);
		VisualizzatoreMessaggi03.nNumStates = 3;
		VisualizzatoreMessaggi03.variableTag = TagDB.PLC_ApparecchiaturaModbus01$StatoEV;
		VisualizzatoreMessaggi03.colorRes = _ColorResource0;
		VisualizzatoreMessaggi03.textRes = _TextResource1;
		VisualizzatoreMessaggi03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreMessaggi03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreMessaggi03.indexRes = _IndexIntResource1;
		VisualizzatoreMessaggi03.alwaysDrawBackground = false;

		VisualizzatoreMessaggi03.init();

		CgpText Testo07 = new CgpText
		(
			"EV OSSIGENO",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F12,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			20,	// x1
			183,	// y1
			199,	// x2
			202,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo07.set3DColor(0x00777777);
		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(BannerAllarme01, contextObject);
		TagDB.PLC_ApparecchiaturaModbus01$SondaREDOXScalata.addEventListener(VisualizzatoreOssigeno, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$StatoM1.addEventListener(VisualizzatoreMessaggi01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$StatoM2.addEventListener(VisualizzatoreMessaggi02, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SetPointREDOX.addEventListener(VisualizzatoreOssigeno02, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SondaOSSIGENOScalata.addEventListener(VisualizzatoreOssigeno01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$SetPointOSSIGENO.addEventListener(VisualizzatoreOssigeno03, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$StatoEV.addEventListener(VisualizzatoreMessaggi03, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[20];
		zOrderList[0] = VisualizzatoreOssigeno;
		zOrderList[1] = Testo01;
		zOrderList[2] = VisualizzatoreMessaggi01;
		zOrderList[3] = VisualizzatoreMessaggi02;
		zOrderList[4] = Testo03;
		zOrderList[5] = Testo04;
		zOrderList[6] = BannerAllarme01;
		zOrderList[7] = Testo05;
		zOrderList[8] = VisualizzatoreOssigeno02;
		zOrderList[9] = Testo06;
		zOrderList[10] = Linea01;
		zOrderList[11] = Linea02;
		zOrderList[12] = ButtonIndietro2;
		zOrderList[13] = VisualizzatoreOssigeno01;
		zOrderList[14] = Testo02;
		zOrderList[15] = VisualizzatoreOssigeno03;
		zOrderList[16] = Rettangolo03;
		zOrderList[17] = VisualizzatoreMessaggi03;
		zOrderList[18] = Testo07;
		zOrderList[19] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			VisualizzatoreOssigeno03,
			ButtonIndietro2,
			VisualizzatoreOssigeno02,
			BannerAllarme01,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SondaREDOXScalata);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SetPointREDOX);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$StatoM2);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$StatoM1);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$StatoEV);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SondaOSSIGENOScalata);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SetPointOSSIGENO);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();
		BannerAllarme01.clean();

		VisualizzatoreMessaggi03.shutdown();

		VisualizzatoreOssigeno03.shutdown();

		VisualizzatoreOssigeno01.shutdown();

		ButtonIndietro2.shutdown();

		VisualizzatoreOssigeno02.shutdown();

		VisualizzatoreMessaggi02.shutdown();

		VisualizzatoreMessaggi01.shutdown();

		VisualizzatoreOssigeno.shutdown();
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
			174 + _dx,	// x
			142 + _dy,	// y
			40,	// width
			31,	// height
			0x00777777,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			7,	// arc width
			7	// arc height
		);
		// Rettangolo01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			14 + _dx,	// x
			141 + _dy,	// y
			40,	// width
			30,	// height
			0x00777777,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.ARC_CORNERS,	// corner type
			7,	// arc width
			7	// arc height
		);
		VisualizzatoreOssigeno.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
