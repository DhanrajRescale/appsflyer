package okhttp3.logging;

import bv.j;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Lbv/j;", HttpUrl.FRAGMENT_ENCODE_SET, "isProbablyUtf8", "okhttp-logging-interceptor"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class Utf8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, bv.j] */
    public static final boolean isProbablyUtf8(@NotNull j isProbablyUtf8) {
        long j10;
        Intrinsics.e(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            ?? obj = new Object();
            long j11 = isProbablyUtf8.f7365b;
            if (j11 > 64) {
                j10 = 64;
            } else {
                j10 = j11;
            }
            isProbablyUtf8.d(0L, obj, j10);
            for (int i10 = 0; i10 < 16; i10++) {
                if (!obj.p()) {
                    int I = obj.I();
                    if (Character.isISOControl(I) && !Character.isWhitespace(I)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
