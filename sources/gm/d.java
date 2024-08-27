package gm;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import zp.o;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f17505a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17506b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17507c;

    public d(String str, o oVar, boolean z10) {
        this.f17505a = str;
        this.f17506b = oVar;
        this.f17507c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f17507c == dVar.f17507c && this.f17505a.equals(dVar.f17505a) && this.f17506b.equals(dVar.f17506b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f17506b.hashCode() + (this.f17505a.hashCode() * 31)) * 31) + (this.f17507c ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PhoneVerification{mNumber='");
        sb2.append(this.f17505a);
        sb2.append("', mCredential=");
        sb2.append(this.f17506b);
        sb2.append(", mIsAutoVerified=");
        return v.e.k(sb2, this.f17507c, UrlTreeKt.componentParamSuffixChar);
    }
}
