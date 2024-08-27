package pp;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f31259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f31260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f31261c;

    public a(long j10, long j11, long j12) {
        this.f31259a = j10;
        this.f31260b = j11;
        this.f31261c = j12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f31259a == aVar.f31259a && this.f31260b == aVar.f31260b && this.f31261c == aVar.f31261c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f31259a;
        long j11 = this.f31260b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f31261c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f31259a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f31260b);
        sb2.append(", uptimeMillis=");
        return a3.a.j(sb2, this.f31261c, UrlTreeKt.componentParamSuffix);
    }
}
