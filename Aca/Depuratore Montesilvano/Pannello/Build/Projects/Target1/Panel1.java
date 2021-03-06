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

public class Panel1 extends CgpPanel
{
	public Switch_0001 Button_Setup;
	public CgpNumericDisplay VisualizzatoreData01;
	public Switch_0001 Button_Setup01;
	public Switch_0001 Button_Setup02;
	public Switch_0015 Tasto01;
	public Switch_0015 Tasto02;
	public TextList_0016 VisualizzatoreMessaggi03;
	public Switch_0001 Button_Setup03;
	public Switch_0015 Tasto03;
	CgpResText _TextResource0 = new _TextResource0();
	CgpResIntIndex _IndexIntResource0 = new _IndexIntResource0();
	CgpResColor _ColorResource0 = new _ColorResource0();
	CgpFont F2_0;
	CgpFont LBBannerAllarme01Font[];
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
		return "Main";
	}
	public int getPanelID()
	{
		return 1;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		Button_Setup = new Switch_0001(65, 200, 124, 239, panelContext, this);
		Button_Setup.foreClr = 0x00444444;
		Button_Setup.backClr = 0x00000000;
		Button_Setup.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "Setup";

		F2_0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);
		fonts2[0] = F2_0;

		Button_Setup.buzzer = true;

		Button_Setup.switchFonts = fonts2;
		Button_Setup.labels = labels2;

		int intArray0[] = {0x00ffffff, };
		Button_Setup.labelClr = intArray0;
		int intArray1[] = {0x00777777, };
		Button_Setup.label3DClr = intArray1;
		Button_Setup.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Button_Setup.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Button_Setup.panelChange0 = 2;
		Button_Setup.alwaysDrawBackground = false;

		Button_Setup.init();

		VisualizzatoreData01 = new CgpNumericDisplay(0, 33, 99, 52, panelContext, this);
		VisualizzatoreData01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		VisualizzatoreData01.dateTimeFormat = CgpDate.DD_MM_YYYY;
		VisualizzatoreData01.dateTimeListenVariable = TagDB._Day;
		CgpFont	fonts3[][] = {
			{ textFont0 },
			};
		VisualizzatoreData01.fonts = fonts3;
		VisualizzatoreData01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreData01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreData01.enableInput = false;
		VisualizzatoreData01.barcode = false;
		VisualizzatoreData01.frameColor = 0x00333333;
		VisualizzatoreData01.foreColor = 0x00000000;
		VisualizzatoreData01.textColor = 0x00ffffff;
		VisualizzatoreData01.text3DColor = 0x00000000;
		VisualizzatoreData01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		VisualizzatoreData01.changeColor = false;
		VisualizzatoreData01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_BlankArea(0,0,0,0);
		VisualizzatoreData01.drawObject = displayDraw0;
		VisualizzatoreData01.alwaysDrawBackground = false;
		VisualizzatoreData01.init();
		Button_Setup01 = new Switch_0001(125, 200, 184, 239, panelContext, this);
		Button_Setup01.foreClr = 0x00444444;
		Button_Setup01.backClr = 0x00000000;
		Button_Setup01.pattern = 1;

		CgpFont	fonts17[];
		String	labels17[];
		fonts17 = new CgpFont[1];
		labels17 = new String[1];

		labels17[0] = "Diagn.";
		fonts17[0] = F2_0;

		Button_Setup01.buzzer = true;

		Button_Setup01.switchFonts = fonts17;
		Button_Setup01.labels = labels17;

		Button_Setup01.labelClr = intArray0;
		Button_Setup01.label3DClr = intArray1;
		Button_Setup01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Button_Setup01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Button_Setup01.panelChange0 = 6;
		Button_Setup01.alwaysDrawBackground = false;

		Button_Setup01.init();
		Button_Setup02 = new Switch_0001(185, 200, 244, 239, panelContext, this);
		Button_Setup02.foreClr = 0x00444444;
		Button_Setup02.backClr = 0x00000000;
		Button_Setup02.pattern = 1;

		CgpFont	fonts19[];
		String	labels19[];
		fonts19 = new CgpFont[1];
		labels19 = new String[1];

		labels19[0] = "Allarmi";
		fonts19[0] = F2_0;

		Button_Setup02.buzzer = true;

		Button_Setup02.switchFonts = fonts19;
		Button_Setup02.labels = labels19;

		Button_Setup02.labelClr = intArray0;
		Button_Setup02.label3DClr = intArray1;
		Button_Setup02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Button_Setup02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Button_Setup02.panelChange0 = 3;
		Button_Setup02.alwaysDrawBackground = false;

		Button_Setup02.init();
		Tasto01 = new Switch_0015(4, 69, 79, 101, panelContext, this);
		Tasto01.foreClr = 0x00777777;
		Tasto01.backClr = 0x00000000;
		Tasto01.pattern = 1;

		CgpFont	fonts36[];
		String	labels36[];
		fonts36 = new CgpFont[1];
		labels36 = new String[1];

		labels36[0] = "Avvio Ciclo";
		fonts36[0] = F2_0;

		Tasto01.buzzer = true;

		Tasto01.switchFonts = fonts36;
		Tasto01.labels = labels36;

		Tasto01.labelClr = intArray0;
		int intArray2[] = {0x00000000, };
		Tasto01.label3DClr = intArray2;
		Tasto01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto01.bit0 = TagDB.PLC_ApparecchiaturaModbus01$TastoStartCiclo;
		Tasto01.alwaysDrawBackground = false;

		Tasto01.init();
		Tasto02 = new Switch_0015(81, 69, 156, 101, panelContext, this);
		Tasto02.foreClr = 0x00777777;
		Tasto02.backClr = 0x00000000;
		Tasto02.pattern = 1;

		CgpFont	fonts37[];
		String	labels37[];
		fonts37 = new CgpFont[1];
		labels37 = new String[1];

		labels37[0] = "Stop Ciclo";
		fonts37[0] = F2_0;

		Tasto02.buzzer = true;

		Tasto02.switchFonts = fonts37;
		Tasto02.labels = labels37;

		Tasto02.labelClr = intArray0;
		Tasto02.label3DClr = intArray2;
		Tasto02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto02.bit0 = TagDB.PLC_ApparecchiaturaModbus01$TastoStopCiclo;
		Tasto02.alwaysDrawBackground = false;

		Tasto02.init();

		VisualizzatoreMessaggi03 = new TextList_0016(160, 71, 318, 98, panelContext, this);
		VisualizzatoreMessaggi03.nNumStates = 3;
		VisualizzatoreMessaggi03.variableTag = TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo;
		VisualizzatoreMessaggi03.colorRes = _ColorResource0;
		VisualizzatoreMessaggi03.textRes = _TextResource0;
		VisualizzatoreMessaggi03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		VisualizzatoreMessaggi03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		VisualizzatoreMessaggi03.indexRes = _IndexIntResource0;
		VisualizzatoreMessaggi03.alwaysDrawBackground = false;

		VisualizzatoreMessaggi03.init();
		Button_Setup03 = new Switch_0001(5, 200, 64, 239, panelContext, this);
		Button_Setup03.foreClr = 0x00444444;
		Button_Setup03.backClr = 0x00000000;
		Button_Setup03.pattern = 1;

		CgpFont	fonts40[];
		String	labels40[];
		fonts40 = new CgpFont[1];
		labels40 = new String[1];

		labels40[0] = "Monitor";
		fonts40[0] = F2_0;

		Button_Setup03.buzzer = true;

		Button_Setup03.switchFonts = fonts40;
		Button_Setup03.labels = labels40;

		Button_Setup03.labelClr = intArray0;
		Button_Setup03.label3DClr = intArray1;
		Button_Setup03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Button_Setup03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Button_Setup03.panelChange0 = 11;
		Button_Setup03.alwaysDrawBackground = false;

		Button_Setup03.init();
		Tasto03 = new Switch_0015(0, 120, 159, 159, panelContext, this);
		Tasto03.foreClr = 0x00777777;
		Tasto03.backClr = 0x00000000;
		Tasto03.pattern = 1;

		CgpFont	fonts41[];
		String	labels41[];
		fonts41 = new CgpFont[1];
		labels41 = new String[1];

		labels41[0] = "Reset Allarmi";
		fonts41[0] = F2_0;

		Tasto03.buzzer = true;

		Tasto03.switchFonts = fonts41;
		Tasto03.labels = labels41;

		Tasto03.labelClr = intArray0;
		Tasto03.label3DClr = intArray2;
		Tasto03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Tasto03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Tasto03.bit0 = TagDB.PLC_ApparecchiaturaModbus01$ResetAllarmi;
		Tasto03.alwaysDrawBackground = false;

		Tasto03.init();
		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(BannerAllarme01, contextObject);
		TagDB._Day.addEventListener(VisualizzatoreData01, 0, panelContext);
		TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo.addEventListener(VisualizzatoreMessaggi03, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[10];
		zOrderList[0] = Button_Setup;
		zOrderList[1] = VisualizzatoreData01;
		zOrderList[2] = Button_Setup01;
		zOrderList[3] = BannerAllarme01;
		zOrderList[4] = Button_Setup02;
		zOrderList[5] = Tasto01;
		zOrderList[6] = Tasto02;
		zOrderList[7] = VisualizzatoreMessaggi03;
		zOrderList[8] = Button_Setup03;
		zOrderList[9] = Tasto03;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Tasto03,
			Button_Setup03,
			Tasto02,
			Tasto01,
			Button_Setup02,
			BannerAllarme01,
			Button_Setup01,
			Button_Setup,
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
		tagListVector.add(TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		BannerAllarme01.clean();

		Tasto03.shutdown();

		Button_Setup03.shutdown();

		VisualizzatoreMessaggi03.shutdown();

		Tasto02.shutdown();

		Tasto01.shutdown();

		Button_Setup02.shutdown();

		Button_Setup01.shutdown();

		VisualizzatoreData01.shutdown();

		Button_Setup.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		VisualizzatoreData01.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
