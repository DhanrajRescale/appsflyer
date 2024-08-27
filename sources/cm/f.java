package cm;

import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes.dex */
public class f extends b {

    /* renamed from: b, reason: collision with root package name */
    public FrameLayout f8235b;

    /* renamed from: d, reason: collision with root package name */
    public CircularProgressIndicator f8237d;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f8236c = new Handler();

    /* renamed from: e, reason: collision with root package name */
    public long f8238e = 0;

    @Override // cm.g
    public final void b() {
        this.f8236c.postDelayed(new bl.d(this, 7), Math.max(750 - (System.currentTimeMillis() - this.f8238e), 0L));
    }

    @Override // cm.g
    public final void f(int i10) {
        if (this.f8237d.getVisibility() == 0) {
            this.f8236c.removeCallbacksAndMessages(null);
        } else {
            this.f8238e = System.currentTimeMillis();
            this.f8237d.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.g0
    public void onViewCreated(View view, Bundle bundle) {
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(new ContextThemeWrapper(getContext(), this.f8228a.y().f744d), null);
        this.f8237d = circularProgressIndicator;
        circularProgressIndicator.setIndeterminate(true);
        this.f8237d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.invisible_frame);
        this.f8235b = frameLayout;
        frameLayout.addView(this.f8237d, layoutParams);
    }
}
