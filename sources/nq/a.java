package nq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f29073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f29074b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29075c;

    public a(String str, long j10, long j11) {
        this.f29073a = str;
        this.f29074b = j10;
        this.f29075c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f29073a.equals(aVar.f29073a) && this.f29074b == aVar.f29074b && this.f29075c == aVar.f29075c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f29073a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f29074b;
        long j11 = this.f29075c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f29073a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f29074b);
        sb2.append(", tokenCreationTimestamp=");
        return a3.a.j(sb2, this.f29075c, UrlTreeKt.componentParamSuffix);
    }
}
