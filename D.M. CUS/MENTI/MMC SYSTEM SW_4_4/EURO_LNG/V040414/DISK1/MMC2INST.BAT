@ECHO OFF
IF "%INSTMED%"=="" goto nommc2
IF "%TMP%"=="" goto NoTmpdir
IF NOT %INSTMED%==FLOPPY goto nocopy
IF "%_DRIVE%"=="" goto nommc2
IF EXIST %TMP%\nul C:\WIN95\COMMAND\DELTREE /Y %TMP%\*.*
IF NOT EXIST %TMP%\nul MD %TMP%
IF NOT EXIST %TMP%\nul goto NoInstdir
c:\tools\_break on
:insert
IF EXIST %_DRIVE%\INSTFILE.BAT goto copyfilebat
ECHO Please insert Floppy #1
pause
goto insert
:copyfilebat
ECHO COPYING %_DRIVE%\INSTFILE.BAT TO C:\TOOLS ...
COPY %_DRIVE%\INSTFILE.BAT C:\TOOLS
COPY %_DRIVE%\COPYFILE.BAT C:\TOOLS
COPY %_DRIVE%\READCON.EXE C:\TOOLS
COPY %_DRIVE%\BANNER.BAT %TMP%
CLS
SET _abort=N
call %TMP%\banner.bat
:frage
readcon yn "Continue with Installation (y/n)? [y] " 
if errorlevel 2 goto frage
if errorlevel 1 goto fangan
if errorlevel 0 goto abort
:fangan
CALL INSTFILE.BAT
IF "%_abort%"=="Y" goto abort
:nocopy
C:
call %TMP%\doinstal.bat
IF "%_abort%"=="Y" goto abort
echo.
echo зддддддддддддддддддддддддд©
echo Ё Installation Succeded ! Ё
echo юддддддддддддддддддддддддды
echo.
pause
goto end
rem ************************
rem *       ERRORS         *
rem ************************
:nommc2
echo.
echo    зддддддддддддддддддддддд©
echo    Ё 'MMC2INST.BAT' is for Ё
echo    Ё  internal Use Only !  Ё
echo    юддддддддддддддддддддддды
echo.
pause
CLS
goto end
:NoInstdir
ECHO.
ECHO ****** FATAL: Can't create %TMP% ! ******
ECHO.
pause
goto end
:NoTmpdir
ECHO.
ECHO ****** FATAL: Environment Variable TMP does not exist ! ******
ECHO.
pause
goto end
:abort
ECHO.
ECHO ***************** Installation ABORTED ! *****************
ECHO.
pause
:end

