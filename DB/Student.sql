use Student;
INSERT INTO `Student`.`StudInfo` (`StudentID`, `First_Name`, `Last_Name`) VALUES ('1', 'Henok', 'Wordoffa');
INSERT INTO `Student`.`StudInfo` (`StudentID`, `First_Name`, `Last_Name`) VALUES ('2', 'Raya ', 'Meressa');

select * from StudInfo;
delete from StudInfo where Last_Name = `Java` limit 1;
select * from Nationality;