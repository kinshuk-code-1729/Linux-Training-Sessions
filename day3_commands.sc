Script started on 2023-10-18 04:30:22+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="130" LINES="33"]
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F1
-rw-rw-r-- 1 kinshuk kinshuk 0 Oct 18 04:28 F1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+x F1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+x F1[4Pls -l[C[C[C
-rwxrw-r-- 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F1[4@chmod u+x[C[C[C[1P[1@o[C[C[1P F1w F1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod o+w F1[C[4Pls -l[C[C[C[4@chmod u+x[C[C[C[4Pls -l[C[C[C
-rwxrw-rw- 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F1[4@chmod o+w[C[C[C[4Pls -l[C[C[C[4@chmod u+x[C[C[C[1P[1@g[1@o
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod go+x F1[5Pls -l[C[C[C
-rwxrwxrwx 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo-w F1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo-w F1[6Pls -l[C[C[C
-r-xr-xr-x 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F1[6@chmod ugo-w[C[C[C[C[1P[1P[1P[1@a[C[C[1P[1@+
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod a+w F1[4Pls -l[C[C[C
-rwxrwxrwx 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ [H[2J]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F1[4@chmod a+w[C[C[C[1P[1@a[C[1P[1@-
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod a-w F1[4Pls -l[C[C[C
-r-xr-xr-x 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$  chmod [K[K[K[K[K[K[Kchmod go=r F1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod go=r F1[5Pls -l[C[C[C
-r-xr--r-- 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F2
-rw-rw-r-- 1 kinshuk kinshuk 0 Oct 18 04:28 F2
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F21[5@chmod go=r[C[C[C[5Pls -l[C[C[C[4@chmod a-w[C[C[C[4Pls -l[C[C[C[5@chmod go=r[C[C[C[K2
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod go=r F2[5Pls -l[C[C[C
-rw-r--r-- 1 kinshuk kinshuk 0 Oct 18 04:28 F2
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F2[5@chmod go=r[C[C[C[Cx F2[1@u
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo=rx F2[7Pls -l[C[C[C
-r-xr-xr-x 1 kinshuk kinshuk 0 Oct 18 04:28 [0m[01;32mF2[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l
total 8
-r-xr--r-- 1 kinshuk kinshuk    0 Oct 18 04:28 [0m[01;32mF1[0m
-r-xr-xr-x 1 kinshuk kinshuk    0 Oct 18 04:28 [01;32mF2[0m
-rw-rw-r-- 1 kinshuk kinshuk    0 Oct 18 04:28 F3
-rw-rw-r-- 1 kinshuk kinshuk    0 Oct 18 04:28 F4
drwxrwxr-x 2 kinshuk kinshuk 4096 Oct 18 04:28 [01;34mGlobal[0m
-rw-rw-r-- 1 kinshuk kinshuk   26 Oct 18 04:27 Global.txt
-rw-rw-r-- 1 kinshuk kinshuk    0 Oct 18 04:30 day3_commands.sc
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ [K]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l F2[7@chmod ugo=rx[C[C[C[K[K[K[K[K[K[K[K[KGlobal.txt7 Global.txt7 Global.txt7 Global.txt[C Global.txt[1PGlobal.txt[1@ 
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 777 Global.txtls -l[K Global.txt 
-rwxrwxrwx 1 kinshuk kinshuk 26 Oct 18 04:27 [0m[01;32mGlobal.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l Global.txt chmod 777 Global.txt[1P Global.txt[1P Global.txt[1P Global.txt5 Global.txt4 Global.txt7 Global.txt[1P Global.txt1 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 541 Global.txt[3Pls -l Global.txt 
-r-xr----x 1 kinshuk kinshuk 26 Oct 18 04:27 [0m[01;32mGlobal.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l Global.txt chmod 541 Global.txt[C[C[1P Global.txt[1P Global.txt[1P Global.txt0 Global.txt0 Global.txt0 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 000 Global.txt[3Pls -l Global.txt 
---------- 1 kinshuk kinshuk 26 Oct 18 04:27 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ vca[K[K[Kcat Global.txt 
cat: Global.txt: Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l 400 Global.txt 
ls: cannot access '400': No such file or directory
---------- 1 kinshuk kinshuk 26 Oct 18 04:27 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l 400 Global.txt [6Pcat[C[C[C[C[C[C[C[C[C[C[C[C[2@ls -l[C[C[C[C[C[C[C[C[C[C[C[Cchmod 000 Global.txt[C[C[C[C[1P Global.txt[1P Global.txt[1@4[C0 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 400 Global.txtls -l 400 Global.txt [6Pcat[C[C[C[C[C[C[C[C[C[C[C[C[2@ls -l[C[C[C[C[C[C[C[C[C[C[C[C
-r-------- 1 kinshuk kinshuk 26 Oct 18 04:27 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat testfile>testfile testfile[C[C[C[C[C[C[C[C.xtx[K[K[Ktxt
Hello     We are lleameing        earning file pr ermisss ions in linuc x
Its reallt y crazy...
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat > testfile.txt[1P testfile.txt[1Ptestfile.txt[1P testfile.txt[1P testfile.txt[1P testfile.txtl testfile.txts testfile.txt[C testfile.txt- testfile.txtl testfile.txt
-rw-rw-r-- 1 kinshuk kinshuk 62 Oct 18 05:05 testfile.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l testfile.txtcat >[C[C[C[C[C[C[C[C[C[C[C[C[C[1Ptestfile.txt[1Ptestfile.txt
We are learning file permissions in linux
Its really crazy...
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat testfile.txt[2@ls -l[C[C[C[C[C[C[C[C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kchomod [K[K[K[K[Kn[Kmod 000 testfile.txt 
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 000 testfile.txt [7Pat testfile.txt
cat: testfile.txt: Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat testfile.txthmod 000 testfile.txt [C[C[1P[1P[1P[1@u[1@+[1@x
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+x testfile.txt [7Pat testfile.txt
cat: testfile.txt: Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat testfile.txthmod u+x testfile.txt [C[C[C[C[1@r
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+rx testfile.txt [8Pat testfile.txt
We are learning file permissions in linux
Its really crazy...
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat > newfile.txt
1st line
2nd linwe   w  e
3rd linw e
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l newfile.txt 
-rw-rw-r-- 1 kinshuk kinshuk 27 Oct 18 05:08 newfile.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ umask
0002
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l
total 24
-r-xr--r-- 1 kinshuk kinshuk    0 Oct 18 04:28 [0m[01;32mF1[0m
-r-xr-xr-x 1 kinshuk kinshuk    0 Oct 18 04:28 [01;32mF2[0m
-rw-rw-r-- 1 kinshuk kinshuk    0 Oct 18 04:28 F3
-rw-rw-r-- 1 kinshuk kinshuk    0 Oct 18 04:28 F4
drwxrwxr-x 2 kinshuk kinshuk 4096 Oct 18 04:28 [01;34mGlobal[0m
-r-------- 1 kinshuk kinshuk   26 Oct 18 04:27 Global.txt
-rw-rw-r-- 1 kinshuk kinshuk 8192 Oct 18 05:06 day3_commands.sc
-rw-rw-r-- 1 kinshuk kinshuk   27 Oct 18 05:08 newfile.txt
-r-x------ 1 kinshuk kinshuk   62 Oct 18 05:05 [01;32mtestfile.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -lumaskls -ld hello[K[K[K[K[KGlobal
drwxrwxr-x 2 kinshuk kinshuk 4096 Oct 18 04:28 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ umask 0003
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ umask 0003[K[K[K[K[K
0003
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cart[K[Kt > test.xtx[K[K[Ktxt
Something written in new file permission.
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l test.txt 
-rw-rw-r-- 1 kinshuk kinshuk 42 Oct 18 05:13 test.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l test.txt [1Pcat > test.txt[9Pumask 0003[1P3
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ umask 003[K[K[K[K
0003
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ umask 003ls -l test.txt [1Pcat > test.txt[C2.txt
Something written in new file permission.^[[D      here.
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat > test2.txt[10Pumask 003ls -l test.txt [1@2
-rw-rw-r-- 1 kinshuk kinshuk 47 Oct 18 05:16 test2.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ls College[K[K[K[K[K[K[Kglobal[1PlobalGlobal
total 0
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ls Global[C[1P Globald Global
drwxrwxr-x 2 kinshuk kinshuk 4096 Oct 18 04:28 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmiodn[K[K[K[Kod 000 Global
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 000 Global[3Pls -ld[C[C[C[C[C[C[C
d--------- 2 kinshuk kinshuk 4096 Oct 18 04:28 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld Global[K[Kal[1PGlobal[1PGlobal[1PGlobal[1PGlobal
ls: cannot open directory 'Global': Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+r Global
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+r Global[7Pls[C[C[C[C[C[C[C-ld Global
dr-------- 2 kinshuk kinshuk 4096 Oct 18 04:28 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld Global[3@chmod u+r[C[C[C[C[C[C[C[7Pls[C[C[C[C[C[C[C
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls Global[Kls
[0m[01;32mF1[0m  [01;32mF2[0m  F3  F4  [01;34mGlobal[0m  Global.txt  day3_commands.sc  newfile.txt  test.txt  test2.txt  [01;32mtestfile.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ s[Kls Global-ld Global[3@chmod u+r[C[C[C[C[C[C[C[3Pls -ld[C[C[C[C[C[C[C[4PGlobal-ld Global[3@chmod u+r[C[C[C[C[C[C[C[1P Global[1P Global[1P Globala Global+ Globalx Global+ Globalr Global+ Globalw Global
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd g[Kglo[K[K[KGlobal/
]0;kinshuk@Ubuntu-Server-20: ~/Global[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/Global[00m$ touch cat.txt dog.txt rat.txt mice.txt
]0;kinshuk@Ubuntu-Server-20: ~/Global[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/Global[00m$ cd ..
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd ..touch cat.txt dog.txt rat.txt mice.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd Global/[Khmod a+x+r+w Globalls[K Global-ld Global[3@chmod u+r[C[C[C[C[C[C[C[7Pls[C[C[C[C[C[C[C-ld Global[3@chmod 000[C[C[C[C[C[C[C
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 000 Globald ..[Ktouch cat.txt dog.txt rat.txt mice.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd Global/[Khmod a+x+r+w Globalls[K Global-ld Global[4PGlobal
ls: cannot open directory 'Global': Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls Global[7@chmod 000[C[C[C[C[C[C[Cd ..[Ktouch cat.txt dog.txt rat.txt mice.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd Global/[Khmod a+x+r+w Globalls[K Global-ld Global
d--------- 2 kinshuk kinshuk 4096 Oct 18 05:24 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld Global[4PGlobal[7@chmod 000[C[C[C[C[C[C[Cd ..[Ktouch cat.txt dog.txt rat.txt mice.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Ccd Global/[Khmod a+x+r+w Globalls[K Global-ld Global[3@chmod u+r[C[C[C[C[C[C[C
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod u+r Global[3Pls -ld[C[C[C[C[C[C[C
dr-------- 2 kinshuk kinshuk 4096 Oct 18 05:24 [0m[01;34mGlobal[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls Global
ls: cannot access 'Global/mice.txt': Permission denied
ls: cannot access 'Global/cat.txt': Permission denied
ls: cannot access 'Global/rat.txt': Permission denied
ls: cannot access 'Global/dog.txt': Permission denied
cat.txt  dog.txt  mice.txt  rat.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls [K[K[Kmkf[Kdir newdir
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd newdir/
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cat myfile1[C>myfile1 myfile1[C[C[C[C[C[C[C
somet  test  xt .......
another line.....
etc tec     etc...
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ ls -l myfile1 
-rw-rw-r-- 1 kinshuk kinshuk 47 Oct 18 05:26 myfile1
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ ls -l myfile1 [1@d[C[C[C[C[C[C[C[C[C[K[K[K[K[K[K[K[Knewdir
ls: cannot access 'newdir': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ ls -ld newdir[K[K[K[K[K[K[K myfile1 
-rw-rw-r-- 1 kinshuk kinshuk 47 Oct 18 05:26 myfile1
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cd ..
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls ld [1Pcd ..ls -ld myfile1 [2Pnewdir
drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:26 [0m[01;34mnewdir[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod newdir[C newdir4 newdir4 newdir4 newdir
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod 444 newdir[3Pls -ld[C[C[C[C[C[C[C
dr--r--r-- 2 kinshuk kinshuk 4096 Oct 18 05:26 [0m[01;34mnewdir[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd newdir/
bash: cd: newdir/: Permission denied
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo6[K+x new
newdir/      newfile.txt  
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo+x newdir/.[K
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod ugo+x newdir/[9Pd[C[C[C[C[C[C[C[C
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cd ..
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd ..newdir/[9@hmod ugo+x[C[C[C[C[C[C[C[C[9Pd[C[C[C[C[C[C[C[Cls -ld newdir
dr-xr-xr-x 2 kinshuk kinshuk 4096 Oct 18 05:26 [0m[01;34mnewdir[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld newdir[8Pcd ..newdir/
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cat > writefile.xtx[K[K[Ktxt
bash: writefile.txt: Permission denied
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cat > writefile.txt[9Pd newdir/ls -ld newdir[8Pcd ..
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod a+w newdir/
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cd newdir/
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cd newdir/[7@hmod a+w[C[C[C[C[C[C[C[Cd ..[Kat > writefile.txt
file written
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ 
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ ls
myfile1  writefile.txt
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ exit[K[K[K[Kcd ...
bash: cd: ...: No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~/newdir[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~/newdir[00m$ cd ...[K
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ mkdir X1 X1/Y1 X1/Z1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls 
[0m[01;32mF1[0m  [01;32mF2[0m  F3  F4  [01;34mGlobal[0m  Global.txt  [01;34mX1[0m  day3_commands.sc  [34;42mnewdir[0m  newfile.txt  test.txt  test2.txt  [01;32mtestfile.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls X1
[0m[01;34mY1[0m  [01;34mZ1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls X1-X1lX1 X1
total 8
drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [0m[01;34mY1[0m
drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [01;34mZ1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -l X1d X1
drwxrwxr-- 4 kinshuk kinshuk 4096 Oct 18 05:37 [0m[01;34mX1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld X1[1P X1s X1
total 8
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [0m[01;34mY1[0m
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [01;34mZ1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod a-w X1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod a-w X1[3Pls -ls[C[C[Cd[C[C[C[1P X1d X1
dr-xr-xr-- 4 kinshuk kinshuk 4096 Oct 18 05:37 [0m[01;34mX1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld X1[3@chmod a-w[C[C[C[3Pls -ls[C[C[C
total 8
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [0m[01;34mY1[0m
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:37 [01;34mZ1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod [K[K[K[K[K[Kmkdir AB1 AB1/C1 Ab[KB1/D1
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld AB1
drwxrwxr-- 4 kinshuk kinshuk 4096 Oct 18 05:46 [0m[01;34mAB1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld AB1[C[1P AB1s AB1
total 8
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:46 [0m[01;34mC1[0m
4 drwxrwxr-- 2 kinshuk kinshuk 4096 Oct 18 05:46 [01;34mD1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod -R ACC[K[KB1oAB1+AB1wAB1 AB1[C[C[C
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ chmod -R o+w AB1[6Pls -ls[C[C[C[Cd[C[C[C[C
drwxrwxrw- 4 kinshuk kinshuk 4096 Oct 18 05:46 [0m[34;42mAB1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -ld AB1[6@chmod -R o+w[C[C[C[C[6Pls -ls[C[C[C[C
total 8
4 drwxrwxrw- 2 kinshuk kinshuk 4096 Oct 18 05:46 [0m[34;42mC1[0m
4 drwxrwxrw- 2 kinshuk kinshuk 4096 Oct 18 05:46 [34;42mD1[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls >[C >- >a >l >[C[C ls-op[K[K[K_o/p[K[Kp.xtx[K[K[K[K
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls -al > ls_op[Kcsat[K[K[Kat ls_op
total 96
drwxr-xr-x 8 kinshuk kinshuk  4096 Oct 18 05:51 .
drwxr-xr-x 3 root    root     4096 Oct 17 19:08 ..
-rw------- 1 kinshuk kinshuk     5 Oct 17 19:23 .bash_history
-rw-r--r-- 1 kinshuk kinshuk   220 Feb 25  2020 .bash_logout
-rw-r--r-- 1 kinshuk kinshuk  3771 Feb 25  2020 .bashrc
drwx------ 2 kinshuk kinshuk  4096 Oct 17 19:13 .cache
-rw-r--r-- 1 kinshuk kinshuk   807 Feb 25  2020 .profile
drwx------ 2 kinshuk kinshuk  4096 Oct 17 19:08 .ssh
drwxrwxrw- 4 kinshuk kinshuk  4096 Oct 18 05:46 AB1
-r-xr--r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F1
-r-xr-xr-x 1 kinshuk kinshuk     0 Oct 18 04:28 F2
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F3
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F4
dr-------- 2 kinshuk kinshuk  4096 Oct 18 05:24 Global
-r-------- 1 kinshuk kinshuk    26 Oct 18 04:27 Global.txt
dr-xr-xr-- 4 kinshuk kinshuk  4096 Oct 18 05:37 X1
-rw-rw-r-- 1 kinshuk kinshuk 24576 Oct 18 05:47 day3_commands.sc
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 05:51 ls_op
drwxrwxrwx 2 kinshuk kinshuk  4096 Oct 18 05:35 newdir
-rw-rw-r-- 1 kinshuk kinshuk    27 Oct 18 05:08 newfile.txt
-rw-rw-r-- 1 kinshuk kinshuk    42 Oct 18 05:13 test.txt
-rw-rw-r-- 1 kinshuk kinshuk    47 Oct 18 05:16 test2.txt
-r-x------ 1 kinshuk kinshuk    62 Oct 18 05:05 testfile.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat ls_op[5@ls -al >[C[C[C[C[C[C[1P[1P[1P[1P[1Pcat[C[C[C[C[C[C[Kcat ls_op[1@ls >[C[C[C[C[C[C-ls AB1> ls_op> ls_op[C[C[C[C[1P[1P[1@w[1@c[C[1@ [1@l[1P[1@G[1@l[1@o[1@b[1@l[1P[1@a[1@l[1@.[1@x[1@t[1@x[1P[1P[1P[1@t[1@x[1@t
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ wc Global.txt >> ls_op[13Pcat[C[C[C[C[C[C
total 96
drwxr-xr-x 8 kinshuk kinshuk  4096 Oct 18 05:51 .
drwxr-xr-x 3 root    root     4096 Oct 17 19:08 ..
-rw------- 1 kinshuk kinshuk     5 Oct 17 19:23 .bash_history
-rw-r--r-- 1 kinshuk kinshuk   220 Feb 25  2020 .bash_logout
-rw-r--r-- 1 kinshuk kinshuk  3771 Feb 25  2020 .bashrc
drwx------ 2 kinshuk kinshuk  4096 Oct 17 19:13 .cache
-rw-r--r-- 1 kinshuk kinshuk   807 Feb 25  2020 .profile
drwx------ 2 kinshuk kinshuk  4096 Oct 17 19:08 .ssh
drwxrwxrw- 4 kinshuk kinshuk  4096 Oct 18 05:46 AB1
-r-xr--r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F1
-r-xr-xr-x 1 kinshuk kinshuk     0 Oct 18 04:28 F2
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F3
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 04:28 F4
dr-------- 2 kinshuk kinshuk  4096 Oct 18 05:24 Global
-r-------- 1 kinshuk kinshuk    26 Oct 18 04:27 Global.txt
dr-xr-xr-- 4 kinshuk kinshuk  4096 Oct 18 05:37 X1
-rw-rw-r-- 1 kinshuk kinshuk 24576 Oct 18 05:47 day3_commands.sc
-rw-rw-r-- 1 kinshuk kinshuk     0 Oct 18 05:51 ls_op
drwxrwxrwx 2 kinshuk kinshuk  4096 Oct 18 05:35 newdir
-rw-rw-r-- 1 kinshuk kinshuk    27 Oct 18 05:08 newfile.txt
-rw-rw-r-- 1 kinshuk kinshuk    42 Oct 18 05:13 test.txt
-rw-rw-r-- 1 kinshuk kinshuk    47 Oct 18 05:16 test2.txt
-r-x------ 1 kinshuk kinshuk    62 Oct 18 05:05 testfile.txt
 1  6 26 Global.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat Gloq[Kbal.txt 
Hello this is a text file
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat Global.txt [6Pls_op[13@wc Global.txt >>[C[C[C[C[C[C[C[1P ls_op[C[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1P[1@l[1@s
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls > ls_opcat Global.txt [6Pls_op[13@wc Global.txt >>[C[C[C[C[C[C[13Pcat[C[C[C[C[C[C
AB1
F1
F2
F3
F4
Global
Global.txt
X1
day3_commands.sc
ls_op
newdir
newfile.txt
test.txt
test2.txt
testfile.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls
[0m[34;42mAB1[0m  [01;32mF2[0m  F4      Global.txt  day3_commands.sc  [34;42mnewdir[0m       test.txt   [01;32mtestfile.txt[0m
[01;32mF1[0m   F3  [01;34mGlobal[0m  [01;34mX1[0m          ls_op             newfile.txt  test2.txt
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls F[0-9][K[K[K[K[K[K[K t?
ls: cannot access 't?': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls t?[K*
test.txt  test2.txt  [0m[01;32mtestfile.txt[0m
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls f[0-9][1P[0-9]F[0-9]
[0m[01;32mF1[0m  [01;32mF2[0m  F3  F4
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls F[0-9][1P][1P][1P]a]-]z][C
ls: cannot access 'F[a-z]': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls F[a-z]0-9]10-9][1P0-9]!0-9]
ls: cannot access 'F[!0-9]': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ touch[K[K[K[K[Kls tet[Kst[!0-9]
ls: cannot access 'test[!0-9]': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls test[!0-9][C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[Ktouch Rishit[K[K[K[K[K[KFilea file[K[K[K[K[K Fileb
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ touch Filea Fileb[4Pls test[!0-9][1P[!0-9][1P[!0-9][1P[!0-9][1P[!0-9]F[!0-9]i[!0-9]l[!0-9]e[!0-9]
Filea  Fileb
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls File[!0-9][1P0-9]
ls: cannot access 'File[0-9]': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls File[0-9][1P][1P][1P]a]-]z]
Filea  Fileb
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls File[a-z]!a-z]
ls: cannot access 'File[!a-z]': No such file or directory
]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ exit
exit

Script done on 2023-10-18 06:08:01+00:00 [COMMAND_EXIT_CODE="2"]
