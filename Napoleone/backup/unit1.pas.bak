unit unit1;

{$mode objfpc}{$H+}
interface

uses
  Classes, SysUtils, LResources, Forms, Controls, Graphics, Dialogs,
  mysql50conn, sqldb, StdCtrls, DB, DBGrids, DBCtrls, ComCtrls, ButtonPanel,
  EditBtn, LCLType, Menus, Buttons, Grids, TAGraph, TASources, TADbSource,
  TASeries, StrUtils;

type
  { TForm1 }
  TForm1 = class(TForm)
    btnSave:     TButton;
    btnNext:     TButton;
    btnPrior:    TButton;
    Button1: TButton;
    Button2:TButton;
    Button3:     TButton;
    Datasource2:TDatasource;
    DBComboBox1:TDBComboBox;
    FilterTarga: TEdit;
    GroupBox2: TGroupBox;
    LblTotaleKm: TLabel;
    LblTotaleLitri: TLabel;
    SQLQuery2:TSQLQuery;
    SQLQueryCalcoli: TSQLQuery;
    SQLTransaction2:TSQLTransaction;
    TipoFiltroAutista: TComboBox;
    TipoData1: TComboBox;
    TipoData2: TComboBox;
    Datasource1: TDatasource;
    Data1: TDateEdit;
    Data2: TDateEdit;
    DBCalendar1: TDBCalendar;
    DBData:      TDBEdit;
    FilterAutista: TEdit;
    EditAutista: TDBEdit;
    DBGrid1:     TDBGrid;
    EditAutista1: TDBEdit;
    EditAutista2: TDBEdit;
    EditAutista3: TDBEdit;
    EditAutista4: TDBEdit;
    EditAutista5: TDBEdit;
    GroupBox1: TGroupBox;
    GroupModDati: TGroupBox;
    ImageList1:  TImageList;
    MainMenu1:   TMainMenu;
    MenuItem1:   TMenuItem;
    MySQL50Connection1: TMySQL50Connection;
    SpeedButton1: TSpeedButton;
    SpeedButton2: TSpeedButton;
    SQLQuery1:   TSQLQuery;
    SQLTransaction1: TSQLTransaction;
    StatusBar1:  TStatusBar;
    TipoFiltroTarga: TComboBox;
    ToolBar1:    TToolBar;
    TBConnetti:  TToolButton;
    TBDisconnetti: TToolButton;
    TBImporta:   TToolButton;
    ToolButton1: TToolButton;
    TBAggiungi:  TToolButton;
    TBElimina:   TToolButton;
    TBModifica:  TToolButton;
    TBAggiorna:  TToolButton;
    TBInfo: TToolButton;
    ToolButton2: TToolButton;
    TBExit: TToolButton;
    procedure btnConnectClick(Sender: TObject);
    procedure btnNextClick(Sender: TObject);
    procedure btnPriorClick(Sender: TObject);
    procedure btnSaveClick(Sender: TObject);
    procedure Button1Click(Sender: TObject);
    procedure Button2Click(Sender: TObject);
    procedure Button3Click(Sender: TObject);
    procedure Button4Click(Sender: TObject);
    procedure Button5Click(Sender: TObject);
    procedure ButtonPanel1Click(Sender: TObject);
    procedure DBCalendar1Change(Sender: TObject);
    procedure DBGrid1CellClick(Column: TColumn);
    procedure DBGrid1DragOver(Sender, Source: TObject; X, Y: integer;
      State: TDragState; var Accept: boolean);
    procedure DBGrid1DrawColumnCell(Sender:TObject;const Rect:TRect;DataCol:
      Integer;Column:TColumn;State:TGridDrawState);
    procedure DBGrid1Exit(Sender: TObject);
    procedure DrawGrid1Click(Sender: TObject);
    procedure FormClose(Sender: TObject; var CloseAction: TCloseAction);
    procedure FormCreate(Sender: TObject);
    procedure GroupModDatiClick(Sender: TObject);
    procedure PageControl1Change(Sender: TObject);
    procedure SpeedButton1Click(Sender: TObject);
    procedure SpeedButton2Click(Sender: TObject);
    procedure TBConnettiClick(Sender: TObject);
    procedure TBExitClick(Sender: TObject);
    procedure ToolBar1Click(Sender: TObject);
    procedure TBDisconnettiClick(Sender: TObject);
    procedure TBAggiungiClick(Sender: TObject);
    procedure TBEliminaClick(Sender: TObject);
    procedure TBModificaClick(Sender: TObject);
    procedure TBAggiornaClick(Sender: TObject);
  private
    { private declarations }
  public
    { public declarations }
  end;

var
  Form1: TForm1;

implementation

{ TForm1 }

