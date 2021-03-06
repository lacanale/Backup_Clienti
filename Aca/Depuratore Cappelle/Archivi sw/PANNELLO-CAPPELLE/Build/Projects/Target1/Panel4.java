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

public class Panel4 extends CgpPanel
{
	public Switch_0002 ButtonIndietro2;
	public CgpNumericDisplay M1RitardoAvvioVeloBassa;
	public CgpNumericDisplay M1RitardoAvvioVeloAlta;
	public CgpNumericDisplay M1LimitePreallarme;
	public CgpNumericDisplay M1LimitePreallarme01;
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
		return "SetMotore1";
	}
	public int getPanelID()
	{
		return 4;
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

		M1RitardoAvvioVeloBassa = new CgpNumericDisplay(230, 56, 290, 79, panelContext, this);
		M1RitardoAvvioVeloBassa.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M1RitardoAvvioVeloBassa.variable = TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa;
		M1RitardoAvvioVeloBassa.zeroSuppress = true;
		M1RitardoAvvioVeloBassa.zeroDisplay = true;
		M1RitardoAvvioVeloBassa.displayDigits = 6;
		M1RitardoAvvioVeloBassa.decimalPlaces = 0;
		M1RitardoAvvioVeloBassa.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		CgpFont	fonts4[][] = {
			{ textFont0 },
			};
		M1RitardoAvvioVeloBassa.fonts = fonts4;
		M1RitardoAvvioVeloBassa.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M1RitardoAvvioVeloBassa.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M1RitardoAvvioVeloBassa.enableInput = true;
		M1RitardoAvvioVeloBassa.displayPopupKeypad = true;
		M1RitardoAvvioVeloBassa.keypad = decKeypad;
		M1RitardoAvvioVeloBassa.beepOnTouch = false;
		M1RitardoAvvioVeloBassa.barcode = false;
		M1RitardoAvvioVeloBassa.frameColor = 0x00333333;
		M1RitardoAvvioVeloBassa.foreColor = 0x00000000;
		M1RitardoAvvioVeloBassa.textColor = 0x00ffffff;
		M1RitardoAvvioVeloBassa.text3DColor = 0x00000000;
		M1RitardoAvvioVeloBassa.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1RitardoAvvioVeloBassa.changeColor = false;
		M1RitardoAvvioVeloBassa.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		M1RitardoAvvioVeloBassa.drawObject = displayDraw0;
		M1RitardoAvvioVeloBassa.alwaysDrawBackground = false;
		M1RitardoAvvioVeloBassa.init();

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

		M1RitardoAvvioVeloAlta = new CgpNumericDisplay(230, 85, 290, 108, panelContext, this);
		M1RitardoAvvioVeloAlta.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M1RitardoAvvioVeloAlta.variable = TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta;
		M1RitardoAvvioVeloAlta.zeroSuppress = true;
		M1RitardoAvvioVeloAlta.zeroDisplay = true;
		M1RitardoAvvioVeloAlta.displayDigits = 6;
		M1RitardoAvvioVeloAlta.decimalPlaces = 0;
		M1RitardoAvvioVeloAlta.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M1RitardoAvvioVeloAlta.fonts = fonts4;
		M1RitardoAvvioVeloAlta.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M1RitardoAvvioVeloAlta.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M1RitardoAvvioVeloAlta.enableInput = true;
		M1RitardoAvvioVeloAlta.displayPopupKeypad = true;
		M1RitardoAvvioVeloAlta.keypad = decKeypad;
		M1RitardoAvvioVeloAlta.beepOnTouch = false;
		M1RitardoAvvioVeloAlta.barcode = false;
		M1RitardoAvvioVeloAlta.frameColor = 0x00333333;
		M1RitardoAvvioVeloAlta.foreColor = 0x00000000;
		M1RitardoAvvioVeloAlta.textColor = 0x00ffffff;
		M1RitardoAvvioVeloAlta.text3DColor = 0x00000000;
		M1RitardoAvvioVeloAlta.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1RitardoAvvioVeloAlta.changeColor = false;
		M1RitardoAvvioVeloAlta.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1RitardoAvvioVeloAlta.drawObject = displayDraw0;
		M1RitardoAvvioVeloAlta.alwaysDrawBackground = true;
		M1RitardoAvvioVeloAlta.init();

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

		M1LimitePreallarme = new CgpNumericDisplay(230, 113, 290, 136, panelContext, this);
		M1LimitePreallarme.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M1LimitePreallarme.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente;
		M1LimitePreallarme.zeroSuppress = true;
		M1LimitePreallarme.zeroDisplay = true;
		M1LimitePreallarme.displayDigits = 6;
		M1LimitePreallarme.decimalPlaces = 0;
		M1LimitePreallarme.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M1LimitePreallarme.fonts = fonts4;
		M1LimitePreallarme.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M1LimitePreallarme.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M1LimitePreallarme.enableInput = true;
		M1LimitePreallarme.displayPopupKeypad = true;
		M1LimitePreallarme.keypad = decKeypad;
		M1LimitePreallarme.beepOnTouch = false;
		M1LimitePreallarme.barcode = false;
		M1LimitePreallarme.frameColor = 0x00333333;
		M1LimitePreallarme.foreColor = 0x00000000;
		M1LimitePreallarme.textColor = 0x00ffffff;
		M1LimitePreallarme.text3DColor = 0x00000000;
		M1LimitePreallarme.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1LimitePreallarme.changeColor = false;
		M1LimitePreallarme.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1LimitePreallarme.drawObject = displayDraw0;
		M1LimitePreallarme.alwaysDrawBackground = true;
		M1LimitePreallarme.init();

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

		M1LimitePreallarme01 = new CgpNumericDisplay(230, 142, 290, 165, panelContext, this);
		M1LimitePreallarme01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		M1LimitePreallarme01.variable = TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente;
		M1LimitePreallarme01.zeroSuppress = true;
		M1LimitePreallarme01.zeroDisplay = true;
		M1LimitePreallarme01.displayDigits = 6;
		M1LimitePreallarme01.decimalPlaces = 0;
		M1LimitePreallarme01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		M1LimitePreallarme01.fonts = fonts4;
		M1LimitePreallarme01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		M1LimitePreallarme01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		M1LimitePreallarme01.enableInput = true;
		M1LimitePreallarme01.displayPopupKeypad = true;
		M1LimitePreallarme01.keypad = decKeypad;
		M1LimitePreallarme01.beepOnTouch = false;
		M1LimitePreallarme01.barcode = false;
		M1LimitePreallarme01.frameColor = 0x00333333;
		M1LimitePreallarme01.foreColor = 0x00000000;
		M1LimitePreallarme01.textColor = 0x00ffffff;
		M1LimitePreallarme01.text3DColor = 0x00000000;
		M1LimitePreallarme01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1LimitePreallarme01.changeColor = false;
		M1LimitePreallarme01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		M1LimitePreallarme01.drawObject = displayDraw0;
		M1LimitePreallarme01.alwaysDrawBackground = true;
		M1LimitePreallarme01.init();

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

		CgpFont	fonts16[];
		String	labels16[];
		fonts16 = new CgpFont[1];
		labels16 = new String[1];

		labels16[0] = " ";
		fonts16[0] = F1_0;

		ButtonIndietro01.buzzer = true;

		ButtonIndietro01.switchFonts = fonts16;
		ButtonIndietro01.labels = labels16;

		ButtonIndietro01.labelClr = intArray0;
		ButtonIndietro01.label3DClr = intArray1;
		ButtonIndietro01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro01.panelChange0 = 5;
		ButtonIndietro01.alwaysDrawBackground = false;

		ButtonIndietro01.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa.addEventListener(M1RitardoAvvioVeloBassa, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta.addEventListener(M1RitardoAvvioVeloAlta, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente.addEventListener(M1LimitePreallarme, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente.addEventListener(M1LimitePreallarme01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[14];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = M1RitardoAvvioVeloBassa;
		zOrderList[2] = Testo06;
		zOrderList[3] = Testo02;
		zOrderList[4] = M1RitardoAvvioVeloAlta;
		zOrderList[5] = Testo03;
		zOrderList[6] = Testo04;
		zOrderList[7] = M1LimitePreallarme;
		zOrderList[8] = Testo07;
		zOrderList[9] = Testo08;
		zOrderList[10] = M1LimitePreallarme01;
		zOrderList[11] = Testo09;
		zOrderList[12] = ButtonIndietro01;
		zOrderList[13] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			ButtonIndietro01,
			M1LimitePreallarme01,
			M1LimitePreallarme,
			M1RitardoAvvioVeloAlta,
			M1RitardoAvvioVeloBassa,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		nativeImage0.clean();
		nativeImage1.clean();

		ButtonIndietro01.shutdown();

		M1LimitePreallarme01.shutdown();

		M1LimitePreallarme.shutdown();

		M1RitardoAvvioVeloAlta.shutdown();

		M1RitardoAvvioVeloBassa.shutdown();

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
			"Compressore 1",	// text
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
		M1RitardoAvvioVeloBassa.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
