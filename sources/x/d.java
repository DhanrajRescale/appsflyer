package x;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public a0.n f39520a;

    /* renamed from: b, reason: collision with root package name */
    public int f39521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f39522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f39523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0.l f39524e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(k kVar, long j10, a0.l lVar, yt.a aVar) {
        super(2, aVar);
        this.f39522c = kVar;
        this.f39523d = j10;
        this.f39524e = lVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f39522c, this.f39523d, this.f39524e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        a0.n nVar;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f39521b;
        k kVar = this.f39522c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    nVar = this.f39520a;
                    ut.n.b(obj);
                    kVar.f39612z = nVar;
                    return Unit.f23355a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ut.n.b(obj);
        } else {
            ut.n.b(obj);
            kVar.getClass();
            if (!((Boolean) kVar.c(androidx.compose.foundation.gestures.a.f1240c)).booleanValue()) {
                int i11 = j0.f39596b;
                ViewParent parent = ((View) c2.g.p(kVar, AndroidCompositionLocals_androidKt.f1433g)).getParent();
                while (parent != null && (parent instanceof ViewGroup)) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (!viewGroup.shouldDelayChildPressedState()) {
                        parent = viewGroup.getParent();
                    }
                }
            }
            long j10 = j0.f39595a;
            this.f39521b = 1;
            if (kp.j.K(j10, this) == aVar) {
                return aVar;
            }
        }
        a0.n nVar2 = new a0.n(this.f39523d);
        this.f39520a = nVar2;
        this.f39521b = 2;
        if (this.f39524e.a(nVar2, this) == aVar) {
            return aVar;
        }
        nVar = nVar2;
        kVar.f39612z = nVar;
        return Unit.f23355a;
    }
}
