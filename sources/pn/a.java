package pn;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.android.gms.search.SearchAuth;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f31225f;

    /* renamed from: a, reason: collision with root package name */
    public final long f31226a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31227b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31228c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31229d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31230e;

    static {
        String str;
        Long l10 = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf(SearchAuth.StatusCodes.AUTH_DISABLED);
        Long l11 = 604800000L;
        Integer num2 = 81920;
        if (l10 == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (valueOf == null) {
            str = jr.h.r(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = jr.h.r(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = jr.h.r(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f31225f = new a(l10.longValue(), num.intValue(), valueOf.intValue(), l11.longValue(), num2.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public a(long j10, int i10, int i11, long j11, int i12) {
        this.f31226a = j10;
        this.f31227b = i10;
        this.f31228c = i11;
        this.f31229d = j11;
        this.f31230e = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31226a == aVar.f31226a && this.f31227b == aVar.f31227b && this.f31228c == aVar.f31228c && this.f31229d == aVar.f31229d && this.f31230e == aVar.f31230e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31226a;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f31227b) * 1000003) ^ this.f31228c) * 1000003;
        long j11 = this.f31229d;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f31230e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f31226a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f31227b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f31228c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f31229d);
        sb2.append(", maxBlobByteSizePerRow=");
        return nn.d.m(sb2, this.f31230e, UrlTreeKt.componentParamSuffix);
    }
}
