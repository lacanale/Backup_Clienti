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

public class Panel3 extends CgpPanel
{
	public Switch_0002 ButtonIndietro2;
	public Switch_0011 Riepilogoallarmi01_Switch_0011;
	public Switch_0012 Riepilogoallarmi01_Switch_0012;
	public Switch_0014 Riepilogoallarmi01_Switch_0014;
	public Switch_0016 Riepilogoallarmi01_Switch_0016;
	public Switch_0017 Riepilogoallarmi01_Switch_0017;
	public Switch_0018 Riepilogoallarmi01_Switch_0018;
	CgpFont F1_0;
	CgpFont LBRiepilogoallarmi01Font[];
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	CgpGraphicFile nativeImage3;
	CgpGraphicFile nativeImage4;
	CgpGraphicFile nativeImage5;
	CgpGraphicFile nativeImage6;
	private CgpMasterPanel masterPanel = null;
	public static CgpAlarmSummary Riepilogoallarmi01;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		String Riepilogoallarmi01Strings[];
		CgpFont Riepilogoallarmi01Fonts[];

		CgpStringDB dbRiepilogoallarmi01_0;
		Riepilogoallarmi01Strings = new String[3];
		Riepilogoallarmi01Strings[0] = "Messaggio";
		Riepilogoallarmi01Strings[1] = "Data";
		Riepilogoallarmi01Strings[2] = "Ora";
		Riepilogoallarmi01Fonts = new CgpFont[3];
		Riepilogoallarmi01Fonts[0] = new CgpFont("TCP8x13", CgpFont.BOLD, (byte)13, (byte)8);
		Riepilogoallarmi01Fonts[1] = Riepilogoallarmi01Fonts[0];
		Riepilogoallarmi01Fonts[2] = Riepilogoallarmi01Fonts[0];
		dbRiepilogoallarmi01_0 = new CgpStringDB(Riepilogoallarmi01Strings, Riepilogoallarmi01Fonts);

		CgpStringDB Riepilogoallarmi01DBList[] =
		{
			dbRiepilogoallarmi01_0,
		};

		int LBRiepilogoallarmi01Widths[] = {
			300,
			100,
			100,
		};

