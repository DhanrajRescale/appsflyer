package ka;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;
import t0.g1;

/* loaded from: classes.dex */
public final class m0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f22840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qu.f0 f22841c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f22842d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f22843e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f22844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g1 f22845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g1 f22846h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(g1 g1Var, qu.f0 f0Var, g1 g1Var2, g1 g1Var3, g1 g1Var4, g1 g1Var5, g1 g1Var6, int i10) {
        super(1);
        this.f22839a = i10;
        this.f22840b = g1Var;
        this.f22841c = f0Var;
        this.f22842d = g1Var2;
        this.f22843e = g1Var3;
        this.f22844f = g1Var4;
        this.f22845g = g1Var5;
        this.f22846h = g1Var6;
    }

    public final t0.n0 a(t0.o0 DisposableEffect) {
        qu.f0 f0Var = this.f22841c;
        int i10 = this.f22839a;
        g1 g1Var = this.f22840b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var = (o1) g1Var.getValue();
                if (o1Var != null) {
                    o1Var.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new k0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 0);
            case 1:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var2 = (o1) g1Var.getValue();
                if (o1Var2 != null) {
                    o1Var2.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new v0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 1);
            case 2:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var3 = (o1) g1Var.getValue();
                if (o1Var3 != null) {
                    o1Var3.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new w0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 2);
            case 3:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var4 = (o1) g1Var.getValue();
                if (o1Var4 != null) {
                    o1Var4.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new x0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 3);
            case 4:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var5 = (o1) g1Var.getValue();
                if (o1Var5 != null) {
                    o1Var5.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new y0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 4);
            default:
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                o1 o1Var6 = (o1) g1Var.getValue();
                if (o1Var6 != null) {
                    o1Var6.a(null);
                }
                g1Var.setValue(yk.g.H(f0Var, null, null, new z0(this.f22842d, this.f22843e, this.f22844f, this.f22845g, this.f22846h, null), 3));
                return new l0(g1Var, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f22839a) {
            case 0:
                return a((t0.o0) obj);
            case 1:
                return a((t0.o0) obj);
            case 2:
                return a((t0.o0) obj);
            case 3:
                return a((t0.o0) obj);
            case 4:
                return a((t0.o0) obj);
            default:
                return a((t0.o0) obj);
        }
    }
}
