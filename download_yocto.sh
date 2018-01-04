#!/bin/bash

#apt-get install bc  build-essential  chrpath  diffstat  gawk  git  libncurses5-dev  pkg-config  subversion  texi2html  texinfo  u-boot-tool
#dpkg-reconfigure dash
#
 
(D='poky' 					; if [ -d ./yocto/$D ] ; then echo 'download skipped '$D;  exit ; fi ; mkdir -p ./yocto/$D ; cd ./yocto/$D ;  git clone -b jethro git://git.yoctoproject.org/poky.git . ; git checkout  b1f23d1254682866236bfaeb843c0d8aa332efc2)
(D='meta-raspberrypi' 					; if [ -d ./yocto/$D ] ; then echo 'download skipped '$D;  exit ; fi ; mkdir -p ./yocto/$D ; cd ./yocto/$D ;  git clone -b jethro git://git.yoctoproject.org/meta-raspberrypi . ; git checkout  d49102e594ec50a389009d67ebae1cc529e06b07)
(D='meta-openembedded' 		; if [ -d ./yocto/$D ] ; then echo 'download skipped '$D;  exit ; fi ; mkdir -p ./yocto/$D ; cd ./yocto/$D ;  git clone -b jethro git://git.openembedded.org/meta-openembedded . ; git checkout dc5634968b270dde250690609f0015f881db81f2  )
  