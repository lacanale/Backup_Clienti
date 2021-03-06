package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.macroobjects.*;
import gpclasses.graphics.*;
import gpclasses.animations.*;
import gpclasses.plugins.script.*;
import gpclasses.util.io.*;
import gpclasses.tags.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.userScripts.*;
import gpclasses.plugins.remoteTargetAlarms.*;



public class Startup extends CgpStartup
{
	public static CgpScript DateTime;
	public static Object DateTimeTimerContext;

	// Dialog table member declaration

	public static void main (String args[])
	{
		startupObject = new Startup();
		CgpStartup.main(args);
	}

	public String[] getPublishedPanels()
	{
		return null;
	}

	public int getDisplayWidth()
	{
		return 320;
	}

	public int getDisplayHeight()
	{
		return 240;
	}

	public CgpWindow[] getPopupWindows()
	{
		CgpWindow[] windowList =
		{
			// empty
		};
		return windowList;
	}

	protected void preInitProject()
	{
		TagDB.StaticInit();
		new Projects.Target1.TagDB();
		CgpSystem.projectName = "Projects/Target1";
	}

	protected void postInitProject()
	{
		CgpSmartKeypad.setKeypadProperty( true,
						0x00ffffff,
						0x00ffffff,
						0x009f5f1f,
						0x005f3f1f,
						0x00744e14,
						CgpSmartKeypad.LAYOUT_3PAGE
						);

		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		gpclasses.system.CgpSystem.TM.setMinPeriodicInterval(100);
		Projects.Target1.TagDB._ExternalCmdTag.addEventListener(CgpScript.loadScript("Projects/Target1/ExternalCmdScript"), 0, iPersistentContext);
		Projects.Target1.TagDB._CurPanelID.addEventListener(CgpScript.loadScript("gpclasses/system/CgpChangePanelScript"), 0, iPersistentContext);
		DateTime = new CgpDateTimeUpdateScript();
		DateTimeTimerContext = gpclasses.system.CgpSystem.TM.createContext(CgpThread.MAX_PRIORITY-1);
		gpclasses.system.CgpSystem.TM.addTimerScript(DateTime, 1000, DateTimeTimerContext);
		gpclasses.system.CgpSystem.baseWindow.setPanelHistory(32);
		gpclasses.system.CgpSystem.TEM.setAnyHDATags(false);

		CgpSystem.globalPanel = new MasterPanel();

		CgpTag tagListIgnoredByProWeb[] =
		{
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[0],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[1],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[2],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[3],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[4],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[5],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[6],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[7],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[8],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[9],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[10],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[11],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[12],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[13],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[14],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[15],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[16],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[17],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[18],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[19],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[20],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[21],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[22],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[23],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[24],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[25],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[26],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[27],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[28],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[29],
			TagDB.PLC_ApparecchiaturaModbus01$Allarme[30],
		};
		CgpSystem.TEM.registerTagList(iPersistentContext, null, tagListIgnoredByProWeb);

		char seps[] = {' '};
		CgpLanguageMgr.languageMgr.setSeperators(seps);


		CgpTag _RecipeControlDefaultVars[] = {
			TagDB._RecipeControlDefault.RecipeGroupNumber,
			TagDB._RecipeControlDefault.RecipeNumber,
			TagDB._RecipeControlDefault.Operation,
			TagDB._RecipeControlDefault.OperationsLock,
			TagDB._RecipeControlDefault.Status,
			TagDB._RecipeControlDefault.Error,
			TagDB._RecipeControlDefault.AccessRight,
			TagDB._RecipeControlDefault.RecipeLabel,
		};
		TagDB._rc_RecipeControlDefault = new CgpRecipeControl(iPersistentContext, CgpRecipeControl.RESET_OPERATION_WHEN_FINISHED);
		TagDB._rc_RecipeControlDefault.setControlVars(_RecipeControlDefaultVars);


		if (CgpSystem.isPlatform(CgpSystem.HMI)) CgpHdaHistorian.setAutoFlushTime(0);

		// Dialog Table Functions

		gpclasses.system.CgpSystem.globalCursor = new CgpCursor("MouseArrow.bmp", "MouseHand.bmp", 20, 25, CgpColor.makeTransparentColor(0x00333333));

		gpclasses.system.CgpSystem.globalCursor.setTimeout(30);
	}

	protected void openScripts()
	{
	}

	protected void shutdownProject()
	{
		TagDB.GruppoAllarme1.clean();
	}

}
