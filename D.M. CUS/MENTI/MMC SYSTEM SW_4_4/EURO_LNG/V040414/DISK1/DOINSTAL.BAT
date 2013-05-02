IF NOT EXIST %TMP%\setup.exe goto NoSetup
IF NOT EXIST %TMP%\SYSTEM.UPD goto NoSysupd
COPY %TMP%\SYSTEM.UPD C:\WIN95\SYSTEM.INI
MOVE %TMP%\SISETUP.MMC %TMP%\SISETUP.INI
%TMP%\SCANTAB.EXE
C:
C:\WIN95\WIN
MODE CO80
echo.
echo зддддддддддддддддддддддддддддддддддддддд©
echo Ё        Installation Succeded !        Ё
echo Ё                                       Ё
echo Ё Please remove the Installation-Disk ! Ё
echo Ё                                       Ё
echo Ё        Hit ANY Key to REBOOT !        Ё
echo юддддддддддддддддддддддддддддддддддддддды
echo.
pause
C:\TOOLS\REBOOT.EXE -C -Y
goto Ende
:NoSysupd
ECHO.
ECHO ****** FATAL: File %TMP%\SYSTEM.UPD does not exist ! ******
set _abort=Y
goto Ende
:NoSetup
ECHO.
ECHO ****** FATAL: File %TMP%\SETUP.EXE does not exist ! ******
set _abort=Y
:Ende
