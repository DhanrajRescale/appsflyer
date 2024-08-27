package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import vt.g0;
import vt.z;

/* loaded from: classes2.dex */
public class l extends j {
    public static String b(String str) {
        int i10;
        Comparable comparable;
        int i11;
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "newIndent");
        List F = w.F(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F) {
            if (!w.C((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z.k(arrayList));
        Iterator it = arrayList.iterator();
        while (true) {
            i10 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str3 = (String) it.next();
            int length = str3.length();
            while (true) {
                if (i10 < length) {
                    if (!CharsKt.b(str3.charAt(i10))) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 == -1) {
                i10 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i10));
        }
        Intrinsics.checkNotNullParameter(arrayList2, "<this>");
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        int length2 = str.length();
        F.size();
        k kVar = k.f23418a;
        int f10 = vt.y.f(F);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : F) {
            int i12 = i10 + 1;
            if (i10 >= 0) {
                String str4 = (String) obj2;
                if ((i10 == 0 || i10 == f10) && w.C(str4)) {
                    str4 = null;
                } else {
                    Intrinsics.checkNotNullParameter(str4, "<this>");
                    if (i11 >= 0) {
                        int length3 = str4.length();
                        if (i11 <= length3) {
                            length3 = i11;
                        }
                        String substring = str4.substring(length3);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        if (substring != null && (str2 = (String) kVar.invoke(substring)) != null) {
                            str4 = str2;
                        }
                    } else {
                        throw new IllegalArgumentException(jr.h.o("Requested character count ", i11, " is less than zero.").toString());
                    }
                }
                if (str4 != null) {
                    arrayList3.add(str4);
                }
                i10 = i12;
            } else {
                vt.y.j();
                throw null;
            }
        }
        StringBuilder sb2 = new StringBuilder(length2);
        g0.A(arrayList3, sb2, null, 124);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static String c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(HttpUrl.FRAGMENT_ENCODE_SET, "newIndent");
        Intrinsics.checkNotNullParameter("|", "marginPrefix");
        if (!w.C("|")) {
            List F = w.F(str);
            int length = str.length();
            F.size();
            k kVar = k.f23418a;
            int f10 = vt.y.f(F);
            ArrayList arrayList = new ArrayList();
            Iterator it = F.iterator();
            int i10 = 0;
            while (true) {
                String str2 = null;
                if (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        String str3 = (String) next;
                        if ((i10 != 0 && i10 != f10) || !w.C(str3)) {
                            int length2 = str3.length();
                            int i12 = 0;
                            while (true) {
                                if (i12 < length2) {
                                    if (!CharsKt.b(str3.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                } else {
                                    i12 = -1;
                                    break;
                                }
                            }
                            if (i12 != -1 && s.q(i12, str3, "|", false)) {
                                str2 = str3.substring("|".length() + i12);
                                Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
                            }
                            if (str2 == null || (str2 = (String) kVar.invoke(str2)) == null) {
                                str2 = str3;
                            }
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                        i10 = i11;
                    } else {
                        vt.y.j();
                        throw null;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    g0.A(arrayList, sb2, null, 124);
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    return sb3;
                }
            }
        } else {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
    }
}
