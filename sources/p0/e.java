package p0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30446a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f30447b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(o oVar, int i10) {
        super(0);
        this.f30446a = i10;
        this.f30447b = oVar;
    }

    public final Float a() {
        int i10 = this.f30446a;
        o oVar = this.f30447b;
        switch (i10) {
            case 0:
                float a10 = oVar.a() / oVar.b();
                float f10 = 1.0f;
                if (a10 < 1.0f) {
                    f10 = 0.3f;
                }
                return Float.valueOf(f10);
            default:
                return Float.valueOf(oVar.f30485f.i() * 0.5f);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f30446a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
