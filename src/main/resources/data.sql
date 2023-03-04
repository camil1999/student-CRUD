
insert into students
 (name, surname,teacher) values
  ('Vasif' , 'Kerimov','muellim-1'),
  ('Mahir','Orucov','muellim-2'),
   ('İlqar' , 'Yusifov','muellim-3'),
  ('Murtuz','İsgenderov','muellim-4'),
  ('Aysel' , 'Memmedli','muellim-5'),
  ('cemil' , 'memmedov','muellim-6'),
  ('Sevda' , 'Hüseynova','muellim-7');
  


 insert into users
 (username,password,enabled)
 values
 ('muellim-1','{noop}9',1),
 ('muellim-2','{noop}9',1),
 ('muellim-3','{noop}9',1),
 ('muellim-4','{noop}9',1),
 ('muellim-5','{noop}9',1),
 ('muellim-6','{noop}6',1),
 ('muellim-7','{noop}9',1);
 


 insert into authorities
 (username,authority)
 values
 ('muellim-1','teacher'),
 ('muellim-6','teacher'),
 ('muellim-7','teacher'),
 ('muellim-2','teacher'),
 ('muellim-3','teacher'),
 ('muellim-4','teacher'),
 ('muellim-5','teacher');
 
 
 insert into student_note
 (note,student_id)
 values
 ('agilli usaqdir','1'),
 ('oxumur','5'),
 ('Aylığı ödəyib','2'),
 ('Aylığı ödəməyib','3'),
 ('Dərsə davamiyyəti zəifdir','4');
 
 

 
 
 
 
 