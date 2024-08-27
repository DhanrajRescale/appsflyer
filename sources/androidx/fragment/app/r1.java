package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public final class r1 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Rect f1823b;

    public /* synthetic */ r1(Rect rect, int i10) {
        this.f1822a = i10;
        this.f1823b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        int i10 = this.f1822a;
        Rect rect = this.f1823b;
        switch (i10) {
            case 0:
                return rect;
            default:
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
