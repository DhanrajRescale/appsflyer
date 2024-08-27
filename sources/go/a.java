package go;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final Dialog f17529a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17531c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17532d;

    public a(Dialog dialog, Rect rect) {
        this.f17529a = dialog;
        this.f17530b = rect.left;
        this.f17531c = rect.top;
        this.f17532d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f17530b;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f17531c, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f17532d;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f17529a.onTouchEvent(obtain);
    }
}
