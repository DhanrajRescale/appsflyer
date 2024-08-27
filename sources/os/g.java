package os;

import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class g extends gs.b {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f30319r;

    /* JADX WARN: Type inference failed for: r4v1, types: [hs.c, hs.d] */
    public g(i iVar, URI uri, Socket socket) {
        this.f30319r = iVar;
        ?? cVar = new hs.c();
        this.f17554g = null;
        this.f17555h = null;
        this.f17556i = null;
        this.f17559l = Proxy.NO_PROXY;
        this.f17562o = new CountDownLatch(1);
        this.f17563p = new CountDownLatch(1);
        this.f17554g = uri;
        this.f17561n = null;
        this.f17564q = 5000;
        this.f17555h = new fs.b(this, cVar);
        if (this.f17556i == null) {
            this.f17556i = socket;
            return;
        }
        throw new IllegalStateException("socket has already been set");
    }

    @Override // gs.b
    public final void u0(Exception exc) {
        if (exc.getMessage() != null) {
            el.l.M("MixpanelAPI.EditorCnctn", "Websocket Error: " + exc.getMessage());
            return;
        }
        el.l.M("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
    }
}
