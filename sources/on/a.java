package on;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final rn.a f30114a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f30115b;

    public a(rn.a aVar, Map map) {
        if (aVar != null) {
            this.f30114a = aVar;
            if (map != null) {
                this.f30115b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final long a(gn.c cVar, long j10, int i10) {
        long j11;
        long a10 = j10 - ((rn.c) this.f30114a).a();
        b bVar = (b) this.f30115b.get(cVar);
        long j12 = bVar.f30116a;
        int i11 = i10 - 1;
        if (j12 > 1) {
            j11 = j12;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * j12 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), a10), bVar.f30117b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f30114a.equals(aVar.f30114a) && this.f30115b.equals(aVar.f30115b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f30114a.hashCode() ^ 1000003) * 1000003) ^ this.f30115b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f30114a + ", values=" + this.f30115b + UrlTreeKt.componentParamSuffix;
    }
}
