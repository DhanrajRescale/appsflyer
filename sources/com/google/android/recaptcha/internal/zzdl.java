package com.google.android.recaptcha.internal;

import a3.a;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.logging.Level;
import java.util.logging.Logger;
import jr.h;

/* loaded from: classes2.dex */
public final class zzdl {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String s7;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                s7 = "null";
            } else {
                try {
                    s7 = obj.toString();
                } catch (Exception e10) {
                    String g10 = a.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(g10), (Throwable) e10);
                    s7 = h.s(UrlTreeKt.configurablePathSegmentPrefix, g10, " threw ", e10.getClass().getName(), UrlTreeKt.configurablePathSegmentSuffix);
                }
            }
            objArr[i11] = s7;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i12, indexOf);
            sb2.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
