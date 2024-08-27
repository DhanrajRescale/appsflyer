package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public interface AFd1vSDK {

    /* loaded from: classes.dex */
    public static final class AFa1uSDK {
        public final float valueOf;
        public final String values;

        public AFa1uSDK(float f10, String str) {
            this.valueOf = f10;
            this.values = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1uSDK)) {
                return false;
            }
            AFa1uSDK aFa1uSDK = (AFa1uSDK) obj;
            return Intrinsics.a(Float.valueOf(this.valueOf), Float.valueOf(aFa1uSDK.valueOf)) && Intrinsics.a(this.values, aFa1uSDK.values);
        }

        public final int hashCode() {
            int hashCode = Float.hashCode(this.valueOf) * 31;
            String str = this.values;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BatteryData(level=");
            sb2.append(this.valueOf);
            sb2.append(", charging=");
            sb2.append(this.values);
            sb2.append(')');
            return sb2.toString();
        }
    }

    @NotNull
    AFa1uSDK AFInAppEventParameterName(@NotNull Context context);
}
