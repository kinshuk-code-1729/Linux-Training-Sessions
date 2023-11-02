Script started on 2023-11-02 07:08:02+00:00 [TERM="xterm-256color" TTY="/dev/pts/0" COLUMNS="111" LINES="28"]
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ps
[?2004l    PID TTY          TIME CMD
   3079 pts/1    00:00:00 bash
   3085 pts/1    00:00:00 ps
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ps -f
[?2004lUID          PID    PPID  C STIME TTY          TIME CMD
kinshuk     3079    3078  0 07:08 pts/1    00:00:00 bash -i
kinshuk     3088    3079  0 07:08 pts/1    00:00:00 ps -f
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ps -f[Ke
[?2004l    PID TTY          TIME CMD
      1 ?        00:00:02 systemd
      2 ?        00:00:00 kthreadd
      3 ?        00:00:00 rcu_gp
      4 ?        00:00:00 rcu_par_gp
      5 ?        00:00:00 slub_flushwq
      6 ?        00:00:00 netns
      8 ?        00:00:00 kworker/0:0H-kblockd
     10 ?        00:00:00 mm_percpu_wq
     11 ?        00:00:00 rcu_tasks_rude_
     12 ?        00:00:00 rcu_tasks_trace
     13 ?        00:00:00 ksoftirqd/0
     14 ?        00:00:00 rcu_sched
     15 ?        00:00:00 migration/0
     17 ?        00:00:00 cpuhp/0
     18 ?        00:00:00 cpuhp/1
     19 ?        00:00:00 migration/1
     20 ?        00:00:00 ksoftirqd/1
     21 ?        00:00:00 kworker/1:0-events
     22 ?        00:00:00 kworker/1:0H-events_highpri
     23 ?        00:00:00 kdevtmpfs
     24 ?        00:00:00 inet_frag_wq
     25 ?        00:00:00 kauditd
     26 ?        00:00:00 khungtaskd
     27 ?        00:00:00 oom_reaper
     28 ?        00:00:00 writeback
     29 ?        00:00:00 kcompactd0
     30 ?        00:00:00 ksmd
     31 ?        00:00:00 khugepaged
     78 ?        00:00:00 kintegrityd
     79 ?        00:00:00 kblockd
     80 ?        00:00:00 blkcg_punt_bio
     81 ?        00:00:00 tpm_dev_wq
     82 ?        00:00:00 ata_sff
     83 ?        00:00:00 md
     84 ?        00:00:00 edac-poller
     85 ?        00:00:00 hv_vmbus_con
     86 ?        00:00:00 hv_pri_chan
     87 ?        00:00:00 hv_sub_chan
     88 ?        00:00:00 devfreq_wq
     89 ?        00:00:00 watchdogd
     90 ?        00:00:00 kworker/u4:1-events_power_efficient
     91 ?        00:00:00 kworker/1:1H-kblockd
     93 ?        00:00:00 kswapd0
     94 ?        00:00:00 ecryptfs-kthrea
     96 ?        00:00:00 kthrotld
     97 ?        00:00:00 nfit
     98 ?        00:00:00 nvme-wq
     99 ?        00:00:00 scsi_eh_0
    101 ?        00:00:00 scsi_tmf_0
    102 ?        00:00:00 scsi_eh_1
    103 ?        00:00:00 nvme-reset-wq
    104 ?        00:00:00 scsi_tmf_1
    105 ?        00:00:00 nvme-delete-wq
    106 ?        00:00:00 vfio-irqfd-clea
    107 ?        00:00:00 kworker/u4:3-events_unbound
    110 ?        00:00:00 mld
    111 ?        00:00:00 ipv6_addrconf
    113 ?        00:00:00 hv_balloon
    121 ?        00:00:00 kstrp
    124 ?        00:00:00 zswap-shrink
    125 ?        00:00:00 kworker/u5:0
    132 ?        00:00:00 jbd2/sda1-8
    133 ?        00:00:00 ext4-rsv-conver
    159 ?        00:00:00 kworker/0:1H-kblockd
    175 ?        00:00:00 systemd-journal
    201 ?        00:00:00 kworker/0:4-events
    213 ?        00:00:00 kaluad
    215 ?        00:00:00 kmpath_rdacd
    216 ?        00:00:00 kmpathd
    217 ?        00:00:00 kmpath_handlerd
    218 ?        00:00:00 multipathd
    221 ?        00:00:00 systemd-udevd
    252 ?        00:00:00 cryptd
    294 ?        00:00:00 hv_kvp_daemon
    340 ?        00:00:00 bpfilter_umh
    451 ?        00:00:00 kworker/0:7-cgroup_destroy
    529 ?        00:00:00 systemd-network
    531 ?        00:00:00 systemd-resolve
    609 ?        00:00:00 jbd2/sdb1-8
    610 ?        00:00:00 ext4-rsv-conver
    648 ?        00:00:00 accounts-daemon
    653 ?        00:00:00 cron
    655 ?        00:00:00 dbus-daemon
    659 ?        00:00:00 irqbalance
    660 ?        00:00:00 networkd-dispat
    662 ?        00:00:00 polkitd
    663 ?        00:00:00 rsyslogd
    666 ?        00:00:01 snapd
    669 ?        00:00:00 systemd-logind
    672 ?        00:00:00 udisksd
    673 ?        00:00:00 python3
    675 ?        00:00:00 atd
    740 ?        00:00:00 ModemManager
    755 ?        00:00:01 python3
    757 ?        00:00:00 sshd
   1010 ttyS0    00:00:00 agetty
   1012 tty1     00:00:00 agetty
   1396 ?        00:00:00 packagekitd
   2839 ?        00:00:00 unattended-upgr
   2852 ?        00:00:00 sshd
   2855 ?        00:00:00 systemd
   2856 ?        00:00:00 (sd-pam)
   2964 ?        00:00:00 sshd
   2965 pts/0    00:00:00 bash
   3045 ?        00:00:00 kworker/1:1
   3078 pts/0    00:00:00 script
   3079 pts/1    00:00:00 bash
   3087 ?        00:00:00 kworker/u4:0-events_unbound
   3090 pts/1    00:00:00 ps
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ps -e[C [K -f
[?2004lUID          PID    PPID  C STIME TTY          TIME CMD
root           1       0  0 06:47 ?        00:00:02 /sbin/init
root           2       0  0 06:47 ?        00:00:00 [kthreadd]
root           3       2  0 06:47 ?        00:00:00 [rcu_gp]
root           4       2  0 06:47 ?        00:00:00 [rcu_par_gp]
root           5       2  0 06:47 ?        00:00:00 [slub_flushwq]
root           6       2  0 06:47 ?        00:00:00 [netns]
root           8       2  0 06:47 ?        00:00:00 [kworker/0:0H-kblockd]
root          10       2  0 06:47 ?        00:00:00 [mm_percpu_wq]
root          11       2  0 06:47 ?        00:00:00 [rcu_tasks_rude_]
root          12       2  0 06:47 ?        00:00:00 [rcu_tasks_trace]
root          13       2  0 06:47 ?        00:00:00 [ksoftirqd/0]
root          14       2  0 06:47 ?        00:00:00 [rcu_sched]
root          15       2  0 06:47 ?        00:00:00 [migration/0]
root          17       2  0 06:47 ?        00:00:00 [cpuhp/0]
root          18       2  0 06:47 ?        00:00:00 [cpuhp/1]
root          19       2  0 06:47 ?        00:00:00 [migration/1]
root          20       2  0 06:47 ?        00:00:00 [ksoftirqd/1]
root          21       2  0 06:47 ?        00:00:00 [kworker/1:0-events]
root          22       2  0 06:47 ?        00:00:00 [kworker/1:0H-events_highpri]
root          23       2  0 06:47 ?        00:00:00 [kdevtmpfs]
root          24       2  0 06:47 ?        00:00:00 [inet_frag_wq]
root          25       2  0 06:47 ?        00:00:00 [kauditd]
root          26       2  0 06:47 ?        00:00:00 [khungtaskd]
root          27       2  0 06:47 ?        00:00:00 [oom_reaper]
root          28       2  0 06:47 ?        00:00:00 [writeback]
root          29       2  0 06:47 ?        00:00:00 [kcompactd0]
root          30       2  0 06:47 ?        00:00:00 [ksmd]
root          31       2  0 06:47 ?        00:00:00 [khugepaged]
root          78       2  0 06:47 ?        00:00:00 [kintegrityd]
root          79       2  0 06:47 ?        00:00:00 [kblockd]
root          80       2  0 06:47 ?        00:00:00 [blkcg_punt_bio]
root          81       2  0 06:47 ?        00:00:00 [tpm_dev_wq]
root          82       2  0 06:47 ?        00:00:00 [ata_sff]
root          83       2  0 06:47 ?        00:00:00 [md]
root          84       2  0 06:47 ?        00:00:00 [edac-poller]
root          85       2  0 06:47 ?        00:00:00 [hv_vmbus_con]
root          86       2  0 06:47 ?        00:00:00 [hv_pri_chan]
root          87       2  0 06:47 ?        00:00:00 [hv_sub_chan]
root          88       2  0 06:47 ?        00:00:00 [devfreq_wq]
root          89       2  0 06:47 ?        00:00:00 [watchdogd]
root          90       2  0 06:47 ?        00:00:00 [kworker/u4:1-flush-8:0]
root          91       2  0 06:47 ?        00:00:00 [kworker/1:1H-kblockd]
root          93       2  0 06:47 ?        00:00:00 [kswapd0]
root          94       2  0 06:47 ?        00:00:00 [ecryptfs-kthrea]
root          96       2  0 06:47 ?        00:00:00 [kthrotld]
root          97       2  0 06:47 ?        00:00:00 [nfit]
root          98       2  0 06:47 ?        00:00:00 [nvme-wq]
root          99       2  0 06:47 ?        00:00:00 [scsi_eh_0]
root         101       2  0 06:47 ?        00:00:00 [scsi_tmf_0]
root         102       2  0 06:47 ?        00:00:00 [scsi_eh_1]
root         103       2  0 06:47 ?        00:00:00 [nvme-reset-wq]
root         104       2  0 06:47 ?        00:00:00 [scsi_tmf_1]
root         105       2  0 06:47 ?        00:00:00 [nvme-delete-wq]
root         106       2  0 06:47 ?        00:00:00 [vfio-irqfd-clea]
root         107       2  0 06:47 ?        00:00:00 [kworker/u4:3-events_unbound]
root         110       2  0 06:47 ?        00:00:00 [mld]
root         111       2  0 06:47 ?        00:00:00 [ipv6_addrconf]
root         113       2  0 06:47 ?        00:00:00 [hv_balloon]
root         121       2  0 06:47 ?        00:00:00 [kstrp]
root         124       2  0 06:47 ?        00:00:00 [zswap-shrink]
root         125       2  0 06:47 ?        00:00:00 [kworker/u5:0]
root         132       2  0 06:47 ?        00:00:00 [jbd2/sda1-8]
root         133       2  0 06:47 ?        00:00:00 [ext4-rsv-conver]
root         159       2  0 06:47 ?        00:00:00 [kworker/0:1H-kblockd]
root         175       1  0 06:47 ?        00:00:00 /lib/systemd/systemd-journald
root         201       2  0 06:47 ?        00:00:00 [kworker/0:4-events]
root         213       2  0 06:47 ?        00:00:00 [kaluad]
root         215       2  0 06:47 ?        00:00:00 [kmpath_rdacd]
root         216       2  0 06:47 ?        00:00:00 [kmpathd]
root         217       2  0 06:47 ?        00:00:00 [kmpath_handlerd]
root         218       1  0 06:47 ?        00:00:00 /sbin/multipathd -d -s
root         221       1  0 06:47 ?        00:00:00 /lib/systemd/systemd-udevd
root         252       2  0 06:47 ?        00:00:00 [cryptd]
root         294       1  0 06:47 ?        00:00:00 /usr/lib/linux-tools/5.15.0-1050-azure/hv_kvp_daemon -n
root         340       2  0 06:47 ?        00:00:00 bpfilter_umh
root         451       2  0 06:47 ?        00:00:00 [kworker/0:7-events]
systemd+     529       1  0 06:47 ?        00:00:00 /lib/systemd/systemd-networkd
systemd+     531       1  0 06:47 ?        00:00:00 /lib/systemd/systemd-resolved
root         609       2  0 06:47 ?        00:00:00 [jbd2/sdb1-8]
root         610       2  0 06:47 ?        00:00:00 [ext4-rsv-conver]
root         648       1  0 06:47 ?        00:00:00 /usr/libexec/accounts-daemon
root         653       1  0 06:47 ?        00:00:00 /usr/sbin/cron -f -P
message+     655       1  0 06:47 ?        00:00:00 @dbus-daemon --system --address=systemd: --nofork --nopidfi
root         659       1  0 06:47 ?        00:00:00 /usr/sbin/irqbalance --foreground
root         660       1  0 06:47 ?        00:00:00 /usr/bin/python3 /usr/bin/networkd-dispatcher --run-startup
root         662       1  0 06:47 ?        00:00:00 /usr/libexec/polkitd --no-debug
syslog       663       1  0 06:47 ?        00:00:00 /usr/sbin/rsyslogd -n -iNONE
root         666       1  0 06:47 ?        00:00:01 /usr/lib/snapd/snapd
root         669       1  0 06:47 ?        00:00:00 /lib/systemd/systemd-logind
root         672       1  0 06:47 ?        00:00:00 /usr/libexec/udisks2/udisksd
root         673       1  0 06:47 ?        00:00:00 /usr/bin/python3 -u /usr/sbin/waagent -daemon
daemon       675       1  0 06:47 ?        00:00:00 /usr/sbin/atd -f
root         740       1  0 06:47 ?        00:00:00 /usr/sbin/ModemManager
root         755     673  0 06:47 ?        00:00:01 python3 -u bin/WALinuxAgent-2.9.1.1-py3.8.egg -run-exthandl
root         757       1  0 06:47 ?        00:00:00 sshd: /usr/sbin/sshd -D [listener] 0 of 10-100 startups
root        1010       1  0 06:47 ttyS0    00:00:00 /sbin/agetty -o -p -- \u --keep-baud 115200,57600,38400,960
root        1012       1  0 06:47 tty1     00:00:00 /sbin/agetty -o -p -- \u --noclear tty1 linux
root        1396       1  0 06:48 ?        00:00:00 /usr/libexec/packagekitd
root        2839       1  0 06:49 ?        00:00:00 /usr/bin/python3 /usr/share/unattended-upgrades/unattended-
root        2852     757  0 06:50 ?        00:00:00 sshd: kinshuk [priv]
kinshuk     2855       1  0 06:50 ?        00:00:00 /lib/systemd/systemd --user
kinshuk     2856    2855  0 06:50 ?        00:00:00 (sd-pam)
kinshuk     2964    2852  0 06:50 ?        00:00:00 sshd: kinshuk@pts/0
kinshuk     2965    2964  0 06:50 pts/0    00:00:00 -bash
root        3045       2  0 07:02 ?        00:00:00 [kworker/1:1]
kinshuk     3078    2965  0 07:08 pts/0    00:00:00 script Script_Day8.sc
kinshuk     3079    3078  0 07:08 pts/1    00:00:00 bash -i
root        3087       2  0 07:08 ?        00:00:00 [kworker/u4:0-events_unbound]
root        3113       2  0 07:09 ?        00:00:00 [kworker/0:0]
root        3114       2  0 07:09 ?        00:00:00 [kworker/u4:2-events_unbound]
kinshuk     3115    3079  0 07:09 pts/1    00:00:00 ps -e -f
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ kill 3115
[?2004lbash: kill: (3115) - No such process
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ kill 3115 [K[K[K[K[K-9 3115
[?2004lbash: kill: (3115) - No such process
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ [H[2J]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        tee.txt
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       poemcount.txt  teecmd.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  [01;34msnap[0m           test.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    sortedFile123  test2.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedfile     [01;32mtestfile.txt[0m
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      students       unique123
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat S[KsortedFile123 
[?2004lTanuj
Bharat
Akash
Manav
Aman
Chaitanya
Deepak
Akash
Tanuj
Deepak
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ cat sortedFile123 [K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Ksort -n global[K[K[K[K[K[KsO[KortedFile123  &[1P&[C
[?2004l[1] 3145
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ Akash
Akash
Aman
Bharat
Chaitanya
Deepak
Deepak
Manav
Tanuj
Tanuj

[?2004l[1]+  Done                    sort -n sortedFile123
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ [H[2J]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ ls ^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^[[2~^?[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdate
[?2004lThu Nov  2 07:15:48 UTC 2023
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ at 07:17:00 PM
[?2004lsyntax error. Last token seen: :
Garbled time
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ at 07:17:00 PM[K[K[K[K[K[Kpm
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 19:17:00 2023
at> ^C[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ at 07:17pm:00 PM[4Ppm[K[K[K[K20pm
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 19:20:00 2023
at> cal > /dev/ty^[[Dt^[[C          ty
at> <EOT>
job 2 at Thu Nov  2 19:20:00 2023
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ datw[Ke
[?2004lThu Nov  2 07:18:35 UTC 2023
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ date
[?2004lThu Nov  2 07:20:14 UTC 2023
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ sudo su
[?2004l[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# exitapt --fix-broken install -y[8Psudo apt upgrade[C[C[C[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kdate
[?2004lThu Nov  2 07:22:55 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:23:04 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 07:24pm
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 19:24:00 2023
at> cal> /dev/tty
at> <EOT>
job 3 at Thu Nov  2 19:24:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:23:31 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:23:39 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:23:54 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:24:06 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# exit
[?2004lexit
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ sudo su[3Pdatesudo su
[?2004l[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# exitdateat 07:24pm[1Ppm6pm
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 19:26:00 2023
at> ^[[A^[[A        cal > sch_op
at> <EOT>
job 4 at Thu Nov  2 19:26:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:25:14 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:25:44 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:26:11 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        tee.txt
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       poemcount.txt  teecmd.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  [01;34msnap[0m           test.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    sortedFile123  test2.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedfile     [01;32mtestfile.txt[0m
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      students       unique123
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# cat [7msch_op[27msch_op
[?2004lcat: sch_op: No such file or directory
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# exi[K[K[Kdate
[?2004lThu Nov  2 07:27:16 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk#  at 07:29pm
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 19:29:00 2023
at> who>file987
at> <EOT>
job 5 at Thu Nov  2 19:29:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# datew[K
[?2004lThu Nov  2 07:28:07 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        tee.txt
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       poemcount.txt  teecmd.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  [01;34msnap[0m           test.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    sortedFile123  test2.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedfile     [01;32mtestfile.txt[0m
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      students       unique123
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# lsdate
[?2004lThu Nov  2 07:28:37 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:28:50 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:28:58 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:29:04 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        tee.txt
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       poemcount.txt  teecmd.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  [01;34msnap[0m           test.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    sortedFile123  test2.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedfile     [01;32mtestfile.txt[0m
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      students       unique123
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# cat [K>file[1Pfile file[C[C[C[C987
[?2004lcat: file987: No such file or directory
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at noon
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 12:00:00 2023
at> <EOT>
job 6 at Thu Nov  2 12:00:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at noon + 1 hour[C[C[C[C[C[1P[1P[1@e[1P[1@w
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 08:30:00 2023
at> <EOT>
job 7 at Thu Nov  2 08:30:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 9am tommorrrw[1Pwow
[?2004lsyntax error. Last token seen: t
Garbled time
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 9am tommorrow[1Porrow
[?2004lwarning: commands will be executed using /bin/sh
at Fri Nov  3 09:00:00 2023
at> <EOT>
job 8 at Fri Nov  3 09:00:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 17:05 November 13,2023
[?2004lsyntax error. Last token seen: 13,20
Garbled time
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 17:05 November 13,2023 2023
[?2004lwarning: commands will be executed using /bin/sh
at Mon Nov 13 17:05:00 2023
at> <EOT>
job 9 at Mon Nov 13 17:05:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 17:05 November 13, 2023[1P2023[10P9am tomorrowmorrow[1Pnow + 1 houron[Kcat file987ls[Kdate[2Plsdatecat sch_opls[Kcat sch_op[6Pdate
[?2004lThu Nov  2 07:33:25 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# at 07:35am
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 07:35:00 2023
at> who > output.txt
at> <EOT>
job 10 at Thu Nov  2 07:35:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        tee.txt
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       poemcount.txt  teecmd.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  [01;34msnap[0m           test.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    sortedFile123  test2.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedfile     [01;32mtestfile.txt[0m
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      students       unique123
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# datw[Ke
[?2004lThu Nov  2 07:34:06 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:34:46 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:34:55 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# date
[?2004lThu Nov  2 07:35:01 UTC 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# ls
[?2004l[0m[34;42mAB1[0m        F4              Script_Day2.sc  Script_Day8.sc  new2         opfile3        students      unique123
DemoFile   [01;34mGlobal[0m          Script_Day3.sc  [01;34mX1[0m              [34;42mnewdir[0m       output.txt     tee.txt
DummyFile  Global.txt      Script_Day4.sc  file123         newfile.txt  poemcount.txt  teecmd.txt
[01;32mF1[0m         MainFile        Script_Day5.sc  logfile         newvifile    [01;34msnap[0m           test.txt
[01;32mF2[0m         README.md       Script_Day6.sc  ls_op           opfile1      sortedFile123  test2.txt
F3         Script_Day1.sc  Script_Day7.sc  new1            opfile2      sortedfile     [01;32mtestfile.txt[0m
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# cat output.txt 
[?2004lkinshuk  pts/0        2023-11-02 06:50 (103.102.100.246)
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# batch
[?2004lwarning: commands will be executed using /bin/sh
at Thu Nov  2 07:35:00 2023
at> <EOT>
job 11 at Thu Nov  2 07:35:00 2023
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# [H[2J]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# vi schdulededuled[C[C[C[C[C-file
[?2004l[?1049h[22;0;0t[>4;2m[?1h=[?2004h[1;28r[?12h[?12l[22;2t[22;1t[27m[23m[29m[m[H[2J[?25l[28;1H"scheduled-file" [New File][2;1H▽[6n[2;1H  [1;1H[>c]10;?]11;?[2;1H[94m~                                                                                                              [3;1H~                                                                                                              [4;1H~                                                                                                              [5;1H~                                                                                                              [6;1H~                                                                                                              [7;1H~                                                                                                              [8;1H~                                                                                                              [9;1H~                                                                                                              [10;1H~                                                                                                              [11;1H~                                                                                                              [12;1H~                                                                                                              [13;1H~                                                                                                              [14;1H~                                                                                                              [15;1H~                                                                                                              [16;1H~                                                                                                              [17;1H~                                                                                                              [18;1H~                                                                                                              [19;1H~                                                                                                              [20;1H~                                                                                                              [21;1H~                                                                                                              [22;1H~                                                                                                              [23;1H~                                                                                                              [24;1H~                                                                                                              [25;1H~                                                                                                              [26;1H~                                                                                                              [27;1H~                                                                                                              [m[28;94H0,0-1[9CAll[1;1H[?25h[?25l[28;84H^[[1;1H[28;86H[[1;1H[28;87H>[1;1H[28;88H0[1;1H[28;89H;[1;1H[28;90H1[1;1H[28;91H0[1;1H[28;92H;[1;1H[28;84H         [1;1H[?25h[?25l[28;84Hi[1;1H[28;84H [1;1H[28;1H[1m-- INSERT --[m[28;13H[K[28;94H0,1[11CAll[1;1H[?25h[?25l1[28;94H1,2[1;2H[?25h[?25l5[28;96H3[1;3H[?25h[?25l[28;96H4[1;4H[?25h[?25l2[28;96H5[1;5H[?25h[?25l0[28;96H6[1;6H[?25h[?25l[28;96H7[1;7H[?25h[?25l2[28;96H8[1;8H[?25h[?25l5[28;96H9[1;9H[?25h[?25l[28;96H10[1;10H[?25h[?25l3[28;97H1[1;11H[?25h[?25l0[28;97H2[1;12H[?25h[?25l[28;97H3[1;13H[?25h[?25l[28;97H4[1;14H[?25h[?25l3[28;97H5[1;15H[?25h[?25l4[28;97H6[1;16H[?25h[?25l[28;97H7[1;17H[?25h[?25l2[28;97H8[1;18H[?25h[?25l5[28;97H9[1;19H[?25h[?25l[28;96H20[1;20H[?25h[?25l3[28;97H1[1;21H[?25h[?25l6[28;97H2[1;22H[?25h[?25l6[28;97H3[1;23H[?25h[?25l[28;97H4[1;24H[?25h[?25l4[28;97H5[1;25H[?25h[?25l5[28;97H6[1;26H[?25h[?25l[1;25H[K[28;97H5[1;25H[?25h[?25l[1;24H[K[28;97H4[1;24H[?25h[?25l[28;97H3[1;23H[?25h[?25l[1;22H[K[28;97H2[1;22H[?25h[?25l[1;21H[K[28;97H1[1;21H[?25h[?25l[1;20H[K[28;97H0[1;20H[?25h[?25l[28;96H19[1;19H[?25h[?25l[1;18H[K[28;97H8[1;18H[?25h[?25l[1;17H[K[28;97H7[1;17H[?25h[?25l[28;97H6[1;16H[?25h[?25l[1;15H[K[28;97H5[1;15H[?25h[?25l[1;14H[K[28;97H4[1;14H[?25h[?25l[28;97H3[1;13H[?25h[?25l[28;97H2[1;12H[?25h[?25l[1;11H[K[28;97H1[1;11H[?25h[?25l[1;10H[K[28;97H0[1;10H[?25h[?25l[28;96H9 [1;9H[?25h[?25l[1;8H[K[28;96H8[1;8H[?25h[?25l[1;7H[K[28;96H7[1;7H[?25h[?25l[28;96H6[1;6H[?25h[?25l[1;5H[K[28;96H5[1;5H[?25h[?25l[1;4H[K[28;96H4[1;4H[?25h[?25l[28;96H3[1;3H[?25h[?25l[1;2H[K[28;96H2[1;2H[?25h[?25l[1;1H[K[28;96H1[1;1H[?25h[?25l1[28;96H2[1;2H[?25h[?25l5[28;96H3[1;3H[?25h[?25l[28;96H4[1;4H[?25h[?25l1[28;96H5[1;5H[?25h[?25l2[28;96H6[1;6H[?25h[?25l0[28;96H7[1;7H[?25h[?25l[1;6H[K[28;96H6[1;6H[?25h[?25l[1;5H[K[28;96H5[1;5H[?25h[?25l[1;4H[K[28;96H4[1;4H[?25h[?25l2[28;96H5[1;5H[?25h[?25l0[28;96H6[1;6H[?25h[?25l[28;96H7[1;7H[?25h[?25l1[28;96H8[1;8H[?25h[?25l[28;96H9[1;9H[?25h[?25l*[28;96H10[1;10H[?25h[?25l[28;97H1[1;11H[?25h[?25l*[28;97H2[1;12H[?25h[?25l[28;97H3[1;13H[?25h[?25le[28;97H4[1;14H[?25h[?25lc[28;97H5[1;15H[?25h[?25lh[28;97H6[1;16H[?25h[?25lo[28;97H7[1;17H[?25h[?25l[28;97H8[1;18H[?25h[?25l"[28;97H9[1;19H[?25h[?25ls[28;96H20[1;20H[?25h[?25la[28;97H1[1;21H[?25h[?25ll[28;97H2[1;22H[?25h[?25la[28;97H3[1;23H[?25h[?25lr[28;97H4[1;24H[?25h[?25ly[28;97H5[1;25H[?25h[?25l[1;24H[K[28;97H4[1;24H[?25h[?25l[1;23H[K[28;97H3[1;23H[?25h[?25l[1;22H[K[28;97H2[1;22H[?25h[?25l[1;21H[K[28;97H1[1;21H[?25h[?25l[1;20H[K[28;97H0[1;20H[?25h[?25l[1;19H[K[28;96H19[1;19H[?25h[?25lS[28;96H20[1;20H[?25h[?25la[28;97H1[1;21H[?25h[?25ll[28;97H2[1;22H[?25h[?25la[28;97H3[1;23H[?25h[?25lr[28;97H4[1;24H[?25h[?25ly[28;97H5[1;25H[?25h[?25l[28;97H6[1;26H[?25h[?25lC[28;97H7[1;27H[?25h[?25lr[28;97H8[1;28H[?25h[?25le[28;97H9[1;29H[?25h[?25ld[28;96H30[1;30H[?25h[?25li[28;97H1[1;31H[?25h[?25lt[28;97H2[1;32H[?25h[?25le[28;97H3[1;33H[?25h[?25ld[28;97H4[1;34H[?25h[?25l"[28;97H5[1;35H[?25h[?25l>[28;97H6[1;36H[?25h[?25l/[28;97H7[1;37H[?25h[?25ld[28;97H8[1;38H[?25h[?25le[28;97H9[1;39H[?25h[?25lv[28;96H40[1;40H[?25h[?25l/[28;97H1[1;41H[?25h[?25lt[28;97H2[1;42H[?25h[?25lt[28;97H3[1;43H[?25h[?25ly[28;97H4[1;44H[?25h[28;1H[K[1;43H[?25l[28;84H^[[1;43H[28;84H  [1;44H[28;94H1,43[10CAll[1;43H[?25h[?25l[28;84H:[1;43H[28;84H[K[28;1H:[?2004h[?25hwq[?25l[?2004l"scheduled-file" [New] 1L, 44C written[23;2t[23;1t
[?2004l[?1l>[?25h[>4;m[?1049l[23;0;0t[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# crontab scheduled-file 
[?2004l[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# crontab scheduled-file [K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kvi scheduled-file[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[K[Kbatchcat output.txt [10Pbatch[K
[?2004l[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# batch[Kcrom[Kntab -l
[?2004l15 20 1 * * echo "Salary Credited">/dev/tty
[?2004h]0;root@Ubuntu-Server-20: /home/kinshukroot@Ubuntu-Server-20:/home/kinshuk# exit
[?2004lexit
[?2004h]0;kinshuk@Ubuntu-Server-20: ~[01;32mkinshuk@Ubuntu-Server-20[00m:[01;34m~[00m$ exit
[?2004lexit

Script done on 2023-11-02 07:45:43+00:00 [COMMAND_EXIT_CODE="0"]
