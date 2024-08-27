package n1;

import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final PathMeasure f28145a;

    public j(PathMeasure pathMeasure) {
        this.f28145a = pathMeasure;
    }

    public final void a(float f10, float f11, p0 p0Var) {
        if (p0Var instanceof h) {
            this.f28145a.getSegment(f10, f11, ((h) p0Var).f28138a, true);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
