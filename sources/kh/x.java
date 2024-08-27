package kh;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import t0.g1;

/* loaded from: classes.dex */
public final class x extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f23181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f23182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f23183c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f23184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f23186f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w4 w4Var, ViewGroup viewGroup, ComposeView composeView, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f23182b = w4Var;
        this.f23183c = viewGroup;
        this.f23184d = composeView;
        this.f23185e = str;
        this.f23186f = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new x(this.f23182b, this.f23183c, this.f23184d, this.f23185e, this.f23186f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f23181a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w4 w4Var = this.f23182b;
            if (w.f23180a[w4Var.c().ordinal()] == 1) {
                g1 g1Var = this.f23186f;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    this.f23183c.removeView(this.f23184d);
                } else {
                    g1Var.setValue(Boolean.TRUE);
                    this.f23181a = 1;
                    if (w4Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.i(this.f23185e, "Bottom sheet " + w4Var.c() + " state");
            }
        }
        return Unit.f23355a;
    }
}
