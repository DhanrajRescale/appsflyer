package m0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n2 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f26519a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(Function1 function1) {
        super(1);
        this.f26519a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new p2((q2) obj, (Function1) this.f26519a);
    }
}
