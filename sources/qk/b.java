package qk;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.security.MessageDigest;
import xj.g;

/* loaded from: classes.dex */
public final class b implements g {

    /* renamed from: b, reason: collision with root package name */
    public final Object f32082b;

    public b(Object obj) {
        if (obj != null) {
            this.f32082b = obj;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // xj.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f32082b.toString().getBytes(g.f40298a));
    }

    @Override // xj.g
    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return this.f32082b.equals(((b) obj).f32082b);
        }
        return false;
    }

    @Override // xj.g
    public final int hashCode() {
        return this.f32082b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f32082b + UrlTreeKt.componentParamSuffixChar;
    }
}
