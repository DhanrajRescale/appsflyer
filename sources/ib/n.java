package ib;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import t0.g1;

/* loaded from: classes.dex */
public final class n extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f19801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f19802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f19803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f19804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f19805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f19806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w4 w4Var, ViewGroup viewGroup, ComposeView composeView, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f19802b = w4Var;
        this.f19803c = viewGroup;
        this.f19804d = composeView;
        this.f19805e = str;
        this.f19806f = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new n(this.f19802b, this.f19803c, this.f19804d, this.f19805e, this.f19806f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f19801a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w4 w4Var = this.f19802b;
            if (m.f19800a[w4Var.c().ordinal()] == 1) {
                g1 g1Var = this.f19806f;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    this.f19803c.removeView(this.f19804d);
                } else {
                    g1Var.setValue(Boolean.TRUE);
                    this.f19801a = 1;
                    if (w4Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.i(this.f19805e, "Bottom sheet " + w4Var.c() + " state");
            }
        }
        return Unit.f23355a;
    }
}
