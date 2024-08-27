package kp;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class i implements h, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f23439a;

    public i(List list) {
        this.f23439a = list;
    }

    @Override // kp.h
    public final boolean apply(Object obj) {
        int i10 = 0;
        while (true) {
            List list = this.f23439a;
            if (i10 < list.size()) {
                if (!((h) list.get(i10)).apply(obj)) {
                    return false;
                }
                i10++;
            } else {
                return true;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f23439a.equals(((i) obj).f23439a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23439a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.and(");
        boolean z10 = true;
        for (Object obj : this.f23439a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
