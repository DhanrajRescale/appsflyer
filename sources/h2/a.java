package h2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f17809a;

    /* renamed from: b, reason: collision with root package name */
    public final ut.d f17810b;

    public a(String str, ut.d dVar) {
        this.f17809a = str;
        this.f17810b = dVar;
    }

    public final String a() {
        return this.f17809a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.a(this.f17809a, aVar.f17809a) && Intrinsics.a(this.f17810b, aVar.f17810b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f17809a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        ut.d dVar = this.f17810b;
        if (dVar != null) {
            i11 = dVar.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f17809a + ", action=" + this.f17810b + ')';
    }
}
