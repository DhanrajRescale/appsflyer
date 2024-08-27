package nl;

import com.facebook.FacebookSdk;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ll.f f28850c = new ll.f(5, 0);

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f28851d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final String f28852a;

    /* renamed from: b, reason: collision with root package name */
    public StringBuilder f28853b;

    public e0() {
        xk.g0 behavior = xk.g0.f40370a;
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter("Request", "tag");
        n0.L("Request", "tag");
        this.f28852a = Intrinsics.i("Request", "FacebookSDK.");
        this.f28853b = new StringBuilder();
    }

    public final void a(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(xk.g0.f40370a)) {
            this.f28853b.append(string);
        }
    }

    public final void b(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] args = {key, value};
        Intrinsics.checkNotNullParameter("  %s:\t%s\n", "format");
        Intrinsics.checkNotNullParameter(args, "args");
        FacebookSdk facebookSdk = FacebookSdk.INSTANCE;
        if (FacebookSdk.isLoggingBehaviorEnabled(xk.g0.f40370a)) {
            StringBuilder sb2 = this.f28853b;
            Object[] copyOf = Arrays.copyOf(args, 2);
            String format = String.format("  %s:\t%s\n", Arrays.copyOf(copyOf, copyOf.length));
            Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            sb2.append(format);
        }
    }

    public final void c() {
        String string = this.f28853b.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        Intrinsics.checkNotNullParameter(string, "string");
        f28850c.q(xk.g0.f40370a, 3, this.f28852a, string);
        this.f28853b = new StringBuilder();
    }
}
