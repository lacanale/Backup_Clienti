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

public class Panel7 extends CgpPanel
{
	public Lamp_0014 Spia01;
	public Lamp_0014 Spia02;
	public Switch_0002 ButtonIndietro2;
	CgpFont F1;
	CgpFont F21;
	CgpGraphicFile nativeImage0;
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
		return "Diagnosi2";
	}
	public int getPanelID()
	{
		return 7;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);

		F21 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		Spia01 = new Lamp_0014(240, 57, 279, 81, panelContext, this);
		int intArray0[] = {0x00777777, 0x00ffffff, };
		Spia01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Spia01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		Spia01.pattern = intArray2;
		Spia01.controlTag01 = TagDB.PLC_ApparecchiaturaModbus01$VentolaBox1;
		Spia01.alwaysDrawBackground = false;

		Spia01.init();
		Spia02 = new Lamp_0014(240, 84, 279, 108, panelContext, this);
		Spia02.foreClr = intArray0;
		Spia02.backClr = intArray1;
		Spia02.pattern = intArray2;
		Spia02.controlTag01 = TagDB.PLC_ApparecchiaturaModbus01$VentolaBox2;
		Spia02.alwaysDrawBackground = false;

		Spia02.init();
		ButtonIndietro2 = new Switch_0002(0, 200, 59, 239, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap1.bmp", 0, 0, 59, 39, 0, CgpColor.makeTransparentColor(0x00777777),this);
		ButtonIndietro2.image01 = nativeImage0;
		ButtonIndietro2.image02 = nativeImage0;

		CgpFont	fonts28[];
		String	labels28[];
		fonts28 = new CgpFont[1];
		labels28 = new String[1];

		labels28[0] = " ";
		fonts28[0] = F21;

		ButtonIndietro2.buzzer = true;

		ButtonIndietro2.switchFonts = fonts28;
		ButtonIndietro2.labels = labels28;

		int intArray3[] = {0x00ffffff, };
		ButtonIndietro2.labelClr = intArray3;
		int intArray4[] = {0x00777777, };
		ButtonIndietro2.label3DClr = intArray4;
		ButtonIndietro2.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		ButtonIndietro2.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		ButtonIndietro2.alwaysDrawBackground = false;

		ButtonIndietro2.init();
		((CgpWindow)owner).drawBack();
		TagDB.PLC_ApparecchiaturaModbus01$VentolaBox1.addEventListener(Spia01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$VentolaBox2.addEventListener(Spia02, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[3];
		zOrderList[0] = Spia01;
		zOrderList[1] = Spia02;
		zOrderList[2] = ButtonIndietro2;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$VentolaBox1);
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$VentolaBox2);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		nativeImage0.clean();

		ButtonIndietro2.shutdown();

		Spia02.shutdown();

		Spia01.shutdown();
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
		// Testo10
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Ventola BOX 1",	// text
			0 + _dx,	// x
			60 + _dy,	// y
			220,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F21	// font type
		);
		// Testo11
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			0x00000000,	// bg color
			0x00777777,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Ventola BOX 2",	// text
			0 + _dx,	// x
			87 + _dy,	// y
			220,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F21	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
