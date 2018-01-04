#!/bin/bash

export TEMPLATECONF=`pwd`/yocto/meta-custom-rpi/conf

#echo 'bitbake rpi-basic-image '
. ./yocto/poky/oe-init-build-env ./build

echo 'To build run the following in order:'
echo '   bitbake rpi-basic-image -c fetchall'
echo '   bitbake rpi-basic-image'


