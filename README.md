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
  - **relative permission :**
    - using *±r* or *±w* or *±x* with ***ugo*** or ***a***
    - using ***ugo/a*** = *±r* or *±w* or *±x*
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
- Linux- Vi Editor ( it has three modes of operation) :
  - Command mode : Operations such as cut, copy, paste, delete, undo, redo etc.
  - Insert mode : Type in new text.
  - Esc mode : Extended commands for saving, exiting,  search-and-replace can executed here.
- vi <filename> to open a file.