procedure TForm1.FormCreate(Sender: TObject);
begin
  DecimalSeparator      := '.';
  //Set properties of components:
  //(could be done in the Object Inspector)
  MySQL50Connection1.HostName := '127.0.0.1';
  MySQL50Connection1.UserName := 'root';
  MySQL50Connection1.Password := '';
  MySQL50Connection1.DatabaseName := 'dynabus';
  MySQL50Connection1.Transaction := SQLTransaction1;
  //SQLQuery1.ParseSQL := true; //line not needed - this is the default
  //SQLQuery1.ReadOnly := false; //line not needed - this is the default
  SQLQuery1.SQL.Text    := 'select * from dati';
  SQLQuery1.Transaction := SQLTransaction1;
  //  SQLQuery1.UpdateMode := upWhereChanged;
  Datasource1.Dataset   := SQLQuery1;
  DBGrid1.DataSource    := Datasource1;
  ;
end;

procedure TForm1.GroupModDatiClick(Sender: TObject);
begin

end;

procedure TForm1.PageControl1Change(Sender: TObject);
begin

end;

procedure TForm1.SpeedButton1Click(Sender: TObject);
var
  x: integer;
begin
  SQLQuery1.ApplyUpdates;
  GroupModDati.Visible := False;
end;

procedure TForm1.SpeedButton2Click(Sender: TObject);
begin
  SQLQuery1.CancelUpdates;
  GroupModDati.Visible := False;
end;

procedure TForm1.TBConnettiClick(Sender: TObject);
var
  S: string;
begin
  try
    MySQL50Connection1.Connected := True;
    SQLQuery1.SQL.Text := 'SELECT * FROM DATI';
    SQLQuery1.Open;

    //Tests to see if all is OK:
    SQLQuery1.Last;
    S := IntToStr(SQLQuery1.RecordCount) + #13#10;
    SQLQuery1.First;
    while not SQLQuery1.EOF do
    begin
      //S := S + SQLQuery1.FieldByName('Data').AsString + #13#10;
      SQLQuery1.Next;
    end;
    StatusBar1.Panels[0].Text := 'Database Connesso';
    StatusBar1.Panels[1].Text := 'Numero righe ' + IntToStr(SQLQuery1.RecordCount);
    TBAggiungi.Enabled    := True;
    TBElimina.Enabled     := True;
    TBModifica.Enabled    := True;
    TBDisconnetti.Enabled := True;
    TBConnetti.Enabled    := False;
    TBAggiorna.Enabled    := True;
    TBImporta.Enabled     := True;
  except
    on E: Exception do
      ShowMessage(E.message);
  end;
end;

procedure TForm1.TBExitClick(Sender: TObject);
begin
  form1.Close;
end;

procedure TForm1.ToolBar1Click(Sender: TObject);
begin

end;

procedure TForm1.TBDisconnettiClick(Sender: TObject);
begin
  MySQL50Connection1.Connected := False;
  StatusBar1.Panels[0].Text := 'Database Disconnesso';
  StatusBar1.Panels[1].Text := '';
  TBAggiungi.Enabled    := False;
  TBElimina.Enabled     := False;
  TBModifica.Enabled    := False;
  TBDisconnetti.Enabled := False;
  TBConnetti.Enabled    := True;
  TBAggiorna.Enabled    := False;
  TBImporta.Enabled     := False;

end;

procedure TForm1.TBAggiungiClick(Sender: TObject);
begin
  SQLQuery1.insert;
  GroupModDati.Visible := True;
end;

procedure TForm1.TBEliminaClick(Sender: TObject);
begin
  if MessageDlg('Cancellazione', 'Sei sicuro di voler cancellare questa riga?',
    mtConfirmation, [mbYes, mbNo, mbIgnore], 0) = mrYes then
  begin
    SQLQuery1.Delete;
    SQLQuery1.ApplyUpdates;
  end;
end;

procedure TForm1.TBModificaClick(Sender: TObject);
begin
  GroupModDati.Visible := True;
end;

procedure TForm1.TBAggiornaClick(Sender: TObject);
begin
  SQLQuery1.Refresh;
end;

procedure TForm1.btnConnectClick(Sender: TObject);
var
  S: string;
begin
  try
    MySQL50Connection1.Connected := True;
    SQLQuery1.Open;

    //Tests to see if all is OK:
    SQLQuery1.Last;
    S := IntToStr(SQLQuery1.RecordCount) + #13#10;
    SQLQuery1.First;
    while not SQLQuery1.EOF do
    begin
      S := S + SQLQuery1.FieldByName('DataOra').AsString + #13#10;
      SQLQuery1.Next;
    end;
  except
    on E: Exception do
      ShowMessage(E.message);
  end;
end;

procedure TForm1.btnNextClick(Sender: TObject);
begin
  SQLQuery1.Next;
end;

procedure TForm1.btnPriorClick(Sender: TObject);
begin
  SQLQuery1.Prior;
end;

procedure TForm1.btnSaveClick(Sender: TObject);
begin
  try
    SQLQuery1.ApplyUpdates;
  except
    on E: Exception do
      ShowMessage(E.message);
  end;
end;

procedure TForm1.Button1Click(Sender: TObject);
var
SqlText,FiltroAutista,FiltroTarga:string;
PrimoFiltro:integer;
begin
sqlquery1.close;
if TipoData1.Text <> '' then
   begin
   if data1.Text='' then showmessaGE('Errore data1');
   end;
if TipoData2.Text <> '' then
   begin
   if data2.Text='' then showmessage('Errore data2');
   end;
