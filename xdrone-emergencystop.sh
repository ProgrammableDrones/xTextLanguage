#!/usr/bin/expect
spawn telnet 192.168.1.1
expect "\# "
send "reboot\r"
