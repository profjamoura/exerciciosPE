program bissexto;
var
  ano: integer;
  P, Q, R: integer;
begin
  ano := 1;
  repeat
	  	writeln('Digite um ano. -1 para finalizar ');
		readln(ano);
		P:= (ano mod 4);
		Q:= (ano mod 100);
		R:= (ano mod 400);
		if ((P = 0) and  (Q <> 0)) or ((R = 0) and (Q = 0)) then
			writeln('é bissexto')
                else 
		 	writeln ('não é bissexto');
  until (ano = -1);
end.

