package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\r\u001a\u00020\tX\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\tX\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFe1hSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1eSDK;", "values", "Lcom/appsflyer/internal/AFe1eSDK;", "AFInAppEventType", "AFKeystoreWrapper", "Ljava/lang/String;", "AFInAppEventParameterName", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1eSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFe1hSDK {

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final String AFInAppEventParameterName;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    @NotNull
    public final String values;

    /* renamed from: values, reason: from kotlin metadata */
    @NotNull
    public final AFe1eSDK AFInAppEventType;

    public AFe1hSDK(@NotNull String str, String str2, @NotNull AFe1eSDK aFe1eSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1eSDK, "");
        this.values = str;
        this.AFInAppEventParameterName = str2;
        this.AFInAppEventType = aFe1eSDK;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFe1hSDK)) {
            return false;
        }
        AFe1hSDK aFe1hSDK = (AFe1hSDK) p02;
        return Intrinsics.a(this.values, aFe1hSDK.values) && Intrinsics.a(this.AFInAppEventParameterName, aFe1hSDK.AFInAppEventParameterName) && this.AFInAppEventType == aFe1hSDK.AFInAppEventType;
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode() * 31;
        String str = this.AFInAppEventParameterName;
        return this.AFInAppEventType.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFe1hSDK(values=");
        sb2.append(this.values);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(')');
        return sb2.toString();
    }
}
