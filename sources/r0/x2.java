package r0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x2 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f32805a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2.b f32806b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f32807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f32808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f32809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(boolean z10, w2.b bVar, a3 a3Var, Function1 function1, boolean z11) {
        super(0);
        this.f32805a = z10;
        this.f32806b = bVar;
        this.f32807c = a3Var;
        this.f32808d = function1;
        this.f32809e = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        return new z2(this.f32805a, this.f32806b, this.f32807c, this.f32808d, this.f32809e);
    }
}
