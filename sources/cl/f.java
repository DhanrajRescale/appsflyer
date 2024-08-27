package cl;

import android.widget.TextView;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f8224a = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0078, code lost:
    
        if (r3.getInputType() == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0062, code lost:
    
        if (r3.getInputType() == 112) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004a, code lost:
    
        if (r3.getInputType() == 96) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x002a, code lost:
    
        if ((r3.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean b(android.view.View r6) {
        /*
            java.lang.Class<cl.f> r0 = cl.f.class
            boolean r1 = sl.a.b(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r6 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> Lb0
            if (r1 == 0) goto Lb3
            cl.f r1 = cl.f.f8224a
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = sl.a.b(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L1a
            goto L31
        L1a:
            int r4 = r3.getInputType()     // Catch: java.lang.Throwable -> L2d
            r5 = 128(0x80, float:1.8E-43)
            if (r4 != r5) goto L24
            goto Lb2
        L24:
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod     // Catch: java.lang.Throwable -> L2d
            if (r3 != 0) goto Lb2
            goto L31
        L2d:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Throwable -> Lb0
        L31:
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Lb0
            boolean r3 = r1.a(r3)     // Catch: java.lang.Throwable -> Lb0
            if (r3 != 0) goto Lb2
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = sl.a.b(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L44
            goto L52
        L44:
            int r3 = r3.getInputType()     // Catch: java.lang.Throwable -> L4e
            r4 = 96
            if (r3 != r4) goto L52
            goto Lb2
        L4e:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Throwable -> Lb0
        L52:
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = sl.a.b(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L5c
            goto L69
        L5c:
            int r3 = r3.getInputType()     // Catch: java.lang.Throwable -> L65
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L69
            goto Lb2
        L65:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Throwable -> Lb0
        L69:
            r3 = r6
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = sl.a.b(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L73
            goto L7f
        L73:
            int r3 = r3.getInputType()     // Catch: java.lang.Throwable -> L7b
            r4 = 3
            if (r3 != r4) goto L7f
            goto Lb2
        L7b:
            r3 = move-exception
            sl.a.a(r1, r3)     // Catch: java.lang.Throwable -> Lb0
        L7f:
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch: java.lang.Throwable -> Lb0
            boolean r3 = sl.a.b(r1)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L88
            goto Lb3
        L88:
            int r3 = r6.getInputType()     // Catch: java.lang.Throwable -> Lab
            r4 = 32
            if (r3 != r4) goto L91
            goto Lb2
        L91:
            java.lang.String r6 = cl.g.i(r6)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto Lb3
            int r3 = r6.length()     // Catch: java.lang.Throwable -> Lab
            if (r3 != 0) goto L9e
            goto Lb3
        L9e:
            java.util.regex.Pattern r3 = android.util.Patterns.EMAIL_ADDRESS     // Catch: java.lang.Throwable -> Lab
            java.util.regex.Matcher r6 = r3.matcher(r6)     // Catch: java.lang.Throwable -> Lab
            boolean r6 = r6.matches()     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto Lb3
            goto Lb2
        Lab:
            r6 = move-exception
            sl.a.a(r1, r6)     // Catch: java.lang.Throwable -> Lb0
            goto Lb3
        Lb0:
            r6 = move-exception
            goto Lb4
        Lb2:
            r2 = 1
        Lb3:
            return r2
        Lb4:
            sl.a.a(r0, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: cl.f.b(android.view.View):boolean");
    }

    public final boolean a(TextView textView) {
        int i10;
        if (sl.a.b(this)) {
            return false;
        }
        try {
            String replace = new Regex("\\s").replace(g.i(textView), HttpUrl.FRAGMENT_ENCODE_SET);
            int length = replace.length();
            if (length >= 12 && length <= 19) {
                int i11 = length - 1;
                if (i11 >= 0) {
                    boolean z10 = false;
                    i10 = 0;
                    while (true) {
                        int i12 = i11 - 1;
                        char charAt = replace.charAt(i11);
                        if (!Character.isDigit(charAt)) {
                            return false;
                        }
                        int digit = Character.digit((int) charAt, 10);
                        if (digit >= 0) {
                            if (z10 && (digit = digit * 2) > 9) {
                                digit = (digit % 10) + 1;
                            }
                            i10 += digit;
                            z10 = !z10;
                            if (i12 < 0) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            throw new IllegalArgumentException("Char " + charAt + " is not a decimal digit");
                        }
                    }
                } else {
                    i10 = 0;
                }
                if (i10 % 10 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }
}
