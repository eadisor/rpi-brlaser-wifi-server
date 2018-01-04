DESCRIPTION = "R8188EU firmware"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "1"
SRC_URI = "https://github.com/lwfinger/rtl8188eu/raw/c83976d1dfb4793893158461430261562b3a5bf0/rtl8188eufw.bin"
SRC_URI[md5sum] = "aaef52a47852e599cbff63a3e7f96a94"
SRC_URI[sha256sum] = "1241ddbfc87f0495e0bf09d8b94c94680b60a3d8eeab89462b3c4d8d3e8a1ee0"
		  

S = "${WORKDIR}/"

PR = "r4"



FILES_${PN} = " /lib "

do_install() {
    install -d ${D}/lib/firmware/rtlwifi

    cp ${S}/rtl8188eufw.bin ${D}/lib/firmware/rtlwifi
	
}



