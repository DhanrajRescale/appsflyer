package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFg1qSDK {

    @NotNull
    final String AFInAppEventParameterName;
    final int AFInAppEventType;
    final int AFKeystoreWrapper;
    final int valueOf;
    final int values;

    public AFg1qSDK(int i10, int i11, int i12, int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = i10;
        this.AFInAppEventType = i11;
        this.values = i12;
        this.valueOf = i13;
        this.AFInAppEventParameterName = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1qSDK)) {
            return false;
        }
        AFg1qSDK aFg1qSDK = (AFg1qSDK) obj;
        return this.AFKeystoreWrapper == aFg1qSDK.AFKeystoreWrapper && this.AFInAppEventType == aFg1qSDK.AFInAppEventType && this.values == aFg1qSDK.values && this.valueOf == aFg1qSDK.valueOf && Intrinsics.a(this.AFInAppEventParameterName, aFg1qSDK.AFInAppEventParameterName);
    }

    public final int hashCode() {
        return this.AFInAppEventParameterName.hashCode() + da.e.f(this.valueOf, da.e.f(this.values, da.e.f(this.AFInAppEventType, Integer.hashCode(this.AFKeystoreWrapper) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CmpTcfData(policyVersion=");
        sb2.append(this.AFKeystoreWrapper);
        sb2.append(", gdprApplies=");
        sb2.append(this.AFInAppEventType);
        sb2.append(", cmpSdkId=");
        sb2.append(this.values);
        sb2.append(", cmpSdkVersion=");
        sb2.append(this.valueOf);
        sb2.append(", tcString=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
