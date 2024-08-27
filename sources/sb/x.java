package sb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends yk.o {

    /* renamed from: d, reason: collision with root package name */
    public final String f34542d;

    /* renamed from: e, reason: collision with root package name */
    public final c f34543e;

    public x(String str, c cVar) {
        this.f34542d = str;
        this.f34543e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.a(this.f34542d, xVar.f34542d) && this.f34543e == xVar.f34543e;
    }

    public final int hashCode() {
        String str = this.f34542d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.f34543e;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowProgressBar(selectedPostId=" + this.f34542d + ", progressBarType=" + this.f34543e + ")";
    }
}
