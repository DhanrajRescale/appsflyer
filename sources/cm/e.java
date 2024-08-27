package cm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import com.assetgro.stockgro.prod.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* loaded from: classes.dex */
public abstract class e extends c {

    /* renamed from: d, reason: collision with root package name */
    public CircularProgressIndicator f8233d;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f8232c = new Handler();

    /* renamed from: e, reason: collision with root package name */
    public long f8234e = 0;

    @Override // cm.g
    public final void b() {
        this.f8232c.postDelayed(new d(this, 0), Math.max(750 - (System.currentTimeMillis() - this.f8234e), 0L));
    }

    @Override // cm.g
    public final void f(int i10) {
        if (this.f8233d.getVisibility() == 0) {
            this.f8232c.removeCallbacksAndMessages(null);
        } else {
            this.f8234e = System.currentTimeMillis();
            this.f8233d.setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.j0, androidx.activity.m, q3.o, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_invisible);
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(new ContextThemeWrapper(this, y().f744d), null);
        this.f8233d = circularProgressIndicator;
        circularProgressIndicator.setIndeterminate(true);
        this.f8233d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ((FrameLayout) findViewById(R.id.invisible_frame)).addView(this.f8233d, layoutParams);
    }

    @Override // cm.c
    public final void w(int i10, Intent intent) {
        setResult(i10, intent);
        this.f8232c.postDelayed(new d(this, 1), Math.max(750 - (System.currentTimeMillis() - this.f8234e), 0L));
    }
}
