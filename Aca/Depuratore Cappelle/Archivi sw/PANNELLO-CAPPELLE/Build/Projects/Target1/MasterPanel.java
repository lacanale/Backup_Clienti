package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class MasterPanel extends CgpPanel
{
	public static CgpAlarmBanner AlarmBanner;
	CgpFont FontList[] = new CgpFont[1];

	public String getPanelName()
	{
		return "MasterPanel";
	}

	public int getPanelID()
	{
		return 99999;
	}

	public void onOpen ()
	{
		super.onOpen();
		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		Integer contextObject = new Integer(iPersistentContext);

		FontList[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		AlarmBanner = new CgpAlarmBanner(
			0,		//leftt
			227,		//top
			319,		//right
			239,		//bottom
			0xffffff,		//text color
			0xff,		//back color
			0xff0000,		//text 3D color
			1,		//rollRate, 0: slow, 1:medium, 2:fast
			2,		//position, 0: Top, 1: Middle, 2: Bottom
			CgpAlarmBanner.STOP_WHEN_RTN,
			FontList,
			TagDB.GruppoAllarme1,
			panelContext);

		AlarmBanner.setMovable(false);

		//Add this line to make that string can be changed by changing user application language.
		TagDB._UserApplicationLanguage.addEventListener(AlarmBanner, contextObject);
		TagDB._ShowSystemMessage.addEventListener(new CgpUserAnimation(AlarmBanner), 0, iPersistentContext);
		if(!CgpSystem.isPlatform(CgpSystem.HMI))
		{
			CgpSystem.globalPanel.addMPTouchRegisterInPeV();
		}
		CgpGraphics zOrderList[] = new CgpGraphics[1];
		zOrderList[0] = AlarmBanner;
		theZstack = zOrderList;
	}

	public void addMPTouchRegisterInPeV()
	{
		IgpTouch touchList[] =
		{
			AlarmBanner,
		};
		if(AlarmBanner != null)
			gpclasses.system.CgpSystem.UIM.addTouchRegistration(touchList, panelContext, true);
	}

	public synchronized void draw(int gp, CgpArea area)
	{
		if(AlarmBanner != null)
			AlarmBanner.draw(gp);
	}

	public void onClose()
	{
		super.onClose();
		AlarmBanner.shutdown();
		AlarmBanner = null;
		FontList = null;
	}

}
