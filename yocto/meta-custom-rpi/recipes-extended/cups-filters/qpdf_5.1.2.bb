SUMMARY = "QPDF"
DESCRIPTION = "A recipe to install libqpdf which is needed by the cups-filters recipe"

inherit autotools-brokensep pkgconfig
PR = "r2"

DEPENDS += "libpcre"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://README;md5=3723aae2cb310c0d5b509facfc889253"

SRC_URI += "http://downloads.sourceforge.net/qpdf/qpdf-${PV}.tar.gz"

SRC_URI[md5sum] = "0bd15ef5eea5f628951ab456c84e78ec"
SRC_URI[sha256sum] = "e9dd8d5d0a322078ffd573f057f03d24a734cc5b7dd925b089ebcb0f6e867bfd"

EXTRA_OECONF += "--with-random=/dev/urandom"



