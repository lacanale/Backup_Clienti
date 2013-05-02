@echo off

rem
rem Copyright (c) Siemens AG 1995, all Rights reserved
rem made by Th. Hornfischer, AUT 6121
rem modified for MMC101/102 by W. Latzel, AUT 61
rem

:install0

if NOT "%4"=="" goto install2

rem
rem install2.bat is called from DOS shell
rem
if NOT exist set_data.bat goto noparam
call set_data.bat
if %_copy%==N goto pcin0_N
goto pcin0_Y

rem
rem install2.bat is called from dossetup.bat
rem
:install2
set _fd=%1
set _dir=%2
set _copy=%3
set _hd=%4

:pcin0
set _drive=%_fd%
if %_copy%==N goto pcin1
:pcin0_N
cls
echo.
set _tmpret=%tmp%
set tmp=%_hd%%_dir%
call instfile.bat
set tmp=%_tmpret%
set _tmpret=
IF "%_abort%"=="Y" goto abort

:pcin0_Y
set _drive=%_hd%

:pcin1
cls
echo.
echo Now we are ready for transfering the Files to the MMC101/102 Disk.
echo.
echo First You have to set this computer into "Server Mode" (by hitting "y"),
echo Then Reboot MMC101/102 and press Key "6" at the "Starting MS-DOS ..."
echo Prompt. Then select "Install/Update MMC System" and "Install via
echo Serial/Parallel Line". Now You are ready for transfering ....
echo.
readcon ny "Transfer the Installation Files to MMC101/102 (y/n)? [n] "
if errorlevel 2 goto pcin1
if errorlevel 1 goto pcin11
if errorlevel 0 goto exit2

:pcin11
cls
echo.
intersvr.exe %_drive%

:install9
cls
echo.
readcon ny "Would you like to repeat the File Transfer again (y/n)? [n] "
if errorlevel 2 goto install9
if errorlevel 1 goto pcin11
if errorlevel 0 goto exit

:noparam
echo USAGE: install2 'floppy' 'dir' 'copy'
goto exit2

:abort
echo.
echo MMC101/102 software installation aborted.
goto exit2

:exit
echo.
echo MMC101/102 software installation procedure finished.
:exit2

rem Copyright (c) Siemens AG 1995, all rights reserved
