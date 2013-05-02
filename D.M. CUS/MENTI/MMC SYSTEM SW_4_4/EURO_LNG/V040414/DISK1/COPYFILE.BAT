:filecopy
IF "%_ABORT%"=="Y" goto exit
IF EXIST %_DRIVE%\%1 goto found
REM CLS
ECHO.
ECHO Please insert Installation Floppy #%2%
ECHO  (Hit "n" to ABORT Installation)
ECHO.
readcon yn "Continue ? [y] "
if errorlevel 1 goto filecopy
if errorlevel 0 goto abort
:abort
set _abort=Y
goto exit
:found
ECHO COPYING %_DRIVE%\%1 TO %TMP% ....
COPY %_DRIVE%\%1 %TMP%
IF NOT EXIST %TMP%\%1 goto abort
:exit
