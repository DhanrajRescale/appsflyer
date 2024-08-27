package x1;

import android.view.MotionEvent;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final List f39870a;

    /* renamed from: b, reason: collision with root package name */
    public final f f39871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39872c;

    /* renamed from: d, reason: collision with root package name */
    public int f39873d;

    public k(List list, f fVar) {
        MotionEvent motionEvent;
        int i10;
        MotionEvent motionEvent2;
        this.f39870a = list;
        this.f39871b = fVar;
        if (fVar != null) {
            motionEvent = fVar.f39845b.f39926b;
        } else {
            motionEvent = null;
        }
        int i11 = 0;
        if (motionEvent != null) {
            i10 = motionEvent.getButtonState();
        } else {
            i10 = 0;
        }
        this.f39872c = i10;
        if (fVar != null) {
            motionEvent2 = fVar.f39845b.f39926b;
        } else {
            motionEvent2 = null;
        }
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = fVar != null ? fVar.f39845b.f39926b : null;
        int i12 = 1;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i11 = 6;
                                break;
                            case 9:
                                i11 = 4;
                                break;
                            case 10:
                                i11 = 5;
                                break;
                        }
                        i12 = i11;
                    }
                    i11 = 3;
                    i12 = i11;
                }
                i11 = 2;
                i12 = i11;
            }
            i11 = 1;
            i12 = i11;
        } else {
            int size = list.size();
            while (true) {
                if (i11 < size) {
                    t tVar = (t) list.get(i11);
                    if (t0.t.A(tVar)) {
                        i12 = 2;
                        break;
                    } else if (t0.t.y(tVar)) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i12 = 3;
                    break;
                }
            }
        }
        this.f39873d = i12;
    }
}
