package hp;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f18639a;

    public e(long j10) {
        this.f18639a = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            eVar.getClass();
            if (this.f18639a == eVar.f18639a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f18639a;
        return ((int) ((j10 >>> 32) ^ j10)) ^ (-724379968);
    }

    public final String toString() {
        return "EventRecord{eventType=3, eventTimestamp=" + this.f18639a + UrlTreeKt.componentParamSuffix;
    }
}
