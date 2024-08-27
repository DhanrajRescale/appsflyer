package gr;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.protobuf.k0;
import com.google.protobuf.u0;
import com.google.protobuf.x0;
import com.google.protobuf.y0;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class r extends com.google.protobuf.t {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final r DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile u0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private k0 customAttributes_ = k0.f11939b;
    private String url_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private String responseContentType_ = HttpUrl.FRAGMENT_ENCODE_SET;
    private com.google.protobuf.y perfSessions_ = x0.f11996d;

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.protobuf.t.t(r.class, rVar);
    }

    public static void A(r rVar, long j10) {
        rVar.bitField0_ |= 128;
        rVar.clientStartTimeUs_ = j10;
    }

    public static void B(r rVar, long j10) {
        rVar.bitField0_ |= 256;
        rVar.timeToRequestCompletedUs_ = j10;
    }

    public static void C(r rVar, long j10) {
        rVar.bitField0_ |= 512;
        rVar.timeToResponseInitiatedUs_ = j10;
    }

    public static void D(r rVar, long j10) {
        rVar.bitField0_ |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        rVar.timeToResponseCompletedUs_ = j10;
    }

    public static void E(r rVar, List list) {
        com.google.protobuf.y yVar = rVar.perfSessions_;
        if (!((com.google.protobuf.c) yVar).f11897a) {
            rVar.perfSessions_ = com.google.protobuf.t.s(yVar);
        }
        com.google.protobuf.b.g(list, rVar.perfSessions_);
    }

    public static void F(r rVar, int i10) {
        rVar.getClass();
        if (i10 != 0) {
            rVar.httpMethod_ = i10 - 1;
            rVar.bitField0_ |= 2;
            return;
        }
        throw null;
    }

    public static void G(r rVar, long j10) {
        rVar.bitField0_ |= 4;
        rVar.requestPayloadBytes_ = j10;
    }

    public static void H(r rVar, long j10) {
        rVar.bitField0_ |= 8;
        rVar.responsePayloadBytes_ = j10;
    }

    public static r J() {
        return DEFAULT_INSTANCE;
    }

    public static p b0() {
        return (p) DEFAULT_INSTANCE.l();
    }

    public static void v(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 1;
        rVar.url_ = str;
    }

    public static void w(r rVar) {
        rVar.getClass();
        rVar.networkClientErrorReason_ = w.k.e(2);
        rVar.bitField0_ |= 16;
    }

    public static void x(r rVar, int i10) {
        rVar.bitField0_ |= 32;
        rVar.httpResponseCode_ = i10;
    }

    public static void y(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 64;
        rVar.responseContentType_ = str;
    }

    public static void z(r rVar) {
        rVar.bitField0_ &= -65;
        rVar.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    public final long I() {
        return this.clientStartTimeUs_;
    }

    public final int K() {
        int i10;
        switch (this.httpMethod_) {
            case 0:
                i10 = 1;
                break;
            case 1:
                i10 = 2;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 5;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 9;
                break;
            case 9:
                i10 = 10;
                break;
            default:
                i10 = 0;
                break;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final int L() {
        return this.httpResponseCode_;
    }

    public final com.google.protobuf.y M() {
        return this.perfSessions_;
    }

    public final long N() {
        return this.requestPayloadBytes_;
    }

    public final long O() {
        return this.responsePayloadBytes_;
    }

    public final long P() {
        return this.timeToRequestCompletedUs_;
    }

    public final long Q() {
        return this.timeToResponseCompletedUs_;
    }

    public final long R() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String S() {
        return this.url_;
    }

    public final boolean T() {
        return (this.bitField0_ & 128) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean Z() {
        return (this.bitField0_ & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0;
    }

    public final boolean a0() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.protobuf.u0, java.lang.Object] */
    @Override // com.google.protobuf.t
    public final Object m(int i10) {
        if (i10 != 0) {
            switch (i10 - 1) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return new y0(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000bဌ\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", h.f17539b, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", h.f17540c, "customAttributes_", q.f17549a, "perfSessions_", w.class});
                case 3:
                    return new r();
                case 4:
                    return new com.google.protobuf.r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    u0 u0Var = PARSER;
                    u0 u0Var2 = u0Var;
                    if (u0Var == null) {
                        synchronized (r.class) {
                            try {
                                u0 u0Var3 = PARSER;
                                u0 u0Var4 = u0Var3;
                                if (u0Var3 == null) {
                                    ?? obj = new Object();
                                    PARSER = obj;
                                    u0Var4 = obj;
                                }
                            } finally {
                            }
                        }
                    }
                    return u0Var2;
                default:
                    throw new UnsupportedOperationException();
            }
        }
        throw null;
    }
}
