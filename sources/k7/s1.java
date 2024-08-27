package k7;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public int f22567a;

    /* renamed from: b, reason: collision with root package name */
    public int f22568b;

    /* renamed from: c, reason: collision with root package name */
    public int f22569c;

    /* renamed from: d, reason: collision with root package name */
    public int f22570d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f22571e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22572f;

    /* renamed from: g, reason: collision with root package name */
    public int f22573g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f22570d;
        if (i10 >= 0) {
            this.f22570d = -1;
            recyclerView.R(i10);
            this.f22572f = false;
            return;
        }
        if (this.f22572f) {
            Interpolator interpolator = this.f22571e;
            if (interpolator != null && this.f22569c < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i11 = this.f22569c;
            if (i11 >= 1) {
                recyclerView.f2418v0.c(this.f22567a, this.f22568b, i11, interpolator);
                int i12 = this.f22573g + 1;
                this.f22573g = i12;
                if (i12 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f22572f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.f22573g = 0;
    }
}
