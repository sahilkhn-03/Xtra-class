DECLARE 
v_total electricity.total%TYPE;
cursor c is select * from electricity;
begin 
     for i in c loop 
     begin 
     if i.unit <= 40 then
     v_total:= i.rent;
     else if i.unit <= 80 then
     v_total :=i.rent  + (i.unit - 40)*0.40;
     else 
     v_total := i.rent + (40 *.40)+(i.unit -80 )*1.40;
     end if;
     end if;
update electricity
set total = v_total
where cons_id = i.cons_id;
end;
end loop;
commit;
end;
/
