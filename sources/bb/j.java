package bb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6928a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6929b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6930c;

    public j(String phoneNumber, String otp, String sessionId) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(otp, "otp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f6928a = phoneNumber;
        this.f6929b = otp;
        this.f6930c = sessionId;
    }
}
