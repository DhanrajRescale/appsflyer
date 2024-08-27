package pm;

import android.animation.ValueAnimator;
import android.graphics.Color;
import com.github.clans.fab.FloatingActionMenu;

/* loaded from: classes.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31191b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f31192c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FloatingActionMenu f31194e;

    public /* synthetic */ f(FloatingActionMenu floatingActionMenu, int i10, int i11, int i12, int i13) {
        this.f31190a = i13;
        this.f31194e = floatingActionMenu;
        this.f31191b = i10;
        this.f31192c = i11;
        this.f31193d = i12;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31190a;
        FloatingActionMenu floatingActionMenu = this.f31194e;
        int i11 = this.f31191b;
        int i12 = this.f31193d;
        int i13 = this.f31192c;
        switch (i10) {
            case 0:
                floatingActionMenu.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), i11, i13, i12));
                return;
            default:
                floatingActionMenu.setBackgroundColor(Color.argb(((Integer) valueAnimator.getAnimatedValue()).intValue(), i11, i13, i12));
                return;
        }
    }
}
