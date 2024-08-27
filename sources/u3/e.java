package u3;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import t.q;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final hr.c f36710a;

    /* renamed from: b, reason: collision with root package name */
    public static final q f36711b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f36710a = new hr.c(7);
        } else if (i10 >= 28) {
            f36710a = new h();
        } else if (i10 >= 26) {
            f36710a = new h();
        } else {
            Method method = g.f36719f;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f36710a = new hr.c(7);
            } else {
                f36710a = new f();
            }
        }
        f36711b = new q(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.equals(r5) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r15, t3.e r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, t3.b r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.e.a(android.content.Context, t3.e, android.content.res.Resources, int, java.lang.String, int, int, t3.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
