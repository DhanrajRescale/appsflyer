package h;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f17573a;

    public a(a aVar) {
        super((ViewGroup.MarginLayoutParams) aVar);
        this.f17573a = 0;
        this.f17573a = aVar.f17573a;
    }

    public a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f17573a = 0;
    }
}
