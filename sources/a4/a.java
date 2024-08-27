package a4;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f160b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f161c;

    public /* synthetic */ a(f fVar, View view, int i10) {
        this.f159a = i10;
        this.f161c = fVar;
        this.f160b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i10 = this.f159a;
        View view = this.f160b;
        f fVar = this.f161c;
        switch (i10) {
            case 0:
                if (fVar.f168b.d()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            default:
                if (((e) fVar).f168b.d()) {
                    return false;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
