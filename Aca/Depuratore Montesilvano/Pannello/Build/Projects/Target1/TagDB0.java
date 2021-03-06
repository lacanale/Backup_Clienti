package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB0
{
	public static Object classFactory1(int tagFieldIdentifier)
	{
		//switch (tagFieldIdentifier - TagDB.startNumber + 1)
		{
			//default: break;

			//case 1:
				TagDB._RecipeControlDefault = new _RecipeControlVars();
				TagDB._RecipeControlDefault.AccessRight = new CgpIntTag("_RecipeControlDefault.AccessRight", 1, TagDB.startNumber + 525, false, 0, false, -1);
				TagDB._RecipeControlDefault.AccessRight.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.Error = new CgpIntTag("_RecipeControlDefault.Error", 1, TagDB.startNumber + 526, false, 0, false, -1);
				TagDB._RecipeControlDefault.Error.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.RecipeNumber = new CgpIntTag("_RecipeControlDefault.RecipeNumber", 1, TagDB.startNumber + 527, false, 0, false, -1);
				TagDB._RecipeControlDefault.RecipeNumber.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.RecipeGroupNumber = new CgpIntTag("_RecipeControlDefault.RecipeGroupNumber", 1, TagDB.startNumber + 528, false, 0, false, -1);
				TagDB._RecipeControlDefault.RecipeGroupNumber.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.Operation = new CgpIntTag("_RecipeControlDefault.Operation", 1, TagDB.startNumber + 529, false, 0, false, -1);
				TagDB._RecipeControlDefault.Operation.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.OperationsLock = new CgpIntTag("_RecipeControlDefault.OperationsLock", 1, TagDB.startNumber + 530, false, 0, false, -1);
				TagDB._RecipeControlDefault.OperationsLock.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.Status = new CgpIntTag("_RecipeControlDefault.Status", 1, TagDB.startNumber + 531, false, 0, false, -1);
				TagDB._RecipeControlDefault.Status.setMinMaxValues(-2147483648, 2147483647, true);
				TagDB._RecipeControlDefault.RecipeLabel = new CgpStringTag("_RecipeControlDefault.RecipeLabel", TagDB.startNumber + 532, false, "", 32, false, -1);
				//return TagDB._RecipeControlDefault;
		};

		return TagDB0.classFactory2(tagFieldIdentifier);
	}

	public static Object classFactory2(int tagFieldIdentifier)
	{
		//switch (tagFieldIdentifier - TagDB.startNumber + 1)
		{
			//default: break;

			//case 2:
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1 = new _DDT106();
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.CH_ERROR = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$CorrenteMotore1.CH_ERROR", 1, TagDB.startNumber + 0, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE = new CgpIntTag("PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE", 1, TagDB.startNumber + 1, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1.VALUE.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore1;
			//case 3:
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2 = new _DDT107();
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.CH_ERROR = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$CorrenteMotore2.CH_ERROR", 1, TagDB.startNumber + 2, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE = new CgpIntTag("PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE", 1, TagDB.startNumber + 3, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2.VALUE.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$CorrenteMotore2;
			//case 4:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1 = new _DDT108();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.CU_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_1.CU_OLD", 1, TagDB.startNumber + 4, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.CU = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_1.CU", 1, TagDB.startNumber + 5, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.R = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_1.R", 1, TagDB.startNumber + 6, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.PV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_1.PV", 1, TagDB.startNumber + 7, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.PV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_1.Q", 1, TagDB.startNumber + 8, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.CV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_1.CV", 1, TagDB.startNumber + 9, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_1.CV.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_1;
			//case 5:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10 = new _DDT141();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.STRT_TM", 1, TagDB.startNumber + 10, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.IN_OLD", 1, TagDB.startNumber + 11, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.IN", 1, TagDB.startNumber + 12, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.PT", 1, TagDB.startNumber + 13, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.Q", 1, TagDB.startNumber + 14, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_1.ET", 1, TagDB.startNumber + 15, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.STRT_TM", 1, TagDB.startNumber + 16, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.IN_OLD", 1, TagDB.startNumber + 17, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.IN", 1, TagDB.startNumber + 18, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.PT", 1, TagDB.startNumber + 19, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.Q", 1, TagDB.startNumber + 20, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_2.ET", 1, TagDB.startNumber + 21, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3 = new _DDT110();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.STRT_TM", 1, TagDB.startNumber + 22, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.IN_OLD", 1, TagDB.startNumber + 23, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.IN", 1, TagDB.startNumber + 24, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.PT", 1, TagDB.startNumber + 25, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.Q", 1, TagDB.startNumber + 26, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_3.ET", 1, TagDB.startNumber + 27, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.STRT_TM", 1, TagDB.startNumber + 28, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.IN_OLD", 1, TagDB.startNumber + 29, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.IN", 1, TagDB.startNumber + 30, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.PT", 1, TagDB.startNumber + 31, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.Q", 1, TagDB.startNumber + 32, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_4.ET", 1, TagDB.startNumber + 33, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.STRT_TM", 1, TagDB.startNumber + 34, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.IN_OLD", 1, TagDB.startNumber + 35, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.IN", 1, TagDB.startNumber + 36, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.PT", 1, TagDB.startNumber + 37, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.Q", 1, TagDB.startNumber + 38, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_5.ET", 1, TagDB.startNumber + 39, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.STRT_TM", 1, TagDB.startNumber + 40, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.IN_OLD", 1, TagDB.startNumber + 41, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.IN", 1, TagDB.startNumber + 42, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.PT", 1, TagDB.startNumber + 43, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.Q", 1, TagDB.startNumber + 44, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.FBI_6.ET", 1, TagDB.startNumber + 45, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AttivaVeloBassa", 1, TagDB.startNumber + 46, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AttivaVeloAlta", 1, TagDB.startNumber + 47, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AllarmeTermico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AllarmeTermico", 1, TagDB.startNumber + 48, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AllarmeAttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AllarmeAttivaVeloBassa", 1, TagDB.startNumber + 49, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AllarmeAttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AllarmeAttivaVeloAlta", 1, TagDB.startNumber + 50, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.PreallarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.PreallarmeCorrente", 1, TagDB.startNumber + 51, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AllarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AllarmeCorrente", 1, TagDB.startNumber + 52, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.StartVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.StartVeloBassa", 1, TagDB.startNumber + 53, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.StartVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.StartVeloAlta", 1, TagDB.startNumber + 54, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.MotoreVeloBassaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.MotoreVeloBassaAttiva", 1, TagDB.startNumber + 55, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.MotoreVeloAltaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.MotoreVeloAltaAttiva", 1, TagDB.startNumber + 56, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloBassa", 1, TagDB.startNumber + 57, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloAlta", 1, TagDB.startNumber + 58, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitardoAvvioVeloAlta.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.Corrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.Corrente", 1, TagDB.startNumber + 59, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.Corrente.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimitePreallarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimitePreallarme", 1, TagDB.startNumber + 60, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimitePreallarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimiteAllarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimiteAllarmeBassa", 1, TagDB.startNumber + 61, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.CORRENTE_LimiteAllarmeBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.Termico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.Termico", 1, TagDB.startNumber + 62, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.Sentinel = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.Sentinel", 1, TagDB.startNumber + 63, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AttVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AttVeloBassa", 1, TagDB.startNumber + 64, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.AttVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.AttVeloAlta", 1, TagDB.startNumber + 65, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioBassa", 1, TagDB.startNumber + 66, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioAlta", 1, TagDB.startNumber + 67, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.SommatoriaAllarmi = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.SommatoriaAllarmi", 1, TagDB.startNumber + 68, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.Test = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.Test", 1, TagDB.startNumber + 69, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.log0 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.log0", 1, TagDB.startNumber + 70, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.TitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.TitAvvioXMille", 1, TagDB.startNumber + 71, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_10.RitAvvioXMille", 1, TagDB.startNumber + 72, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_10;
			//case 6:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2 = new _DDT112();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1 = new _DDT108();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CU_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CU_OLD", 1, TagDB.startNumber + 73, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CU = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CU", 1, TagDB.startNumber + 74, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.R = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.R", 1, TagDB.startNumber + 75, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.PV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.PV", 1, TagDB.startNumber + 76, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.PV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.Q", 1, TagDB.startNumber + 77, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CV", 1, TagDB.startNumber + 78, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.FBI_1.CV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ValoreAttualeORE = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.ValoreAttualeORE", 1, TagDB.startNumber + 79, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ValoreAttualeORE.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.AllarmeAttivo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.AllarmeAttivo", 1, TagDB.startNumber + 80, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ConteggioSec = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.ConteggioSec", 1, TagDB.startNumber + 81, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ConteggioSec.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.Enable = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.Enable", 1, TagDB.startNumber + 82, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.SogliaAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.SogliaAllarme", 1, TagDB.startNumber + 83, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.SogliaAllarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ResetContatore = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.ResetContatore", 1, TagDB.startNumber + 84, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.ContatoreOK = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_2.ContatoreOK", 1, TagDB.startNumber + 85, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.Conteggio = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_2.Conteggio", 1, TagDB.startNumber + 86, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_2.Conteggio.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_2;
			//case 7:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3 = new _DDT112();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1 = new _DDT108();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CU_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CU_OLD", 1, TagDB.startNumber + 87, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CU = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CU", 1, TagDB.startNumber + 88, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.R = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.R", 1, TagDB.startNumber + 89, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.PV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.PV", 1, TagDB.startNumber + 90, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.PV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.Q", 1, TagDB.startNumber + 91, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CV", 1, TagDB.startNumber + 92, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.FBI_1.CV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ValoreAttualeORE = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.ValoreAttualeORE", 1, TagDB.startNumber + 93, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ValoreAttualeORE.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.AllarmeAttivo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.AllarmeAttivo", 1, TagDB.startNumber + 94, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ConteggioSec = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.ConteggioSec", 1, TagDB.startNumber + 95, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ConteggioSec.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.Enable = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.Enable", 1, TagDB.startNumber + 96, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.SogliaAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.SogliaAllarme", 1, TagDB.startNumber + 97, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.SogliaAllarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ResetContatore = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.ResetContatore", 1, TagDB.startNumber + 98, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.ContatoreOK = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_3.ContatoreOK", 1, TagDB.startNumber + 99, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.Conteggio = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_3.Conteggio", 1, TagDB.startNumber + 100, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_3.Conteggio.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_3;
			//case 8:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4 = new _DDT115();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_OUTP_T1 = new CgpFloatTag[2];
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_OUTP_T1[0] = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.I_OUTP_T1[0]", 1, TagDB.startNumber + 101, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_OUTP_T1[1] = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.I_OUTP_T1[1]", 1, TagDB.startNumber + 102, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA = new _DDT114();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.id = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.id", 1, TagDB.startNumber + 103, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.id.setMinMaxValues(0, 65535, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.pv_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.pv_inf", 1, TagDB.startNumber + 104, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.pv_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.pv_sup", 1, TagDB.startNumber + 105, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.out_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.out_inf", 1, TagDB.startNumber + 106, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.out_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.out_sup", 1, TagDB.startNumber + 107, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.rev_dir = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.rev_dir", 1, TagDB.startNumber + 108, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.en_rcpy = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.en_rcpy", 1, TagDB.startNumber + 109, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.kp = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.kp", 1, TagDB.startNumber + 110, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.ti = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.ti", 1, TagDB.startNumber + 111, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.dband = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.dband", 1, TagDB.startNumber + 112, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PARA.outbias = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PARA.outbias", 1, TagDB.startNumber + 113, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_INIT_DONE = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.I_INIT_DONE", 1, TagDB.startNumber + 114, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_WARM_INIT_TODO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.I_WARM_INIT_TODO", 1, TagDB.startNumber + 115, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_TS = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_4.I_TS", 1, TagDB.startNumber + 116, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_PV_T1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.I_PV_T1", 1, TagDB.startNumber + 117, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_MAN_AUTO_T1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.I_MAN_AUTO_T1", 1, TagDB.startNumber + 118, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_TR_S_T1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.I_TR_S_T1", 1, TagDB.startNumber + 119, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_DEV_T1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.I_DEV_T1", 1, TagDB.startNumber + 120, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.I_TI_T1 = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_4.I_TI_T1", 1, TagDB.startNumber + 121, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.PV = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.PV", 1, TagDB.startNumber + 122, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.SP = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.SP", 1, TagDB.startNumber + 123, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.RCPY = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.RCPY", 1, TagDB.startNumber + 124, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.MAN_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.MAN_AUTO", 1, TagDB.startNumber + 125, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.TR_I = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.TR_I", 1, TagDB.startNumber + 126, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.TR_S = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.TR_S", 1, TagDB.startNumber + 127, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.OUT = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.OUT", 1, TagDB.startNumber + 128, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.OUTD = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.OUTD", 1, TagDB.startNumber + 129, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.MA_O = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_4.MA_O", 1, TagDB.startNumber + 130, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.DEV = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_4.DEV", 1, TagDB.startNumber + 131, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.STATUS = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_4.STATUS", 1, TagDB.startNumber + 132, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_4.STATUS.setMinMaxValues(0, 65535, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_4;
			//case 9:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5 = new _DDT112();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1 = new _DDT108();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CU_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CU_OLD", 1, TagDB.startNumber + 133, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CU = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CU", 1, TagDB.startNumber + 134, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.R = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.R", 1, TagDB.startNumber + 135, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.PV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.PV", 1, TagDB.startNumber + 136, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.PV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.Q", 1, TagDB.startNumber + 137, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CV", 1, TagDB.startNumber + 138, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.FBI_1.CV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ValoreAttualeORE = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.ValoreAttualeORE", 1, TagDB.startNumber + 139, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ValoreAttualeORE.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.AllarmeAttivo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.AllarmeAttivo", 1, TagDB.startNumber + 140, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ConteggioSec = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.ConteggioSec", 1, TagDB.startNumber + 141, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ConteggioSec.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.Enable = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.Enable", 1, TagDB.startNumber + 142, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.SogliaAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.SogliaAllarme", 1, TagDB.startNumber + 143, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.SogliaAllarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ResetContatore = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.ResetContatore", 1, TagDB.startNumber + 144, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.ContatoreOK = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_5.ContatoreOK", 1, TagDB.startNumber + 145, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.Conteggio = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_5.Conteggio", 1, TagDB.startNumber + 146, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_5.Conteggio.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_5;
			//case 10:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6 = new _DDT112();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1 = new _DDT108();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CU_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CU_OLD", 1, TagDB.startNumber + 147, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CU = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CU", 1, TagDB.startNumber + 148, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.R = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.R", 1, TagDB.startNumber + 149, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.PV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.PV", 1, TagDB.startNumber + 150, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.PV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.Q", 1, TagDB.startNumber + 151, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CV = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CV", 1, TagDB.startNumber + 152, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.FBI_1.CV.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ValoreAttualeORE = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.ValoreAttualeORE", 1, TagDB.startNumber + 153, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ValoreAttualeORE.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.AllarmeAttivo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.AllarmeAttivo", 1, TagDB.startNumber + 154, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ConteggioSec = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.ConteggioSec", 1, TagDB.startNumber + 155, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ConteggioSec.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.Enable = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.Enable", 1, TagDB.startNumber + 156, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.SogliaAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.SogliaAllarme", 1, TagDB.startNumber + 157, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.SogliaAllarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ResetContatore = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.ResetContatore", 1, TagDB.startNumber + 158, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.ContatoreOK = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_6.ContatoreOK", 1, TagDB.startNumber + 159, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.Conteggio = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_6.Conteggio", 1, TagDB.startNumber + 160, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_6.Conteggio.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_6;
			//case 11:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7 = new _DDT115();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_OUTP_T1 = new CgpFloatTag[2];
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_OUTP_T1[0] = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.I_OUTP_T1[0]", 1, TagDB.startNumber + 161, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_OUTP_T1[1] = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.I_OUTP_T1[1]", 1, TagDB.startNumber + 162, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA = new _DDT114();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.id = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.id", 1, TagDB.startNumber + 163, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.id.setMinMaxValues(0, 65535, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.pv_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.pv_inf", 1, TagDB.startNumber + 164, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.pv_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.pv_sup", 1, TagDB.startNumber + 165, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.out_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.out_inf", 1, TagDB.startNumber + 166, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.out_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.out_sup", 1, TagDB.startNumber + 167, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.rev_dir = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.rev_dir", 1, TagDB.startNumber + 168, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.en_rcpy = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.en_rcpy", 1, TagDB.startNumber + 169, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.kp = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.kp", 1, TagDB.startNumber + 170, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.ti = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.ti", 1, TagDB.startNumber + 171, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.dband = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.dband", 1, TagDB.startNumber + 172, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PARA.outbias = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PARA.outbias", 1, TagDB.startNumber + 173, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_INIT_DONE = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.I_INIT_DONE", 1, TagDB.startNumber + 174, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_WARM_INIT_TODO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.I_WARM_INIT_TODO", 1, TagDB.startNumber + 175, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_TS = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_7.I_TS", 1, TagDB.startNumber + 176, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_PV_T1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.I_PV_T1", 1, TagDB.startNumber + 177, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_MAN_AUTO_T1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.I_MAN_AUTO_T1", 1, TagDB.startNumber + 178, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_TR_S_T1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.I_TR_S_T1", 1, TagDB.startNumber + 179, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_DEV_T1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.I_DEV_T1", 1, TagDB.startNumber + 180, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.I_TI_T1 = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_7.I_TI_T1", 1, TagDB.startNumber + 181, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.PV = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.PV", 1, TagDB.startNumber + 182, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.SP = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.SP", 1, TagDB.startNumber + 183, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.RCPY = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.RCPY", 1, TagDB.startNumber + 184, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.MAN_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.MAN_AUTO", 1, TagDB.startNumber + 185, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.TR_I = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.TR_I", 1, TagDB.startNumber + 186, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.TR_S = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.TR_S", 1, TagDB.startNumber + 187, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.OUT = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.OUT", 1, TagDB.startNumber + 188, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.OUTD = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.OUTD", 1, TagDB.startNumber + 189, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.MA_O = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_7.MA_O", 1, TagDB.startNumber + 190, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.DEV = new CgpFloatTag("PLC_ApparecchiaturaModbus01$FBI_7.DEV", 1, TagDB.startNumber + 191, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.STATUS = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_7.STATUS", 1, TagDB.startNumber + 192, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_7.STATUS.setMinMaxValues(0, 65535, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_7;
			//case 12:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8 = new _DDT141();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.STRT_TM", 1, TagDB.startNumber + 193, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.IN_OLD", 1, TagDB.startNumber + 194, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.IN", 1, TagDB.startNumber + 195, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.PT", 1, TagDB.startNumber + 196, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.Q", 1, TagDB.startNumber + 197, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_1.ET", 1, TagDB.startNumber + 198, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.STRT_TM", 1, TagDB.startNumber + 199, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.IN_OLD", 1, TagDB.startNumber + 200, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.IN", 1, TagDB.startNumber + 201, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.PT", 1, TagDB.startNumber + 202, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.Q", 1, TagDB.startNumber + 203, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_2.ET", 1, TagDB.startNumber + 204, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3 = new _DDT110();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.STRT_TM", 1, TagDB.startNumber + 205, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.IN_OLD", 1, TagDB.startNumber + 206, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.IN", 1, TagDB.startNumber + 207, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.PT", 1, TagDB.startNumber + 208, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.Q", 1, TagDB.startNumber + 209, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_3.ET", 1, TagDB.startNumber + 210, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.STRT_TM", 1, TagDB.startNumber + 211, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.IN_OLD", 1, TagDB.startNumber + 212, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.IN", 1, TagDB.startNumber + 213, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.PT", 1, TagDB.startNumber + 214, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.Q", 1, TagDB.startNumber + 215, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_4.ET", 1, TagDB.startNumber + 216, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.STRT_TM", 1, TagDB.startNumber + 217, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.IN_OLD", 1, TagDB.startNumber + 218, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.IN", 1, TagDB.startNumber + 219, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.PT", 1, TagDB.startNumber + 220, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.Q", 1, TagDB.startNumber + 221, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_5.ET", 1, TagDB.startNumber + 222, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.STRT_TM", 1, TagDB.startNumber + 223, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.IN_OLD", 1, TagDB.startNumber + 224, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.IN", 1, TagDB.startNumber + 225, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.PT", 1, TagDB.startNumber + 226, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.Q", 1, TagDB.startNumber + 227, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.FBI_6.ET", 1, TagDB.startNumber + 228, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AttivaVeloBassa", 1, TagDB.startNumber + 229, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AttivaVeloAlta", 1, TagDB.startNumber + 230, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AllarmeTermico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AllarmeTermico", 1, TagDB.startNumber + 231, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AllarmeAttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AllarmeAttivaVeloBassa", 1, TagDB.startNumber + 232, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AllarmeAttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AllarmeAttivaVeloAlta", 1, TagDB.startNumber + 233, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.PreallarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.PreallarmeCorrente", 1, TagDB.startNumber + 234, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AllarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AllarmeCorrente", 1, TagDB.startNumber + 235, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.StartVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.StartVeloBassa", 1, TagDB.startNumber + 236, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.StartVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.StartVeloAlta", 1, TagDB.startNumber + 237, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.MotoreVeloBassaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.MotoreVeloBassaAttiva", 1, TagDB.startNumber + 238, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.MotoreVeloAltaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.MotoreVeloAltaAttiva", 1, TagDB.startNumber + 239, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloBassa", 1, TagDB.startNumber + 240, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloAlta", 1, TagDB.startNumber + 241, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitardoAvvioVeloAlta.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.Corrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.Corrente", 1, TagDB.startNumber + 242, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.Corrente.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimitePreallarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimitePreallarme", 1, TagDB.startNumber + 243, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimitePreallarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimiteAllarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimiteAllarmeBassa", 1, TagDB.startNumber + 244, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.CORRENTE_LimiteAllarmeBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.Termico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.Termico", 1, TagDB.startNumber + 245, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.Sentinel = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.Sentinel", 1, TagDB.startNumber + 246, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AttVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AttVeloBassa", 1, TagDB.startNumber + 247, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.AttVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.AttVeloAlta", 1, TagDB.startNumber + 248, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioBassa", 1, TagDB.startNumber + 249, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioAlta", 1, TagDB.startNumber + 250, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.SommatoriaAllarmi = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.SommatoriaAllarmi", 1, TagDB.startNumber + 251, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.Test = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.Test", 1, TagDB.startNumber + 252, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.log0 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.log0", 1, TagDB.startNumber + 253, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.TitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.TitAvvioXMille", 1, TagDB.startNumber + 254, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_8.RitAvvioXMille", 1, TagDB.startNumber + 255, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_8;
			//case 13:
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9 = new _DDT141();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.STRT_TM", 1, TagDB.startNumber + 256, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.IN_OLD", 1, TagDB.startNumber + 257, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.IN", 1, TagDB.startNumber + 258, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.PT", 1, TagDB.startNumber + 259, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.Q", 1, TagDB.startNumber + 260, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_1.ET", 1, TagDB.startNumber + 261, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.STRT_TM", 1, TagDB.startNumber + 262, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.IN_OLD", 1, TagDB.startNumber + 263, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.IN", 1, TagDB.startNumber + 264, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.PT", 1, TagDB.startNumber + 265, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.Q", 1, TagDB.startNumber + 266, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_2.ET", 1, TagDB.startNumber + 267, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3 = new _DDT110();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.STRT_TM", 1, TagDB.startNumber + 268, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.IN_OLD", 1, TagDB.startNumber + 269, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.IN", 1, TagDB.startNumber + 270, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.PT", 1, TagDB.startNumber + 271, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.Q", 1, TagDB.startNumber + 272, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_3.ET", 1, TagDB.startNumber + 273, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.STRT_TM", 1, TagDB.startNumber + 274, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.IN_OLD", 1, TagDB.startNumber + 275, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.IN", 1, TagDB.startNumber + 276, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.PT", 1, TagDB.startNumber + 277, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.Q", 1, TagDB.startNumber + 278, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_4.ET", 1, TagDB.startNumber + 279, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.STRT_TM", 1, TagDB.startNumber + 280, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.IN_OLD", 1, TagDB.startNumber + 281, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.IN", 1, TagDB.startNumber + 282, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.PT", 1, TagDB.startNumber + 283, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.Q", 1, TagDB.startNumber + 284, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_5.ET", 1, TagDB.startNumber + 285, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6 = new _DDT109();
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.STRT_TM = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.STRT_TM", 1, TagDB.startNumber + 286, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.IN_OLD = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.IN_OLD", 1, TagDB.startNumber + 287, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.IN = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.IN", 1, TagDB.startNumber + 288, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.PT = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.PT", 1, TagDB.startNumber + 289, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.Q = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.Q", 1, TagDB.startNumber + 290, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.ET = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.FBI_6.ET", 1, TagDB.startNumber + 291, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AttivaVeloBassa", 1, TagDB.startNumber + 292, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AttivaVeloAlta", 1, TagDB.startNumber + 293, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AllarmeTermico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AllarmeTermico", 1, TagDB.startNumber + 294, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AllarmeAttivaVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AllarmeAttivaVeloBassa", 1, TagDB.startNumber + 295, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AllarmeAttivaVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AllarmeAttivaVeloAlta", 1, TagDB.startNumber + 296, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.PreallarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.PreallarmeCorrente", 1, TagDB.startNumber + 297, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AllarmeCorrente = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AllarmeCorrente", 1, TagDB.startNumber + 298, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.StartVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.StartVeloBassa", 1, TagDB.startNumber + 299, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.StartVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.StartVeloAlta", 1, TagDB.startNumber + 300, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.MotoreVeloBassaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.MotoreVeloBassaAttiva", 1, TagDB.startNumber + 301, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.MotoreVeloAltaAttiva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.MotoreVeloAltaAttiva", 1, TagDB.startNumber + 302, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloBassa", 1, TagDB.startNumber + 303, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloAlta", 1, TagDB.startNumber + 304, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitardoAvvioVeloAlta.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.Corrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.Corrente", 1, TagDB.startNumber + 305, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.Corrente.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimitePreallarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimitePreallarme", 1, TagDB.startNumber + 306, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimitePreallarme.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimiteAllarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimiteAllarmeBassa", 1, TagDB.startNumber + 307, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.CORRENTE_LimiteAllarmeBassa.setMinMaxValues(-32768, 32767, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.Termico = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.Termico", 1, TagDB.startNumber + 308, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.Sentinel = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.Sentinel", 1, TagDB.startNumber + 309, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AttVeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AttVeloBassa", 1, TagDB.startNumber + 310, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.AttVeloAlta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.AttVeloAlta", 1, TagDB.startNumber + 311, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioBassa", 1, TagDB.startNumber + 312, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioAlta", 1, TagDB.startNumber + 313, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.SommatoriaAllarmi = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.SommatoriaAllarmi", 1, TagDB.startNumber + 314, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.Test = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.Test", 1, TagDB.startNumber + 315, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.log0 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.log0", 1, TagDB.startNumber + 316, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.TitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.TitAvvioXMille", 1, TagDB.startNumber + 317, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioXMille = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FBI_9.RitAvvioXMille", 1, TagDB.startNumber + 318, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FBI_9;
			//case 14:
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno = new _DDT114();
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.id = new CgpIntTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.id", 1, TagDB.startNumber + 319, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.id.setMinMaxValues(0, 65535, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.pv_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.pv_inf", 1, TagDB.startNumber + 320, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.pv_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.pv_sup", 1, TagDB.startNumber + 321, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.out_inf = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.out_inf", 1, TagDB.startNumber + 322, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.out_sup = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.out_sup", 1, TagDB.startNumber + 323, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.rev_dir = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.rev_dir", 1, TagDB.startNumber + 324, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.en_rcpy = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.en_rcpy", 1, TagDB.startNumber + 325, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.kp = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.kp", 1, TagDB.startNumber + 326, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.ti = new CgpIntTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.ti", 1, TagDB.startNumber + 327, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.dband = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.dband", 1, TagDB.startNumber + 328, true, 0.0f, true);
				TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno.outbias = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParPIDOssigeno.outbias", 1, TagDB.startNumber + 329, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ParPIDOssigeno;
			//case 15:
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA = new _DDT116();
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA.CH_ERROR = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA.CH_ERROR", 1, TagDB.startNumber + 330, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA.VALUE = new CgpIntTag("PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA.VALUE", 1, TagDB.startNumber + 331, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA.VALUE.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA;
			//case 16:
				TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_TIME = new CgpIntTag("PLC_ApparecchiaturaModbus01$Ki_Ossigeno_TIME", 1, TagDB.startNumber + 332, true, 0, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_TIME;
			//case 17:
				TagDB.PLC_ApparecchiaturaModbus01$CmdInizPIDOssigeno = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$CmdInizPIDOssigeno", 1, TagDB.startNumber + 333, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$CmdInizPIDOssigeno;
			//case 18:
				TagDB.PLC_ApparecchiaturaModbus01$Bobina1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Bobina1", 1, TagDB.startNumber + 334, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Bobina1;
			//case 19:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeM1", 1, TagDB.startNumber + 335, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM1;
			//case 20:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeM1", 1, TagDB.startNumber + 336, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1;
			//case 21:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeM2", 1, TagDB.startNumber + 337, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeM2;
			//case 22:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeM2", 1, TagDB.startNumber + 338, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM2;
			//case 23:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeTermicoM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeTermicoM1", 1, TagDB.startNumber + 339, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeTermicoM1;
			//case 24:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeTermicoM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeTermicoM2", 1, TagDB.startNumber + 340, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeTermicoM2;
			//case 25:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM2", 1, TagDB.startNumber + 341, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM2;
			//case 26:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM2", 1, TagDB.startNumber + 342, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM2;
			//case 27:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM1", 1, TagDB.startNumber + 343, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM1;
			//case 28:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM1", 1, TagDB.startNumber + 344, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM1;
			//case 29:
				TagDB.PLC_ApparecchiaturaModbus01$Pulsante1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Pulsante1", 1, TagDB.startNumber + 345, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Pulsante1;
			//case 30:
				TagDB.PLC_ApparecchiaturaModbus01$Occhio = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Occhio", 1, TagDB.startNumber + 346, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Occhio;
			//case 31:
				TagDB.PLC_ApparecchiaturaModbus01$Interferenza = new CgpFloatTag("PLC_ApparecchiaturaModbus01$Interferenza", 1, TagDB.startNumber + 347, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Interferenza;
		};

		return TagDB0.classFactory3(tagFieldIdentifier);
	}

	public static Object classFactory3(int tagFieldIdentifier)
	{
		//switch (tagFieldIdentifier - TagDB.startNumber + 1)
		{
			//default: break;

			//case 32:
				TagDB.PLC_ApparecchiaturaModbus01$M1Bassa_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$M1Bassa_AUTO", 1, TagDB.startNumber + 348, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1Bassa_AUTO;
			//case 33:
				TagDB.PLC_ApparecchiaturaModbus01$M2Bassa_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$M2Bassa_AUTO", 1, TagDB.startNumber + 349, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2Bassa_AUTO;
			//case 34:
				TagDB.PLC_ApparecchiaturaModbus01$UltimoM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$UltimoM1", 1, TagDB.startNumber + 350, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$UltimoM1;
			//case 35:
				TagDB.PLC_ApparecchiaturaModbus01$FPSoglia1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$FPSoglia1", 1, TagDB.startNumber + 351, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$FPSoglia1;
			//case 36:
				TagDB.PLC_ApparecchiaturaModbus01$M1Alta_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$M1Alta_AUTO", 1, TagDB.startNumber + 352, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1Alta_AUTO;
			//case 37:
				TagDB.PLC_ApparecchiaturaModbus01$M2Alta_AUTO = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$M2Alta_AUTO", 1, TagDB.startNumber + 353, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2Alta_AUTO;
			//case 38:
				TagDB.PLC_ApparecchiaturaModbus01$CountOK = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$CountOK", 1, TagDB.startNumber + 354, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$CountOK;
			//case 39:
				TagDB.PLC_ApparecchiaturaModbus01$ResetContatoreM1Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetContatoreM1Bassa", 1, TagDB.startNumber + 355, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetContatoreM1Bassa;
			//case 40:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1VeloBassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeM1VeloBassa", 1, TagDB.startNumber + 356, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1VeloBassa;
			//case 41:
				TagDB.PLC_ApparecchiaturaModbus01$Log0 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Log0", 1, TagDB.startNumber + 357, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Log0;
			//case 42:
				TagDB.PLC_ApparecchiaturaModbus01$RCPY = new CgpFloatTag("PLC_ApparecchiaturaModbus01$RCPY", 1, TagDB.startNumber + 358, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$RCPY;
			//case 43:
				TagDB.PLC_ApparecchiaturaModbus01$ParamPidOssigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$ParamPidOssigeno", 1, TagDB.startNumber + 359, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ParamPidOssigeno;
			//case 44:
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigenoProva = new CgpFloatTag("PLC_ApparecchiaturaModbus01$SondaOssigenoProva", 1, TagDB.startNumber + 360, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SondaOssigenoProva;
			//case 45:
				TagDB.PLC_ApparecchiaturaModbus01$InizializzaPIDOssigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$InizializzaPIDOssigeno", 1, TagDB.startNumber + 361, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$InizializzaPIDOssigeno;
			//case 46:
				TagDB.PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno", 1, TagDB.startNumber + 362, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno;
			//case 47:
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$SecVeloM1Bassa", 1, TagDB.startNumber + 363, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Bassa;
			//case 48:
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$MinVeloM1Bassa", 1, TagDB.startNumber + 364, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Bassa;
			//case 49:
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$OreVeloM1Bassa", 1, TagDB.startNumber + 365, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Bassa;
			//case 50:
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$SondaOssigeno", 1, TagDB.startNumber + 366, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SondaOssigeno;
			//case 51:
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$SecVeloM2Bassa", 1, TagDB.startNumber + 367, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Bassa;
			//case 52:
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$SecVeloM1Alta", 1, TagDB.startNumber + 368, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SecVeloM1Alta;
			//case 53:
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$SecVeloM2Alta", 1, TagDB.startNumber + 369, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SecVeloM2Alta;
			//case 54:
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$MinVeloM2Bassa", 1, TagDB.startNumber + 370, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Bassa;
			//case 55:
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$MinVeloM1Alta", 1, TagDB.startNumber + 371, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$MinVeloM1Alta;
			//case 56:
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$MinVeloM2Alta", 1, TagDB.startNumber + 372, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$MinVeloM2Alta;
			//case 57:
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$OreVeloM2Bassa", 1, TagDB.startNumber + 373, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Bassa;
			//case 58:
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$OreVeloM1Alta", 1, TagDB.startNumber + 374, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$OreVeloM1Alta;
			//case 59:
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta = new CgpIntTag("PLC_ApparecchiaturaModbus01$OreVeloM2Alta", 1, TagDB.startNumber + 375, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$OreVeloM2Alta;
			//case 60:
				TagDB.PLC_ApparecchiaturaModbus01$StatoM1 = new CgpIntTag("PLC_ApparecchiaturaModbus01$StatoM1", 1, TagDB.startNumber + 376, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$StatoM1.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$StatoM1;
			//case 61:
				TagDB.PLC_ApparecchiaturaModbus01$StatoM2 = new CgpIntTag("PLC_ApparecchiaturaModbus01$StatoM2", 1, TagDB.startNumber + 377, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$StatoM2.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$StatoM2;
			//case 62:
				TagDB.PLC_ApparecchiaturaModbus01$SetPointOssigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$SetPointOssigeno", 1, TagDB.startNumber + 378, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SetPointOssigeno;
			//case 63:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteAllarme", 1, TagDB.startNumber + 379, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarme.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarme;
			//case 64:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimitePreallarme", 1, TagDB.startNumber + 380, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarme.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarme;
			//case 65:
				TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta", 1, TagDB.startNumber + 381, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta;
			//case 66:
				TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa", 1, TagDB.startNumber + 382, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa;
			//case 67:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteAllarme", 1, TagDB.startNumber + 383, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarme.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarme;
			//case 68:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarme = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimitePreallarme", 1, TagDB.startNumber + 384, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarme.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarme;
			//case 69:
				TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta", 1, TagDB.startNumber + 385, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta;
			//case 70:
				TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa", 1, TagDB.startNumber + 386, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa;
			//case 71:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaAllarme = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaAllarme", 1, TagDB.startNumber + 387, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaAllarme;
			//case 72:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaMax1", 1, TagDB.startNumber + 388, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax1;
			//case 73:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax2 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaMax2", 1, TagDB.startNumber + 389, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMax2;
			//case 74:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaMin1", 1, TagDB.startNumber + 390, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin1;
			//case 75:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin2 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaMin2", 1, TagDB.startNumber + 391, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaMin2;
			//case 76:
				TagDB.PLC_ApparecchiaturaModbus01$VentolaBox1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$VentolaBox1", 1, TagDB.startNumber + 392, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$VentolaBox1;
			//case 77:
				TagDB.PLC_ApparecchiaturaModbus01$VentolaBox2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$VentolaBox2", 1, TagDB.startNumber + 393, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$VentolaBox2;
			//case 78:
				TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$VentolaCompressore1", 1, TagDB.startNumber + 394, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore1;
			//case 79:
				TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$VentolaCompressore2", 1, TagDB.startNumber + 395, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$VentolaCompressore2;
			//case 80:
				TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT = new CgpIntTag("PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT", 1, TagDB.startNumber + 396, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT;
			//case 81:
				TagDB.PLC_ApparecchiaturaModbus01$Kp_Ossigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$Kp_Ossigeno", 1, TagDB.startNumber + 397, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Kp_Ossigeno;
			//case 82:
				TagDB.PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno = new CgpFloatTag("PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno", 1, TagDB.startNumber + 398, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno;
			//case 83:
				TagDB.PLC_ApparecchiaturaModbus01$PulsanteSalva = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PulsanteSalva", 1, TagDB.startNumber + 399, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PulsanteSalva;
			//case 84:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeCorrenteM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeCorrenteM1", 1, TagDB.startNumber + 400, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeCorrenteM1;
			//case 85:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeCorrenteM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeCorrenteM2", 1, TagDB.startNumber + 401, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeCorrenteM2;
			//case 86:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeM1Bassa", 1, TagDB.startNumber + 402, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeM1Bassa;
			//case 87:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeM2Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeM2Bassa", 1, TagDB.startNumber + 403, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeM2Bassa;
			//case 88:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa", 1, TagDB.startNumber + 404, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa;
			//case 89:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa", 1, TagDB.startNumber + 405, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa;
			//case 90:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa", 1, TagDB.startNumber + 406, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa;
			//case 91:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta", 1, TagDB.startNumber + 407, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta;
			//case 92:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa", 1, TagDB.startNumber + 408, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa;
			//case 93:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM1", 1, TagDB.startNumber + 409, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM1;
			//case 94:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM2", 1, TagDB.startNumber + 410, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM2;
			//case 95:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM1Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeM1Bassa", 1, TagDB.startNumber + 411, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM1Bassa;
			//case 96:
				TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM2Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$PreallarmeM2Bassa", 1, TagDB.startNumber + 412, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PreallarmeM2Bassa;
			//case 97:
				TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Alta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetOreM1Alta", 1, TagDB.startNumber + 413, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Alta;
			//case 98:
				TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetOreM1Bassa", 1, TagDB.startNumber + 414, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetOreM1Bassa;
			//case 99:
				TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Alta = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetOreM2Alta", 1, TagDB.startNumber + 415, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Alta;
			//case 100:
				TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Bassa = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetOreM2Bassa", 1, TagDB.startNumber + 416, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetOreM2Bassa;
			//case 101:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta", 1, TagDB.startNumber + 417, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta;
			//case 102:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta", 1, TagDB.startNumber + 418, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta;
			//case 103:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta", 1, TagDB.startNumber + 419, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta;
		};

		return TagDB0.classFactory4(tagFieldIdentifier);
	}

	public static Object classFactory4(int tagFieldIdentifier)
	{
		//switch (tagFieldIdentifier - TagDB.startNumber + 1)
		{
			//default: break;

			//case 104:
				TagDB.PLC_ApparecchiaturaModbus01$Allarme = new CgpDiscreteTag[100];
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[0] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[0]", 1, TagDB.startNumber + 420, true, false, true);
				String[] _Msg52721432 =
				{
				"Impianto Spento", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[0].alarm = new CgpDiscreteAlarm(1, _Msg52721432, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[0].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[1] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[1]", 1, TagDB.startNumber + 421, true, false, true);
				String[] _Msg52752856 =
				{
				"Errore sonda ossigeno", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[1].alarm = new CgpDiscreteAlarm(1, _Msg52752856, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[1].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[2] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[2]", 1, TagDB.startNumber + 422, true, false, true);
				String[] _Msg52754232 =
				{
				"Soglia massima ossigeno superata", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[2].alarm = new CgpDiscreteAlarm(1, _Msg52754232, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[2].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[3] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[3]", 1, TagDB.startNumber + 423, true, false, true);
				String[] _Msg52755016 =
				{
				"Libero", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[3].alarm = new CgpDiscreteAlarm(1, _Msg52755016, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[3].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[4] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[4]", 1, TagDB.startNumber + 424, true, false, true);
				String[] _Msg52755512 =
				{
				"Libero", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[4].alarm = new CgpDiscreteAlarm(1, _Msg52755512, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[4].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[5] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[5]", 1, TagDB.startNumber + 425, true, false, true);
				String[] _Msg52721480 =
				{
				"Libero", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[5].alarm = new CgpDiscreteAlarm(1, _Msg52721480, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[5].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[6] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[6]", 1, TagDB.startNumber + 426, true, false, true);
				String[] _Msg52756008 =
				{
				"Protezione termica motore 1 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[6].alarm = new CgpDiscreteAlarm(1, _Msg52756008, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[6].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[7] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[7]", 1, TagDB.startNumber + 427, true, false, true);
				String[] _Msg52764448 =
				{
				"Protezione termica motore 2 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[7].alarm = new CgpDiscreteAlarm(1, _Msg52764448, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[7].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[8] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[8]", 1, TagDB.startNumber + 428, true, false, true);
				String[] _Msg52765072 =
				{
				"Errore comando velocit\u00e0 motore 1 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[8].alarm = new CgpDiscreteAlarm(1, _Msg52765072, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[8].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[9] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[9]", 1, TagDB.startNumber + 429, true, false, true);
				String[] _Msg52765568 =
				{
				"Errore comando velocit\u00e0 motore 1 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[9].alarm = new CgpDiscreteAlarm(1, _Msg52765568, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[9].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[10] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[10]", 1, TagDB.startNumber + 430, true, false, true);
				String[] _Msg52766208 =
				{
				"Errore comando velocit\u00e0 motore 2 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[10].alarm = new CgpDiscreteAlarm(1, _Msg52766208, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[10].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[11] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[11]", 1, TagDB.startNumber + 431, true, false, true);
				String[] _Msg52720040 =
				{
				"Errore comando velocit\u00e0 motore 2 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[11].alarm = new CgpDiscreteAlarm(1, _Msg52720040, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[11].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[12] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[12]", 1, TagDB.startNumber + 432, true, false, true);
				String[] _Msg52720088 =
				{
				"Protezione termica ventola motore 1 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[12].alarm = new CgpDiscreteAlarm(1, _Msg52720088, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[12].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[13] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[13]", 1, TagDB.startNumber + 433, true, false, true);
				String[] _Msg52719944 =
				{
				"Protezione termica ventola motore 2 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[13].alarm = new CgpDiscreteAlarm(1, _Msg52719944, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[13].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[14] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[14]", 1, TagDB.startNumber + 434, true, false, true);
				String[] _Msg52719992 =
				{
				"Protezione termica ventola BOX 1 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[14].alarm = new CgpDiscreteAlarm(1, _Msg52719992, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[14].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[15] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[15]", 1, TagDB.startNumber + 435, true, false, true);
				String[] _Msg52718344 =
				{
				"Protezione termica ventola BOX 2 intervenuta", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[15].alarm = new CgpDiscreteAlarm(1, _Msg52718344, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[15].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[16] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[16]", 1, TagDB.startNumber + 436, true, false, true);
				String[] _Msg52718392 =
				{
				"Errore sonda corrente motore 1", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[16].alarm = new CgpDiscreteAlarm(1, _Msg52718392, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[16].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[17] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[17]", 1, TagDB.startNumber + 437, true, false, true);
				String[] _Msg52718248 =
				{
				"Errore sonda corrente motore 2", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[17].alarm = new CgpDiscreteAlarm(1, _Msg52718248, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[17].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[18] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[18]", 1, TagDB.startNumber + 438, true, false, true);
				String[] _Msg52718296 =
				{
				"Preallarme superamento ore motore 1 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[18].alarm = new CgpDiscreteAlarm(1, _Msg52718296, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[18].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[19] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[19]", 1, TagDB.startNumber + 439, true, false, true);
				String[] _Msg52717816 =
				{
				"Preallarme superamento ore motore 2 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[19].alarm = new CgpDiscreteAlarm(1, _Msg52717816, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[19].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[20] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[20]", 1, TagDB.startNumber + 440, true, false, true);
				String[] _Msg52717864 =
				{
				"Preallarme superamento ore motore 1 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[20].alarm = new CgpDiscreteAlarm(1, _Msg52717864, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[20].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[21] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[21]", 1, TagDB.startNumber + 441, true, false, true);
				String[] _Msg52717720 =
				{
				"Preallarme superamento ore motore 2 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[21].alarm = new CgpDiscreteAlarm(1, _Msg52717720, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[21].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[22] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[22]", 1, TagDB.startNumber + 442, true, false, true);
				String[] _Msg52717768 =
				{
				"Allarme superamento ore motore 1 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[22].alarm = new CgpDiscreteAlarm(1, _Msg52717768, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[22].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[23] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[23]", 1, TagDB.startNumber + 443, true, false, true);
				String[] _Msg52717288 =
				{
				"Allarme superamento ore motore 2 (2 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[23].alarm = new CgpDiscreteAlarm(1, _Msg52717288, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[23].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[24] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[24]", 1, TagDB.startNumber + 444, true, false, true);
				String[] _Msg52717336 =
				{
				"Allarme superamento ore motore 1 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[24].alarm = new CgpDiscreteAlarm(1, _Msg52717336, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[24].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[25] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[25]", 1, TagDB.startNumber + 445, true, false, true);
				String[] _Msg52717192 =
				{
				"Allarme superamento ore motore 2 (4 poli)", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[25].alarm = new CgpDiscreteAlarm(1, _Msg52717192, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[25].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[26] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[26]", 1, TagDB.startNumber + 446, true, false, true);
				String[] _Msg52717240 =
				{
				"Limite Preallarme corrente Motore 1", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[26].alarm = new CgpDiscreteAlarm(1, _Msg52717240, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[26].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[27] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[27]", 1, TagDB.startNumber + 447, true, false, true);
				String[] _Msg52716760 =
				{
				"Limite allarme corrente Motore 1", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[27].alarm = new CgpDiscreteAlarm(1, _Msg52716760, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[27].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[28] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[28]", 1, TagDB.startNumber + 448, true, false, true);
				String[] _Msg52716808 =
				{
				"Limite Preallarme corrente Motore 2", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[28].alarm = new CgpDiscreteAlarm(1, _Msg52716808, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[28].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[29] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[29]", 1, TagDB.startNumber + 449, true, false, true);
				String[] _Msg52716664 =
				{
				"Limite Allarme corrente Motore 2", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[29].alarm = new CgpDiscreteAlarm(1, _Msg52716664, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[29].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[30] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[30]", 1, TagDB.startNumber + 450, true, false, true);
				String[] _Msg52716712 =
				{
				"Libero", 
				};
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[30].alarm = new CgpDiscreteAlarm(1, _Msg52716712, -1, TagDB.GruppoAllarme1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[30].addEventListener(TagDB.GruppoAllarme1, TagDB.persistentContextObject);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[31] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[31]", 1, TagDB.startNumber + 451, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[32] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[32]", 1, TagDB.startNumber + 452, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[33] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[33]", 1, TagDB.startNumber + 453, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[34] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[34]", 1, TagDB.startNumber + 454, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[35] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[35]", 1, TagDB.startNumber + 455, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[36] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[36]", 1, TagDB.startNumber + 456, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[37] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[37]", 1, TagDB.startNumber + 457, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[38] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[38]", 1, TagDB.startNumber + 458, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[39] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[39]", 1, TagDB.startNumber + 459, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[40] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[40]", 1, TagDB.startNumber + 460, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[41] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[41]", 1, TagDB.startNumber + 461, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[42] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[42]", 1, TagDB.startNumber + 462, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[43] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[43]", 1, TagDB.startNumber + 463, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[44] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[44]", 1, TagDB.startNumber + 464, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[45] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[45]", 1, TagDB.startNumber + 465, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[46] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[46]", 1, TagDB.startNumber + 466, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[47] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[47]", 1, TagDB.startNumber + 467, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[48] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[48]", 1, TagDB.startNumber + 468, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[49] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[49]", 1, TagDB.startNumber + 469, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[50] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[50]", 1, TagDB.startNumber + 470, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[51] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[51]", 1, TagDB.startNumber + 471, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[52] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[52]", 1, TagDB.startNumber + 472, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[53] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[53]", 1, TagDB.startNumber + 473, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[54] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[54]", 1, TagDB.startNumber + 474, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[55] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[55]", 1, TagDB.startNumber + 475, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[56] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[56]", 1, TagDB.startNumber + 476, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[57] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[57]", 1, TagDB.startNumber + 477, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[58] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[58]", 1, TagDB.startNumber + 478, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[59] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[59]", 1, TagDB.startNumber + 479, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[60] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[60]", 1, TagDB.startNumber + 480, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[61] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[61]", 1, TagDB.startNumber + 481, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[62] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[62]", 1, TagDB.startNumber + 482, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[63] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[63]", 1, TagDB.startNumber + 483, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[64] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[64]", 1, TagDB.startNumber + 484, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[65] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[65]", 1, TagDB.startNumber + 485, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[66] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[66]", 1, TagDB.startNumber + 486, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[67] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[67]", 1, TagDB.startNumber + 487, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[68] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[68]", 1, TagDB.startNumber + 488, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[69] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[69]", 1, TagDB.startNumber + 489, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[70] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[70]", 1, TagDB.startNumber + 490, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[71] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[71]", 1, TagDB.startNumber + 491, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[72] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[72]", 1, TagDB.startNumber + 492, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[73] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[73]", 1, TagDB.startNumber + 493, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[74] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[74]", 1, TagDB.startNumber + 494, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[75] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[75]", 1, TagDB.startNumber + 495, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[76] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[76]", 1, TagDB.startNumber + 496, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[77] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[77]", 1, TagDB.startNumber + 497, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[78] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[78]", 1, TagDB.startNumber + 498, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[79] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[79]", 1, TagDB.startNumber + 499, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[80] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[80]", 1, TagDB.startNumber + 500, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[81] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[81]", 1, TagDB.startNumber + 501, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[82] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[82]", 1, TagDB.startNumber + 502, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[83] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[83]", 1, TagDB.startNumber + 503, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[84] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[84]", 1, TagDB.startNumber + 504, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[85] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[85]", 1, TagDB.startNumber + 505, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[86] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[86]", 1, TagDB.startNumber + 506, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[87] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[87]", 1, TagDB.startNumber + 507, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[88] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[88]", 1, TagDB.startNumber + 508, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[89] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[89]", 1, TagDB.startNumber + 509, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[90] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[90]", 1, TagDB.startNumber + 510, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[91] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[91]", 1, TagDB.startNumber + 511, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[92] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[92]", 1, TagDB.startNumber + 512, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[93] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[93]", 1, TagDB.startNumber + 513, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[94] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[94]", 1, TagDB.startNumber + 514, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[95] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[95]", 1, TagDB.startNumber + 515, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[96] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[96]", 1, TagDB.startNumber + 516, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[97] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[97]", 1, TagDB.startNumber + 517, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[98] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[98]", 1, TagDB.startNumber + 518, true, false, true);
				TagDB.PLC_ApparecchiaturaModbus01$Allarme[99] = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Allarme[99]", 1, TagDB.startNumber + 519, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Allarme;
			//case 105:
				TagDB.PLC_ApparecchiaturaModbus01$ResetAllarmi = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$ResetAllarmi", 1, TagDB.startNumber + 520, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$ResetAllarmi;
			//case 106:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente", 1, TagDB.startNumber + 521, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente;
			//case 107:
				TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente", 1, TagDB.startNumber + 522, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente;
			//case 108:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente", 1, TagDB.startNumber + 523, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente;
			//case 109:
				TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente", 1, TagDB.startNumber + 524, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente;
			//case 110:
				TagDB.PLC_ApparecchiaturaModbus01$CicloInCorso = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$CicloInCorso", 1, TagDB.startNumber + 533, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$CicloInCorso;
			//case 111:
				TagDB.PLC_ApparecchiaturaModbus01$TastoStartCiclo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$TastoStartCiclo", 1, TagDB.startNumber + 534, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$TastoStartCiclo;
			//case 112:
				TagDB.PLC_ApparecchiaturaModbus01$TastoStopCiclo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$TastoStopCiclo", 1, TagDB.startNumber + 535, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$TastoStopCiclo;
			//case 113:
				TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo = new CgpIntTag("PLC_ApparecchiaturaModbus01$StatoCiclo", 1, TagDB.startNumber + 536, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$StatoCiclo;
			//case 114:
				TagDB.PLC_ApparecchiaturaModbus01$PercSogliaAllarme1 = new CgpFloatTag("PLC_ApparecchiaturaModbus01$PercSogliaAllarme1", 1, TagDB.startNumber + 537, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$PercSogliaAllarme1;
			//case 115:
				TagDB.PLC_ApparecchiaturaModbus01$SogliaAllarmeSuperata = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$SogliaAllarmeSuperata", 1, TagDB.startNumber + 538, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SogliaAllarmeSuperata;
			//case 116:
				TagDB.PLC_ApparecchiaturaModbus01$AllarmeStopCiclo = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$AllarmeStopCiclo", 1, TagDB.startNumber + 539, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$AllarmeStopCiclo;
			//case 117:
				TagDB.PLC_ApparecchiaturaModbus01$SondaOssigenoScalata = new CgpFloatTag("PLC_ApparecchiaturaModbus01$SondaOssigenoScalata", 1, TagDB.startNumber + 540, true, 0.0f, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$SondaOssigenoScalata;
			//case 118:
				TagDB.PLC_ApparecchiaturaModbus01$log1 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$log1", 1, TagDB.startNumber + 541, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$log1;
			//case 119:
				TagDB.PLC_ApparecchiaturaModbus01$log2 = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$log2", 1, TagDB.startNumber + 542, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$log2;
			//case 120:
				TagDB.PLC_ApparecchiaturaModbus01$Simula = new CgpDiscreteTag("PLC_ApparecchiaturaModbus01$Simula", 1, TagDB.startNumber + 543, true, false, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$Simula;
			//case 121:
				TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1RitVeloAlta", 1, TagDB.startNumber + 544, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloAlta;
			//case 122:
				TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M1RitVeloBassa", 1, TagDB.startNumber + 545, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M1RitVeloBassa;
			//case 123:
				TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloAlta = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2RitVeloAlta", 1, TagDB.startNumber + 546, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloAlta.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloAlta;
			//case 124:
				TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloBassa = new CgpIntTag("PLC_ApparecchiaturaModbus01$M2RitVeloBassa", 1, TagDB.startNumber + 547, true, 0, true);
				TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloBassa.setMinMaxValues(-32768, 32767, true);
				//return TagDB.PLC_ApparecchiaturaModbus01$M2RitVeloBassa;
		};

		new RefTagDB();

		return null;
	}
}
