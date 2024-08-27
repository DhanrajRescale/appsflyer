package lu;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends a {

    /* renamed from: c, reason: collision with root package name */
    public final b f25396c = new ThreadLocal();

    @Override // lu.a
    public final Random e() {
        Object obj = this.f25396c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
