package m;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class g2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i2 f25526a;

    public g2(i2 i2Var) {
        this.f25526a = i2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        if (i10 == 1) {
            i2 i2Var = this.f25526a;
            if (i2Var.f25583z.getInputMethodMode() != 2 && i2Var.f25583z.getContentView() != null) {
                Handler handler = i2Var.f25579v;
                b2 b2Var = i2Var.f25575r;
                handler.removeCallbacks(b2Var);
                b2Var.run();
            }
        }
    }
}
