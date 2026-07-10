program imccomcase;
var
  peso, altura, imc: real;
  imcreal:integer;
begin
  writeln('Digite seu peso em kg');
  read (peso);

  writeln('digite sua altura em cm');
  read (altura);

  altura := altura/100;
  imc := peso / (altura * altura);
  writeln('IMC =  ',imc:2:1);
  imcreal:=Trunc(imc)*10;
  case imcreal of
    0..185: 
	writeln('Peso abaixo do normal');
    186..249: 
	writeln('Peso normal');
    250..299:
	writeln('Sobrepeso');
    300..349:
        writeln('Obsidade grau I');
    350..399:
        writeln('Obsidade grau II');
    400..1000:
        writeln('Obsidade grau III');
    else writeln('imc não calculado');
  end;
end.
