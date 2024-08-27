package jn;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.HashMap;
import java.util.Map;
import m.w;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21493a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f21494b;

    /* renamed from: c, reason: collision with root package name */
    public final l f21495c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21496d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21497e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f21498f;

    public h(String str, Integer num, l lVar, long j10, long j11, Map map) {
        this.f21493a = str;
        this.f21494b = num;
        this.f21495c = lVar;
        this.f21496d = j10;
        this.f21497e = j11;
        this.f21498f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f21498f.get(str);
        if (str2 == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21498f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final w c() {
        w wVar = new w(4);
        String str = this.f21493a;
        if (str != null) {
            wVar.f25760a = str;
            wVar.f25761b = this.f21494b;
            wVar.i(this.f21495c);
            wVar.f25763d = Long.valueOf(this.f21496d);
            wVar.f25764e = Long.valueOf(this.f21497e);
            wVar.f25765f = new HashMap(this.f21498f);
            return wVar;
        }
        throw new NullPointerException("Null transportName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f21493a.equals(hVar.f21493a)) {
            Integer num = hVar.f21494b;
            Integer num2 = this.f21494b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f21495c.equals(hVar.f21495c) && this.f21496d == hVar.f21496d && this.f21497e == hVar.f21497e && this.f21498f.equals(hVar.f21498f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f21493a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f21494b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.f21495c.hashCode()) * 1000003;
        long j10 = this.f21496d;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f21497e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f21498f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21493a + ", code=" + this.f21494b + ", encodedPayload=" + this.f21495c + ", eventMillis=" + this.f21496d + ", uptimeMillis=" + this.f21497e + ", autoMetadata=" + this.f21498f + UrlTreeKt.componentParamSuffix;
    }
}
