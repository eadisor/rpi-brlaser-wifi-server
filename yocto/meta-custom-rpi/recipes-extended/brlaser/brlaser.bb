SUMMARY = "Driver for (some) Brother laster printers"
HOMEPAGE = "https://github.com/pdewacht/brlaser.git"
#LICENSE = "none"
#md5=b234ee4d69f5fce4486a80fdaf4a4263"
#LIC_FILES_CHKSUM = "COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S="${WORKDIR}/git"

#DEPENDS = "popt"

SRC_URI = "git://github.com/pdewacht/brlaser.git;protocol=https;tag=03bb366e751bc99f7d48522626eca757396362a2"
SRC_URI[md5sum] = "8e7cc038ede279cd1dfe68f66f684bd0"
SRC_URI[sha256sum] = "e87da7401284542c45c4c1f755663e1e3b2c4216d619ed35bd318e4d6e2d5ca4"

INSANE_SKIP = "debug-files"

inherit autotools


FILES_${PN} = " /usr/ "
FILES_${PN}-dbg = " /usr/lib/cups/filter/.debug "





