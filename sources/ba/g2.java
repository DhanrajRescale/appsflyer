package ba;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.ContentLoadingProgressBar;

/* loaded from: classes.dex */
public abstract class g2 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final CoordinatorLayout f4774s;

    /* renamed from: t, reason: collision with root package name */
    public final ImageView f4775t;

    /* renamed from: u, reason: collision with root package name */
    public final ContentLoadingProgressBar f4776u;

    /* renamed from: v, reason: collision with root package name */
    public final SurfaceView f4777v;

    public g2(Object obj, View view, CoordinatorLayout coordinatorLayout, ImageView imageView, ContentLoadingProgressBar contentLoadingProgressBar, SurfaceView surfaceView) {
        super(obj, view, 0);
        this.f4774s = coordinatorLayout;
        this.f4775t = imageView;
        this.f4776u = contentLoadingProgressBar;
        this.f4777v = surfaceView;
    }
}
