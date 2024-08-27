package os;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f30330d = ByteBuffer.allocate(0);

    /* renamed from: a, reason: collision with root package name */
    public final o f30331a;

    /* renamed from: b, reason: collision with root package name */
    public final g f30332b;

    /* renamed from: c, reason: collision with root package name */
    public final URI f30333c;

    public i(URI uri, o oVar, Socket socket) {
        this.f30331a = oVar;
        this.f30333c = uri;
        try {
            g gVar = new g(this, uri, socket);
            this.f30332b = gVar;
            if (gVar.f17560m == null) {
                Thread thread = new Thread(gVar);
                gVar.f17560m = thread;
                thread.start();
                gVar.f17562o.await();
                gVar.f17555h.getClass();
                return;
            }
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        } catch (InterruptedException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final BufferedOutputStream a() {
        return new BufferedOutputStream(new h(this));
    }

    public final boolean b() {
        fs.b bVar = this.f30332b.f17555h;
        int i10 = bVar.f16230c;
        if (i10 != 5 && i10 != 4 && !bVar.f16229b) {
            return true;
        }
        return false;
    }
}
