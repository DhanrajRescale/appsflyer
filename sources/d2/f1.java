package d2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class f1 extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13413a;

    public /* synthetic */ f1(int i10) {
        this.f13413a = i10;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        int i10 = this.f13413a;
        switch (i10) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    h1 h1Var = new h1(choreographer, yk.j.N0(myLooper));
                    return h1Var.l(h1Var.f13438l);
                }
                throw new IllegalStateException("no Looper on this thread".toString());
            case 1:
                return new PathMeasure();
            case 2:
                switch (i10) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            case 3:
                switch (i10) {
                    case 2:
                        return new Path();
                    default:
                        return new Path();
                }
            default:
                return new float[4];
        }
    }
}
