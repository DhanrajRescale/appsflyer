package hs;

/* loaded from: classes2.dex */
public final class d extends c {
    @Override // hs.c, hs.a
    public final int b(js.a aVar) {
        if (c.n(aVar) == 13) {
            return 1;
        }
        return 2;
    }

    @Override // hs.c, hs.a
    public final js.a g(js.c cVar) {
        super.g(cVar);
        cVar.h("Sec-WebSocket-Version", "13");
        return cVar;
    }
}
