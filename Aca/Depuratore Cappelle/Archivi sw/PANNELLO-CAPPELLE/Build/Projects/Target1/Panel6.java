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

public class Panel6 extends CgpPanel
{
	public CgpNumericDisplay M2RitardoAvvioVeloBassa;
	public CgpNumericDisplay M2RitardoAvvioVeloBassa02;
	public CgpNumericDisplay M2RitardoAvvioVeloBassa03;
	public Lamp_0014 Spia01;
	public Lamp_0014 Spia02;
	public Switch_0013 ButtonIndietro01;
	public Switch_0002 ButtonIndietro2;
	CgpFont F1;
	CgpFont F2;
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
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
		return "Diagnosi1";
	}
	public int getPanelID()
	{
		return 6;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		F2 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);


		M2RitardoAvvioVeloBassa = new CgpNumericDisplay(230, 56, 290, 79, panelContext, this);
		M2RitardoAvvioVeloBassa.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2RitardoAvvioVeloBassa.variable = TagDB.PLC_ApparecchiaturaModbus01$SondaREDOX_ANA.VALUE;
		M2RitardoAvvioVeloBassa.zeroSuppress = true;
		M2RitardoAvvioVeloBassa.zeroDisplay = true;
		M2RitardoAvvioVeloBassa.displayDigits = 6;
		M2RitardoAvvioVeloBassa.decimalPlaces = 0;
		M2RitardoAvvioVeloBassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		CgpFont	fonts3[][] = {
			{ textFont0 },
			};
		M2RitardoAvvioVeloBassa.fonts = fonts3;
		M2RitardoAvvioVeloBassa.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2RitardoAvvioVeloBassa.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2RitardoAvvioVeloBassa.enableInput = false;
		M2RitardoAvvioVeloBassa.barcode = false;
		M2RitardoAvvioVeloBassa.frameColor = 0x00333333;
		M2RitardoAvvioVeloBassa.foreColor = 0x00000000;
		M2RitardoAvvioVeloBassa.textColor = 0x00ffffff;
		M2RitardoAvvioVeloBassa.text3DColor = 0x00000000;
		M2RitardoAvvioVeloBassa.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloBassa.changeColor = false;
		M2RitardoAvvioVeloBassa.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		M2RitardoAvvioVeloBassa.drawObject = displayDraw0;
		M2RitardoAvvioVeloBassa.alwaysDrawBackground = false;
		M2RitardoAvvioVeloBassa.init();

		CgpText Testo06 = new CgpText
		(
			"sec",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			60,	// y1
			326,	// x2
			79,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo06.set3DColor(0x00777777);

		CgpText Testo04 = new CgpText
		(
			"Corrente Compressore 1",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			100,	// y1
			219,	// x2
			119,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo04.set3DColor(0x00777777);

		M2RitardoAvvioVeloBassa02 = new CgpNumericDisplay(230, 96, 290, 119, panelContext, this);
		M2RitardoAvvioVeloBassa02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2RitardoAvvioVeloBassa02.variable = TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE;
		M2RitardoAvvioVeloBassa02.zeroSuppress = true;
		M2RitardoAvvioVeloBassa02.zeroDisplay = true;
		M2RitardoAvvioVeloBassa02.displayDigits = 6;
		M2RitardoAvvioVeloBassa02.decimalPlaces = 0;
		M2RitardoAvvioVeloBassa02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M2RitardoAvvioVeloBassa02.fonts = fonts3;
		M2RitardoAvvioVeloBassa02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2RitardoAvvioVeloBassa02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2RitardoAvvioVeloBassa02.enableInput = false;
		M2RitardoAvvioVeloBassa02.barcode = false;
		M2RitardoAvvioVeloBassa02.frameColor = 0x00333333;
		M2RitardoAvvioVeloBassa02.foreColor = 0x00000000;
		M2RitardoAvvioVeloBassa02.textColor = 0x00ffffff;
		M2RitardoAvvioVeloBassa02.text3DColor = 0x00000000;
		M2RitardoAvvioVeloBassa02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloBassa02.changeColor = false;
		M2RitardoAvvioVeloBassa02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloBassa02.drawObject = displayDraw0;
		M2RitardoAvvioVeloBassa02.alwaysDrawBackground = true;
		M2RitardoAvvioVeloBassa02.init();

		CgpText Testo07 = new CgpText
		(
			"sec",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			100,	// y1
			326,	// x2
			119,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo07.set3DColor(0x00777777);

		CgpText Testo08 = new CgpText
		(
			"Corrente Compressore 2",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			120,	// y1
			219,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo08.set3DColor(0x00777777);

		M2RitardoAvvioVeloBassa03 = new CgpNumericDisplay(230, 116, 290, 139, panelContext, this);
		M2RitardoAvvioVeloBassa03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2RitardoAvvioVeloBassa03.variable = TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE;
		M2RitardoAvvioVeloBassa03.zeroSuppress = true;
		M2RitardoAvvioVeloBassa03.zeroDisplay = true;
		M2RitardoAvvioVeloBassa03.displayDigits = 6;
		M2RitardoAvvioVeloBassa03.decimalPlaces = 0;
		M2RitardoAvvioVeloBassa03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M2RitardoAvvioVeloBassa03.fonts = fonts3;
		M2RitardoAvvioVeloBassa03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2RitardoAvvioVeloBassa03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2RitardoAvvioVeloBassa03.enableInput = false;
		M2RitardoAvvioVeloBassa03.barcode = false;
		M2RitardoAvvioVeloBassa03.frameColor = 0x00333333;
		M2RitardoAvvioVeloBassa03.foreColor = 0x00000000;
		M2RitardoAvvioVeloBassa03.textColor = 0x00ffffff;
		M2RitardoAvvioVeloBassa03.text3DColor = 0x00000000;
		M2RitardoAvvioVeloBassa03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloBassa03.changeColor = false;
		M2RitardoAvvioVeloBassa03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloBassa03.drawObject = displayDraw0;
		M2RitardoAvvioVeloBassa03.alwaysDrawBackground = true;
		M2RitardoAvvioVeloBassa03.init();

		CgpText Testo09 = new CgpText
		(
			"sec",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			120,	// y1
			326,	// x2
			139,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo09.set3DColor(0x00777777);

		CgpText Testo10 = new CgpText
		(
			"Ventola Compressore 1",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			150,	// y1
			219,	// x2
			169,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo10.set3DColor(0x00777777);
		Spia01 = new Lamp_0014(240, 146, 279, 170, panelContext, this);
		int intArray0[] = {0x00777777, 0x00ffffff, };
		Spia01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Spia01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		Spia01.pattern = intArray2;
		Spia01.controlTag01 = TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore1;
		Spia01.alwaysDrawBackground = false;

		Spia01.init();

		CgpText Testo11 = new CgpText
		(
			"Ventola Compressore 2",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F2,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			177,	// y1
			219,	// x2
			196,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo11.set3DColor(0x00777777);
		Spia02 = new Lamp_0014(240, 174, 279, 198, panelContext, this);
		Spia02.foreClr = intArray0;
		Spia02.backClr = intArray1;
		Spia02.pattern = intArray2;
		Spia02.controlTag01 = TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore2;
		Spia02.alwaysDrawBackground = false;

		Spia02.init();
		ButtonIndietro01 = new Switch_0013(260, 200, 319, 239, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap42.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro01.image01 = nativeImage0;
		ButtonIndietro01.image02 = nativeImage0;

		CgpFont	fonts27[];
		String	labels27[];
		fonts27 = new CgpFont[1];
		labels27 = new String[1];

		labels27[0] = " ";
		fonts27[0] = F2;

		ButtonIndietro01.buzzer = true;

		ButtonIndietro01.switchFonts = fonts27;
		ButtonIndietro01.labels = labels27;

		int intArray3[] = {0x00ffffff, };
		ButtonIndietro01.labelClr = intArray3;
		int intArray4[] = {0x00777777, };
		ButtonIndietro01.label3DClr = intArray4;
		ButtonIndietro01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro01.panelChange0 = 7;
		ButtonIndietro01.alwaysDrawBackground = false;

		ButtonIndietro01.init();
		ButtonIndietro2 = new Switch_0002(0, 200, 59, 239, panelContext, this);
		nativeImage1 = new CgpGraphicFile( "Bitmap1.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro2.image01 = nativeImage1;
		ButtonIndietro2.image02 = nativeImage1;

		CgpFont	fonts28[];
		String	labels28[];
		fonts28 = new CgpFont[1];
		labels28 = new String[1];

		labels28[0] = " ";
		fonts28[0] = F2;

		ButtonIndietro2.buzzer = true;

		ButtonIndietro2.switchFonts = fonts28;
		ButtonIndietro2.labels = labels28;

		ButtonIndietro2.labelClr = intArray3;
		ButtonIndietro2.label3DClr = intArray4;
		ButtonIndietro2.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro2.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro2.alwaysDrawBackground = false;

		ButtonIndietro2.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$SondaREDOX_ANA.VALUE.addEventListener(M2RitardoAvvioVeloBassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE.addEventListener(M2RitardoAvvioVeloBassa02, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE.addEventListener(M2RitardoAvvioVeloBassa03, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore1.addEventListener(Spia01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore2.addEventListener(Spia02, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[14];
		zOrderList[0] = M2RitardoAvvioVeloBassa;
		zOrderList[1] = Testo06;
		zOrderList[2] = Testo04;
		zOrderList[3] = M2RitardoAvvioVeloBassa02;
		zOrderList[4] = Testo07;
		zOrderList[5] = Testo08;
		zOrderList[6] = M2RitardoAvvioVeloBassa03;
		zOrderList[7] = Testo09;
		zOrderList[8] = Testo10;
		zOrderList[9] = Spia01;
		zOrderList[10] = Testo11;
		zOrderList[11] = Spia02;
		zOrderList[12] = ButtonIndietro01;
		zOrderList[13] = ButtonIndietro2;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			ButtonIndietro2,
			ButtonIndietro01,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$SondaREDOX_ANA.VALUE);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore2);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore1);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		nativeImage0.clean();
		nativeImage1.clean();

		ButtonIndietro2.shutdown();

		ButtonIndietro01.shutdown();

		Spia02.shutdown();

		Spia01.shutdown();

		M2RitardoAvvioVeloBassa03.shutdown();

		M2RitardoAvvioVeloBassa02.shutdown();

		M2RitardoAvvioVeloBassa.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Testo05
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00888888,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Diagnostica Impianto",	// text
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
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Sonda REDOX",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			220,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F2	// font type
		);
		M2RitardoAvvioVeloBassa.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
