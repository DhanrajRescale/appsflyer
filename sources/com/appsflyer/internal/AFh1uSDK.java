package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0004\b \u0010!J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX\u0087\u0002¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001e\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0015X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFh1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", HttpUrl.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "()I", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "AFKeystoreWrapper", "Ljava/lang/String;", "values", "d", "valueOf", "Ljava/lang/Boolean;", "AFInAppEventParameterName", "AFInAppEventType", "registerClient", HttpUrl.FRAGMENT_ENCODE_SET, "AFLogger", "Ljava/util/Map;", "unregisterClient", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFh1uSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    public Boolean registerClient;
    public Boolean AFInAppEventType;

    /* renamed from: AFKeystoreWrapper, reason: from kotlin metadata */
    public String values;

    @NotNull
    public Map<String, Object> AFLogger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String AFKeystoreWrapper;

    /* renamed from: registerClient, reason: from kotlin metadata */
    public Boolean unregisterClient;

    /* renamed from: valueOf, reason: from kotlin metadata */
    public Boolean AFInAppEventParameterName;

    /* renamed from: values, reason: from kotlin metadata */
    public Boolean valueOf;

    public AFh1uSDK() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFh1uSDK)) {
            return false;
        }
        AFh1uSDK aFh1uSDK = (AFh1uSDK) p02;
        return Intrinsics.a(this.values, aFh1uSDK.values) && Intrinsics.a(this.registerClient, aFh1uSDK.registerClient) && Intrinsics.a(this.AFInAppEventParameterName, aFh1uSDK.AFInAppEventParameterName) && Intrinsics.a(this.AFInAppEventType, aFh1uSDK.AFInAppEventType) && Intrinsics.a(this.valueOf, aFh1uSDK.valueOf) && Intrinsics.a(this.AFKeystoreWrapper, aFh1uSDK.AFKeystoreWrapper) && Intrinsics.a(this.unregisterClient, aFh1uSDK.unregisterClient) && Intrinsics.a(this.AFLogger, aFh1uSDK.AFLogger);
    }

    public final int hashCode() {
        String str = this.values;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.registerClient;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.AFInAppEventParameterName;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.AFInAppEventType;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.valueOf;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str2 = this.AFKeystoreWrapper;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool5 = this.unregisterClient;
        return this.AFLogger.hashCode() + ((hashCode6 + (bool5 != null ? bool5.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFh1uSDK(values=");
        sb2.append(this.values);
        sb2.append(", registerClient=");
        sb2.append(this.registerClient);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(", AFInAppEventType=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", valueOf=");
        sb2.append(this.valueOf);
        sb2.append(", AFKeystoreWrapper=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", unregisterClient=");
        sb2.append(this.unregisterClient);
        sb2.append(", AFLogger=");
        sb2.append(this.AFLogger);
        sb2.append(')');
        return sb2.toString();
    }

    private AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, @NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.values = str;
        this.registerClient = bool;
        this.AFInAppEventParameterName = bool2;
        this.AFInAppEventType = bool3;
        this.valueOf = bool4;
        this.AFKeystoreWrapper = str2;
        this.unregisterClient = bool5;
        this.AFLogger = map;
    }

    public /* synthetic */ AFh1uSDK(String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str2, Boolean bool5, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : bool2, (i10 & 8) != 0 ? null : bool3, (i10 & 16) != 0 ? null : bool4, (i10 & 32) != 0 ? null : str2, (i10 & 64) == 0 ? bool5 : null, (i10 & 128) != 0 ? new HashMap() : map);
    }
}
