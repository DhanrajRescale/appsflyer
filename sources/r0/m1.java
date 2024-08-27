package r0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m1 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32584a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f32585b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Function0 function0, int i10) {
        super(1);
        this.f32584a = i10;
        this.f32585b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f32584a;
        Object obj2 = this.f32585b;
        switch (i10) {
            case 0:
                ((Function0) obj2).mo2invoke();
                return Unit.f23355a;
            default:
                long j10 = ((m1.c) obj).f27237a;
                ((Function0) obj2).mo2invoke();
                return Unit.f23355a;
        }
    }
}
