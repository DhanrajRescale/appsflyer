package c0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class o0 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(int i10, int i11) {
        super(0);
        this.f7557a = i10;
        this.f7558b = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        return new m0(this.f7557a, this.f7558b);
    }
}
