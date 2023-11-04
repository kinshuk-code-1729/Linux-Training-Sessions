# ✨ Linux-Training-Sessions ✨
## ⚛️ Day 1 Commands :
- ***cal* :** Prints an ASCII calendar of the given month or year.
- **_date_ :** Displays the current date and time.
- ***echo* :** Displays lines of text or string which are passed as arguments on the command line.
- **_clear_ :** Brings the command line on top of the computer terminal.
- ***script* :** Makes typescript or records all the terminal activities.
- **_ls_ :** Lists directory contents of files and directories.
- ***who* :** Prints information about users who are currently logged in.
- **_whoami_ :** Allows Linux users to see the currently logged-in user.
- ***tty* :**  Any terminal on Linux/Unix systems.
- **_uname & uname -r_ :** displays the information about the system. Option -r displays the Linux kernel release info.
- ***cd* (change directory) :** Used to move efficiently from the current working directory to different directories in our System.
- **_mkdir_ :** Creates multiple directories in the current location.
- ***rmdir* :** Removes the directory, specified by the Directory parameter, from the system.
- **_rm -r_ :** It will recursively delete a directory and all its contents.

## ⚛️ Day 2 Commands :
- **_man_ :** Used to display the user manual of any command that we can run on the terminal.
- ***ls* options :**
  - **_ls -l_ :** Displays the contents of the current directory in a long listing format, one per line (show permissions).
  - **_ls -a_ :** Lists all files including hidden files _(files with names beginning with a dot)._
  - **_ls -author_ :** Lists the contents in the specified directory along with its owner.
  - **_ls -C_ :** Lists entries by columns.
  - **_ls -d_ :** Lists directories - with ' */'.
  - **_ls -r_ :** It is used to print the list in reverse order.
- **file creation through *cat* command :**
  - _cat >_ (to overwrite)
  - _cat >>_ (to append)
  - _cat_ (to view)
- **empty file creation using *touch* command**
- *cp* : **cp** stands for a copy. This command is used to copy files or groups of files or directories.
- *mv* : Moves files and directories from one directory to another or renames a file or directory.
- *file* : Used to determine the type of a file.
- ***wc* command :** (stands for word count)
  - **_wc -l_ :** Prints the number of lines in a file.
  - **_wc -w_ :** Prints the number of words in a file.
  - **_wc -c_ :** Displays the count of bytes in a file.
  - **_wc -m_ :** Prints the count of characters from a file.
  - **_wc -L_ :** Prints only the length of the longest line in a file.
- **_cmp :_** Used to compare two files _byte by byte_ and helps to find out whether the two files are identical or not.
- **_comm :_** Compares two sorted files line by line and writes to standard output; the lines that are common and the lines that are unique.
- **_sort :_** Prints the lines of its input or concatenation of all files listed in its argument list in sorted order.
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
- ***chmod -R* :** To assign same permissions of **root directory** to **sub-directories.**
- ***umask* :** The umask command sets the file-creation mask using this format:
  - where mask is an **octal number** or **symbolic value** that correspond to the permissions to be disabled.
  - This umask command adds **write permission to the group**:
    - With **no arguments,** umask displays the **current** value.
- ***ls -ls***
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

## ⚛️ Day 6 Commands :


## ⚛️ Day 7 Commands :


## ⚛️ Day 8 Commands :
