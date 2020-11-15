var
c,b,a: string;
begin
   readln(a);
   readln(b);
   readln(c);
   
   if(a = 'vertebrado')then
   begin
      if(b = 'ave')then
      begin
         if(c = 'carnivoro')then
         begin
            writeln('aguia');
         end
         else if(c = 'onivoro')then
         begin
            writeln('pomba');
         end
      end
      else if(b = 'mamifero')then
      begin
         if(c = 'onivoro')then
         begin
            writeln('homem');
         end
         else if(c = 'herbivoro')then
         begin
            writeln('vaca');
         end
      end
   end
   else if(a = 'invertebrado')then
   begin
      if(b = 'inseto')then
      begin
         if(c = 'hematofago')then
         begin
            writeln('pulga');
         end
         else if(c = 'herbivoro')then
         begin
            writeln('lagarta');
         end
      end 
      else if(b = 'anelideo')then
      begin
         if(c = 'hematofago')then
         begin
            writeln('sanguessuga');
         end
         else if(c = 'onivoro')then
         begin
            writeln('minhoca');
         end
      end
   end
end.
