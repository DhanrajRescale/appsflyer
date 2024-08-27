package ib;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import t0.g1;

/* loaded from: classes.dex */
public final class v extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19823a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f19824b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f19825c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f19826d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f19828f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w4 w4Var, ViewGroup viewGroup, ComposeView composeView, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f19824b = w4Var;
        this.f19825c = viewGroup;
        this.f19826d = composeView;
        this.f19827e = str;
        this.f19828f = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new v(this.f19824b, this.f19825c, this.f19826d, this.f19827e, this.f19828f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19823a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w4 w4Var = this.f19824b;
            if (u.f19822a[w4Var.c().ordinal()] == 1) {
                g1 g1Var = this.f19828f;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    this.f19825c.removeView(this.f19826d);
                } else {
                    g1Var.setValue(Boolean.TRUE);
                    this.f19823a = 1;
                    if (w4Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.i(this.f19827e, "Bottom sheet " + w4Var.c() + " state");
            }
        }
        return Unit.f23355a;
    }
}
