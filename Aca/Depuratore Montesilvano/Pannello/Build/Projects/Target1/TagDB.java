package Projects.Target1;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.macroobjects.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.plugins.remoteTargetAlarms.*;

import Projects.ConfigurationMenu.ConfigTagDB;

public class TagDB extends ConfigTagDB
{
	public static int startNumber = CgpTagDB.NUM_SYSTEM_TAGS;
	public static Integer persistentContextObject = new Integer(CgpTagEventManager.getContextID(0));
	private static byte errorHandle = (byte)0;

	public static _RecipeControlVars _RecipeControlDefault;
	public static _DDT106 PLC_ApparecchiaturaModbus01$CorrenteMotore1;
	public static _DDT107 PLC_ApparecchiaturaModbus01$CorrenteMotore2;
	public static _DDT108 PLC_ApparecchiaturaModbus01$FBI_1;
	public static _DDT141 PLC_ApparecchiaturaModbus01$FBI_10;
	public static _DDT112 PLC_ApparecchiaturaModbus01$FBI_2;
	public static _DDT112 PLC_ApparecchiaturaModbus01$FBI_3;
	public static _DDT115 PLC_ApparecchiaturaModbus01$FBI_4;
	public static _DDT112 PLC_ApparecchiaturaModbus01$FBI_5;
	public static _DDT112 PLC_ApparecchiaturaModbus01$FBI_6;
	public static _DDT115 PLC_ApparecchiaturaModbus01$FBI_7;
	public static _DDT141 PLC_ApparecchiaturaModbus01$FBI_8;
	public static _DDT141 PLC_ApparecchiaturaModbus01$FBI_9;
	public static _DDT114 PLC_ApparecchiaturaModbus01$ParPIDOssigeno;
	public static _DDT116 PLC_ApparecchiaturaModbus01$SondaOssigeno_ANA;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$Ki_Ossigeno_TIME;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$CmdInizPIDOssigeno;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$Bobina1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeTermicoM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeTermicoM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeVeloBassaM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeVeloAltaM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$Pulsante1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$Occhio;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$Interferenza;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$M1Bassa_AUTO;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$M2Bassa_AUTO;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$UltimoM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$FPSoglia1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$M1Alta_AUTO;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$M2Alta_AUTO;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$CountOK;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetContatoreM1Bassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeM1VeloBassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$Log0;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$RCPY;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$ParamPidOssigeno;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$SondaOssigenoProva;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$InizializzaPIDOssigeno;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$UscitaPIDOssigeno;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$SecVeloM1Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$MinVeloM1Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$OreVeloM1Bassa;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$SondaOssigeno;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$SecVeloM2Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$SecVeloM1Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$SecVeloM2Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$MinVeloM2Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$MinVeloM1Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$MinVeloM2Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$OreVeloM2Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$OreVeloM1Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$OreVeloM2Alta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$StatoM1;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$StatoM2;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$SetPointOssigeno;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteAllarme;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimitePreallarme;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1TempoRitardoVeloBassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteAllarme;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimitePreallarme;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2TempoRitardoVeloBassa;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaAllarme;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaMax1;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaMax2;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaMin1;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaMin2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$VentolaBox1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$VentolaBox2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$VentolaCompressore1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$VentolaCompressore2;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$Ki_Ossigeno_INT;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$Kp_Ossigeno;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$Isteresi_Ossigeno;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PulsanteSalva;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeCorrenteM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeCorrenteM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeM1Bassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeM2Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeBassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeBassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeBassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteOrePreallarmeBassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeCorrenteM2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeM1Bassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$PreallarmeM2Bassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetOreM1Alta;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetOreM1Bassa;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetOreM2Alta;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetOreM2Bassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteOrePreallarmeAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteOreAllarmeAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteOreAllarmeAlta;
	public static CgpDiscreteTag[] PLC_ApparecchiaturaModbus01$Allarme;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$ResetAllarmi;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimiteAllarmeCorrente;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1LimitePreallarmeCorrente;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimiteAllarmeCorrente;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2LimitePreallarmeCorrente;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$CicloInCorso;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$TastoStartCiclo;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$TastoStopCiclo;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$StatoCiclo;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$PercSogliaAllarme1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$SogliaAllarmeSuperata;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$AllarmeStopCiclo;
	public static CgpFloatTag PLC_ApparecchiaturaModbus01$SondaOssigenoScalata;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$log1;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$log2;
	public static CgpDiscreteTag PLC_ApparecchiaturaModbus01$Simula;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1RitVeloAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M1RitVeloBassa;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2RitVeloAlta;
	public static CgpIntTag PLC_ApparecchiaturaModbus01$M2RitVeloBassa;
	public static CgpRecipeControl _rc_RecipeControlDefault;

