package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import ut.l;

/* loaded from: classes.dex */
public final class AFf1aSDK {
    private static /* synthetic */ boolean AFInAppEventParameterName(AFf1aSDK aFf1aSDK, String str) {
        return AFKeystoreWrapper(str, TimeUnit.HOURS, 1L);
    }

    public final boolean AFKeystoreWrapper(String str) {
        return AFInAppEventParameterName(this, str);
    }

    private static boolean AFKeystoreWrapper(String str, @NotNull TimeUnit timeUnit, long j10) {
        Long h10;
        Object a10;
        Intrinsics.checkNotNullParameter(timeUnit, "");
        if (str != null && (h10 = r.h(str)) != null) {
            try {
                l.Companion companion = ut.l.INSTANCE;
                a10 = Boolean.valueOf(Math.abs(h10.longValue() - TimeUnit.MILLISECONDS.toSeconds(AFb1vSDK.AFKeystoreWrapper().AFInAppEventParameterName().e().AFInAppEventType())) < timeUnit.toSeconds(1L));
            } catch (Throwable th2) {
                l.Companion companion2 = ut.l.INSTANCE;
                a10 = ut.n.a(th2);
            }
            Throwable a11 = ut.l.a(a10);
            if (a11 != null) {
                StringBuilder sb2 = new StringBuilder("Could not convert ");
                sb2.append(str);
                sb2.append(" to TS");
                AFLogger.afErrorLog(sb2.toString(), a11);
            }
            if (a10 instanceof ut.m) {
                a10 = null;
            }
            Boolean bool = (Boolean) a10;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return false;
    }
}
