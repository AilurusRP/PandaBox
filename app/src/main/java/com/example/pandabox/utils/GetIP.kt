package com.example.pandabox.utils

import java.net.NetworkInterface
import java.util.*

fun getLocalIpAddress(): String {
    try {
        val interfaces: List<NetworkInterface> =
            Collections.list(NetworkInterface.getNetworkInterfaces())
        for (intf in interfaces) {
            val addresses = Collections.list(intf.inetAddresses)
            for (address in addresses) {
                if (!address.isLoopbackAddress && address.isSiteLocalAddress) {
                    return address.hostAddress
                }
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return "No valid local IP found."
}