sqltext:='';
PrimoFiltro:=0;
SqlText:='select * from dati where ';

if data1.Text<>'' then
   begin
        SqlText:=SqlText + ' Data ' + TipoData1.Text + '''' + FormatDateTime ('yyyy/mm/dd',StrToDateTime(DATA1.TEXT)) + '''';
        PrimoFiltro:=1;
   end;

if data2.Text<>'' then
   begin
        if PrimoFiltro=1 then
           SqlText:=SqlText + ' and Data ' + TipoData2.Text + '''' + FormatDateTime ('yyyy/mm/dd',StrToDateTime(DATA2.TEXT)) + ''''
        else
           SqlText:=SqlText + ' Data ' + TipoData2.Text + '''' + FormatDateTime ('yyyy/mm/dd',StrToDateTime(DATA2.TEXT)) + '''';
   end;

if TipoFiltroAutista.text <>'' then
   begin
        if TipoFiltroAutista.text='Inizia per' then FiltroAutista:= ' like ' + '''' + FilterAutista.text + '%' + '''' ;
        if TipoFiltroAutista.text='Finisce per' then FiltroAutista:= ' like ' + '''' + '%' + FilterAutista.text + ''''  ;
        if TipoFiltroAutista.text='Uguale a' then FiltroAutista:= ' = ' + ''''  + FilterAutista.text + '''' ;
        if PrimoFiltro=1 then
           SqlText:=SqlText + ' and Autista ' + FiltroAutista
        else
           SqlText:=SqlText + ' Autista ' + FiltroAutista;
        PrimoFiltro:=1;
    end;

if TipoFiltroTarga.text <>'' then
   begin
        if TipoFiltroTarga.text='Inizia per' then FiltroTarga:= ' like ' + '''' + FilterTarga.text + '%' + '''' ;
        if TipoFiltroTarga.text='Finisce per' then FiltroTarga:= ' like ' + '''' + '%' + FilterTarga.text + ''''  ;
        if TipoFiltroTarga.text='Uguale a' then FiltroTarga:= ' = ' + ''''  + FilterTarga.text + '''' ;
        if PrimoFiltro=1 then
           SqlText:=SqlText + ' and Targa ' + FiltroTarga
        else
           SqlText:=SqlText + ' Targa ' + FiltroTarga;
        PrimoFiltro:=1;
    end;

if PrimoFiltro=0 then sqltext:= 'select * from dati';

sqlquery1.SQL.Text:=sqltext;
sqlquery1.open;

SQLQueryCalcoli.close;
SQLQueryCalcoli.SQL.Text:='SELECT SUM(Km) AS TotaleKm, Sum(Litri) as TotaleLitri FROM dati ' + midstr(SqlText,19,Length(sqltext));
SQLQueryCalcoli.open;
LblTotaleKm.Caption :=SQLQueryCalcoli.FieldByName('TotaleKm').AsString ;
LblTotaleLitri.Caption :=SQLQueryCalcoli.FieldByName('TotaleLitri').AsString ;




StatusBar1.Panels[1].Text := 'Numero righe ' + IntToStr(SQLQuery1.RecordCount);
end;

procedure TForm1.Button2Click(Sender: TObject);
begin

end;

procedure TForm1.Button3Click(Sender: TObject);
begin
  DBCalendar1.Visible := True;
end;

procedure TForm1.Button4Click(Sender: TObject);
begin

end;

procedure TForm1.Button5Click(Sender: TObject);
begin
  SQLQuery1.Insert;
end;

procedure TForm1.ButtonPanel1Click(Sender: TObject);
begin

end;

procedure TForm1.DBCalendar1Change(Sender: TObject);
begin
  DBData.Text := DBCalendar1.date;
  DBCalendar1.Visible := False;
end;

procedure TForm1.DBGrid1CellClick(Column: TColumn);
begin

end;

procedure TForm1.DBGrid1DragOver(Sender, Source: TObject; X, Y: integer;
  State: TDragState; var Accept: boolean);
begin
  ShowMessage('ciao');
end;

procedure TForm1.DBGrid1DrawColumnCell(Sender:TObject;const Rect:TRect;DataCol:
  Integer;Column:TColumn;State:TGridDrawState);
begin
  if (Column.Field.FieldName='Targa') then
    begin
      if Column.Field.Text='BR409CH' then
      begin
        DBGrid1.Canvas.Brush.Color := clYELLOW ;
        DBGrid1.Canvas.Font.Size:=10;
        DBGrid1.Canvas.Font.Bold:=TRUE;
        DBGrid1.Canvas.fillRect( rect );
        DBGRID1.Canvas.TextOut(Rect.Left, Rect.Top, Column.Field.Text );
      end;
    end;
end;

procedure TForm1.DBGrid1Exit(Sender: TObject);
begin
  SQLQuery1.CancelUpdates;
end;

procedure TForm1.DrawGrid1Click(Sender: TObject);
begin

end;

procedure TForm1.FormClose(Sender: TObject; var CloseAction: TCloseAction);
begin
  //Required or get EDatabase error on close:
  MySQL50Connection1.Connected := False;
end;

initialization
  {$I unit1.lrs}
end.

