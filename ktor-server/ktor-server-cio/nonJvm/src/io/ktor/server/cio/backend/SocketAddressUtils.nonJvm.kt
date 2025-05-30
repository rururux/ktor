/*
 * Copyright 2014-2022 JetBrains s.r.o and contributors. Use of this source code is governed by the Apache 2.0 license.
 */

package io.ktor.server.cio.backend

import io.ktor.network.sockets.*
import io.ktor.util.network.*

internal actual fun SocketAddress.toNetworkAddress(): NetworkAddress? {
    if (this !is InetSocketAddress) return null
    return NetworkAddress(hostname, port)
}
