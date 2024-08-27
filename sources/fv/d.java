package fv;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.y;

/* loaded from: classes2.dex */
public final class d extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f16276b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final d f16277c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final d f16278d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        super(1);
        this.f16279a = i10;
    }

    public final long a(int i10) {
        switch (this.f16279a) {
            case 1:
                if (i10 > 9) {
                    return 5000L;
                }
                return ((Number) y.g(10L, 50L, 100L, 150L, 200L, 250L, 500L, 1000L, 2000L).get(i10 - 1)).longValue();
            default:
                if (i10 > 3) {
                    return 10000L;
                }
                return ((Number) y.g(1000L, 2000L, 5000L).get(i10 - 1)).longValue();
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16279a) {
            case 0:
                f it = (f) obj;
                Intrinsics.e(it, "it");
                return it;
            case 1:
                return Long.valueOf(a(((Number) obj).intValue()));
            default:
                return Long.valueOf(a(((Number) obj).intValue()));
        }
    }
}
