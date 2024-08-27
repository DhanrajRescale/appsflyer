package n9;

import com.airbnb.lottie.LottieAnimationView;
import j9.a0;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class s implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28529b;

    public /* synthetic */ s(Object obj, int i10) {
        this.f28528a = i10;
        this.f28529b = obj;
    }

    public final void a(Throwable e10) {
        int i10 = this.f28528a;
        Object obj = this.f28529b;
        switch (i10) {
            case 1:
                qu.h hVar = (qu.h) obj;
                if (!hVar.D()) {
                    l.Companion companion = ut.l.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(e10, "e");
                    hVar.resumeWith(ut.n.a(e10));
                    return;
                }
                return;
            default:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
                int i11 = lottieAnimationView.f8362g;
                if (i11 != 0) {
                    lottieAnimationView.setImageResource(i11);
                }
                a0 a0Var = lottieAnimationView.f8361f;
                if (a0Var == null) {
                    a0Var = LottieAnimationView.f8358r;
                }
                a0Var.onResult(e10);
                return;
        }
    }

    @Override // j9.a0
    public final void onResult(Object obj) {
        switch (this.f28528a) {
            case 0:
                qu.h hVar = (qu.h) this.f28529b;
                if (!hVar.D()) {
                    l.Companion companion = ut.l.INSTANCE;
                    hVar.resumeWith(obj);
                    return;
                }
                return;
            case 1:
                a((Throwable) obj);
                return;
            default:
                a((Throwable) obj);
                return;
        }
    }
}
