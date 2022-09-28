This layer depends on:

    URI: git://git.yoctoproject.org/poky.git
    branch: dunfell

    URI: git://git.openembedded.org/meta-openembedded
    branch: dunfell

    URI: git://git.yoctoproject.org/meta-security.git
    branch: dunfell

Latest commits:

    poky d64bef1c7d
    meta-openembedded 8f96c05f6
    meta-security c79262a

Warnings:

    meta-networking expects a newer kernel. You should mask it to avoid compilation problems.
    You can add your own backported version from other layers if you need to use wireguard.

```
BBMASK = "meta-networking/recipes-kernel/wireguard"
```

meta-bbb layer maintainer: Xabier marquiegui <reibax@gmail.com>
