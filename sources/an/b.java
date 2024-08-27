package an;

import android.view.GestureDetector;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public int f783a = 0;

    /* renamed from: b, reason: collision with root package name */
    public wm.c f784b;

    /* renamed from: c, reason: collision with root package name */
    public final GestureDetector f785c;

    /* renamed from: d, reason: collision with root package name */
    public final sm.b f786d;

    public b(sm.b bVar) {
        this.f786d = bVar;
        this.f785c = new GestureDetector(bVar.getContext(), this);
    }
}
