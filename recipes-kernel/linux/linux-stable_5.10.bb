require linux-stable.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} CC="${KERNEL_CC}" O=${B} olddefconfig"

COMPATIBLE_MACHINE = "beaglebone"

KERNEL_DEVICETREE ?= " \
    am335x-boneblack.dtb \
    am335x-boneblack-pps.dtb \
    am335x-boneblack-wireless.dtb \
    am335x-boneblue.dtb \
    am335x-bonegreen.dtb \
    am335x-bonegreen-wireless.dtb \
    am335x-pocketbeagle.dtb \
"

LINUX_VERSION = "5.10"
LINUX_VERSION_EXTENSION = "-aingura"

FILESEXTRAPATHS:prepend := "${THISDIR}/linux-stable-${LINUX_VERSION}:"

S = "${WORKDIR}/git"

PATCHTOOL = "git"

PV = "5.10.131"
SRCREV = "f2a0073c4a8674af46fd6a7cf563cf55dfe926f1"
SRC_URI = " \
    git://github.com/beagleboard/linux.git;protocol=https;branch=${LINUX_VERSION} \
    file://0001-fix-beaglebone-black-pps-not-working.patch \
    \
"
