package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f29330a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f29331b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f29332c;

    public d(g gVar) {
        this.f29332c = gVar;
    }

    @Override // o.f
    public final void a(c cVar) {
        boolean z10;
        c cVar2 = this.f29330a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f29329d;
            this.f29330a = cVar3;
            if (cVar3 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f29331b = z10;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f29331b) {
            if (this.f29332c.f29335a == null) {
                return false;
            }
            return true;
        }
        c cVar = this.f29330a;
        if (cVar == null || cVar.f29328c == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f29331b) {
            this.f29331b = false;
            this.f29330a = this.f29332c.f29335a;
        } else {
            c cVar2 = this.f29330a;
            if (cVar2 != null) {
                cVar = cVar2.f29328c;
            } else {
                cVar = null;
            }
            this.f29330a = cVar;
        }
        return this.f29330a;
    }
}
