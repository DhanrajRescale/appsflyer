package oo;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public final class c extends u7.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f30154c;

    public c(View view, int i10) {
        this.f30153b = i10;
        this.f30154c = view;
    }

    @Override // u7.c
    public final void a(Drawable drawable) {
        int i10 = this.f30153b;
        View view = this.f30154c;
        switch (i10) {
            case 0:
                d dVar = (d) view;
                dVar.setIndeterminate(false);
                dVar.b(dVar.f30156b, dVar.f30157c);
                return;
            case 1:
                d dVar2 = (d) view;
                if (!dVar2.f30161g) {
                    dVar2.setVisibility(dVar2.f30162h);
                    return;
                }
                return;
            default:
                ColorStateList colorStateList = ((eo.b) view).f15773o;
                if (colorStateList != null) {
                    v3.b.h(drawable, colorStateList);
                    return;
                }
                return;
        }
    }

    @Override // u7.c
    public final void b(Drawable drawable) {
        switch (this.f30153b) {
            case 2:
                eo.b bVar = (eo.b) this.f30154c;
                ColorStateList colorStateList = bVar.f15773o;
                if (colorStateList != null) {
                    v3.b.g(drawable, colorStateList.getColorForState(bVar.f15777s, colorStateList.getDefaultColor()));
                    return;
                }
                return;
            default:
                return;
        }
    }
}
