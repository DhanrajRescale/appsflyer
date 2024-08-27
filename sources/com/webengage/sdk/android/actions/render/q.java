package com.webengage.sdk.android.actions.render;

import android.view.MotionEvent;
import android.view.View;
import com.webengage.sdk.android.actions.render.n;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12429a;

    public /* synthetic */ q(int i10) {
        this.f12429a = i10;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f12429a) {
            case 0:
                return n.f.b(view, motionEvent);
            default:
                return n.b(view, motionEvent);
        }
    }
}
