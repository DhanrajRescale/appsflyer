package wn;

import android.view.View;
import d4.n1;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final View f39348a;

    /* renamed from: b, reason: collision with root package name */
    public int f39349b;

    /* renamed from: c, reason: collision with root package name */
    public int f39350c;

    /* renamed from: d, reason: collision with root package name */
    public int f39351d;

    public n(View view) {
        this.f39348a = view;
    }

    public final void a() {
        int i10 = this.f39351d;
        View view = this.f39348a;
        int top = i10 - (view.getTop() - this.f39349b);
        WeakHashMap weakHashMap = n1.f13788a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f39350c));
    }

    public final boolean b(int i10) {
        if (this.f39351d != i10) {
            this.f39351d = i10;
            a();
            return true;
        }
        return false;
    }
}
