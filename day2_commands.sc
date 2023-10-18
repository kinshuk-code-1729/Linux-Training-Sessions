Script started on 2023-10-17 04:45:53+00:00 [TERM="linux" TTY="/dev/pts/0" COLUMNS="158" LINES="47"]
To run a command as administrator (user "root"), use "sudo <command>".
See "man sudo_root" for details.

devasc-VM@Ubuntu-Day2:~$ man ls
LS(1)                                                                  User Commands                                                                 LS(1)[m
[m
[1mNAME[m[m
       ls - list directory contents[m
[m
[1mSYNOPSIS[m[m
       [1mls[m [[4mOPTION[24m]... [[4mFILE[24m]...[m
[m
[1mDESCRIPTION[m[m
       List information about the FILEs (the current directory by default).  Sort entries alphabetically if none of [1m-cftuvSUX[m nor [1m--sort[m is specified.[m
[m
       Mandatory arguments to long options are mandatory for short options too.[m
[m
       [1m-a[m, [1m--all[m[m
              do not ignore entries starting with .[m
[m
       [1m-A[m, [1m--almost-all[m[m
              do not list implied . and ..[m
[m
       [1m--author[m[m
              with [1m-l[m, print the author of each file[m
[m
       [1m-b[m, [1m--escape[m[m
              print C-style escapes for nongraphic characters[m
[m
       [1m--block-size[m=[4mSIZE[24m[m
              with [1m-l[m, scale sizes by SIZE when printing them; e.g., '--block-size=M'; see SIZE format below[m
[m
       [1m-B[m, [1m--ignore-backups[m[m
              do not list implied entries ending with ~[m
[m
       [1m-c[m     with  [1m-lt[m: sort by, and show, ctime (time of last modification of file status information); with [1m-l[m: show ctime and sort by name; otherwise:[m
              sort by ctime, newest first[m
[m
       [1m-C[m     list entries by columns[m
[m
       [1m--color[m[=[4mWHEN[24m][m
              colorize the output; WHEN can be 'always' (default if omitted), 'auto', or 'never'; more info below[m
[m
       [1m-d[m, [1m--directory[m[m
              list directories themselves, not their contents[m
[m
       [1m-D[m, [1m--dired[m[m
              generate output designed for Emacs' dired mode[m
[m
       [1m-f[m     do not sort, enable [1m-aU[m, disable [1m-ls[m [1m--color[m[m
[7m Manual page ls(1) line 1 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 2 (press h for help or q to quit)[27m[K[K       [1m-F[m, [1m--classify[m[m
[7m Manual page ls(1) line 3 (press h for help or q to quit)[27m[K[K              append indicator (one of */=>@|) to entries[m
[7m Manual page ls(1) line 4 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 5 (press h for help or q to quit)[27m[K[K       [1m--file-type[m[m
[7m Manual page ls(1) line 6 (press h for help or q to quit)[27m[K[K              likewise, except do not append '*'[m
[7m Manual page ls(1) line 7 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 8 (press h for help or q to quit)[27m[K[K       [1m--format[m=[4mWORD[24m[m
[7m Manual page ls(1) line 9 (press h for help or q to quit)[27m[K[K              across [1m-x[m, commas [1m-m[m, horizontal [1m-x[m, long [1m-l[m, single-column [1m-1[m, verbose [1m-l[m, vertical [1m-C[m[m
[7m Manual page ls(1) line 10 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 11 (press h for help or q to quit)[27m[K[K       [1m--full-time[m[m
[7m Manual page ls(1) line 12 (press h for help or q to quit)[27m[K[K              like [1m-l[m [1m--time-style[m=[4mfull-iso[24m[m
[7m Manual page ls(1) line 13 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 14 (press h for help or q to quit)[27m[K[K       [1m-g[m     like [1m-l[m, but do not list owner[m
[7m Manual page ls(1) line 15 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 16 (press h for help or q to quit)[27m[K[K       [1m--group-directories-first[m[m
[7m Manual page ls(1) line 17 (press h for help or q to quit)[27m[K[K              group directories before files;[m
[7m Manual page ls(1) line 18 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 19 (press h for help or q to quit)[27m[K[K              can be augmented with a [1m--sort[m option, but any use of [1m--sort[m=[4mnone[24m ([1m-U[m) disables grouping[m
[7m Manual page ls(1) line 20 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 21 (press h for help or q to quit)[27m[K[K       [1m-G[m, [1m--no-group[m[m
[7m Manual page ls(1) line 22 (press h for help or q to quit)[27m[K[K              in a long listing, don't print group names[m
[7m Manual page ls(1) line 23 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 24 (press h for help or q to quit)[27m[K[K       [1m-h[m, [1m--human-readable[m[m
[7m Manual page ls(1) line 25 (press h for help or q to quit)[27m[K[K              with [1m-l[m and [1m-s[m, print sizes like 1K 234M 2G etc.[m
[7m Manual page ls(1) line 26 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 27 (press h for help or q to quit)[27m[K[K       [1m--si[m   likewise, but use powers of 1000 not 1024[m
[7m Manual page ls(1) line 28 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 29 (press h for help or q to quit)[27m[K[K       [1m-H[m, [1m--dereference-command-line[m[m
[7m Manual page ls(1) line 30 (press h for help or q to quit)[27m[K[K              follow symbolic links listed on the command line[m
[7m Manual page ls(1) line 31 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 32 (press h for help or q to quit)[27m[K[K       [1m--dereference-command-line-symlink-to-dir[m[m
[7m Manual page ls(1) line 33 (press h for help or q to quit)[27m[K[K              follow each command line symbolic link[m
[7m Manual page ls(1) line 34 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 35 (press h for help or q to quit)[27m[K[K              that points to a directory[m
[7m Manual page ls(1) line 36 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 37 (press h for help or q to quit)[27m[K[K       [1m--hide[m=[4mPATTERN[24m[m
[7m Manual page ls(1) line 38 (press h for help or q to quit)[27m[K[K              do not list implied entries matching shell PATTERN (overridden by [1m-a[m or [1m-A[m)[m
[7m Manual page ls(1) line 39 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 40 (press h for help or q to quit)[27m[K[K       [1m--hyperlink[m[=[4mWHEN[24m][m
[7m Manual page ls(1) line 41 (press h for help or q to quit)[27m[K[K              hyperlink file names; WHEN can be 'always' (default if omitted), 'auto', or 'never'[m
[7m Manual page ls(1) line 42 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 43 (press h for help or q to quit)[27m[K[K       [1m--indicator-style[m=[4mWORD[24m[m
[7m Manual page ls(1) line 44 (press h for help or q to quit)[27m[K[K              append indicator with style WORD to entry names: none (default), slash ([1m-p[m), file-type ([1m--file-type[m), classify ([1m-F[m)[m
[7m Manual page ls(1) line 45 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 46 (press h for help or q to quit)[27m[K[K       [1m-i[m, [1m--inode[m[m
[7m Manual page ls(1) line 47 (press h for help or q to quit)[27m[K[K              print the index number of each file[m
[7m Manual page ls(1) line 48 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 49 (press h for help or q to quit)[27m[K[K       [1m-I[m, [1m--ignore[m=[4mPATTERN[24m[m
[7m Manual page ls(1) line 50 (press h for help or q to quit)[27m[K[K              do not list implied entries matching shell PATTERN[m
[7m Manual page ls(1) line 51 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 52 (press h for help or q to quit)[27m[K[K       [1m-k[m, [1m--kibibytes[m[m
[7m Manual page ls(1) line 53 (press h for help or q to quit)[27m[K[K              default to 1024-byte blocks for disk usage; used only with [1m-s[m and per directory totals[m
[7m Manual page ls(1) line 54 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 55 (press h for help or q to quit)[27m[K[K       [1m-l[m     use a long listing format[m
[7m Manual page ls(1) line 56 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 57 (press h for help or q to quit)[27m[K[K       [1m-L[m, [1m--dereference[m[m
[7m Manual page ls(1) line 58 (press h for help or q to quit)[27m[K[K              when showing file information for a symbolic link, show information for the file the link references rather than for the link itself[m
[7m Manual page ls(1) line 59 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 60 (press h for help or q to quit)[27m[K[K       [1m-m[m     fill width with a comma separated list of entries[m
[7m Manual page ls(1) line 61 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 62 (press h for help or q to quit)[27m[K[K       [1m-n[m, [1m--numeric-uid-gid[m[m
[7m Manual page ls(1) line 63 (press h for help or q to quit)[27m[K[K              like [1m-l[m, but list numeric user and group IDs[m
[7m Manual page ls(1) line 64 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 65 (press h for help or q to quit)[27m[K[K       [1m-N[m, [1m--literal[m[m
[7m Manual page ls(1) line 66 (press h for help or q to quit)[27m[K[K              print entry names without quoting[m
[7m Manual page ls(1) line 67 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 68 (press h for help or q to quit)[27m[K[K       [1m-o[m     like [1m-l[m, but do not list group information[m
[7m Manual page ls(1) line 69 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 70 (press h for help or q to quit)[27m[K[K       [1m-p[m, [1m--indicator-style[m=[4mslash[24m[m
[7m Manual page ls(1) line 71 (press h for help or q to quit)[27m[K[K              append / indicator to directories[m
[7m Manual page ls(1) line 72 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 73 (press h for help or q to quit)[27m[K[K       [1m-q[m, [1m--hide-control-chars[m[m
[7m Manual page ls(1) line 74 (press h for help or q to quit)[27m[K[K              print ? instead of nongraphic characters[m
[7m Manual page ls(1) line 75 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 76 (press h for help or q to quit)[27m[K[K       [1m--show-control-chars[m[m
[7m Manual page ls(1) line 77 (press h for help or q to quit)[27m[K[K              show nongraphic characters as-is (the default, unless program is 'ls' and output is a terminal)[m
[7m Manual page ls(1) line 78 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 79 (press h for help or q to quit)[27m[K[K       [1m-Q[m, [1m--quote-name[m[m
[7m Manual page ls(1) line 80 (press h for help or q to quit)[27m[K[K              enclose entry names in double quotes[m
[7m Manual page ls(1) line 81 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 82 (press h for help or q to quit)[27m[K[K       [1m--quoting-style[m=[4mWORD[24m[m
[7m Manual page ls(1) line 83 (press h for help or q to quit)[27m[K[K              use quoting style WORD for entry names: literal, locale, shell, shell-always, shell-escape, shell-escape-always, c, escape (overrides  QUOT‐[m
[7m Manual page ls(1) line 84 (press h for help or q to quit)[27m[K[K              ING_STYLE environment variable)[m
[7m Manual page ls(1) line 85 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 86 (press h for help or q to quit)[27m[K[K       [1m-r[m, [1m--reverse[m[m
[7m Manual page ls(1) line 87 (press h for help or q to quit)[27m[K[K              reverse order while sorting[m
[7m Manual page ls(1) line 88 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 89 (press h for help or q to quit)[27m[K[K       [1m-R[m, [1m--recursive[m[m
[7m Manual page ls(1) line 90 (press h for help or q to quit)[27m[K[K              list subdirectories recursively[m
[7m Manual page ls(1) line 91 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 92 (press h for help or q to quit)[27m[K[K       [1m-s[m, [1m--size[m[m
[7m Manual page ls(1) line 93 (press h for help or q to quit)[27m[K[K              print the allocated size of each file, in blocks[m
[7m Manual page ls(1) line 94 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 95 (press h for help or q to quit)[27m[K[K       [1m-S[m     sort by file size, largest first[m
[7m Manual page ls(1) line 96 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 97 (press h for help or q to quit)[27m[K[K       [1m--sort[m=[4mWORD[24m[m
[7m Manual page ls(1) line 98 (press h for help or q to quit)[27m[K[K              sort by WORD instead of name: none ([1m-U[m), size ([1m-S[m), time ([1m-t[m), version ([1m-v[m), extension ([1m-X[m)[m
[7m Manual page ls(1) line 99 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 100 (press h for help or q to quit)[27m[K[K       [1m--time[m=[4mWORD[24m[m
[7m Manual page ls(1) line 101 (press h for help or q to quit)[27m[K[K              with  [1m-l[m, show time as WORD instead of default modification time: atime or access or use ([1m-u[m); ctime or status ([1m-c[m); also use specified time[m
[7m Manual page ls(1) line 102 (press h for help or q to quit)[27m[K[K              as sort key if [1m--sort[m=[4mtime[24m (newest first)[m
[7m Manual page ls(1) line 103 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 104 (press h for help or q to quit)[27m[K[K       [1m--time-style[m=[4mTIME_STYLE[24m[m
[7m Manual page ls(1) line 105 (press h for help or q to quit)[27m[K[K              time/date format with [1m-l[m; see TIME_STYLE below[m
[7m Manual page ls(1) line 106 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 107 (press h for help or q to quit)[27m[K[K       [1m-t[m     sort by modification time, newest first[m
[7m Manual page ls(1) line 108 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 109 (press h for help or q to quit)[27m[K[K       [1m-T[m, [1m--tabsize[m=[4mCOLS[24m[m
[7m Manual page ls(1) line 110 (press h for help or q to quit)[27m[K[K              assume tab stops at each COLS instead of 8[m
[7m Manual page ls(1) line 111 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 112 (press h for help or q to quit)[27m[K[K       [1m-u[m     with [1m-lt[m: sort by, and show, access time; with [1m-l[m: show access time and sort by name; otherwise: sort by access time, newest first[m
[7m Manual page ls(1) line 113 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 114 (press h for help or q to quit)[27m[K[K       [1m-U[m     do not sort; list entries in directory order[m
[7m Manual page ls(1) line 115 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 116 (press h for help or q to quit)[27m[K[K       [1m-v[m     natural sort of (version) numbers within text[m
[7m Manual page ls(1) line 117 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 118 (press h for help or q to quit)[27m[K[K       [1m-w[m, [1m--width[m=[4mCOLS[24m[m
[7m Manual page ls(1) line 119 (press h for help or q to quit)[27m[K[K              set output width to COLS.  0 means no limit[m
[7m Manual page ls(1) line 120 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 121 (press h for help or q to quit)[27m[K[K       [1m-x[m     list entries by lines instead of by columns[m
[7m Manual page ls(1) line 122 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 123 (press h for help or q to quit)[27m[K[K       [1m-X[m     sort alphabetically by entry extension[m
[7m Manual page ls(1) line 124 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 125 (press h for help or q to quit)[27m[K[K       [1m-Z[m, [1m--context[m[m
[7m Manual page ls(1) line 126 (press h for help or q to quit)[27m[K[K              print any security context of each file[m
[7m Manual page ls(1) line 127 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 128 (press h for help or q to quit)[27m[K[K       [1m-1[m     list one file per line.  Avoid '\n' with [1m-q[m or [1m-b[m[m
[7m Manual page ls(1) line 129 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 130 (press h for help or q to quit)[27m[K[K       [1m--help[m display this help and exit[m
[7m Manual page ls(1) line 131 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 132 (press h for help or q to quit)[27m[K[K       [1m--version[m[m
[7m Manual page ls(1) line 133 (press h for help or q to quit)[27m[K[K              output version information and exit[m
[7m Manual page ls(1) line 134 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 135 (press h for help or q to quit)[27m[K[K       The SIZE argument is an integer and optional unit (example: 10K is 10*1024).  Units are K,M,G,T,P,E,Z,Y (powers of 1024) or  KB,MB,...  (powers  of[m
[7m Manual page ls(1) line 136 (press h for help or q to quit)[27m[K[K       1000).[m
[7m Manual page ls(1) line 137 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 138 (press h for help or q to quit)[27m[K[K       The  TIME_STYLE  argument  can  be  full-iso, long-iso, iso, locale, or +FORMAT.  FORMAT is interpreted like in date(1).  If FORMAT is FORMAT1<new‐[m
[7m Manual page ls(1) line 139 (press h for help or q to quit)[27m[K[K       line>FORMAT2, then FORMAT1 applies to non-recent files and FORMAT2 to recent files.  TIME_STYLE prefixed with 'posix-' takes  effect  only  outside[m
[7m Manual page ls(1) line 140 (press h for help or q to quit)[27m[K[K       the POSIX locale.  Also the TIME_STYLE environment variable sets the default style to use.[m
[7m Manual page ls(1) line 141 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 142 (press h for help or q to quit)[27m[K[K       Using  color to distinguish file types is disabled both by default and with [1m--color[m=[4mnever[24m.  With [1m--color[m=[4mauto[24m, ls emits color codes only when stan‐[m
[7m Manual page ls(1) line 143 (press h for help or q to quit)[27m[K[K       dard output is connected to a terminal.  The LS_COLORS environment variable can change the settings.  Use the dircolors command to set it.[m
[7m Manual page ls(1) line 144 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 145 (press h for help or q to quit)[27m[K[K   [1mExit[m [1mstatus:[m[m
[7m Manual page ls(1) line 146 (press h for help or q to quit)[27m[K[K       0      if OK,[m
[7m Manual page ls(1) line 147 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 148 (press h for help or q to quit)[27m[K[K       1      if minor problems (e.g., cannot access subdirectory),[m
[7m Manual page ls(1) line 149 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 150 (press h for help or q to quit)[27m[K[K       2      if serious trouble (e.g., cannot access command-line argument).[m
[7m Manual page ls(1) line 151 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 152 (press h for help or q to quit)[27m[K[K[1mAUTHOR[m[m
[7m Manual page ls(1) line 153 (press h for help or q to quit)[27m[K[K       Written by Richard M. Stallman and David MacKenzie.[m
[7m Manual page ls(1) line 154 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 155 (press h for help or q to quit)[27m[K[K[1mREPORTING[m [1mBUGS[m[m
[7m Manual page ls(1) line 156 (press h for help or q to quit)[27m[K[K       GNU coreutils online help: <https://www.gnu.org/software/coreutils/>[m
[7m Manual page ls(1) line 157 (press h for help or q to quit)[27m[K[K       Report ls translation bugs to <https://translationproject.org/team/>[m
[7m Manual page ls(1) line 158 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 159 (press h for help or q to quit)[27m[K[K[1mCOPYRIGHT[m[m
[7m Manual page ls(1) line 160 (press h for help or q to quit)[27m[K[K       Copyright © 2018 Free Software Foundation, Inc.  License GPLv3+: GNU GPL version 3 or later <https://gnu.org/licenses/gpl.html>.[m
[7m Manual page ls(1) line 161 (press h for help or q to quit)[27m[K[K       This is free software: you are free to change and redistribute it.  There is NO WARRANTY, to the extent permitted by law.[m
[7m Manual page ls(1) line 162 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 163 (press h for help or q to quit)[27m[K[K[1mSEE[m [1mALSO[m[m
[7m Manual page ls(1) line 164 (press h for help or q to quit)[27m[K[K       Full documentation at: <https://www.gnu.org/software/coreutils/ls>[m
[7m Manual page ls(1) line 165 (press h for help or q to quit)[27m[K[K       or available locally via: info '(coreutils) ls invocation'[m
[7m Manual page ls(1) line 166 (press h for help or q to quit)[27m[K[K[m
[7m Manual page ls(1) line 167 (press h for help or q to quit)[27m[K[KGNU coreutils 8.30                                                    September 2019                                                                 LS(1)[m
[7m Manual page ls(1) line 168 (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[K[K[7m Manual page ls(1) line 168/213 (END) (press h for help or q to quit)[27m[K[Kdevasc-VM@Ubuntu-Day2:~$ ls -author
total 48K
-rw-r--r-- 1 devasc-VM  220 Aug 31 21:39 .bash_logout
drwx------ 2 devasc-VM 4.0K Oct 17 04:32 [0m[01;34m.ssh[0m
drwxr-xr-x 3 root      4.0K Oct 17 04:32 [01;34m..[0m
drwx------ 2 devasc-VM 4.0K Oct 17 04:34 [01;34m.cache[0m
-rw-r--r-- 1 devasc-VM  807 Oct 17 04:34 .profile
-rw-r--r-- 1 devasc-VM 3.7K Oct 17 04:34 .bashrc
-rw-rw-r-- 1 devasc-VM  20K Oct 17 04:45 day2_commands.sc
drwxr-xr-x 4 devasc-VM 4.0K Oct 17 04:46 [01;34m.[0m
devasc-VM@Ubuntu-Day2:~$ ls -author[K[K[K[K[K
[0m[01;34m.[0m  [01;34m..[0m  .bash_logout  .bashrc  [01;34m.cache[0m  .profile  [01;34m.ssh[0m  day2_commands.sc
devasc-VM@Ubuntu-Day2:~$ ls -a[Kc
day2_commands.sc
devasc-VM@Ubuntu-Day2:~$ ls -c[K
ls: cannot access '-': No such file or directory
devasc-VM@Ubuntu-Day2:~$ c[Kls -C
day2_commands.sc
devasc-VM@Ubuntu-Day2:~$ ls -C[Kl
total 24
-rw-rw-r-- 1 devasc-VM devasc-VM 24576 Oct 17 04:46 day2_commands.sc
devasc-VM@Ubuntu-Day2:~$ cat ?? [K[K[K> hello/[K.txt
hello from cat command
devasc-VM@Ubuntu-Day2:~$ cat > hello.txt2.txt[C[C[C[C
^[[A^[[A        new file content
Kinshukdevasc-VM@Ubuntu-Day2:~$ cat hello.txt 
hello from cat command
devasc-VM@Ubuntu-Day2:~$ cat hello.txt [1@2
new file content
Kinshukdevasc-VM@Ubuntu-Day2:~$ cat hello2.txt [1@>
Updated new file
devasc-VM@Ubuntu-Day2:~$ cat >hello2.txt [1P[C[C[C[C[C[C[C[C[C[C[C
Updated new file
devasc-VM@Ubuntu-Day2:~$ cat hello2.txt [1@>[C[C[C[C[C[C[C[C[C[C[C[1P[C[C[C[C[C[C[C[C[C[C[C[1P[C[C[C[C[C> hello2.txt[1P.txt[10Pls -lcat > hello.txt> hello.txt[C[C[C[C[C[C[C[C[C[C
updated heelo      ello file
devasc-VM@Ubuntu-Day2:~$ cat >> hello.txt[1Phello.txt[1Phello.txt[1Phello.txt[1Phello.txt hello.txt
hello from cat command
updated hello file
devasc-VM@Ubuntu-Day2:~$ mkdir Global
devasc-VM@Ubuntu-Day2:~$ cp hello.txt Global/
devasc-VM@Ubuntu-Day2:~$ ls Global/
hello.txt
devasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ ls Global/[10@cp hello.txt[C[C[C[C[C[C[C[C[K[K[K[K[K[K[Kheo[Kllo[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kls
[0m[01;34mGlobal[0m  day2_commands.sc  hello.txt  hello2.txt
devasc-VM@Ubuntu-Day2:~$ touch [K[K[K[K[K[Kcat hello >[K[K[K[K[K[K[K> hello3.txt
Sajoy is usng     sing DEVASC lab VM  linux.
devasc-VM@Ubuntu-Day2:~$ cat > hello3.txtls[K Global/[10@cp hello.txt[C[C[C[C[C[C[C[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kmkf[Kdir College f[KDownlads[12Pls Global/[Kcat > hello3.txt[Kcat > hello3.txt[Kmkdir Downmloads[C[1Ploads[C[C[C[C[C colge[K[K[K[K[KCollege 
devasc-VM@Ubuntu-Day2:~$ mkdir Downloads College [8Pcat > hello3.txtls[K Global/mkdir College Downlads[10PGlobalcat hello.txt[1Pmkdir GlobalCollege Downlads[12Pls Global/[Kcat > hello3.txtmkdir Downloads College [Kmkdir Downloads College [8Pcat > hello3.txtls[K Global/mkdir College Downlads[10PGlobalcat hello.txt>> hello.txt[1Phello2.txt >> hello.txt[1Phello2.txt [1@>[C[C[C[C[C[C[C[C[C[C[C[1P[C[C[C[C[C[C[C[C[C[C[C[1P[C[C[C[C[C[1@2[C[C[C[C[C[1@>[C[C[C[C[C[C[C[C[C[C[C[1P[C[C[C[C[C[C[C[C[C[C[C>> hello.txt[3Phello.txt[1Pmkdir GlobalCollege Downlads[12Pls Global/[Kcat > hello3.txtmkdir Downloads College [Kcp hello2.txt hello3.txt College
devasc-VM@Ubuntu-Day2:~$ ls College/
hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~$ cp -r College [K[K[K[K[K[K[K[KCollege Downloads
devasc-VM@Ubuntu-Day2:~$ ls Downloads/
[0m[01;34mCollege[0m
devasc-VM@Ubuntu-Day2:~$ ls Downloads/College/\[K
hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~$ ls
[0m[01;34mCollege[0m  [01;34mDownloads[0m  [01;34mGlobal[0m  day2_commands.sc  hello.txt  hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~$ mv hello.txt College/
devasc-VM@Ubuntu-Day2:~$ mv hello.txt College/ls[K
[0m[01;34mCollege[0m  [01;34mDownloads[0m  [01;34mGlobal[0m  day2_commands.sc  hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~$ ls co[K[KCollege/
hello.txt  hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~$ mv hello3.txt sajoy.txt
devasc-VM@Ubuntu-Day2:~$ mv hello3.txt sajoy.txt[12Pls College/[K[K[K[K[K[K[K[K[K
[0m[01;34mCollege[0m  [01;34mDownloads[0m  [01;34mGlobal[0m  day2_commands.sc  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ .cat sajoy.txt 

Command '.cat' not found, but there are 17 similar ones.

devasc-VM@Ubuntu-Day2:~$ .cat sajoy.txt [1P
Sajoy is using DEVASC lab VM  linux.
devasc-VM@Ubuntu-Day2:~$ ls
[0m[01;34mCollege[0m  [01;34mDownloads[0m  [01;34mGlobal[0m  day2_commands.sc  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ cd College/
devasc-VM@Ubuntu-Day2:~/College$ MC [K[K[KMV [K[K[KMV [K[K[Kmc[Kv hello.txt 
mv: missing destination file operand after 'hello.txt'
Try 'mv --help' for more information.
devasc-VM@Ubuntu-Day2:~/College$ mv hello.txt ..
devasc-VM@Ubuntu-Day2:~/College$ ls
hello2.txt  hello3.txt
devasc-VM@Ubuntu-Day2:~/College$ cd ..
devasc-VM@Ubuntu-Day2:~$ ls
[0m[01;34mCollege[0m  [01;34mDownloads[0m  [01;34mGlobal[0m  day2_commands.sc  hello.txt  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ filr [K[Ke day2_commands.sc 
day2_commands.sc: data
devasc-VM@Ubuntu-Day2:~$ file day2_commands.sc [K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Ksajoy.txt 
sajoy.txt: ASCII text
devasc-VM@Ubuntu-Day2:~$ file sajoy.txt [K[K[K[K[K[K[K[K[K[KGlobal
Global: directory
devasc-VM@Ubuntu-Day2:~$ c[Kcat sandeep.py[K[K[K[K[K[K[K[K[K[Khello.py
cat: hello.py: No such file or directory
devasc-VM@Ubuntu-Day2:~$ cat hello.py[C hello.py> hello.py[C[C[C[C[C[C[C[C[C
pru u  rint("Hello from Python")
devasc-VM@Ubuntu-Day2:~$ file f[Khello.py 
hello.py: ASCII text
devasc-VM@Ubuntu-Day2:~$ cat > File1
thi     this      This is the 2nd day of Linux traninig      aining
Sajoy is helphing      ing me
Missing Bipin here with us
devasc-VM@Ubuntu-Day2:~$ wc f[Kf[KFile1 
 3 17 85 File1
devasc-VM@Ubuntu-Day2:~$ wc File1 [1@-[1@l[1@ [Kdevasc-VM@Ubuntu-Day2:~$ wc -l File1 
3 File1
devasc-VM@Ubuntu-Day2:~$ wc -l File1 [1P[1@w
17 File1
devasc-VM@Ubuntu-Day2:~$ wc -w File1 [C[1P[1@c
85 File1
devasc-VM@Ubuntu-Day2:~$ wc -c File1 [1P[1@m
85 File1
devasc-VM@Ubuntu-Day2:~$ wc -m File1 [1P[1@L
37 File1
devasc-VM@Ubuntu-Day2:~$ cat F1.xt[K[Ktxt
cat: F1.txt: No such file or directory
devasc-VM@Ubuntu-Day2:~$ cat F1.txt>F1.txt
This is a text file.
devasc-VM@Ubuntu-Day2:~$ cat >F1.txt[1PF1.txt>F1.txt[C[C[1P.txt2.txt
This is a tet    ext file.
devasc-VM@Ubuntu-Day2:~$ cat >F2.txt[1P.txt3.txt
This   is an audipo  o file.
devasc-VM@Ubuntu-Day2:~$ cmp F1.xtxt [K[K[K[K[K[K.txt f2.txt[K[K[K[K[KF2.txt[1PF2.txt[C[C[C[C[C[C
devasc-VM@Ubuntu-Day2:~$ cmp F1.txt F2.txt[1P.txt3.txt
F1.txt F3.txt differ: byte 10, line 1
devasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [H[Jdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ cat > [Kteam^?[K[K[K[K[Kmem[K[K[K[KMem[K[K[K[K > Members.txt
Kinshuk
kirti     Kirti
Kratika
Kshitz iz
muskan^[[D^[[D              Muskan
sajoy     Sajoy
devasc-VM@Ubuntu-Day2:~$ cat > Friends [K.txt
Bipin
kin   Kinshuk
Kshitiz
Koushki
Sajoy
Sandeep       sandee      sandee      sandeep       Sandeep
devasc-VM@Ubuntu-Day2:~$ comm Members.txt f[KF
F1.txt       F2.txt       F3.txt       File1        Friends.txt  
devasc-VM@Ubuntu-Day2:~$ comm Members.txt Friends.txt 
	Bipin
		Kinshuk
Kirti
Kratika
		Kshitiz
comm: file 2 is not in sorted order
	Koushki
Muskan
		Sajoy
	Sandeep
devasc-VM@Ubuntu-Day2:~$ comm Members.txt Friends.txt [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[12Pat > Friends.txtMembers.txtFriends.txt
Bipin
Kinshuk
Koushkki  i
Kshitiz
Sandeep
Sajoy
devasc-VM@Ubuntu-Day2:~$ cat > Friends.txtomm Members.txt Friends.txt 
	Bipin
		Kinshuk
Kirti
	Koushki
Kratika
		Kshitiz
Muskan
Sajoy
	Sandeep
comm: file 2 is not in sorted order
	Sajoy
devasc-VM@Ubuntu-Day2:~$ comm Members.txt Friends.txt [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[12Pat > Friends.txt
Bipin
Kinshuk
Kshitiz
Koushki
Sajoy
sandeep^[[D^[[D^[[D                   Sandeep       ^Z
[1]+  Stopped                 cat > Friends.txt
devasc-VM@Ubuntu-Day2:~$ cat > Friends.txtomm Members.txt Friends.txt [C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[12Pat > Friends.txt
Bipin
Kinshuk
Koushki 
Kshitiz
San joy
sandeep       Sandeep
devasc-VM@Ubuntu-Day2:~$ cat > Friends.txtomm Members.txt Friends.txt 
	Bipin
		Kinshuk
Kirti
	Koushki 
Kratika
		Kshitiz
Muskan
		Sajoy
	Sandeep
devasc-VM@Ubuntu-Day2:~$ 
devasc-VM@Ubuntu-Day2:~$ comm Mjor[K[K[Kajor.txt
comm: missing operand after ‘Major.txt’
Try 'comm --help' for more information.
devasc-VM@Ubuntu-Day2:~$ comm Major.txt[C> Major.txt
comm: missing operand
Try 'comm --help' for more information.
devasc-VM@Ubuntu-Day2:~$ comm> Major.txt[1P[1P[1P[1@a[1@t[1@ 
Satendra
Kinshuk
Bipin
Sandeep
Sajoy
Kshitiz
devasc-VM@Ubuntu-Day2:~$ s[Kcat MA[KA[Kajor.txt 
Satendra
Kinshuk
Bipin
Sandeep
Sajoy
Kshitiz
devasc-VM@Ubuntu-Day2:~$ sort Major.txt 
Bipin
Kinshuk
Kshitiz
Sajoy
Sandeep
Satendra
devasc-VM@Ubuntu-Day2:~$ cat Major.txt 
Satendra
Kinshuk
Bipin
Sandeep
Sajoy
Kshitiz
devasc-VM@Ubuntu-Day2:~$ cat Major.txt [1@sor[C[C[C[C[C[C[C[C[C[C[C[C> Major-New.txt
devasc-VM@Ubuntu-Day2:~$ cat Major-New.txt 
Bipin
Kinshuk
Kshitiz
Sajoy
Sandeep
Satendra
devasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [H[Jdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [H[Jdevasc-VM@Ubuntu-Day2:~$ ls
[0m[01;34mCollege[0m    F1.txt  F3.txt  Friends.txt  Major-New.txt  Members.txt       hello.py   hello2.txt
[01;34mDownloads[0m  F2.txt  File1   [01;34mGlobal[0m       Major.txt      day2_commands.sc  hello.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ rm Memmv[K[Kbers.txt 
devasc-VM@Ubuntu-Day2:~$ ls[K[Krm Members.txt [1P[1P[1P[1P[1P[1@a[1P[1@a[1P[1P[1@a[1@j[1@o[1@r[1@-[1@i[1@ [C[C[C[C[C[C[C[C[C
rm: remove regular file 'Major.txt'? n
devasc-VM@Ubuntu-Day2:~$ ls
[0m[01;34mCollege[0m    F1.txt  F3.txt  Friends.txt  Major-New.txt  day2_commands.sc  hello.txt   sajoy.txt
[01;34mDownloads[0m  F2.txt  File1   [01;34mGlobal[0m       Major.txt      hello.py          hello2.txt
devasc-VM@Ubuntu-Day2:~$ 
devasc-VM@Ubuntu-Day2:~$ lsrm -i Major.txt 
rm: remove regular file 'Major.txt'? y
devasc-VM@Ubuntu-Day2:~$ rm -i Major.txt ls[K
[0m[01;34mCollege[0m  [01;34mDownloads[0m  F1.txt  F2.txt  F3.txt  File1  Friends.txt  [01;34mGlobal[0m  Major-New.txt  day2_commands.sc  hello.py  hello.txt  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ grep ;f[K[K'^F' ls
grep: ls: No such file or directory
devasc-VM@Ubuntu-Day2:~$ grep '^F' ls[K[K[K[1P'^F'[1P'^F'[1P'^F'[1P'^F'[1P'^F'l'^F's'^F' '^F'[C[C[C[C[K[K[K[KF*
F1.txt  F2.txt  F3.txt  File1  Friends.txt
devasc-VM@Ubuntu-Day2:~$ ls F*[K[K*txt
F1.txt  F2.txt  F3.txt  Friends.txt  Major-New.txt  hello.txt  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ 
devasc-VM@Ubuntu-Day2:~$ 
devasc-VM@Ubuntu-Day2:~$ [H[Jdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ ls *txt.txt
F1.txt  F2.txt  F3.txt  Friends.txt  Major-New.txt  hello.txt  hello2.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ touch Sau[KyHello Call[1P[1@h[1@0[C[C[1P[C[C[C[C. Callx Callt Callx Callt Call[1P Call[1P Call[1P Call[1P Callt Callx Callt Call[C[C[C[C[Chello.txt
devasc-VM@Ubuntu-Day2:~$ touch Sayhello.txt Callhello.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls *.txt[K[K[K[K[K[K'f[Khello[K[K[K[K[K[K*helooo[K[K[Klo/[K*
Callhello.txt  Sayhello.txt  hello.py  hello.txt  hello2.txt
devasc-VM@Ubuntu-Day2:~$ ls[Kdevasc-VM@Ubuntu-Day2:~$ ls[Kdevasc-VM@Ubuntu-Day2:~$ ls
Callhello.txt  [0m[01;34mDownloads[0m  F2.txt  File1        [01;34mGlobal[0m         Sayhello.txt      hello.py   hello2.txt
[01;34mCollege[0m        F1.txt     F3.txt  Friends.txt  Major-New.txt  day2_commands.sc  hello.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ [H[Jdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ [Kdevasc-VM@Ubuntu-Day2:~$ ls F????
File1
devasc-VM@Ubuntu-Day2:~$ ls F????[K *hello*touch Sayhello.txt Callhello.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls *hello*[Ktouch Sayhello.txt Callhello.txt[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls *hello*[K[K F????[Ktouch Myfile1 Myfile2 Myfile3 Myfile4
devasc-VM@Ubuntu-Day2:~$ touch Myfile1 Myfile2 Myfile3 Myfile4[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K??????
devasc-VM@Ubuntu-Day2:~$ rm -r M??????
devasc-VM@Ubuntu-Day2:~$ rm -r M??????touch[C[C[C[C[C[C[C[C[C[1P M??????[1P M??????[1P M??????[1P M??????[1P M??????l M??????s M??????[C*M??????rm -r M??????[Krm -r M??????[2Pls *M??????[1PM??????
ls: cannot access 'M??????': No such file or directory
devasc-VM@Ubuntu-Day2:~$ ls M??????[K
ls: cannot access 'M?????': No such file or directory
devasc-VM@Ubuntu-Day2:~$ ls
Callhello.txt  [0m[01;34mDownloads[0m  F2.txt  File1        [01;34mGlobal[0m         Sayhello.txt      hello.py   hello2.txt
[01;34mCollege[0m        F1.txt     F3.txt  Friends.txt  Major-New.txt  day2_commands.sc  hello.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ ls M??????[3@rm -r[C[C[C[C[C[C[C[Ctouch[C[C[C[C[C[C[C[Cyfile1 Myfile2 Myfile3 Myfile4
devasc-VM@Ubuntu-Day2:~$ ls
Callhello.txt  [0m[01;34mDownloads[0m  F2.txt  File1        [01;34mGlobal[0m         Myfile1  Myfile3  Sayhello.txt      hello.py   hello2.txt
[01;34mCollege[0m        F1.txt     F3.txt  Friends.txt  Major-New.txt  Myfile2  Myfile4  day2_commands.sc  hello.txt  sajoy.txt
devasc-VM@Ubuntu-Day2:~$ lstouch Myfile1 Myfile2 Myfile3 Myfile4[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[C[Cls[K M??????
Myfile1  Myfile2  Myfile3  Myfile4
devasc-VM@Ubuntu-Day2:~$ history
    1  man ls
    2  ls -author
    3  ls -a
    4  ls -c
    5  ls -
    6  ls -C
    7  ls -l
    8  cat > hello.txt
    9  cat > hello2.txt
   10  cat hello.txt 
   11  cat hello2.txt 
   12  cat >hello2.txt 
   13  cat hello2.txt 
   14  cat >> hello.txt
   15  cat hello.txt
   16  mkdir Global
   17* mkdir College Downlads
   18  ls Global/
   19  ls
   20  cat > hello3.txt
   21  mkdir Downloads College 
   22  cp hello2.txt hello3.txt College
   23  ls College/
   24  cp -r College Downloads
   25  ls Downloads/
   26  ls Downloads/College/
   27  ls
   28  mv hello.txt College/
   29  ls
   30  ls College/
   31  mv hello3.txt sajoy.txt
   32  ls
   33  .cat sajoy.txt 
   34  cat sajoy.txt 
   35  ls
   36  cd College/
   37  mv hello.txt 
   38  mv hello.txt ..
   39  ls
   40  cd ..
   41  ls
   42  file day2_commands.sc 
   43  file sajoy.txt 
   44  file Global
   45  cat hello.py
   46  cat > hello.py
   47  file hello.py 
   48  cat > File1
   49  wc File1 
   50  wc -l File1 
   51  wc -w File1 
   52  wc -c File1 
   53  wc -m File1 
   54  wc -L File1 
   55  cat F1.txt
   56  cat >F1.txt
   57  cat >F2.txt
   58  cat >F3.txt
   59  cmp F1.txt F2.txt
   60  cmp F1.txt F3.txt
   61  cat > Members.txt
   62  cat > Friends.txt
   63  comm Members.txt Friends.txt 
   64  cat > Friends.txt
   65  comm Members.txt Friends.txt 
   66  cat > Friends.txt
   67  comm Members.txt Friends.txt 
   68  comm Major.txt
   69  comm> Major.txt
   70  cat > Major.txt
   71  cat Major.txt 
   72  sort Major.txt 
   73  cat Major.txt 
   74  sort Major.txt > Major-New.txt
   75  cat Major-New.txt 
   76  ls
   77  rm Members.txt 
   78  rm -i Major.txt 
   79  ls
   80  rm -i Major.txt 
   81  ls
   82  grep '^F' ls
   83  ls F*
   84  ls *txt
   85  ls *.txt
   86  touch Sayhello.txt Callhello.txt
   87  ls *hello*
   88  ls
   89  ls F????
   90  touch Myfile1 Myfile2 Myfile3 Myfile4
   91  touch M??????
   92  rm -r M??????
   93  ls M??????
   94  ls M?????
   95  ls
   96  touch Myfile1 Myfile2 Myfile3 Myfile4
   97  ls
   98  ls M??????
   99  history
devasc-VM@Ubuntu-Day2:~$ exit
exit
There are stopped jobs.
devasc-VM@Ubuntu-Day2:~$ exit
exit

Script done on 2023-10-17 06:05:29+00:00 [COMMAND_EXIT_CODE="1"]
