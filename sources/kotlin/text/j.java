package kotlin.text;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class j {
    public static void a(StringBuilder sb2, Object obj, Function1 function1) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (function1 != null) {
            sb2.append((CharSequence) function1.invoke(obj));
            return;
        }
        if (obj == null || (obj instanceof CharSequence)) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) String.valueOf(obj));
        }
    }
}
