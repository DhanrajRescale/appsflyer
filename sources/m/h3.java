package m;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class h3 extends TouchDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final View f25538a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f25539b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f25540c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f25541d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25542e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25543f;

    public h3(Rect rect, Rect rect2, SearchView.SearchAutoComplete searchAutoComplete) {
        super(rect, searchAutoComplete);
        int scaledTouchSlop = ViewConfiguration.get(searchAutoComplete.getContext()).getScaledTouchSlop();
        this.f25542e = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.f25539b = rect3;
        Rect rect4 = new Rect();
        this.f25541d = rect4;
        Rect rect5 = new Rect();
        this.f25540c = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i10 = -scaledTouchSlop;
        rect4.inset(i10, i10);
        rect5.set(rect2);
        this.f25538a = searchAutoComplete;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z12 = true;
        if (action != 0) {
            if (action != 1 && action != 2) {
                if (action == 3) {
                    z11 = this.f25543f;
                    this.f25543f = false;
                }
                z10 = true;
                z12 = false;
            } else {
                z11 = this.f25543f;
                if (z11 && !this.f25541d.contains(x10, y10)) {
                    z12 = z11;
                    z10 = false;
                }
            }
            z12 = z11;
            z10 = true;
        } else {
            if (this.f25539b.contains(x10, y10)) {
                this.f25543f = true;
                z10 = true;
            }
            z10 = true;
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        Rect rect = this.f25540c;
        View view = this.f25538a;
        if (z10 && !rect.contains(x10, y10)) {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        } else {
            motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}
