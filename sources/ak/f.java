package ak;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class f implements xj.g {

    /* renamed from: b, reason: collision with root package name */
    public final xj.g f470b;

    /* renamed from: c, reason: collision with root package name */
    public final xj.g f471c;

    public f(xj.g gVar, xj.g gVar2) {
        this.f470b = gVar;
        this.f471c = gVar2;
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        this.f470b.a(messageDigest);
        this.f471c.a(messageDigest);
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f470b.equals(fVar.f470b) || !this.f471c.equals(fVar.f471c)) {
            return false;
        }
        return true;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f471c.hashCode() + (this.f470b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f470b + ", signature=" + this.f471c + UrlTreeKt.componentParamSuffixChar;
    }
}
