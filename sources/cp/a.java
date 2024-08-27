package cp;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* loaded from: classes2.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f13029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ jo.a f13031c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f13032d;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, jo.a aVar) {
        this.f13032d = expandableBehavior;
        this.f13029a = view;
        this.f13030b = i10;
        this.f13031c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f13029a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f13032d;
        if (expandableBehavior.f11563a == this.f13030b) {
            Object obj = this.f13031c;
            expandableBehavior.s((View) obj, view, ((FloatingActionButton) obj).f11362o.f3157a, false);
        }
        return false;
    }
}
