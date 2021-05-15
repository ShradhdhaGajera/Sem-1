1. Show all parts located at Londan city.

	select * from p where p_city="London";
    
    
    
    
    
    
    
2. Show maximum weight part name.

	select pname from p where weight = (select max(weight) from p);
    
    
    
    
3. Show all parts name , part number for part color = Red.

	select pname,pno from p where color="Red";
    
    
    
4. Show suppler name , suppler city who supply part qty more then 200.

	select sname,s_city from s,sp where s.sno = sp.sno and sp.qty > 200;
    
    
5. Show second highest weight.

	select max(weight) from p where weight < (select max(weight) from p);
    
    
    
6. Show suppler no and qty for part supply for highest weight part.

	select sp.sno,sp.qty from sp,p where sp.pno = p.pno and p.weight = (select max(weight) from p);
    
    
    
7. Show suppler name and qty for part color is "Red" supply.

	select s.sname,sp.qty from sp,s,p where p.color = "Red" and sp.pno = p.pno and sp.sno = s.sno;
    
    
8. Show suppler name , part city and qty for suppler status is less then 30 shipment supply.

	select s.sname,p.p_city,sp.qty from s,p,sp where sp.pno = p.pno and sp.sno = s.sno and s.s_status < 30;
    
    
    
    
    
9. Show each suppers total qty supply.

	select s.sname, sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno;
    
    
    
    
10. Show each parts total qty supply.

	select sp.pno, p.pname,sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pno;
    
    
    
11. Show each part anmes total qty supply.

	select p.pname,sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pname;
    
    
    
    
    
12. Show each suppers whose suppler number is less then 's4' give total qty supply by each suppler.

	select s.sname,s.sno,sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno having sp.sno < "s4";
    
    
    
    
    
    
    
    
13. Show each suppers whose suppler status is 20 give total qty supply by each suppler.

	select s.sname,s.sno,sum(sp.qty) from sp,s where sp.sno = s.sno and s.s_status = 20 group by sp.sno;