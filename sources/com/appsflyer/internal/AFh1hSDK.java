package com.appsflyer.internal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000e\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\t\u0010\rR\u0011\u0010\t\u001a\u00020\u0006X\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000f\u001a\u00020\u0011X\u0007¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0011\u0010\u001a\u001a\u00020\u0018X\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019"}, d2 = {"Lcom/appsflyer/internal/AFh1hSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", "AFInAppEventParameterName", "()Z", "values", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/String;", "valueOf", "AFInAppEventType", "I", HttpUrl.FRAGMENT_ENCODE_SET, "F", "AFLogger", "AFKeystoreWrapper", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/List;", "d", HttpUrl.FRAGMENT_ENCODE_SET, "J", "unregisterClient", "p1", "p2", "p3", "p4", "p5", "<init>", "(JFLjava/util/List;ILjava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFh1hSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public final String valueOf;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final int AFInAppEventParameterName;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public List<String> d;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public final String AFKeystoreWrapper;

    /* renamed from: valueOf, reason: from kotlin metadata */
    public long unregisterClient;

    /* renamed from: values, reason: from kotlin metadata */
    public final float AFInAppEventType;

    public AFh1hSDK(long j10, float f10, @NotNull List<String> list, int i10, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.unregisterClient = j10;
        this.AFInAppEventType = f10;
        this.d = list;
        this.AFInAppEventParameterName = i10;
        this.valueOf = str;
        this.AFKeystoreWrapper = str2;
    }

    public final boolean AFInAppEventParameterName() {
        if (TimeUnit.SECONDS.toMillis(this.unregisterClient) > AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object p02) {
        Class<?> cls;
        if (this == p02) {
            return true;
        }
        if (p02 != null) {
            cls = p02.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.a(AFh1hSDK.class, cls)) {
            return false;
        }
        if (p02 != null) {
            AFh1hSDK aFh1hSDK = (AFh1hSDK) p02;
            if (this.unregisterClient == aFh1hSDK.unregisterClient && this.AFInAppEventType == aFh1hSDK.AFInAppEventType && Intrinsics.a(this.d, aFh1hSDK.d) && this.AFInAppEventParameterName == aFh1hSDK.AFInAppEventParameterName && Intrinsics.a(this.valueOf, aFh1hSDK.valueOf) && Intrinsics.a(this.AFKeystoreWrapper, aFh1hSDK.AFKeystoreWrapper)) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.appsflyer.internal.model.rc.RDConfiguration");
    }

    public final int hashCode() {
        return this.AFKeystoreWrapper.hashCode() + ((this.valueOf.hashCode() + ((nn.d.e(this.d, v.e.a(this.AFInAppEventType, Long.hashCode(this.unregisterClient) * 31, 31), 31) + this.AFInAppEventParameterName) * 31)) * 31);
    }
}
