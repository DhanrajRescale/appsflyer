package o;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f29333a;

    /* renamed from: b, reason: collision with root package name */
    public c f29334b;

    @Override // o.f
    public final void a(c cVar) {
        c cVar2;
        c cVar3;
        c cVar4 = null;
        if (this.f29333a == cVar && cVar == this.f29334b) {
            this.f29334b = null;
            this.f29333a = null;
        }
        c cVar5 = this.f29333a;
        if (cVar5 == cVar) {
            switch (((b) this).f29325c) {
                case 0:
                    cVar3 = cVar5.f29329d;
                    break;
                default:
                    cVar3 = cVar5.f29328c;
                    break;
            }
            this.f29333a = cVar3;
        }
        c cVar6 = this.f29334b;
        if (cVar6 == cVar) {
            c cVar7 = this.f29333a;
            if (cVar6 != cVar7 && cVar7 != null) {
                switch (((b) this).f29325c) {
                    case 0:
                        cVar2 = cVar6.f29328c;
                        break;
                    default:
                        cVar2 = cVar6.f29329d;
                        break;
                }
                cVar4 = cVar2;
            }
            this.f29334b = cVar4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29334b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.f29334b;
        c cVar3 = this.f29333a;
        if (cVar2 != cVar3 && cVar3 != null) {
            switch (((b) this).f29325c) {
                case 0:
                    cVar = cVar2.f29328c;
                    break;
                default:
                    cVar = cVar2.f29329d;
                    break;
            }
        } else {
            cVar = null;
        }
        this.f29334b = cVar;
        return cVar2;
    }
}
