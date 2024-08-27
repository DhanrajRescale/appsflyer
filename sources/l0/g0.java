package l0;

import c2.b2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ iu.v f23755a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(iu.v vVar) {
        super(1);
        this.f23755a = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (((x1.n) obj).f39894p) {
            this.f23755a.f20556a = false;
            return b2.f7664c;
        }
        return b2.f7662a;
    }
}
