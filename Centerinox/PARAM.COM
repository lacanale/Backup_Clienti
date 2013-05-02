//S(Start)
;
HS7=("Impostazioni Centerinox",ac7,se1)
PRESS(HS7)
LM("MENU")
END_PRESS
//END



//M(MENU//"Asamec.bmp")

HS1=("Lubrificaz.",,se1)
HS2=("Mandrino",,se1)
HS3=("Refrigerante",,se1)
HS4=("Contatori",,se1)
HS5=("",,se1)
HS6=("",,se1)
HS7=("",,se1)
HS8=("",,se1)
VS1=("",,se1)
VS2=("",,se1)
VS3=("",,se1)
VS4=("",,se1)
VS5=("",,se1)
VS6=("",,se1)
VS7=("",,se1)
VS8=("Esci",,se1)

PRESS(HS1)
LM("LUBRIF")
END_PRESS

PRESS(HS2)
LM("MANDRINO")
END_PRESS

PRESS(HS3)
LM("refrigerante")
END_PRESS

PRESS(HS4)
LM("contatori")
END_PRESS

PRESS(VS8)
	Exit
END_PRESS

//END




//M(LUBRIF/)
Def Tit1=(I///,"Lubrificazione asse A",/wr0///10,,250/0,0,0)
DEF T_LUB1=(I/0,1000//"","Impulso LUB",,"Sec"///"db103.dbw0"/10,,150/200,,120)
DEF INT_LUB1=(I/0,7200//"","Intervallo LUB",,"Sec"///"db103.dbw2"/10,,150/200,,120)

Def Tit2=(I///,"Lubrificazione asse B",/wr0///10,,250/0,0,0)
DEF T_LUB2=(I/0,1000//"","Impulso LUB",,"Sec"///"db103.dbw4"/10,,150/200,,120)
DEF INT_LUB2=(I/0,7200//"","Intervallo LUB",,"Sec"///"db103.dbw6"/10,,150/200,,120)

Def Tit3=(I///,"Lubrificazione assi lineari",/wr0///10,,250/0,0,0)
DEF T_LUB3=(I/0,1000//"","Impulso LUB",,"Sec"///"db103.dbw8"/10,,150/200,,120)
DEF INT_LUB3=(I/0,7200//"","Intervallo LUB",,"Sec"///"db103.dbw10"/10,,150/200,,120)

HS1=("",,se1)
HS2=("",,se1)
HS3=("",,se1)
HS4=("",,se1)
HS5=("",,se1)
HS6=("",,se1)
HS7=("",,se1)
HS8=("",,se1)
VS1=("",,se1)
VS2=("",,se1)
VS3=("",,se1)
VS4=("",,se1)
VS5=("",,se1)
VS6=("",,se1)
VS7=("",,se1)
VS8=("Indietro",,se1)

PRESS(VS8)
	LM("MENU")
END_PRESS

//END

//M(MANDRINO/)

Def Tit1=(I///,"SENSORE MANDRINO",/wr0///10,,250/0,0,0)
DEF SENS_MANDRINO=(I/0,65000//"","Valore Attuale",""///"MW102"/10,,150/200,,70/10,6)
Def Tit1_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit2=(I///,"PINZA APERTA",/wr0///10,,250/0,0,0)
DEF Min_Pinza_Aperta=(I/0,65000//"","Pinza Aperta Min",""///"db103.dbw12"/10,,150/200,,70/10,9)
DEF Max_Pinza_Aperta=(I/0,65000//"","Pinza Aperta Max",""///"db103.dbw14"/10,,150/200,,70/10,4)
Def Tit2_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit3=(I///,"PINZA CHIUSA",/wr0///10,,250/0,0,0)
DEF Min_Pinza_Chiusa=(I/0,65000//"","Pinza Chiusa Min",""///"db103.dbw16"/10,,150/200,,70/10,9)
DEF Max_Pinza_Chiusa=(I/0,65000//"","Pinza Chiusa Max",""///"db103.dbw18"/10,,150/200,,70/10,4)
Def Tit3_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit4=(I///,"STATO PINZA",/wr0///10,,250/0,0,0)
DEF Stato_Aperta=(I/* 0="Indefinito",1="Aperta",2="Chiusa",3="Errore"//"","Stato Pinza = ",""/WR1//"MB106"/10,,150/200,,100/10,3)
Def Tit4_1=(I///,"",/wr0///0,0,0/0,0,0)




HS1=("",,se1)
HS2=("",,se1)
HS3=("",,se1)
HS4=("",,se1)
HS5=("",,se1)
HS6=("",,se1)
HS7=("",,se1)
HS8=("",,se1)
VS1=("",,se1)
VS2=("",,se1)
VS3=("",,se1)
VS4=("",,se1)
VS5=("",,se1)
VS6=("",,se1)
VS7=("",,se1)
VS8=("Indietro",,se1)


PRESS(VS8)
	LM("MENU")
END_PRESS

//END


//M(Refrigerante/)


Def Tit1=(I///,"Vasca Interna",/wr0///10,,250/0,0,0)
DEF Liv_Vasca_Interna=(I/* 0="Regolare",1="Massimo"//"","Livello vasca interna = ",""/WR1//"DB100.DBX8.5"/10,,150/200,,100/10,3)
Def Tit1_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit2=(I///,"Vasca Esterna",/wr0///10,,250/0,0,0)
DEF Liv_Presenza_Olio_Vasca_Interna=(I/* 0="Inferiore",1="Superiore"//"","Livello massimo olio vasca = ",""/WR1//"DB100.DBX9.0"/10,,150/200,,100/10,3)
DEF Liv_Minimo_Olio_Vasca_Interna=(I/* 0="Inferiore",1="Superiore"//"","Livello minimo olio vasca = ",""/WR1//"DB100.DBX8.6"/10,,150/200,,100/10,3)
DEF Liv_Allarme_Olio_Vasca_Interna=(I/* 0="Inferiore",1="Superiore"//"","Livello allarme olio vasca = ",""/WR1//"DB100.DBX8.7"/10,,150/200,,100/10,3)
Def Tit2_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit3=(I///,"Stato Pompe",/wr0///10,,250/0,0,0)
DEF Pompa_Refrigerante=(I/* 0="Spenta",1="Accesa"//"","Pompa Refrigerante = ",""/WR1//"DB101.DBX6.3"/10,,150/200,,100/10,4)
DEF Pompa_Travaso=(I/* 0="Spenta",1="Accesa"//"","Pompa Travaso = ",""/WR1//"DB101.DBX6.2"/10,,150/200,,100/10,4)
Def Tit3_1=(I///,"",/wr0///0,0,0/0,0,0)

Def Tit4=(I///,"Tentativi ripristino refrigerante",/wr0///10,,250/0,0,0)
DEF Numero_Tentativi=(I///"","Numero di tentativi = ","","di 3"/WR1//"mb104"/10,,150/200,,100/10,6)
Def Tit4_1=(I///,"",/wr0///0,0,0/0,0,0)


HS1=("",,se1)
HS2=("",,se1)
HS3=("",,se1)
HS4=("",,se1)
HS5=("",,se1)
HS6=("",,se1)
HS7=("",,se1)
HS8=("",,se1)
VS1=("",,se1)
VS2=("",,se1)
VS3=("",,se1)
VS4=("",,se1)
VS5=("",,se1)
VS6=("",,se1)
VS7=("",,se1)
VS8=("Indietro",,se1)


PRESS(VS8)
	LM("MENU")
END_PRESS

//end


//M(contatori/)

Def Tit1=(I///,"Conteggio pezzi",/wr0///10,,250/0,0,0)

DEF Programma_Attuale=(S///"","Programma Attuale",,""/WR1//"ULTIMO_PROGRAMMA"/10,,150/200,,160)
DEF PezziTotali=(I///"","Pezzi Totali",,"num"///"db103.dbw24"/10,,150/200,,120)
DEF Pezzi_Parziali=(I///"","Pezzi Parziali",,"num"///"db103.dbw20"/10,,150/200,,120)
DEF Pezzi_Intervallo_Tastatura=(I///"","Pezzi Intervallo Tastatura",,"num"///"db103.dbw22"/10,,150/200,,120)


HS1=("",,se1)
HS2=("",,se1)
HS3=("",,se1)
HS4=("",,se1)
HS5=("",,se1)
HS6=("",,se1)
HS7=("",,se1)
HS8=("",,se1)
VS1=("",,se1)
VS2=("",,se1)
VS3=("",,se1)
VS4=("",,se1)
VS5=("",,se1)
VS6=("",,se1)
VS7=("",,se1)
VS8=("Indietro",,se1)

PRESS(VS8)
	LM("MENU")
END_PRESS

//END





M17


