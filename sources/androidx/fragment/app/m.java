package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f2 f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f1758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f1760d;

    public m(View view, i iVar, n nVar, f2 f2Var) {
        this.f1757a = f2Var;
        this.f1758b = nVar;
        this.f1759c = view;
        this.f1760d = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        n nVar = this.f1758b;
        nVar.f1769a.post(new e(nVar, this.f1759c, this.f1760d));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1757a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f1757a + " has reached onAnimationStart.");
        }
    }
}
