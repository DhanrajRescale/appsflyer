package td;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import t0.g1;

/* loaded from: classes.dex */
public final class q extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f35932a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f35933b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f35934c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f35935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f35936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f35937f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w4 w4Var, ViewGroup viewGroup, ComposeView composeView, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f35933b = w4Var;
        this.f35934c = viewGroup;
        this.f35935d = composeView;
        this.f35936e = str;
        this.f35937f = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new q(this.f35933b, this.f35934c, this.f35935d, this.f35936e, this.f35937f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f35932a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w4 w4Var = this.f35933b;
            if (p.f35927a[w4Var.c().ordinal()] == 1) {
                g1 g1Var = this.f35937f;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    this.f35934c.removeView(this.f35935d);
                } else {
                    g1Var.setValue(Boolean.TRUE);
                    this.f35932a = 1;
                    if (w4Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.i(this.f35936e, "Bottom sheet " + w4Var.c() + " state");
            }
        }
        return Unit.f23355a;
    }
}
