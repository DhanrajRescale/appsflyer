package m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n6 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.a1 f26543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f26544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(a2.a1 a1Var, int i10, a2.a1 a1Var2, int i11, int i12) {
        super(1);
        this.f26541a = a1Var;
        this.f26542b = i10;
        this.f26543c = a1Var2;
        this.f26544d = i11;
        this.f26545e = i12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a2.z0 z0Var = (a2.z0) obj;
        a2.z0.g(z0Var, this.f26541a, 0, this.f26542b);
        a2.z0.g(z0Var, this.f26543c, this.f26544d, this.f26545e);
        return Unit.f23355a;
    }
}
