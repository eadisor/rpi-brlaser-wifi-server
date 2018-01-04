SUMMARY = "Filters for CUPS"
DESCRIPTION = "As of CUPS 1.6 a lot of filters are no longer provided in the default \
               CUPS source such as texttops. This adds them back in."

inherit autotools-brokensep pkgconfig

#DEPENDS += "poppler freetype fontconfig ijs qpdf"
DEPENDS += " poppler lcms ijs freetype fontconfig qpdf "

PR = "r2"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://NEWS;md5=316ec62b153a734418829e0b48726afd"

SRC_URI += "http://openprinting.org/download/cups-filters/cups-filters-${PV}.tar.bz2"

SRC_URI[md5sum] = "252cfa4182b6f3e344f97b9205da7134"
SRC_URI[sha256sum] = "ac917028a79fc644ada44b01e48cd23e9ff778916413df89d552e14d75d9efdd"


EXTRA_OECONF += " \
               --disable-avahi \
               --enable-dbus \
               --without-tiff \
               --without-php \
               --without-jpeg \  
               "


			   
			   
FILES_${PN}-dbg += "/usr/lib/cups/filter/.debug \
                    /usr/lib/cups/backend/.debug \
                   "
# specifically leaving out gstopxl, gstoraster and foomatic-rip filters since
# they are all provided by other recipes
FILES_${PN} += "/usr/lib/cups/backend \
                /usr/lib/cups/filter/pdftoopvp \
                /usr/lib/cups/filter/rastertopclx \
                /usr/lib/cups/filter/texttopdf \
                /usr/lib/cups/filter/imagetoraster \
                /usr/lib/cups/filter/imagetopdf \
                /usr/lib/cups/filter/rastertoescpx \
                /usr/lib/cups/filter/pstopdf \
                /usr/lib/cups/filter/bannertopdf \
                /usr/lib/cups/filter/urftopdf \
                /usr/lib/cups/filter/commandtopclx \
                /usr/lib/cups/filter/commandtoescpx \
                /usr/lib/cups/filter/imagetops \
                /usr/lib/cups/filter/texttops \
                /usr/lib/cups/filter/pdftops \
                /usr/lib/cups/filter/pdftoijs \
                /usr/lib/cups/filter/pdftopdf \
                /usr/lib/cups/filter/pdftoraster \
                /usr/lib/cups/filter/pdftoippprinter \
                /usr/lib/cups/filter/textonly \
                /usr/share/cups \
                /usr/share/ppd \
                "
				
PACKAGES += " ${PN}-deleted "  				
FILES_${PN}-deleted = "\
				/usr/lib/cups/filter/brftoembosser \
				/usr/lib/cups/filter/texttobrf \
				/usr/lib/cups/filter/textbrftoindexv4 \
				/usr/lib/cups/filter/foomatic-rip \
				/usr/lib/cups/filter/textbrftoindexv3 \
				/usr/lib/cups/filter/imageubrltoindexv3 \
				/usr/lib/cups/filter/sys5ippprinter \
				/usr/lib/cups/filter/imagetobrf \
				/usr/lib/cups/filter/gstopxl \
				/usr/lib/cups/filter/imagetoubrl \
				/usr/lib/cups/filter/imageubrltoindexv4 \
				/usr/lib/cups/filter/rastertopdf \
				/usr/lib/cups/filter/gstoraster \
"


do_install_append(){
				 
				rm -f ${D}/usr/lib/cups/backend/beh 
				rm -f ${D}/usr/share/cups/data/testprint 
				rm -f ${D}/usr/share/cups/banners/secret 
				rm -f ${D}/usr/share/cups/banners/classified 
				rm -f ${D}/usr/share/cups/banners/confidential 
				rm -f ${D}/usr/share/cups/banners/standard 
				rm -f ${D}/usr/share/cups/banners/unclassified 
				rm -f ${D}/usr/share/cups/banners/topsecret 	
}
