package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0017\b&\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b \u0010!J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJO\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0014\u0010\nJ)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0015\u0010\nJ)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0016\u0010\nJ\u001d\u0010\u0018\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0002H\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u0004*\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001f\u001a\u00020\u00068\u0017X\u0096D¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/appsflyer/internal/AFg1fSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/appsflyer/internal/AFg1aSDK;", "tag", HttpUrl.FRAGMENT_ENCODE_SET, "msg", HttpUrl.FRAGMENT_ENCODE_SET, "shouldRemoteDebug", HttpUrl.FRAGMENT_ENCODE_SET, "d", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1aSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "values", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1aSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "AFInAppEventParameterName", "Z", "getShouldExtendMsg", "()Z", "shouldExtendMsg", "<init>", "()V", "AFa1tSDK"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFg1fSDK {
    public static long values = System.currentTimeMillis();

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    private final boolean shouldExtendMsg;

    public static /* synthetic */ void d$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            aFg1fSDK.d(aFg1aSDK, str, z10);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void e$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, Throwable th2, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        if (obj == null) {
            if ((i10 & 8) != 0) {
                z14 = true;
            } else {
                z14 = z10;
            }
            if ((i10 & 16) != 0) {
                z15 = true;
            } else {
                z15 = z11;
            }
            if ((i10 & 32) != 0) {
                z16 = true;
            } else {
                z16 = z12;
            }
            if ((i10 & 64) != 0) {
                z17 = true;
            } else {
                z17 = z13;
            }
            aFg1fSDK.e(aFg1aSDK, str, th2, z14, z15, z16, z17);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void i$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            aFg1fSDK.i(aFg1aSDK, str, z10);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void v$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            aFg1fSDK.v(aFg1aSDK, str, z10);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void w$default(AFg1fSDK aFg1fSDK, AFg1aSDK aFg1aSDK, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            aFg1fSDK.w(aFg1aSDK, str, z10);
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        d$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1aSDK, str, th2, false, false, false, false, 120, null);
    }

    public void force(@NotNull AFg1aSDK tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public boolean getShouldExtendMsg() {
        return this.shouldExtendMsg;
    }

    public final void i(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        i$default(this, aFg1aSDK, str, false, 4, null);
    }

    public final void v(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        v$default(this, aFg1aSDK, str, false, 4, null);
    }

    @NotNull
    public final String values(String str, @NotNull AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        if (str == null || w.C(str)) {
            str = "null";
        }
        String withTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1aSDK);
        if (getShouldExtendMsg()) {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(System.currentTimeMillis() - values);
            sb2.append(") [");
            sb2.append(Thread.currentThread().getName());
            sb2.append("] ");
            sb2.append(withTag$SDK_prodRelease);
            return sb2.toString();
        }
        return withTag$SDK_prodRelease;
    }

    public final void w(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        w$default(this, aFg1aSDK, str, false, 4, null);
    }

    @NotNull
    public final String withTag$SDK_prodRelease(@NotNull String str, @NotNull AFg1aSDK aFg1aSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(aFg1aSDK.values);
        sb2.append("] ");
        sb2.append(str);
        return sb2.toString();
    }

    public void d(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2, boolean z10) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1aSDK, str, th2, z10, false, false, false, 112, null);
    }

    public void i(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void v(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public void w(@NotNull AFg1aSDK tag, @NotNull String msg, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
    }

    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1aSDK, str, th2, z10, z11, false, false, 96, null);
    }

    public final void e(@NotNull AFg1aSDK aFg1aSDK, @NotNull String str, @NotNull Throwable th2, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1aSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th2, "");
        e$default(this, aFg1aSDK, str, th2, z10, z11, z12, false, 64, null);
    }

    public void e(@NotNull AFg1aSDK tag, @NotNull String msg, @NotNull Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
        Intrinsics.checkNotNullParameter(tag, "");
        Intrinsics.checkNotNullParameter(msg, "");
        Intrinsics.checkNotNullParameter(throwable, "");
    }
}
