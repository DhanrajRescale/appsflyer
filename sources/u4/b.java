package u4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vt.h0;
import vt.k0;
import vt.p0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f36738c = new b(k0.f38324a, p0.d());

    /* renamed from: a, reason: collision with root package name */
    public final Set f36739a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f36740b;

    public b(k0 flags, Map allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f36739a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ((k0) allowedViolations.entrySet()).getClass();
        h0.f38319a.getClass();
        this.f36740b = linkedHashMap;
    }
}
