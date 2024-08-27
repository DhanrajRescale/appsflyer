package hl;

import android.text.TextUtils;
import com.facebook.FacebookSdk;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f18619a = new Object();

    public static final File a() {
        if (sl.a.b(g.class)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            sl.a.a(g.class, th2);
            return null;
        }
    }

    public final String b(String str) {
        int i10;
        boolean z10;
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i11 = 0;
            boolean z11 = false;
            while (i11 <= length) {
                if (!z11) {
                    i10 = i11;
                } else {
                    i10 = length;
                }
                if (Intrinsics.f(str.charAt(i10), 32) <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z11) {
                    if (!z10) {
                        z11 = true;
                    } else {
                        i11++;
                    }
                } else {
                    if (!z10) {
                        break;
                    }
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").d(str.subSequence(i11, length + 1).toString()).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }

    public final int[] c(String texts) {
        if (sl.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[128];
            String b10 = b(texts);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (b10 != null) {
                byte[] bytes = b10.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (i10 < bytes.length) {
                        iArr[i10] = bytes[i10] & 255;
                    } else {
                        iArr[i10] = 0;
                    }
                    if (i11 >= 128) {
                        return iArr;
                    }
                    i10 = i11;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return null;
        }
    }
}
