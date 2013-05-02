@echo off

rem Copyright (c) Siemens AG 1995, all rights reserved

rem made by Th. Hornfischer, AUT 6121
rem modified for MMC101/102 by W. Latzel, AUT 61
rem

if not exist .\readcon.exe goto NO_READCON

rem Check for sufficiend Environment-Memory, Author Th.Breunig, AUT 6125

set ES=THIS_IS_A_REALLY_VERY_LONG_ENVIRONMENT_VARIABLE
if not "%ES%" == "THIS_IS_A_REALLY_VERY_LONG_ENVIRONMENT_VARIABLE" goto no_space
set ES=

set _fd=A:
set _hd=C:
set _dir=\MMC102
set _copy=N

:menu1
cls  
echo Copyright (c) Siemens AG 1995,  all Rights reserved
echo.
echo Installing MMC101/102 Software via Serial/Parallel Line
echo 컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴컴�
echo This process will allow you to install or upgrade following
echo MMC101/102 Operators Panel software components:
echo.
call banner.bat
echo.
echo You have two Choices:
echo.
echo 1. Install directly from Floppy to MMC101/102 (Single Installation)
echo    (Only some batchfiles will be copied to the selected Diskdrive)
echo.
echo 2. Install once to local Harddisk and then multiple to MMC101/102
echo    ( You will need about %free_space% MB free space on your harddisk !)
echo.
readcon yn "Continue with installation (y/n)? [y] " 
if errorlevel 2 goto menu1
if errorlevel 1 goto setup0
if errorlevel 0 goto abort

rem
rem ask the user for installation parameters
rem

:setup0
cls
echo.
echo Please check the installation parameters:
echo.
echo Installation from drive          :    %_fd%
echo Copy files to disk               :    %_copy%
echo Copy (batch)files to directory   :    %_hd%%_dir%
echo.
readcon ny "Would you like to change anything (y/n)? [n] "
if errorlevel 2 goto setup0
if errorlevel 1 goto setup01
if errorlevel 0 goto setup99
:setup01
cls
echo.
echo Which diskette drive do you use?
echo.
echo 1. A:
echo 2. B:
echo.
readcon 1-2 "Please enter corresponding number (1/2): [1] "
if errorlevel 3 goto setup01
if errorlevel 2 goto setup12
if errorlevel 1 goto setup11
:setup11
set _fd=A:
goto setup1
:setup12
set _fd=B:
:setup1
cls
echo.
echo Copy ALL files from Floppy to local Harddisk ?
echo.
echo 1. NO  (only some batchfiles will be copied)
echo 2. YES (You will need about %free_space% MB free space on your harddisk !)
echo.
readcon 1-2 "Please enter corresponding number (1/2): [1] "
if errorlevel 3 goto setup1
if errorlevel 2 goto setup16
if errorlevel 1 goto setup17
:setup16
set _copy=Y
goto setup15
:setup17
set _copy=N
:setup15
cls
echo.
echo Please select the harddisk drive on which the (batch)files should
echo be copied
echo (a subdir "\MMC102" will be automatically created on that drive).
echo.
echo 1. C:
echo 2. D:
echo 3. E:
echo.
readcon 1-3 "Please enter corresponding number (1/2/3): [1] "
if errorlevel 4 goto setup15
if errorlevel 3 goto setup23
if errorlevel 2 goto setup22
if errorlevel 1 goto setup21
:setup21
set _hd=C:
goto setup0
:setup22
set _hd=D:
goto setup0
:setup23
set _hd=E:
goto setup0

:setup99
if not exist %_hd%%_dir%\nul mkdir %_hd%%_dir%
copy %_fd%intersvr.exe %_hd%%_dir%
copy %_fd%readcon.exe %_hd%%_dir%
copy %_fd%*.bat %_hd%%_dir%

%_hd%
cd %_dir%

echo set _fd=%_fd%>  %_dir%\set_data.bat
echo set _hd=%_hd%>> %_dir%\set_data.bat
echo set _dir=%_dir%>> %_dir%\set_data.bat
echo set _copy=%_copy%>> %_dir%\set_data.bat

install2.bat %_fd% %_dir% %_copy% %_hd%
REM ==== sollte eigentlich nicht mehr zurueckkommen ! ====
goto schluss

:exit
echo.
echo MMC101/102 Software Installation finished.
goto schluss

:no_space
REM ==================Author Th.Breunig, AUT 6125======================
cls
echo   There is not enough space for Variables in the current environment
echo.
echo   Suggestions :
echo.
echo   If you are running %0 from  DOS, enlarge your environment using
echo      the 'SHELL'-Entry in your   config.sys !
echo.
echo   If you are running %0 from WINDOWS, enlarge the environment for
echo      DOS-Invokation by editing the DOSPROMPT.PIF !
echo      Insert   /E:2048   to the  Program-Parameters-Field !
echo.
echo   You also may invoke %0 with a new Command-Interpreter with enlarged
echo      Environment using the Command :
echo             "command /E:2048  /c  %0   "
echo.
goto abort

:NO_READCON
echo.
echo Please change to the Directory, where the file "DOSSETUP.BAT" lives,
echo before calling DOSSETUP.BAT !
pause
goto schluss

:abort
echo.
echo MMC101/102 Software Installation aborted.
:schluss
set _fd=
set _hd=
set _dir=
set _copy=
set _drive=
set _abort=
set free_space=

rem Copyright Siemens AG, 1995
