package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su.g f38484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f38485b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(su.g gVar, Object obj) {
        super(0);
        this.f38484a = gVar;
        this.f38485b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        this.f38484a.o(this.f38485b);
        return Unit.f23355a;
    }
}
