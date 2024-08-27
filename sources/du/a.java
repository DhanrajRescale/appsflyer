package du;

import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldu/a;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f14501a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Integer f14502b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, du.a] */
    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f14502b = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f14502b = num2;
    }
}
