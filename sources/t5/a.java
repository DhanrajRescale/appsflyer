package t5;

import java.util.ArrayDeque;
import yk.j;

/* loaded from: classes.dex */
public final class a extends s6.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f35340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s6.c f35341g;

    public a(s6.c cVar, int i10) {
        this.f35340f = i10;
        this.f35341g = cVar;
    }

    @Override // h5.g
    public final void i() {
        boolean z10;
        switch (this.f35340f) {
            case 0:
                ArrayDeque arrayDeque = ((c) this.f35341g).f35346c;
                if (arrayDeque.size() < 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j.H0(z10);
                j.E0(!arrayDeque.contains(this));
                this.f17988b = 0;
                this.f34313d = null;
                arrayDeque.addFirst(this);
                return;
            default:
                s6.a aVar = (s6.a) this.f35341g;
                synchronized (aVar.f34301b) {
                    this.f17988b = 0;
                    this.f34313d = null;
                    int i10 = aVar.f34307h;
                    aVar.f34307h = i10 + 1;
                    aVar.f34305f[i10] = this;
                    if (!aVar.f34302c.isEmpty() && aVar.f34307h > 0) {
                        aVar.f34301b.notify();
                    }
                }
                return;
        }
    }
}
