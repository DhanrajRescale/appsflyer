package k7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class j1 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public y1 f22430a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f22431b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22432c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22433d;

    public j1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22431b = new Rect();
        this.f22432c = true;
        this.f22433d = false;
    }

    public j1(int i10, int i11) {
        super(i10, i11);
        this.f22431b = new Rect();
        this.f22432c = true;
        this.f22433d = false;
    }

    public j1(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f22431b = new Rect();
        this.f22432c = true;
        this.f22433d = false;
    }

    public j1(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f22431b = new Rect();
        this.f22432c = true;
        this.f22433d = false;
    }

    public j1(j1 j1Var) {
        super((ViewGroup.LayoutParams) j1Var);
        this.f22431b = new Rect();
        this.f22432c = true;
        this.f22433d = false;
    }
}
