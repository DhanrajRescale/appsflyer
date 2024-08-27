package kq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f23455a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23456b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f23455a = str;
            this.f23456b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f23455a.equals(aVar.f23455a) && this.f23456b.equals(aVar.f23456b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f23455a.hashCode() ^ 1000003) * 1000003) ^ this.f23456b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f23455a + ", usedDates=" + this.f23456b + UrlTreeKt.componentParamSuffix;
    }
}
