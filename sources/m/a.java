package m;

import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class a implements d4.c2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f25473a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f25474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarContextView f25475c;

    public a(ActionBarContextView actionBarContextView) {
        this.f25475c = actionBarContextView;
    }

    @Override // d4.c2
    public final void a(View view) {
        this.f25473a = true;
    }

    @Override // d4.c2
    public final void b() {
        super/*android.view.View*/.setVisibility(0);
        this.f25473a = false;
    }

    @Override // d4.c2
    public final void c() {
        if (this.f25473a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f25475c;
        actionBarContextView.f936f = null;
        super/*android.view.View*/.setVisibility(this.f25474b);
    }
}
