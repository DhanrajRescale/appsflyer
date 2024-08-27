package bv;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j0 extends f {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f7366a;

    public j0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f7366a = socket;
    }

    @Override // bv.f
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // bv.f
    public final void timedOut() {
        Socket socket = this.f7366a;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (hl.f.v0(e10)) {
                z.f7404a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            z.f7404a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
