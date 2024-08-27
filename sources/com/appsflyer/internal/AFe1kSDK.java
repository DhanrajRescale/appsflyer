package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFe1kSDK {

    @NotNull
    final String valueOf;

    @NotNull
    final String values;

    public AFe1kSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.values = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1kSDK)) {
            return false;
        }
        AFe1kSDK aFe1kSDK = (AFe1kSDK) obj;
        return Intrinsics.a(this.valueOf, aFe1kSDK.valueOf) && Intrinsics.a(this.values, aFe1kSDK.values);
    }

    public final int hashCode() {
        return this.values.hashCode() + (this.valueOf.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HostConfig(prefix=");
        sb2.append(this.valueOf);
        sb2.append(", host=");
        sb2.append(this.values);
        sb2.append(')');
        return sb2.toString();
    }
}
