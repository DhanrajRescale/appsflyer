package ls;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class s implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f25298a;

    public s(r rVar) {
        this.f25298a = rVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f25298a.f25295b.f25310c.onTouchEvent(motionEvent);
    }
}
