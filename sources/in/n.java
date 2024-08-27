package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.List;

/* loaded from: classes2.dex */
public final class n extends u {

    /* renamed from: a, reason: collision with root package name */
    public final long f20435a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20436b;

    /* renamed from: c, reason: collision with root package name */
    public final s f20437c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f20438d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20439e;

    /* renamed from: f, reason: collision with root package name */
    public final List f20440f;

    /* renamed from: g, reason: collision with root package name */
    public final y f20441g;

    public n(long j10, long j11, s sVar, Integer num, String str, List list, y yVar) {
        this.f20435a = j10;
        this.f20436b = j11;
        this.f20437c = sVar;
        this.f20438d = num;
        this.f20439e = str;
        this.f20440f = list;
        this.f20441g = yVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        n nVar = (n) ((u) obj);
        if (this.f20435a == nVar.f20435a) {
            if (this.f20436b == nVar.f20436b) {
                s sVar = nVar.f20437c;
                s sVar2 = this.f20437c;
                if (sVar2 != null ? sVar2.equals(sVar) : sVar == null) {
                    Integer num = nVar.f20438d;
                    Integer num2 = this.f20438d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = nVar.f20439e;
                        String str2 = this.f20439e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = nVar.f20440f;
                            List list2 = this.f20440f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                y yVar = nVar.f20441g;
                                y yVar2 = this.f20441g;
                                if (yVar2 == null) {
                                    if (yVar == null) {
                                        return true;
                                    }
                                } else if (yVar2.equals(yVar)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f20435a;
        long j11 = this.f20436b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        int i11 = 0;
        s sVar = this.f20437c;
        if (sVar == null) {
            hashCode = 0;
        } else {
            hashCode = sVar.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        Integer num = this.f20438d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 ^ hashCode2) * 1000003;
        String str = this.f20439e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 ^ hashCode3) * 1000003;
        List list = this.f20440f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        y yVar = this.f20441g;
        if (yVar != null) {
            i11 = yVar.hashCode();
        }
        return i15 ^ i11;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f20435a + ", requestUptimeMs=" + this.f20436b + ", clientInfo=" + this.f20437c + ", logSource=" + this.f20438d + ", logSourceName=" + this.f20439e + ", logEvents=" + this.f20440f + ", qosTier=" + this.f20441g + UrlTreeKt.componentParamSuffix;
    }
}
