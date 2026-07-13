program segurodes;

var
        sol: integer;
        mTrab: char;
        demi: char;

procedure priSol();
begin
        writeln('Nos últimos 18 meses você trabalhou pelo menos 12 meses?');
        readln(mTrab);
	if (mTrab = 's') or (mTrab='S') then
		writeln('Você tem direito a ter de 4 a 5 parcelas')
	else
		writeln('Infelizmente você não tem direito ao seguro');
end;

procedure segSol();
begin
        writeln('Nos últimos 36 meses você trabalhou pelo menos 9 meses?');
        readln(mTrab);
        if (mTrab = 's') or (mTrab='S') then
                writeln('Você tem direito a ter de 3 a 5 parcelas')
        else
                writeln('Infelizmente você não tem direito ao seguro');
end;

procedure terSol();
begin
        writeln('Nos últimos 36 meses você trabalhou pelo menos 6 meses?(s/n)');
        readln(mTrab);
        if (mTrab = 's') or (mTrab='S') then
                writeln('Você tem direito a ter de 3 a 5 parcelas')
        else
                writeln('Infelizmente você não tem direito ao seguro');
end;

begin
	repeat
		writeln('Qual a solicitação? Ex.: 1,2,5, etc.');
		readln(sol);
	until (sol>=1);

	writeln('Você pediu demissão ou foi demitido por justa causa?(s/n)');
	readln(demi);

	if ((demi = 'n') or (demi = 'N')) then
			case sol of
				1: priSol();
				2: segSol();
			else
				terSol();
			end
	else 
		writeln('Infelizmente você não tem direito ao seguro.');
end.

