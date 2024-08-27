package e0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class l0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f14756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f14757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i10, float f10, Function0 function0) {
        super(0);
        this.f14755a = i10;
        this.f14756b = f10;
        this.f14757c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        return new e(this.f14755a, this.f14756b, this.f14757c);
    }
}
