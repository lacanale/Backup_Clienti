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

public class Panel5 extends CgpPanel
{
	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay M2RitardoAvvioVeloBassa;
	public CgpNumericDisplay M2RitardoAvvioVeloAlta;
	public CgpNumericDisplay M2LimitePreallarme;
	public CgpNumericDisplay M2LimitePreallarme01;
	public Switch_0013 ButtonIndietro01;
	CgpFont F1_0;
	CgpFont F2;
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
	}
	public String getPanelName()
	{
		return "SetMotore2";
	}
	public int getPanelID()
	{
		return 5;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F2 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

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

		M2RitardoAvvioVeloBassa = new CgpNumericDisplay(230, 56, 290, 79, panelContext, this);
		M2RitardoAvvioVeloBassa.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2RitardoAvvioVeloBassa.variable = TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa;
		M2RitardoAvvioVeloBassa.zeroSuppress = true;
		M2RitardoAvvioVeloBassa.zeroDisplay = true;
		M2RitardoAvvioVeloBassa.displayDigits = 6;
		M2RitardoAvvioVeloBassa.decimalPlaces = 0;
		M2RitardoAvvioVeloBassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		CgpFont	fonts4[][] = {
			{ textFont0 },
			};
		M2RitardoAvvioVeloBassa.fonts = fonts4;
		M2RitardoAvvioVeloBassa.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2RitardoAvvioVeloBassa.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2RitardoAvvioVeloBassa.enableInput = true;
		M2RitardoAvvioVeloBassa.displayPopupKeypad = true;
		M2RitardoAvvioVeloBassa.keypad = decKeypad;
		M2RitardoAvvioVeloBassa.beepOnTouch = false;
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
			F1_0,
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

		CgpText Testo02 = new CgpText
		(
			"Ritardo avvio 4 Poli",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			89,	// y1
			219,	// x2
			108,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo02.set3DColor(0x00777777);

		M2RitardoAvvioVeloAlta = new CgpNumericDisplay(230, 85, 290, 108, panelContext, this);
		M2RitardoAvvioVeloAlta.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2RitardoAvvioVeloAlta.variable = TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta;
		M2RitardoAvvioVeloAlta.zeroSuppress = true;
		M2RitardoAvvioVeloAlta.zeroDisplay = true;
		M2RitardoAvvioVeloAlta.displayDigits = 6;
		M2RitardoAvvioVeloAlta.decimalPlaces = 0;
		M2RitardoAvvioVeloAlta.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M2RitardoAvvioVeloAlta.fonts = fonts4;
		M2RitardoAvvioVeloAlta.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2RitardoAvvioVeloAlta.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2RitardoAvvioVeloAlta.enableInput = true;
		M2RitardoAvvioVeloAlta.displayPopupKeypad = true;
		M2RitardoAvvioVeloAlta.keypad = decKeypad;
		M2RitardoAvvioVeloAlta.beepOnTouch = false;
		M2RitardoAvvioVeloAlta.barcode = false;
		M2RitardoAvvioVeloAlta.frameColor = 0x00333333;
		M2RitardoAvvioVeloAlta.foreColor = 0x00000000;
		M2RitardoAvvioVeloAlta.textColor = 0x00ffffff;
		M2RitardoAvvioVeloAlta.text3DColor = 0x00000000;
		M2RitardoAvvioVeloAlta.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloAlta.changeColor = false;
		M2RitardoAvvioVeloAlta.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2RitardoAvvioVeloAlta.drawObject = displayDraw0;
		M2RitardoAvvioVeloAlta.alwaysDrawBackground = true;
		M2RitardoAvvioVeloAlta.init();

		CgpText Testo03 = new CgpText
		(
			"sec",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			89,	// y1
			326,	// x2
			108,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo03.set3DColor(0x00777777);

		CgpText Testo04 = new CgpText
		(
			"Limite Preallarme Corrente",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			117,	// y1
			219,	// x2
			136,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo04.set3DColor(0x00777777);

		M2LimitePreallarme = new CgpNumericDisplay(230, 113, 290, 136, panelContext, this);
		M2LimitePreallarme.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2LimitePreallarme.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente;
		M2LimitePreallarme.zeroSuppress = true;
		M2LimitePreallarme.zeroDisplay = true;
		M2LimitePreallarme.displayDigits = 6;
		M2LimitePreallarme.decimalPlaces = 0;
		M2LimitePreallarme.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M2LimitePreallarme.fonts = fonts4;
		M2LimitePreallarme.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2LimitePreallarme.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2LimitePreallarme.enableInput = true;
		M2LimitePreallarme.displayPopupKeypad = true;
		M2LimitePreallarme.keypad = decKeypad;
		M2LimitePreallarme.beepOnTouch = false;
		M2LimitePreallarme.barcode = false;
		M2LimitePreallarme.frameColor = 0x00333333;
		M2LimitePreallarme.foreColor = 0x00000000;
		M2LimitePreallarme.textColor = 0x00ffffff;
		M2LimitePreallarme.text3DColor = 0x00000000;
		M2LimitePreallarme.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2LimitePreallarme.changeColor = false;
		M2LimitePreallarme.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2LimitePreallarme.drawObject = displayDraw0;
		M2LimitePreallarme.alwaysDrawBackground = true;
		M2LimitePreallarme.init();

		CgpText Testo07 = new CgpText
		(
			"A",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			117,	// y1
			326,	// x2
			136,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo07.set3DColor(0x00777777);

		CgpText Testo08 = new CgpText
		(
			"Limite Allarme Corrente",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			0x00000000,	// BackColor
			0,	// x1
			146,	// y1
			219,	// x2
			165,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo08.set3DColor(0x00777777);

		M2LimitePreallarme01 = new CgpNumericDisplay(230, 142, 290, 165, panelContext, this);
		M2LimitePreallarme01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M2LimitePreallarme01.variable = TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente;
		M2LimitePreallarme01.zeroSuppress = true;
		M2LimitePreallarme01.zeroDisplay = true;
		M2LimitePreallarme01.displayDigits = 6;
		M2LimitePreallarme01.decimalPlaces = 0;
		M2LimitePreallarme01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M2LimitePreallarme01.fonts = fonts4;
		M2LimitePreallarme01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M2LimitePreallarme01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M2LimitePreallarme01.enableInput = true;
		M2LimitePreallarme01.displayPopupKeypad = true;
		M2LimitePreallarme01.keypad = decKeypad;
		M2LimitePreallarme01.beepOnTouch = false;
		M2LimitePreallarme01.barcode = false;
		M2LimitePreallarme01.frameColor = 0x00333333;
		M2LimitePreallarme01.foreColor = 0x00000000;
		M2LimitePreallarme01.textColor = 0x00ffffff;
		M2LimitePreallarme01.text3DColor = 0x00000000;
		M2LimitePreallarme01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2LimitePreallarme01.changeColor = false;
		M2LimitePreallarme01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M2LimitePreallarme01.drawObject = displayDraw0;
		M2LimitePreallarme01.alwaysDrawBackground = true;
		M2LimitePreallarme01.init();

		CgpText Testo09 = new CgpText
		(
			"A",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F1_0,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			287,	// x1
			146,	// y1
			326,	// x2
			165,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Testo09.set3DColor(0x00777777);
		ButtonIndietro01 = new Switch_0013(260, 200, 319, 239, panelContext, this);
		nativeImage1 = new CgpGraphicFile( "Bitmap42.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro01.image01 = nativeImage1;
		ButtonIndietro01.image02 = nativeImage1;

		CgpFont	fonts17[];
		String	labels17[];
		fonts17 = new CgpFont[1];
		labels17 = new String[1];

		labels17[0] = " ";
		fonts17[0] = F1_0;

		ButtonIndietro01.buzzer = true;

		ButtonIndietro01.switchFonts = fonts17;
		ButtonIndietro01.labels = labels17;

		ButtonIndietro01.labelClr = intArray0;
		ButtonIndietro01.label3DClr = intArray1;
		ButtonIndietro01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro01.panelChange0 = 10;
		ButtonIndietro01.alwaysDrawBackground = false;

		ButtonIndietro01.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa.addEventListener(M2RitardoAvvioVeloBassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta.addEventListener(M2RitardoAvvioVeloAlta, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente.addEventListener(M2LimitePreallarme, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente.addEventListener(M2LimitePreallarme01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[14];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = M2RitardoAvvioVeloBassa;
		zOrderList[2] = Testo06;
		zOrderList[3] = Testo02;
		zOrderList[4] = M2RitardoAvvioVeloAlta;
		zOrderList[5] = Testo03;
		zOrderList[6] = Testo04;
		zOrderList[7] = M2LimitePreallarme;
		zOrderList[8] = Testo07;
		zOrderList[9] = Testo08;
		zOrderList[10] = M2LimitePreallarme01;
		zOrderList[11] = Testo09;
		zOrderList[12] = ButtonIndietro01;
		zOrderList[13] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			ButtonIndietro01,
			M2LimitePreallarme01,
			M2LimitePreallarme,
			M2RitardoAvvioVeloAlta,
			M2RitardoAvvioVeloBassa,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();
		nativeImage1.clean();

		ButtonIndietro01.shutdown();

		M2LimitePreallarme01.shutdown();

		M2LimitePreallarme.shutdown();

		M2RitardoAvvioVeloAlta.shutdown();

		M2RitardoAvvioVeloBassa.shutdown();

		ButtonIndietro2.shutdown();
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
			"Compressore 2",	// text
			0 + _dx,	// x
			0 + _dy,	// y
			320,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F2	// font type
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
			"Ritardo avvio 2 Poli",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			220,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1_0	// font type
		);
		M2RitardoAvvioVeloBassa.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
