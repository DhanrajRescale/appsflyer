package lp;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class r1 extends i1 implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final i1 f25050a;

    public r1(i1 i1Var) {
        i1Var.getClass();
        this.f25050a = i1Var;
    }

    @Override // lp.i1
    public final i1 a() {
        return this.f25050a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f25050a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r1) {
            return this.f25050a.equals(((r1) obj).f25050a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f25050a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f25050a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 10);
        sb2.append(valueOf);
        sb2.append(".reverse()");
        return sb2.toString();
    }
}
