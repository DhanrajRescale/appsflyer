package nh;

import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.w4;
import qu.f0;
import t0.g1;

/* loaded from: classes.dex */
public final class h extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f28702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w4 f28703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f28704c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ComposeView f28705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f28706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f28707f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w4 w4Var, ViewGroup viewGroup, ComposeView composeView, String str, g1 g1Var, yt.a aVar) {
        super(2, aVar);
        this.f28703b = w4Var;
        this.f28704c = viewGroup;
        this.f28705d = composeView;
        this.f28706e = str;
        this.f28707f = g1Var;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new h(this.f28703b, this.f28704c, this.f28705d, this.f28706e, this.f28707f, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f28702a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            w4 w4Var = this.f28703b;
            if (g.f28701a[w4Var.c().ordinal()] == 1) {
                g1 g1Var = this.f28707f;
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    this.f28704c.removeView(this.f28705d);
                } else {
                    g1Var.setValue(Boolean.TRUE);
                    this.f28702a = 1;
                    if (w4Var.e(this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                Log.i(this.f28706e, "Bottom sheet " + w4Var.c() + " state");
            }
        }
        return Unit.f23355a;
    }
}