	// Dialog table members decalration

	public static CgpBaseAlarmGroup GruppoAllarme1;


	static void StaticInit()
	{
		errorHandle = CgpSystem.configureErrorHandling("UserInputMgr.txt");

		CgpHdaHistorian.setTopOfDay(0);

		String[] GruppoAllarme1TypeMsgs_0 = { "BASSOBASSO", };
		String[] GruppoAllarme1TypeMsgs_1 = { "BASSO", };
		String[] GruppoAllarme1TypeMsgs_2 = { "NORM", };
		String[] GruppoAllarme1TypeMsgs_3 = { "ALTO", };
		String[] GruppoAllarme1TypeMsgs_4 = { "ALTOALTO", };
		String[] GruppoAllarme1TypeMsgs_5 = { "MIN%", };
		String[] GruppoAllarme1TypeMsgs_6 = { "MAGG%", };
		String[] GruppoAllarme1TypeMsgs_7 = { "MIND", };
		String[] GruppoAllarme1TypeMsgs_8 = { "MAGGD", };
		String[] GruppoAllarme1StateMsgs_0 = { "ATTIVI", };
		String[] GruppoAllarme1StateMsgs_1 = { "RIC", };
		String[] GruppoAllarme1StateMsgs_2 = { "RTN", };
		String[] GruppoAllarme1StateMsgs_3 = { "", };
		String[] GruppoAllarme1Labels	= { "GruppoAllarme1", };

		GruppoAllarme1 = CgpAlarmGroup.createAlarmGroup(1, 31, 100, 100, false, IgpAlarmGroupConstants.OPTIONAL_ACK_MODE);
		GruppoAllarme1.setGroupName("GruppoAllarme1");
		GruppoAllarme1.setTypeMessage(
				GruppoAllarme1TypeMsgs_0,
				GruppoAllarme1TypeMsgs_1,
				GruppoAllarme1TypeMsgs_2,
				GruppoAllarme1TypeMsgs_3,
				GruppoAllarme1TypeMsgs_4,
				GruppoAllarme1TypeMsgs_5,
				GruppoAllarme1TypeMsgs_6,
				GruppoAllarme1TypeMsgs_7,
				GruppoAllarme1TypeMsgs_8);
		GruppoAllarme1.setStateMessage(
				GruppoAllarme1StateMsgs_0,
				GruppoAllarme1StateMsgs_1,
				GruppoAllarme1StateMsgs_2,
				GruppoAllarme1StateMsgs_3);
		GruppoAllarme1.setGroupLabels( GruppoAllarme1Labels );

		GruppoAllarme1.setTouchExpressionId(2001);


		CgpExpressionServer.expressionServer = new XprSrv();
	}

	public TagDB()
	{
		super(574);
		//buildClassFactory();
		//super.buildClassFactory();
	}

	public void instantiate(int tagId)
	{
		classFactory(tagId);
	}

	public void buildClassFactory()
	{
		CgpSystem.buildClassFactory(getClass(), null, startNumber);
	}


	public static Object classFactory(int tagFieldIdentifier)
	{
		return TagDB0.classFactory1(tagFieldIdentifier);
	}

}