		int LBRiepilogoallarmi01Lengths[] = {
			9999,
			9999,
			9999,
		};
		LBRiepilogoallarmi01Font = new CgpFont[1];
		LBRiepilogoallarmi01Font[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		int Riepilogoallarmi01_columns[] = {
			CgpAlarmFormatter.COLUMN_MESSAGE,
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
		};

		CgpAlarmFormatter Riepilogoallarmi01_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			Riepilogoallarmi01_columns, null);
		Riepilogoallarmi01 = new CgpAlarmSummary(
			0,
			40,
			319,
			199,
			false,
			IgpAlarmGroupConstants.ACTIVE_DISP_MODE,
			TagDB.GruppoAllarme1,
			Riepilogoallarmi01_formatter,
			LBRiepilogoallarmi01Font,
			panelContext
		);
		CgpListBox Riepilogoallarmi01_listbox = new CgpListBox (
			0,
			40,
			319,
			199,
			LBRiepilogoallarmi01Font[0],
			0x00000000,
			1,
			LBRiepilogoallarmi01Widths,
			LBRiepilogoallarmi01Lengths,
			true,
			false,
			true,
			20,
			20,
			false,
			false,
			false,
			Riepilogoallarmi01,
			0,
			panelContext
		);
		CgpAlarmColorMgr Riepilogoallarmi01_Colors	= new CgpAlarmColorMgr();
		int[] Riepilogoallarmi01_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] Riepilogoallarmi01_DefaultBackColors	= { 0x000101ff, 0x0001ffff, 0x00888888, 0x0001ff01 };
		int[] Riepilogoallarmi01_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] Riepilogoallarmi01_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		Riepilogoallarmi01_Colors.defaultTextColors	= Riepilogoallarmi01_DefaultTextColors;
		Riepilogoallarmi01_Colors.defaultBackColors	= Riepilogoallarmi01_DefaultBackColors;
		Riepilogoallarmi01_Colors.defaultTextBlink = Riepilogoallarmi01_DefaultTextBlink;
		Riepilogoallarmi01_Colors.defaultBackBlink = Riepilogoallarmi01_DefaultBackBlink;
		Riepilogoallarmi01.setColorSet(Riepilogoallarmi01_Colors);

		Riepilogoallarmi01_listbox.setTitle(Riepilogoallarmi01DBList, 0x00ffffff, 0x00000000);
		Riepilogoallarmi01_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		Riepilogoallarmi01_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		Riepilogoallarmi01.setListBox(Riepilogoallarmi01_listbox);
		Riepilogoallarmi01.setAutoCursorOn(true);

	}
	public String getPanelName()
	{
		return "Allarmi";
	}
	public int getPanelID()
	{
		return 3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

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
		Riepilogoallarmi01_Switch_0011 = new Switch_0011(0, 0, 39, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0011.foreClr = 0x00777777;
		nativeImage1 = new CgpGraphicFile( "Bitmap17.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0011.image01 = nativeImage1;
		Riepilogoallarmi01_Switch_0011.image02 = nativeImage1;
		Riepilogoallarmi01_Switch_0011.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0011.buzzer = true;
		Riepilogoallarmi01_Switch_0011.alwaysDrawBackground = false;

		Riepilogoallarmi01_Switch_0012 = new Switch_0012(40, 0, 79, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0012.foreClr = 0x00777777;
		nativeImage2 = new CgpGraphicFile( "Bitmap16.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0012.image01 = nativeImage2;
		Riepilogoallarmi01_Switch_0012.image02 = nativeImage2;
		Riepilogoallarmi01_Switch_0012.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0012.buzzer = true;
		Riepilogoallarmi01_Switch_0012.alwaysDrawBackground = false;

		Riepilogoallarmi01_Switch_0014 = new Switch_0014(80, 0, 119, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0014.foreClr = 0x00777777;
		nativeImage3 = new CgpGraphicFile( "Bitmap15.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0014.image01 = nativeImage3;
		Riepilogoallarmi01_Switch_0014.image02 = nativeImage3;
		Riepilogoallarmi01_Switch_0014.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0014.buzzer = true;
		Riepilogoallarmi01_Switch_0014.alwaysDrawBackground = false;

		Riepilogoallarmi01_Switch_0016 = new Switch_0016(120, 0, 159, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0016.foreClr = 0x00777777;
		nativeImage4 = new CgpGraphicFile( "Bitmap14.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0016.image01 = nativeImage4;
		Riepilogoallarmi01_Switch_0016.image02 = nativeImage4;
		Riepilogoallarmi01_Switch_0016.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0016.buzzer = true;
		Riepilogoallarmi01_Switch_0016.alwaysDrawBackground = false;

		Riepilogoallarmi01_Switch_0017 = new Switch_0017(160, 0, 199, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0017.foreClr = 0x00777777;
		nativeImage5 = new CgpGraphicFile( "Bitmap13.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0017.image01 = nativeImage5;
		Riepilogoallarmi01_Switch_0017.image02 = nativeImage5;
		Riepilogoallarmi01_Switch_0017.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0017.buzzer = true;
		Riepilogoallarmi01_Switch_0017.alwaysDrawBackground = false;

		Riepilogoallarmi01_Switch_0018 = new Switch_0018(200, 0, 239, 39, panelContext, this);
		Riepilogoallarmi01_Switch_0018.foreClr = 0x00777777;
		nativeImage6 = new CgpGraphicFile( "Bitmap12.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00777777),this);
		Riepilogoallarmi01_Switch_0018.image01 = nativeImage6;
		Riepilogoallarmi01_Switch_0018.image02 = nativeImage6;
		Riepilogoallarmi01_Switch_0018.alarm0 = Riepilogoallarmi01;
		Riepilogoallarmi01_Switch_0018.buzzer = true;
		Riepilogoallarmi01_Switch_0018.alwaysDrawBackground = false;

		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(Riepilogoallarmi01, contextObject);

		CgpGraphics zOrderList[] = new CgpGraphics[8];
		zOrderList[0] = ButtonIndietro2;
		zOrderList[1] = Riepilogoallarmi01_Switch_0011;
		zOrderList[2] = Riepilogoallarmi01_Switch_0012;
		zOrderList[3] = Riepilogoallarmi01_Switch_0014;
		zOrderList[4] = Riepilogoallarmi01_Switch_0016;
		zOrderList[5] = Riepilogoallarmi01_Switch_0017;
		zOrderList[6] = Riepilogoallarmi01_Switch_0018;
		zOrderList[7] = Riepilogoallarmi01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Riepilogoallarmi01,
			Riepilogoallarmi01_Switch_0018,
			Riepilogoallarmi01_Switch_0017,
			Riepilogoallarmi01_Switch_0016,
			Riepilogoallarmi01_Switch_0014,
			Riepilogoallarmi01_Switch_0012,
			Riepilogoallarmi01_Switch_0011,
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

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		nativeImage0.clean();
		nativeImage1.clean();
		nativeImage2.clean();
		nativeImage3.clean();
		nativeImage4.clean();
		nativeImage5.clean();
		nativeImage6.clean();
		Riepilogoallarmi01.clean();

		Riepilogoallarmi01_Switch_0018.shutdown();

		Riepilogoallarmi01_Switch_0017.shutdown();

		Riepilogoallarmi01_Switch_0016.shutdown();

		Riepilogoallarmi01_Switch_0014.shutdown();

		Riepilogoallarmi01_Switch_0012.shutdown();

		Riepilogoallarmi01_Switch_0011.shutdown();

		ButtonIndietro2.shutdown();
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
