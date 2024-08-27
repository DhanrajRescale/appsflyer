package m;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f25494b;

    public /* synthetic */ b2(i2 i2Var, int i10) {
        this.f25493a = i10;
        this.f25494b = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25493a;
        i2 i2Var = this.f25494b;
        switch (i10) {
            case 1:
                w1 w1Var = i2Var.f25560c;
                if (w1Var != null) {
                    w1Var.setListSelectionHidden(true);
                    w1Var.requestLayout();
                    return;
                }
                return;
            default:
                w1 w1Var2 = i2Var.f25560c;
                if (w1Var2 != null) {
                    WeakHashMap weakHashMap = d4.n1.f13788a;
                    if (d4.y0.b(w1Var2) && i2Var.f25560c.getCount() > i2Var.f25560c.getChildCount() && i2Var.f25560c.getChildCount() <= i2Var.f25570m) {
                        i2Var.f25583z.setInputMethodMode(2);
                        i2Var.f();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
