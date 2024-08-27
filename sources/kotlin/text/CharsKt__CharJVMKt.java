package kotlin.text;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¨\u0006\u0003"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "radix", "checkRadix", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/text/CharsKt")
/* loaded from: classes2.dex */
public class CharsKt__CharJVMKt {
    public static int checkRadix(int i10) {
        if (2 <= i10 && i10 < 37) {
            return i10;
        }
        StringBuilder n10 = a3.a.n("radix ", i10, " was not in valid range ");
        n10.append(new kotlin.ranges.c(2, 36, 1));
        throw new IllegalArgumentException(n10.toString());
    }
}
