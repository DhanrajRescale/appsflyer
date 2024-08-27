package mv;

import el.l;
import hv.r;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a, reason: collision with root package name */
    public final hv.g f28091a;

    /* renamed from: b, reason: collision with root package name */
    public final r f28092b;

    /* renamed from: c, reason: collision with root package name */
    public final r f28093c;

    public e(hv.g gVar, r rVar, r rVar2) {
        this.f28091a = gVar;
        this.f28092b = rVar;
        this.f28093c = rVar2;
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        e eVar = (e) obj;
        r rVar = this.f28092b;
        hv.e o10 = hv.e.o(this.f28091a.l(rVar), r1.f18727b.f18734d);
        hv.e o11 = hv.e.o(eVar.f28091a.l(eVar.f28092b), r1.f18727b.f18734d);
        o10.getClass();
        int C = l.C(o10.f18717a, o11.f18717a);
        if (C == 0) {
            return o10.f18718b - o11.f18718b;
        }
        return C;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f28091a.equals(eVar.f28091a) && this.f28092b.equals(eVar.f28092b) && this.f28093c.equals(eVar.f28093c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f28091a.hashCode() ^ this.f28092b.f18764b) ^ Integer.rotateLeft(this.f28093c.f18764b, 16);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Transition[");
        r rVar = this.f28093c;
        int i10 = rVar.f18764b;
        r rVar2 = this.f28092b;
        if (i10 > rVar2.f18764b) {
            str = "Gap";
        } else {
            str = "Overlap";
        }
        sb2.append(str);
        sb2.append(" at ");
        sb2.append(this.f28091a);
        sb2.append(rVar2);
        sb2.append(" to ");
        sb2.append(rVar);
        sb2.append(']');
        return sb2.toString();
    }

    public e(long j10, r rVar, r rVar2) {
        this.f28091a = hv.g.u(j10, 0, rVar);
        this.f28092b = rVar;
        this.f28093c = rVar2;
    }
}
