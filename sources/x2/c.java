package x2;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import o5.s;
import o7.e;
import o7.f;
import okhttp3.HttpUrl;
import s0.g;
import s5.m;

/* loaded from: classes.dex */
public class c implements s, m, v5.m, i7.c {

    /* renamed from: a, reason: collision with root package name */
    public static Field f39946a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f39947b;

    public static final float l(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float max;
        float abs = Math.abs(f10);
        float signum = Math.signum(f10);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            max = signum * fArr2[binarySearch];
        } else {
            int i10 = -(binarySearch + 1);
            int i11 = i10 - 1;
            if (i11 >= fArr.length - 1) {
                float f16 = fArr[fArr.length - 1];
                float f17 = fArr2[fArr.length - 1];
                if (f16 == g.f34069a) {
                    return g.f34069a;
                }
                return (f17 / f16) * f10;
            }
            if (i11 == -1) {
                float f18 = fArr[0];
                f13 = fArr2[0];
                f14 = f18;
                f12 = 0.0f;
                f11 = 0.0f;
            } else {
                float f19 = fArr[i11];
                float f20 = fArr[i10];
                f11 = fArr2[i11];
                f12 = f19;
                f13 = fArr2[i10];
                f14 = f20;
            }
            if (f12 == f14) {
                f15 = 0.0f;
            } else {
                f15 = (abs - f12) / (f14 - f12);
            }
            max = signum * (((f13 - f11) * Math.max(g.f34069a, Math.min(1.0f, f15))) + f11);
        }
        return max;
    }

    public static e m(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return new e(owner);
    }

    public static String n(String str) {
        if (str != null) {
            return "android-app://androidx.navigation/".concat(str);
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    public static String o(int i10, Context context) {
        String valueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        if (i10 <= 16777215) {
            return String.valueOf(i10);
        }
        try {
            valueOf = context.getResources().getResourceName(i10);
        } catch (Resources.NotFoundException unused) {
            valueOf = String.valueOf(i10);
        }
        Intrinsics.checkNotNullExpressionValue(valueOf, "try {\n                co….toString()\n            }");
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004b, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0088, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007b, code lost:
    
        if (r11 != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean p(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.c.p(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // o5.s
    public final MediaCodecInfo a(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override // s5.m
    public final long b() {
        throw new NoSuchElementException();
    }

    @Override // o5.s
    public final boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // s5.m
    public final long d() {
        throw new NoSuchElementException();
    }

    @Override // v5.m
    public final void e() {
        synchronized (w5.b.f38811a) {
            Object obj = w5.b.f38812b;
            synchronized (obj) {
                if (w5.b.f38813c) {
                    return;
                }
                long a10 = w5.b.a();
                synchronized (obj) {
                    w5.b.f38814d = a10;
                    w5.b.f38813c = true;
                }
            }
        }
    }

    @Override // v5.m
    public final void f() {
    }

    @Override // i7.c
    public final void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // i7.c
    public final void h(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override // o5.s
    public final boolean i(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // o5.s
    public final int j() {
        return MediaCodecList.getCodecCount();
    }

    @Override // o5.s
    public final boolean k() {
        return false;
    }

    @Override // s5.m
    public final boolean next() {
        return false;
    }

    public void q() {
    }

    public void r(View view, int i10) {
        if (!f39947b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f39946a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f39947b = true;
        }
        Field field = f39946a;
        if (field != null) {
            try {
                f39946a.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void s() {
    }
}
