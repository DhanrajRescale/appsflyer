package on;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f30116a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30117b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f30118c;

    public b(long j10, long j11, Set set) {
        this.f30116a = j10;
        this.f30117b = j11;
        this.f30118c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f30116a == bVar.f30116a && this.f30117b == bVar.f30117b && this.f30118c.equals(bVar.f30118c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f30116a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f30117b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f30118c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f30116a + ", maxAllowedDelay=" + this.f30117b + ", flags=" + this.f30118c + UrlTreeKt.componentParamSuffix;
    }
}
