# Copyright (C) 2016 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "WPE-On-Westeros compositor image for RaspberryPi"
LICENSE = "MIT"

include recipes-core/images/wpe-image.bb

inherit distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland opengl"
