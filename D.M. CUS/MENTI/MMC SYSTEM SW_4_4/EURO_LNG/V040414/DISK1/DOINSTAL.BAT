IF NOT EXIST %TMP%\setup.exe goto NoSetup
IF NOT EXIST %TMP%\SYSTEM.UPD goto NoSysupd
COPY %TMP%\SYSTEM.UPD C:\WIN95\SYSTEM.INI
MOVE %TMP%\SISETUP.MMC %TMP%\SISETUP.INI
%TMP%\SCANTAB.EXE
C:
C:\WIN95\WIN
MODE CO80
echo.
echo 旼컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴�
echo �        Installation Succeded !        �
echo �                                       �
echo � Please remove the Installation-Disk ! �
echo �                                       �
echo �        Hit ANY Key to REBOOT !        �
echo 읕컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴�
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
