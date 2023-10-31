# ✨ Linux-Training-Sessions ✨
## ⚛️ Day 1 Commands :
- *cal*
- _date_
- *echo*
- _clear_
- *script*
- _ls_
- *who*
- _whoami_
- *tty*
- _uname & uname -r_
- *cd*
- _mkdir_
- *rmdir*
- _rm -r_

## ⚛️ Day 2 Commands :
- *man*
- ***ls* options :**
  - _ls -l_
  - _ls -a_
  - _ls -author_
  - _ls -C_
  - _ls -d_
  - _ls -r_
- **file creation through *cat* command :**
  - _cat >_ (to overwrite)
  - _cat >>_ (to append)
  - _cat_ (to view)
- **empty file creation using *touch* command**
- *cp*
- *mv*
- *file*
- ***wc* command :**
  - _wc -l_
  - _wc -w_
  - _wc -c_
  - _wc -m_
  - _wc -L_
- *cmp*
- *comm*
- *sort*
- **redirection operator _>_**
- ***rm -i* for interactive delete**
- **character class :**
  - ????? placeholders
  - asterisks(**) to denote all

## ⚛️ Day 3 Commands :
- *chmod* **(change mode) :**
  - **relative permission : ('+' symbol is used _add_ and '-' symbol is used to _remove_ a specific permission from _user_ , _group_ or _others_.)**
    - using *±r* or *±w* or *±x* with ***ugo*** or ***a***. ( **_'a'_** stands for **all** , i.e., **_'u'_(user)**, **_'g'_(group)** & **_'o'_(others)**. )
    - using ***ugo/a*** = *±r* or *±w* or *±x*.
  - **absolute permission using numbers :**
    - **4 : read (*r--*)**
    - **2 : write (*-w-*)**
    - **1 : execute (*--x*)**
      - **3 (2+1) : write & execute (*-wx*)**
      - **5 (4+1) : read & execute (*r-x*)**
      - **6 (4+2) : read & write (*rw-*)**
      - **7 (4+2+1) : read, write & execute (*rwx*)**
- *chmod -R* to assign same permissions of **root directory** to **sub-directories :**
- *umask*
- *ls -ls*
- **redirection of output using *>* and *>>***
- **Character class :**
  - **[0-9]** for digits (same as **[!a-z]**).
  - **[a-z]** for chars (same as **[!0-9]**).

## ⚛️ Day 4 Commands :
- **Linux- Vi Editor** _(it has three modes of operation)_ :
  - **_Command mode_ :** Operations such as cut, copy, paste, delete, undo, redo etc.
  - **_Insert mode_ :** Type in new text.
  - **_Esc mode_ :** Extended commands for saving, exiting,  search-and-replace can executed here.
- _vi <filename>_ to open a file.
- **Input Mode Commands :**
  - **_i :_** Insert text to left of the cursor(Existing text shifted right).
  - **_a :_** Append text to right of cursor(Existing text shifted right).
  - **_I :_** Insert text at the beginning of line.
  - **_A_** : Append text at the end of the line.
  - **_o_** : Open line below.
  - **_O_** : Open line above
  - **_rch_** : Replaces single character under cursor with ch.
  - **_R_** : Replaces text from cursor to right.
  - **_s_** : Replaces single character under cursor with any number of characters.
  - **_S_** : Replaces entire line.
 
## ⚛️ Day 5 Commands :
- **_grep_** command in pattern matching :
  - ***grep -v* :** Selects the non-matching lines of the provided input pattern.
  - ***grep -e* :** Union two grep patterns.
  - ***grep -n* :** Prefix each line of the matching output with the line number in the input file.
  - ***grep -c* :** Count number of lines matching to given pattern.
  - ***grep -i* :** Ignores case distinctions in patterns and input data.
  - ***grep "^pattern"*** (find specified pattern at the beginning).
  - ***grep "pattern$"*** (find specified pattern at the end).
  - ***grep "pattern1"*** <filename>|grep "pattern2" <filename>  (pipe operator redirection used).
