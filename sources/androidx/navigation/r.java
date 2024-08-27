package androidx.navigation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(t tVar, int i10) {
        super(1);
        this.f2287a = i10;
        this.f2288b = tVar;
    }

    public final Boolean a(c0 destination) {
        int i10 = this.f2287a;
        t tVar = this.f2288b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(!tVar.f2315l.containsKey(Integer.valueOf(destination.f2181h)));
            default:
                Intrinsics.checkNotNullParameter(destination, "destination");
                return Boolean.valueOf(!tVar.f2315l.containsKey(Integer.valueOf(destination.f2181h)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2287a) {
            case 0:
                return a((c0) obj);
            default:
                return a((c0) obj);
        }
    }
}
