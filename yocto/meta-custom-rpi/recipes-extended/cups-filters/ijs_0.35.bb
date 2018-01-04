DESCRIPTION = "Inkjet driver from linuxprinting.org"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;md5=6f2f06909c6fd797a9521cd23168ecd0"

PR = "r1"

HOMEPAGE = "http://www.linuxprinting.org/ijs/"

SRC_URI = "http://www.linuxprinting.org/ijs/download/ijs-${PV}.tar.bz2"

inherit autotools pkgconfig 

EXTRA_OECONF = " --enable-shared "

FILES_${PN} = "/usr/lib/libijs-0.35.so /usr/bin/ijs-config"
FILES_${PN}-dev = "/usr/bin/ijs_client_example /usr/bin/ijs_server_example /usr/include/ijs /usr/lib/libijs.so /usr/lib/libijs.la /usr/lib/pkgconfig"

SRC_URI[md5sum] = "896fdcb7a01c586ba6eb81398ea3f6e9"
SRC_URI[sha256sum] = "11a5f5084488c480f3ff5a24d64d7147bb64272bf60a0ba51330a56c5b50cab9"

