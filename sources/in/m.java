package in;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class m extends t {

    /* renamed from: a, reason: collision with root package name */
    public final long f20428a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f20429b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20430c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f20431d;

    /* renamed from: e, reason: collision with root package name */
    public final String f20432e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20433f;

    /* renamed from: g, reason: collision with root package name */
    public final x f20434g;

    public m(long j10, Integer num, long j11, byte[] bArr, String str, long j12, x xVar) {
        this.f20428a = j10;
        this.f20429b = num;
        this.f20430c = j11;
        this.f20431d = bArr;
        this.f20432e = str;
        this.f20433f = j12;
        this.f20434g = xVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        m mVar = (m) tVar;
        if (this.f20428a == mVar.f20428a && ((num = this.f20429b) != null ? num.equals(mVar.f20429b) : mVar.f20429b == null)) {
            if (this.f20430c == mVar.f20430c) {
                if (tVar instanceof m) {
                    bArr = ((m) tVar).f20431d;
                } else {
                    bArr = mVar.f20431d;
                }
                if (Arrays.equals(this.f20431d, bArr)) {
                    String str = mVar.f20432e;
                    String str2 = this.f20432e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f20433f == mVar.f20433f) {
                            x xVar = mVar.f20434g;
                            x xVar2 = this.f20434g;
                            if (xVar2 == null) {
                                if (xVar == null) {
                                    return true;
                                }
                            } else if (xVar2.equals(xVar)) {
                                return true;
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
        long j10 = this.f20428a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i11 = 0;
        Integer num = this.f20429b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (i10 ^ hashCode) * 1000003;
        long j11 = this.f20430c;
        int hashCode3 = (((i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f20431d)) * 1000003;
        String str = this.f20432e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (hashCode3 ^ hashCode2) * 1000003;
        long j12 = this.f20433f;
        int i14 = (i13 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        x xVar = this.f20434g;
        if (xVar != null) {
            i11 = xVar.hashCode();
        }
        return i14 ^ i11;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f20428a + ", eventCode=" + this.f20429b + ", eventUptimeMs=" + this.f20430c + ", sourceExtension=" + Arrays.toString(this.f20431d) + ", sourceExtensionJsonProto3=" + this.f20432e + ", timezoneOffsetSeconds=" + this.f20433f + ", networkConnectionInfo=" + this.f20434g + UrlTreeKt.componentParamSuffix;
    }
}
