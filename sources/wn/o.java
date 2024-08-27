package wn;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f39352a = {R.attr.stateListAnimator};

    public static void a(View view, float f10) {
        int integer = view.getResources().getInteger(com.assetgro.stockgro.prod.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.assetgro.stockgro.prod.R.attr.state_liftable, -2130969872}, ObjectAnimator.ofFloat(view, "elevation", s0.g.f34069a).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f10).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", s0.g.f34069a).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
